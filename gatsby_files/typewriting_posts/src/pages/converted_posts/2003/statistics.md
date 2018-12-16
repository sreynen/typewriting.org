---
path: "/2003/03/23/statistics" 
date: "2003/03/23 00:44:54" 
title: "statistics" 
---
<p>i finally got around to making a <a href="http://www.randomchaos.com/statistics.php">statistics</a> system using a database. the previous system would start to die toward the end of a busy month as the log files grew longer. the new system only checks the log files for new data and then passes that data to a database, from which it can be quickly sorted and displayed. the database also allows me reuse the data for tasks like automatically pointing back to incoming links on a given weblog post, or tracking downloads of software or music.</p>