---
path: "/2002/11/21/itseemsihaveshellaccess" 
date: "2002/11/21 23:43:13" 
title: "it seems i have shell access" 
---
i just discovered that, while i don't have telnet access to my hosted domain, i can access the server shell via PHP (uploaded via FTP). i wonder if my host knows about this. i'm no security expert, but it doesn't seem to me that FTP is any more secure than telnet. (in both cases, if someone gets my password, they have access to a command line.) i'm also no shell expert, but i think i'll start poking around and see what applications are on my server that i can interface with via PHP.