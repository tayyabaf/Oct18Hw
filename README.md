# Design Patterns
SINGLETON
>Lets you ensure that a class has only one instance and provides global access point to this instance
>
> Can only be instanitated once.
> 
> Make the default constructor private and a static creation method

BUILDER
>Lets you construct complex objects step by step.
> 
> Allows you to use different types and representations of an object using the same representation code
> 
> Suggests that you extract the object construction code out of its own class and move it to separate objects called builders


PROTOTYPE
>Lets you copy existing objects without making your own code dependant on their classes
> 
> Delegates the cloning process to the actual objects that are being cloned
> 
> Declares a common interface for all objects that support cloning
> >This interface usually lets u clone an object w/out coupling ur code to the class of an object
> 
> >Usually, such an interface has one clone method


FACTORY
>Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created
>
> Suggests that u replace direct object construction calls with calls to a special factory method
> >Objects returned by a factory method are called *products*
>
> Limitations: subclasses may return different types of products only if these products have a common base class or interface


ABSTRACT FACTORY
>Lets you product families of related objects w/out specifying their concrete classes
> 
> Suggests to explicitly declare interfaces for ech distinct product of the product family, then make all variants of those proucts follow those interfaces
> 
> Need to declare Abstract Factory, which is an interface w/ a list of creation methods for all products that are part of the product family
> >These methods must return abstract product types represented by the interfaces we extracted previously
> 
> For each variant of a product family, create a separate factory class based on the AbstractFactory interface
> >A factory is a class that returns products of a paritcular kind


ADAPTER
>Allows objects with incompatible interfaces to collaborate
> 
> It is a special object which converts the interface of one object so that another object can understand it


COMPOSITE
>Lets you compose objects into tree structures and then work with these structures as if they were individual objects
>
> Example: Products & Boxes - A box can contain several products as well as smaller boxes. These smaller boxes can hold products or even smaller boxes
> 
> Suggests to create a common interface which dives deep into the contents of the tree


DECORATOR
>Lets u attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors
> 
> Key principles: Aggregation and Composition


FACADE
> Provides a simplified interface to a library, a framework, or ny other complex set of classes
> 
> Downsides: may provide limited functionality
> >However, it includes only those features that clients really care about
> 
> Only useful when you need to integrate ur app w/ a sophisitcated library that has dozens of features, but u only need a tiny piece of its functionality


PROXY
>Lets you provide a substitue or placeholder for another object
> 
> Controls access to the original object, allowing u to perform something either before or after the request gets thru to the orginal object
> 
> Suggests u create a new proxy class w/ the same interface as an original object
> 
> Benefits: If you need to execute something either before or after the primary logic of the class, the proxy lets you do this without changing that class
