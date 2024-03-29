# MIT 6.092 Lecture Notes

### Lecture 1: Types, Variables, Operators

* Programming languages like Java help us humans instruct the CPU.
* Steps to run a Java program: Source Code (.java) -> javac -> Byte Code (.class) -> java
* A Java program can be compiled and run from a single class structure.
* Variable values in Java can be assigned when initialized.
* When assignment of a variable occurs, the value is use rather than the pointer, unless specified.

### Lecture 2: More types, Methods, Conditionals

* Types are defined as kinds of values that can be stored and manipulated.
* A Variable is defined as the named location that stores a value.
* Instructed on the use of += operations to store the incremented value to itself.
* Division operates differently on integers and doubles.
* Mismatched types occur when initializing a variable to a value of the wrong data type.
* Casting converts one type to another if allowed.
* Methods have a return type and contain arguments.
* Methods are called by referencing the name of the method along with specifying any arguments necessary.
* Parameters are given to methods in the form of an expression.
* Return values pass out of the method an expression of the specified type given in the method's header.
* Method parameters are like defining a new variable in the method.
* Abstraction is the sense that a user does not need to know how a method works, only how to use it.
* Conversion by method: `Integer.toString()` and `Integer.parseInt()`

### Lecture 3: Loops, Arrays

* Rules:
  1. Use meaningful names.
  2. Use indentation.
  3. Use whitespaces and blank lines for readability.
  4. Do not duplicate tests.
* Loops allow many iterations of code to occur.
* Loops such as while, for allow breaking and continuing to modify the bahaviour of the loop.
* All elements of an arry must have the same type (unlike Python lists or dicts).
* `type[] name = new type[size];`
* Curly braces can be used to initialize an array only when you declare the variable.
* Arrays have a length variable built-in.

### Lecture 4: Classes and Objects

* Class names are capitalized and are generally limited to 1 per file and include a main method if execution is desirable.
* Constructors are useful for passing in less/more information in creating the object (overloading), but never return anything.
* Access to object fields and methods are through the dot method.
* Object locations are references not actually stored at one place.
* Creating arrays of objects or accessing methods or fields may modify the object, but never the reference to the object.
* Static means that the method/field is defined for the class declaration instead of the individual objects (gives a global sense).
* Non-static methods can reference static methods, but not vice versa.

### Lecture 5: Access Control, Class Scope, Packages, Java API

* Prive methods/fields are only accessible from within the class.
* Keyword _this_ specifies scope for fields.
* Packages contain classes that are accessed directly or indirectly from other packages via imporatation.
* Packages allow further organization to combine functionality of classes and to separate similar names for separate classes (shopping and packing lists).
* ArrayList (java.util.ArrayList) allows for a dynamic structure for arrays.
* Sets are like ArrayLists, but do not have an index and only one copy of each object.
* TreeSet (ordered lowest to highest) and HashSet (unordered) are two examples.
* Maps are just like dictionaries with key-value pair.
* Comparable interface is an issue for TreeSet/TreeMap classes that we build.
* "equals" and hashCode methods are concerns for use of HashSet/HashMap classes that we build.
