---
path: "/2006/05/18/Fastr_Bug_Reporting" 
date: "2006/05/18 09:19:24" 
title: "Fastr Bug Reporting" 
---
<p>Two days ago, <a href="http://blog.flickr.com/flickrblog/2006/05/alpha_beta_gamm.html">flickr was updated</a>. The update slightly changed the formatting of pages on flickr. For almost everything on fastr, that doesn't matter because it's using the <a href="http://www.flickr.com/services/api/">flickr API</a>. But the flickr API doesn't provide a way to get a list of tags used by a group, so that part is taken straight from the HTML on flickr. When that HTML changed, <a href="http://randomchaos.com/games/fastr/group/">fastr groups</a> broke. It didn't break right away because the tags are only updated once a day. But eventually, none of the group games were working. I just fixed that. Thanks to 'j/gimmeacookie' for <a href="http://typewriting.org/2006/04/16/Fastr_Groups/#comment-2252">pointing out this bug</a>. Or at least I think that's the bug that was pointed out. Maybe that was a different bug?</p><br><p>If you see something wrong with fastr, please report it either by <a href="mailto:scott@randomchaos.com">emailing me</a> or by posting a comment on any relevant blog post, and provide as much detail as you can, e.g. which browser you're using, which game you're playing, what exactly happened. As much as I'd like to, I can't play fastr 24/7 on a wide variety of browsers, so these reports are very useful in finding and fixing problems. Thanks, and sorry about the brokenness.</p>