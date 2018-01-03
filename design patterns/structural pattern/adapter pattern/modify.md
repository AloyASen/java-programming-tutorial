this is the first design pattern ever implemented by a cs coder 

remember the adapter pattern can only be implemented when multiple inheritance is allowed 

the class is to get the correct data interface between existing and new code as a adapter between the informations to be exchanged.

output:: 
---------

LegacyRectangle:  create.  (120,200) => (180,240)
RectangleAdapter: create.  (120,200), width = 60, height = 40
RectangleAdapter: draw.
LegacyRectangle:  oldDraw.  (120,200) => (180,240)



the pages that are best suited for learning

refactoring.guru

sourcemaking.com


downside 
---------

Increases overall code complexity by creating additional classes.



Bridge is designed up-front to let the abstraction and the implementation vary independently. Adapter is retrofitted to make unrelated classes work together. Adapter makes things work after they're designed; Bridge makes them work before they are.


Adapter provides a different interface to its subject. Proxy provides the same interface. Decorator provides an enhanced interface.


Adapter is meant to change the interface of an existing object. Decorator enhances another object without changing its interface. Decorator is thus more transparent to the application than an adapter is. As a consequence, Decorator supports recursive composition, which isn't possible with pure Adapters.


Facade defines a new interface, whereas Adapter reuses an old interface. Remember that Adapter makes two existing interfaces work together as opposed to defining an entirely new one.

State, Strategy, Bridge (and to some degree Adapter) have similar solution structures. They all share elements of the "handle/body" idiom. They differ in intent - that is, they solve different problems.