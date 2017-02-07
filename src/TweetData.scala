// real tweet data, collected on Oct 1
object TweetData {
  val gizmodo = """[
{ "user": "gizmodo", "text": "Kindle Paperwhite Review: Forget Everything Else, This Is the E-Reader You Want http://t.co/737W6aNC", "retweets": 51.0 },
{ "user": "gizmodo", "text": "These new Apple patents give a sneak peek at what future iPhone cameras might have in store. http://t.co/0YT9rjxp", "retweets": 49.0 }
]"""
  val TechCrunch = """[
{ "user": "TechCrunch", "text": "Pluralis Takes A Crowdsourced Approach To Improving Your Landing Pages http://t.co/YcqHJuC7 by @anthonyha", "retweets": 27.0 },
{ "user": "TechCrunch", "text": "Best photobomb of the day. http://t.co/Xa2EYTyd", "retweets": 326.0 },
{ "user": "TechCrunch", "text": "An Afternoon With Bad Piggies, Rovio's Next Hit http://t.co/KpYlmFSQ by @jordanrcrook", "retweets": 18.0 },
{ "user": "TechCrunch", "text": "Most Docks Should Work With The Lightning Adapter And iPhone 5 http://t.co/oGlTupcK by @johnbiggs", "retweets": 13.0 }
]"""
  val engadget = """[
{ "user": "engadget", "text": "Harman shows off its upcomming JBL docks and speakers, we go eyes-on -  http://t.co/5bz8UCBo", "retweets": 7.0 },
{ "user": "engadget", "text": "From the lab: Lumia 920 image stabilization and 808 drop test at Nokia R&amp;D (video) -  http://t.co/s9zFp7hU", "retweets": 13.0 },
{ "user": "engadget", "text": "Sony's Xperia T is now available on O2 and ThreeUK, Walther PPK/S not included -  http://t.co/LlZsSzqQ", "retweets": 7.0 }
]"""
  val amazondeals = """[
{ "user": "amazondeals", "text": "Deal of the Day: 50% Off Select BEARPAW Boots &amp; Slippers http://t.co/ZBvpSN33", "retweets": 0.0 },
{ "user": "amazondeals", "text": "Lightning Deal! $38.69 - Honeywell Portable Wireless Door Chime and Push Button http://t.co/yYBV4ebr", "retweets": 0.0 },
{ "user": "amazondeals", "text": "Lightning Deal! $124.99 - Ritmo Mundo Unisex White Sport Quartz Watch http://t.co/RfungjJC", "retweets": 0.0 },
{ "user": "amazondeals", "text": "Lightning Deal! $129.99 - Giulio Romano Piemonte Black Silicone Watch http://t.co/7v1ovQCQ", "retweets": 1.0 },
{ "user": "amazondeals", "text": "Lightning Deal! $59.99 - Stuhrling Original Men's Roulette Swiss Quartz Watch http://t.co/vreVCFvJ", "retweets": 0.0 }
]"""
  val CNET = """[
{ "user": "CNET", "text": "RT @CNETNews: Apple \"fell short\" with iOS 6 maps, and we are \"extremely sorry,\" CEO Tim Cook says in open letter http://t.co/t1U4497r", "retweets": 139.0 },
{ "user": "CNET", "text": "iPhone 5 to iPhone 4S: I vibrate so much harder than you http://t.co/1XMZVvVE", "retweets": 43.0 },
{ "user": "CNET", "text": "Leak: Photos of RIM's BlackBerry 10 phones hit the web http://t.co/X0OvqMwL", "retweets": 46.0 },
{ "user": "CNET", "text": "RT @CNETNews: Apple's Tim Cook: We are \"extremely sorry\" about those problems with iOS 6 Maps http://t.co/rlcCUgQO", "retweets": 114.0 },
{ "user": "CNET", "text": "Samsung Galaxy Music leak shows budget music phone http://t.co/aTAjDKk2", "retweets": 14.0 },
{ "user": "CNET", "text": "Bad Piggies review: Angry Birds follow-up bolts on complexity http://t.co/lmfK0Yjd", "retweets": 16.0 },
{ "user": "CNET", "text": "HTC One X+ turns up in O2 brochure, Jelly Bean in tow http://t.co/MGvjw24E", "retweets": 26.0 }
]"""
  val gadgetlab = """[
{ "user": "gadgetlab", "text": "RT @wired: FYI, @wired's liveblog photos are Creative Commons - repost, if you like, with link and license http://t.co/PewWjvwX", "retweets": 26.0 },
{ "user": "gadgetlab", "text": "Soon, photos from the inside of Apple's iPhone 5 event. @redgirlsays + @johnwbradley are on the scene... http://t.co/2mqmIhVB", "retweets": 14.0 },
{ "user": "gadgetlab", "text": "Apple iPhone 5 event LIVEBLOG: the event starts in 30 mins but we've got some photos of reporters standing in line! http://t.co/2mqmIhVB", "retweets": 26.0 },
{ "user": "gadgetlab", "text": "http://t.co/z7Dsi93S Search Confirms iPhone 5 with LTE Support, Plus New iPods http://t.co/a7mZnloy by @alexandra_chang", "retweets": 30.0 },
{ "user": "gadgetlab", "text": "@redgirlsays on the scene at Apple's iPhone 5 unveiling &amp; she has photos...of the outside of the event. Inside soon! http://t.co/5AtpHCfY", "retweets": 0.0 },
{ "user": "gadgetlab", "text": "Demoing at an Apple Event: Secretive, Stressful, and (Probably) Worth It http://t.co/7NOIDSJw by @strngwys", "retweets": 11.0 }
]"""
  val mashable = """[
{ "user": "mashable", "text": "China's Internet Is Getting Faster [INFOGRAPHIC] http://t.co/4dqj8Ln0", "retweets": 63.0 },
{ "user": "mashable", "text": "Camera+ Arrives on the iPad http://t.co/EG4nDhsQ", "retweets": 25.0 },
{ "user": "mashable", "text": "Cute Images Make Us 44% Sharper [STUDY] http://t.co/I4IiIbHX", "retweets": 42.0 },
{ "user": "mashable", "text": "Take 100 NASA Photos, Stir, Make Van Gogh's 'Starry Night' http://t.co/dQv6mvwI", "retweets": 73.0 },
{ "user": "mashable", "text": "Why Being Unfriended on Facebook Hurts [STUDY] http://t.co/0eHHUrTo", "retweets": 51.0 },
{ "user": "mashable", "text": "Think Apple Maps Is Bad? Remember the Tale of MobileMe http://t.co/Koeew9eU", "retweets": 41.0 }
]"""
}
