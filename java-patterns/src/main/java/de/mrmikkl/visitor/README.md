= Visitor

== Description
Good to ensure Open-Close principle.
Thus the pattern is open for extension and closed for modification.

This can be seen when looking at the Converter in the domain Document.
It is just reached in when the methode "convert" is called.

So it is really easy to add new Converters without touching the domain.

Additionally the pattern allows you to seperate the logic of several classes out of its context.
Converting is not the primary function maybe you want to have in your domain.
Thus with Visitor pattern you can nicely seperate the logic and implement at a different place.
