import React from "react";
//import Helmet from "react-helmet";
import { graphql } from "graphql";

export default function Template({
  data,
}) {
  const { markdownRemark } = data
  const { frontmatter, html } = markdownRemark
  return (
    <div className="blog-post-container">
      <div className="blog-post">
        <h1>{frontmatter.title}</h1>
        <h2>{frontmatter.date}</h2>
        <div
          className="blog-post-content"
          dangerouslySetInnerHTML={{ __html: html}}
        />
      </div>
    </div>
  )
}
//   const post = data.markdownRemark;
//   return(
//       <div className = "blog-post-container">
//         <Helmet title={'$post.frontmatter.title'} />
//           <div className = "blog-post">
//             <h1>{post.frontmatter.title}</h1>
//             <div
//               className = "blog-post-content"
//               dangerouslySetInnerHTML={{ __html: post.html }} //???
//             />
//           </div>
//       </div>
//   );
// }

export const pageQuery = graphql`
  query BlogPostByPath($path: String!) {
    markdownRemark(frontmatter: { path: { eq: $path } }) {
      html
      frontmatter {
        date
        path
        title
      }
    }
  }
`
;
