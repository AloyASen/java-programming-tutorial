Bridge is a structural design pattern that lets you split a giant class or a set of closely related classes into two separate hierarchies, abstraction and implementation, which can be developed independently of each other.


The motivation is to decouple the Time interface from the Time implementation, while still allowing the abstraction and the realization to each be modelled with their own inheritance hierarchy. The implementation classes below are straight-forward. The interface classes are a little more subtle. Routinely, a Bridge pattern interface hierarchy "has a" implementation class. Here the interface base class "has a" a pointer to the implementation base class, and each class in the interface hierarchy is responsible for populating the base class pointer with the correct concrete implementation class. Then all requests from the client are simply delegated by the interface class to the encapsulated implementation class.

