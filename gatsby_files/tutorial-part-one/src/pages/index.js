import React from "react";
import Link from "gatsby-link";

export default () => <div style={{color: 'tomato'}}>
  <h1>Hello Gatsby!</h1>
  <p>this is quite a world</p>
  <img src = "https://source.unsplash.com/random/400x200" alt="random photo" />
  <br />
  <br />
  <div>
    <Link to="/page-2/">Link: page 2 <br /> </Link>
    <Link to="/page-3/">Link: page 3 <br /> </Link>
  </div>

  <br />

  <div>
    <Link to="/counter/">Counter<br /> </Link>
  </div>
</div>
