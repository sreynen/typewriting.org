---
path: "/2003/01/10/bugging_CSS" 
date: "2003/01/10 09:15:20" 
title: "bugging CSS" 
---
<p><a href="http://diveintomark.org/archives/2003/01/09.html#should_safari_be_intentionally_buggy">mark pilgrim is toying with the (admitedly evil) idea of intentionally adding a "bug" to safari's handling of <abbr title="Cascading Style Sheets">CSS</abbr> for the sake of allowing designers to detect the browser.</a> this functionality can be achieved with minimal harm. a <abbr title="Cascading Style Sheets">CSS</abbr> statement such as <code>onlysafari body { display: none; }</code> would be technically valid, and could be interpretted only by safari (despite the lack of any actual &lt;onlysafari&gt; tags in the displayed page). additionally, similar syntax could be handled by all browsers without doing significant damage to the <abbr title="Cascading Style Sheets">CSS</abbr> standard.</p>