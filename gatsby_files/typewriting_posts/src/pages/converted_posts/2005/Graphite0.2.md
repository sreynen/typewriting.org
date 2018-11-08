---
path: "/2005/08/14/Graphite0.2" 
date: "2005/08/14 16:11:54" 
title: "Graphite 0.2" 
---
I discovered a couple flaws in <a href="http://www.randomchaos.com/software/dashboard/graphite/">Graphite</a>. One just resulted in ugly graphs, but the other was an infinite loop that slowed the entire system. Both only happen after running the same graph for over a month, which no one but I could have possibly done.<br><blockquote>0.2 beta fixes two flaws in 0.1 beta. You should replace 0.1 with 0.2 to avoid problems.</blockquote>