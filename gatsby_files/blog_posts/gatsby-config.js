module.exports = {
  siteMetadata: {
    title: 'Gatsby Default Starter',
  },
  plugins: [
    {
      resolve: 'gatsby-plugin-canonical-urls',
      options: {
        siteUrl: 'https://www.typewriting.org',
      }
    },
    {
      resolve: 'gatsby-source-filesystem',
      options: {
        path: '${__dirname}/md_files',
        name: 'md_files'
      }
    },
    'gatsby-plugin-catch-links',
    'gatsby-plugin-react-helmet',
    'gatsby-transformer-remark'
  ],
}
