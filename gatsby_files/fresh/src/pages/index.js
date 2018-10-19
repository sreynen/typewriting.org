import React from 'react'
import { Link } from 'gatsby'
//import PropTypes from 'prop-types'
//import Helmet from 'react-helmet'

import Layout from '../components/layout'
//import './index.css'
import "../styles/layout-override.css"

const Header = () => (
   <div
      style={{
         background:'#f5f5f5',
         marginBottom: '3rem',
         borderBottom: '2px solid #e6e6e6',
      }}
   >
      <div
         style={{
            margin: '0 auto',
            maxWidth: 980,
            padding: '1.45rem 1.0875rem',
         }}
      >
         <h1 style={{margin: 0, textAlign: 'center', fontSize: '18px'}}>
            <Link to="/"
               style={{
                  color: 'black',
                  textDecoration: 'none',
               }}
            >
               CodeStack
            </Link>
         </h1>
      </div>
   </div>
);

const IndexPage = () => (
  <Layout>
    <h1>Hi people</h1>
    <p>Welcome to your new Gatsby site.</p>
    <p>Now go build something great.</p>
    <Link to="/page-2/">Go to page 2</Link>
  </Layout>
)

export default IndexPage
