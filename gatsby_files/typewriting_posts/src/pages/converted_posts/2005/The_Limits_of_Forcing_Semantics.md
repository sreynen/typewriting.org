---
path: "/2005/10/25/The_Limits_of_Forcing_Semantics" 
date: "2005/10/25 21:25:37" 
title: "The Limits of Forcing Semantics" 
---
<p>I gather most people involved in microformats are coming from a background heavy in more formally structured data, e.g. RDF, XML, relational databases. I'm coming more from the opposite background: scraping. Recently <a href="http://platformwars.blogspot.com/2005/10/alternatives-to-semantic-web.html">Phil Jones</a> described a web in which metadata resides in scraping/parsing applications meaning documents need not be so descriptive, and <a href="http://dannyayers.com/archives/2005/10/24/an-alternative-the-synweb/">Danny Ayers</a> predictably responded with an argument for the Semantic Web, in which metadata resides in documents meaning applications need not be so smart.</p><br><p>In Danny's comments, I tried to point out the applications Phil predicts can produce the documents Danny predicts. I already do a small amount of this with all my scrapers. On <a href="http://disemployed.com/">Disemployed</a>, I add location and time information to each job posting and publish that information in a regular format (HTML, RSS 1, RSS 2, or Atom). I could admittedly be structuring this information more formally to better encourage reuse, but the data is there, in any case, where it wasn't before. But this is relatively simple data to add. I know when I found each job post and where it came from, so my application doesn't need to be very smart. What are the limits of a smart application? Could a very crafty application actually make microformats unnecessary?</p><br><p>Let's take one microformat, hCard, and see how guessable the microformat metadata would be if it weren't there, on a scale of zero to ten:</p><br><ul><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.1.1_FN_Type_Definition">fn</a> (full name): this could at best be a guess. A name could feasibly contain pretty much any combination of letters. I'm sure someone somewhere has named a child "Asdf Jkl." Microformats are the easiest way to identify fn. 0/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.1.2_N_Type_Definition">n</a> (name): same here. 0/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.1.3_NICKNAME_Type_Definition">nickname</a>: again, no easy way out. 0/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.1.4_PHOTO_Type_Definition">photo</a>: here we have a winner, mostly. I'm guessing eight times out of ten, any image referenced within something identified as hCard information will be a photo. Depending on how lucky we feel, microformats could be dispensed with here. 7/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.1.5_BDAY_Type_Definition">bday</a> (birthday): this is a bit complicated. Dates follow very standard formats, and we could probably identify dates in a jumble of text with about 95% accuracy. But how do we know if a given date is a birthday? We can assume relatively safely based on proximity to words like "birthday." 9/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.2.1_ADR_Type_Definition">adr</a> (address): I would have guessed this would be very hard to identify as a pattern, but <a href="http://blog.outer-court.com/archive/2005-02-16-n59.html">Google is already doing this</a>. Of course, Google is limiting to US addresses. 5/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.2.2_LABEL_Type_Definition">label</a>: at first, this appears to be as open-ended as names, but the variety in practice is likely very limited.  I would expect a list of a few dozen words likely to occur in a label (e.g. home, domestic, etc.) would catch maybe 7/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.3.1_TEL_Type_Definition">tel</a> (telephone): this is a bit complicated. Having an address makes it much easier to tell if a given set of numbers is likely a phone number. Capturing anything that fits the patterns (###) ###-#### or ###-###-#### would get many phone numbers, and I suspect more is possible. 6/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.3.2_EMAIL_Type_Definition">email</a>: This one is easy. An email address must fit <a href="http://www.faqs.org/rfcs/rfc822.html">a defined pattern</a>, so we can discover all email addresses with no microformat, as evidenced by the proliferation of junk email. 10/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.3.3_MAILER_Type_Definition">mailer</a>: At any given time, there are only so many known email clients. 8/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.4.1_TZ_Type_Definition">tz</a> (time zone): There are only so many timezones, and not too many ways to describe them. 9/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.4.2_GEO_Type_Definition">geo</a>: Latitude and Longitude information is pretty much useless if it doesn't follow a certain pattern (decimal numbers between -180 and 180), but that doesn't mean all numbers that follow this pattern are geo codes. 6/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.5.1_TITLE_Type_Definition">title</a>: Theoretically unlimited, but practically limited. 7/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.5.2_ROLE_Type_Definition">role</a>: Words ending in "er" would catch a lot. Check for proximity to words like "job," "work," or "professional." 5/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.5.3_LOGO_Type_Definition">logo</a>: Just like photo, only probably smaller. 7/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.5.4_AGENT_Type_Definition">agent</a>: I had to look this one up. Auto-discovery doesn't look good. 0/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.5.5_ORG_Type_Definition">org</a>: Just like names, only worse. 0/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.6.1_CATEGORIES_Type_Definition">categories</a>: Could be anything. 0/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.6.2_NOTE_Type_Definition">note</a>: Again, anything. 0/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.6.4_REV_Type_Definition">rev</a>: Dates near words like "updated" or "modified." 7/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.6.5_SORT-STRING_Type_Definition">sort-string</a>: Usually last word in the name. 6/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.6.6_SOUND_Type_Definition">sound</a>: Sounds have defined formats. 10/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.6.7_UID_Type_Definition">uid</a>: Pass. 0/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.6.8_URL_Type_Definition">url</a>: First standard link. 7/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.7.1_CLASS_Type_Definition">class</a>: Pass. 0/10.</li><br>	<li><a href="http://microformats.org/wiki/hcard-examples#3.7.2_KEY_Type_Definition">key</a>: Keys follow patterns. 10/10.</li><br></ul><br><p>Average: 5.3/10. In general there are some areas in which microformats are entirely unneccesary, some in which they are entirely necessary, and some in between. Of course, these are mostly rough estimates on the potential accuracy of intelligent scraping. The actual accuracy would need to be determined by writing a scraper and pitting it against some actual data.</p><br><p>In any case, microformats appear well worth the expense to capture that 47% (or however much) of the existing information. Even though email addresses are entirely identifiable without any microformat, as long as we're wrapping names in name tags, it makes sense to wrap the email addresses at the same time so a parser doesn't need to be any smarter.</p><br><p>While not the absolute simplest method, microformats appear to be the lowest common denominator of structured documents. So now I think I was wrong when <a href="http://typewriting.org/2005/08/02/PiggyBank_and_Forced_Semantics/">I wrote</a> that <q>we're headed towards a "semantic web" in which the semantics are forced onto websites by browsers and other intermediaries.</q> I still expect that will happen (as I notice it happening, and cause it to happen), but given the practical limits of the smart-application method of connecting the world of information, it will only work as a bridge to a semantic web composed of metadata-rich documents.</p>