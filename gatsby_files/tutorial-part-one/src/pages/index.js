import React from "react";
import Link from "gatsby-link";

export default () => <div style={{color: 'tomato'}}>
  <h1>Hello Gatsby!</h1>
  <p>this is quite a world</p>
  <img src = "https://source.unsplash.com/random/400x200" alt="random photo" />
  <br />
  <br />
  <div>
    <Link to="/page-2/">Link</Link>
  </div>
</div>
