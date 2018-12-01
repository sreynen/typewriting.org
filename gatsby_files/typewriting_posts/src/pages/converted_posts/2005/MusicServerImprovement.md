---
path: "/2005/09/03/MusicServerImprovement" 
date: "2005/09/03 16:03:42" 
title: "Music Server Improvement" 
---
<p>If you've been having problems with <a href="http://music.randomchaos.com/">the music server</a>, it's fixed now. The problem only effected larger files (i.e. long songs) due to the way I was loading the entire file before sending it on. Now I'm sending every bit of the requested file as it is read. In addition to actually working for larger files, this will allow you to start listening to songs as they are downloaded, which is good for people on slower connections. If you have any future problems with the music server, please notify me.</p>