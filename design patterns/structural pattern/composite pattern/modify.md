Composite is a structural design pattern that lets you compose objects into tree structures and allow clients to work with these structures as if they were individual objects.


The composite pattern makes sense only when your business model can be represented as a tree.

The Composite pattern offers two basic elements: simple leaves and complex containers that store other leaves or containers, and so on. Pattern forces the containers to work with all child elements through the common interface, which allows running operations recursively over the whole tree structure.

