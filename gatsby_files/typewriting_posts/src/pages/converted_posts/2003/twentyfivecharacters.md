---
path: "/2003/08/22/twentyfivecharacters" 
date: "2003/08/22 10:51:57" 
title: "twenty five characters" 
---
<a href="http://inessential.com/?comments=1&amp;postid=2606">brent just added gzip compression support to net news wire</a>, and noted that few webloggers are gzipping. <a href="http://weblog.randomchaos.com/index.php?date=2002-11-24&amp;title=i%27m+gzipped">i've been gzipping for nine months now</a>, so i'm a qualified expert to offer a short tutorial for weblog authors using php:<br>to enable gzipping in php, add the following code to the top of each script (or to a single script included at the top of all others):<br /><br><tt>ob_start("ob_gzhandler");</tt><br>i know it looks complicated, but with a little trial and error, you too can type those twenty five characters and do your part to reduce bandwidth. for advanced coders, there's a special method involving procedures known as "copy" and "paste", but i won't get into that here.