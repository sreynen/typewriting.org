---
path: "/2005/12/13/Graphite" 
date: "2005/12/13 08:47:44" 
title: "Graphite" 
---
I received my first donation for <a href="http://www.randomchaos.com/software/dashboard/graphite/">Graphite</a> last night, and that made me start thinking about it again, which I haven't done in a while. Turns out it is listed on <a href="http://www.apple.com/downloads/dashboard/networking_security/graphite.html">Apple's Dashboard</a> site, though under the "Networking Security" category for some reason. Oh well.<br>The reason I haven't been thinking about Graphite is that I hit a roadblock with my attempts to add zooming and scrolling to the graphs. Scrolling is all done, but it turns out that numbers and dates don't zoom well together.  To keep the numbers somewhat readable in a small space, e.g. "90K" rather than 90,001, I can only zoom numbers by factors of ten. But for dates, the best zoom factor is two, and even that's not perfect: 1 month, 2 weeks, 1 week, 3 days, 36 hours, etc.<br>But last night I realized that rather than changing the values of the end points on the graph, I can just move the them until they match up with a more readable label. So if that graph goes up to 90,001, I can just move the top line down a pixel or two, and still label it accurately as 90K. Now that I've realized what probably should have been obvious a long time ago, I just need to implement it, which I will hopefully get done this weekend.