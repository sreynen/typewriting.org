---
path: "/2002/10/28/htmlspecialchars()" 
date: "2002/10/28 09:48:16" 
title: "htmlspecialchars()" 
---
lucky for me, php's <a href="http://www.zend.com/manual/function.htmlspecialchars.php">htmlspecialchars()</a> function takes an optional character set argument, which, when set to "euc-jp", worked fine in solving <a href="http://weblog.randomchaos.com/index.php?date=2002-10-28&amp;title=html+escaping">my japanese html escaping problem</a>. or more likely, lucky for me, enough people use php to display non-english text that the programmers saw fit to include default non-english support for this one function. i only wish they'd included default non-english support for other text-editing functions. but it hasn't yet been a major obstacle in my ability to produce <a href="http://weblog.randomchaos.com/japanese.php">daily japanese lessons</a>.