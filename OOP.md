### Encapsulation 
Strict access to the attributes of the class through - for example - private attributes and public methods (getters & setters).And that in order to : 
- Validate something before applying modification to the data
- Set a certain condition to be applied on the new data entering before actually accepting it 
- Seperate the implementation details from the behaviour details.
- Ensures security and restricted access on the data 

### Abstraction
Its main goal is to Hide all the unnecessary implementation and only feature the capabilities that that certain class have for example  as well as handling complexity . 
It consists of : 
- Interface 
Initialize the methods without actually writing the implementation.It’s the part of the program that allows different classes to communicate

- Implementation 
The actuall details about that method that needs to be hidden 

### Inheritance
When a class(child) inherits the attributes & methods of another class (parent) while having its one local attributes and methods
Inheritance provides reuseability of the code as the methods written in the base (parent) class doesn’t need to be written again in the child class in order to be used through it .

### Polymorphysim
The ability of the varicle to take many forms. It’s achieved through two main concepts . There are two types of polymorphism 
- Run time (dynamic binding ) polymorphism that achieved through : Overriding 
Having more than one method with the same signature ( number of parameters , type of parameters and order of parameters  ) but each method has a different implementation > it’s usually associated with Inheritance 
- Compile time (static binding ) polymorphism that achieved through : Overloading 
Having more than one method with the same name but different signature  ( number of parameters , type of parameters and order of parameters  )
