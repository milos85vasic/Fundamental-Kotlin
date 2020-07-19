package net.milosvasic.fundamental.syntax

val firstName = "John"
val lastName = "John"
var title = "We called $firstName $lastName to come."

val profession = "captain"
val subtitle = "He is: ${if (firstName == "John") profession else "sailor"}."

val bornDay = 6
val bornYear = 1580
val bornMonth = "June"

val diedDay = 21
val diedYear = 1631
val diedMonth = "June"

val body = """
${profession.capitalize()} $firstName $lastName
($bornDay $bornMonth $bornYear - $diedDay $diedMonth $diedYear),
Admiral of New England, was an English soldier, explorer, and author.
He was knighted for his services to Sigismund Báthory, Prince of Transylvania, and his friend Mózes Székely.
His books and maps were important in encouraging and supporting English colonization of the New World.
He gave the name New England to the region and noted:
"Here every man may be master and owner of his own labour and land...
If he have nothing but his hands, he may...by industries quickly grow rich."
"""