import React from 'react'
import { Link } from 'gatsby'
//import PropTypes from 'prop-types'
import Helmet from 'react-helmet'
import Media from 'react-media'

import Layout from '../components/layout'
//import './index.css'
import "../styles/layout-override.css"


const TemplateWrapper = ({ children }) => (
   <div>
      <Helmet
         title="Gatsby Default Starter"
         meta={[
            { name: "description", content: "Sample" },
            { name: "keywords", content: "sample, something" }
         ]}
      />
      <Header />
      <div
         style={{
            margin: "0 auto",
            maxWidth: 980,
            display: "flex",
            flexDirection: "row",
            justifyContent: "space-between",
            height: "100%"
         }}
      >
      <Media query={{ maxWidth: 848 }}>
         {matches =>
            matches ? (
               <div
                  style={{
                     margin: "0 auto",
                     maxWidth: 980,
                     display: "flex",
                     flexDirection: "row",
                     justifyContent: "space-between",
                     height: "100%",
                     padding: "25px"
                  }}
               >
                  <div style={{ flex: 1 }}>{children()}</div>
               </div>
            ) : (
               <div
                  style={{
                     margin: "0 auto",
                     maxWidth: 980,
                     display: "flex",
                     flexDirection: "row",
                     justifyContent: "space-between",
                     height: "100%",
                     padding: "25px"
                  }}
               >
                  <div style={{ flex: 2.5, paddingRight: "30px" }}>
                     {children()}
                  </div>

                  <div style={{ flex: 1 }}>
                     <Sidebar
                        title="test"
                        description="Test of the early warning system."
                     />
                     <Sidebar
                        title="About"
                        description="This is not a real alarm"
                     />
                     </div>
                  </div>
               )
            }
         </Media>
      </div>
   </div>
);


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

const Sidebar = (props) => (
   <div
      style={{
         border: '2px solid #e6e6e6',
         maxWidth: 960,
         padding: '0.5rem',
         marginBottom: '25px'
      }}
   >
      <strong>{props.title}.</strong> {props.description}
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
