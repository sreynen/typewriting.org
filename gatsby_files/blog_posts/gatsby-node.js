
/**
 * Implement Gatsby's Node APIs in this file.
 *
 * See: https://www.gatsbyjs.org/docs/node-apis/
 */

 // You can delete this file if you're not using it

const path = require('path');

exports.createPages = ({ boundActionCreators, graphql }) => {
	const { createPage } = boundActionCreators;


	return new Promise((resolve,reject) => {
		const blogPostTemplate = path.resolve(`../../markdown_posts/md_files/templates/blog-post.js`);
		resolve(
			graphql(`{
				allMarkdownRemark (
					sort: { order: DESC, fields: [frontmatter___date] }
					limit: 1000
				)
				{
					edges {
						node {
							excerpt(pruneLength: 250)
							html
							id
							frontmatter {
								date
								path
								title
							}
						}
					}
				}
			}`)
				.then(result => {
					if (result.errors) {
						reject(result.errors);
					}

					result.data.allMarkdownRemark.edges.forEach(({ node }) =>{
						createPage({
							path: node.frontmatter.path,
							component: blogPostTemplate,
							context: {}, // additional data can be passed via context
						})
					})
				})
			)
		})
	}
