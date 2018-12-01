---
path: "/2005/10/01/Flickr_Bookmarklet_Update" 
date: "2005/10/01 19:56:01" 
title: "Flickr Bookmarklet Update" 
---
<p>Flickr changed format and broke <a href="http://typewriting.org/2005/08/28/Flickr_Full-Size_Bookmarklet/">my previous bookmarklet</a>. At first I thought maybe they actually moved protected images to a protected server, but they just changed some variable names. So here's the updated bookmarklet that makes it (too) easy to get the full size version of protected images:</p><br><p><a href="javascript: for( i in global_photos ) { p = global_photos[i]; } window.location = 'http://static.flickr.com/' + p.server + '/' + p.id + '_' + p.secret + '_o.jpg';">Get Flickr Original</a></p>