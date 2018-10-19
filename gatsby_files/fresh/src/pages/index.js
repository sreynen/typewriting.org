import React from 'react'
import { Link } from 'gatsby'
//import PropTypes from 'prop-types'
//import Helmet from 'react-helmet'

import Layout from '../components/layout'
//import '.index.css'
//import "../styles/layout-override.css"


const IndexPage = () => (
  <Layout>
    <h1>Hi people</h1>
    <p>Welcome to your new Gatsby site.</p>
    <p>Now go build something great.</p>
    <Link to="/page-2/">Go to page 2</Link>
  </Layout>
)

export default IndexPage
