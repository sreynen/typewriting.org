module.exports = {
  siteMetadata: {
    title: 'Gatsby Default Starter',
  },
  plugins: [{
    resolve: 'gatsby-plugin-canonical-urls',
    options: {
      siteUrl: 'https://www.typewriting.org',
    }
  },
  'gatsby-plugin-react-helmet'],
}
