---
path: "/2002/12/18/QMLvs.QEL" 
date: "2002/12/18 23:48:24" 
title: "QML vs. QEL" 
---
i plan to make some games that use quotations as content and generate puzzles in which the players must discover the quotes. before i do this, i thought i should make a program to create and edit the lists of quotations these games would use. xml is a good format for this kind of thing, and i remembered there being an xml format for quotations last time i wanted to do something with xml and quotations. back then i just wanted to offer my own quote collection as XML, for no other purpose than to get some experience with XML using content i already had. it was then that i first came across <a href="http://www.amk.ca/qel/">QEL, the quotation exchange language</a>, and it worked fine as i remember.<br>of course, i wasn't actually *doing* anything then. unfortunately, now that i actually want to do something with the quotes, QEL has quickly proved to be an impossible format for my plans. the problem is that QEL uses &lt;p&gt; tags to designate the content of a quotation. this works fine if the end destination of the quote is an html page, but if it's not, it forces the XML parser to check each &lt;p&gt; tag and lump them all together. it was as i considered doing this that i realized QEL didn't make any sense structurally. the logical structure of a quotation is not source and paragraph (and maybe more paragraphs), but rather source and content. the content may contain paragraphs (or it may not), but those paragraphs are not structurally significant to the quote, nor is any other display markup (e.g. html).<br>i prefer to create tools that build upon work others have done before, but i'm going to reinvent the wheel this time (although, i think my version rolls better) and make a new XML format for quotations. i'll call it QML (quotation markup language) to avoid confusion. it will be just like QEL, only the content of a quote will be placed within &lt;content&gt; tags, and any display markup will be escaped (if not avoided), so it doesn't get parsed as XML. of course, none of this matters if i'm the only one using QML. it seems there's only one person using QEL right now, but i'm hoping that's because the format isn't widely usable, and not just because no one else has any interest in XML and quotations.