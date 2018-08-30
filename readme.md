1. What is Arrays class.
2. Ways to create an Object.
3. Difference b/w "?" and Object in generics.
4. Multiply 50 digit numbers.
5. Will finally be called if there is a return statement.
6. What is Static import.
7. what is final,finally and finalize.
8. Thread implementation (Thread class and Runnable interface).
9. What is class loader. Types of class loader.
10. Can we have try without catch (yes).
11. Base class of Exception.
12. Example/program for RuntimeException and Exception.
13. Singleton design pattern (sample code).
14. How to create immutable class.
15. Can we override static metohds.
16. IS-A and HAS-A relationship with aggregation and composition example.
18. (int… values) is passed as parameter to a method when you are not aware of the number of input parameter but know that the type of parameter(
19. Why array index starts with 0.
20. Can a key be null in hashmap.
21. Why can we have only one null key in HashMap.
22. Collection vs Collections.
23. Where in collection we have limitation of giving heterogeniuos elements only (tree set, tree map).
24. Size vs capacity in collection.
25. Zig-zab problem in matrix (print element)
26. Implement queue using stack.
27. Find mid node of a linked list travesing only once when last node address is not given.
27. Is overloading possible by changing return type.
28. Is overriding possible by changing return type.
29. Methods in object classe.
30.   
``` java
      void doStuff(int... x) { } // expects from 0 to many ints as parameters
      void doStuff2(char c, int... x) { } // expects first a char, then 0 to many ints  
      void doStuff3(Animal... animal) { } // 0 to many Animals
    Illegal:
      void doStuff4(int x...) { } // bad syntax
      void doStuff5(int... x, char... y) { } // too many var-args
      void doStuff6(String... s, byte b) { } // var-arg must be last
```      
31. Difference between transient and volatile in Java?
32. will it call Thread constructor.
``` java
Thread[] threads = new Thread[5];
```
**ref:- *book: Kathy Sierra, pg. 221***  
33. 
``` java
Thread[] threads = new Thread[5]; // works fine
Thread[] threads = new Thread[]; // Will not compile; needs a size
int[][] myArray = new int[3][]; // works fine, how its working fine when there is no column size given ??
```
**ref:- book *book: Kathy Sierra, pg. 223***  
34.
``` java
int[] weightList = new int[5];
byte b = 4;
char c = 'c';
short s = 7;
weightList[0] = b; // OK, byte is smaller than int
weightList[1] = c; // OK, char is smaller than int
weightList[2] = s; // OK, short is smaller than int
```
**ref:- book *book: Kathy Sierra, pg. 231***  


``` java
int[] splats;
int[] dats = new int[4];
char[] letters = new char[5];
splats = dats; // OK, dats refers to an int array
splats = letters; // NOT OK, letters refers to a char array
```
**ref:- book *book: Kathy Sierra, pg. 232***  

35.
``` java
Integer y = 567; // make a wrapper
Integer x = y; // assign a second ref
 // var to THE wrapper
System.out.println(y==x); // verify that they refer
 // to the same object
y++; // unwrap, use, "rewrap"
System.out.println(x + " " + y); // print values
System.out.println(y==x); // verify that they refer
 // to different objects
```  
Which produces the output:
```
 true
 567 568
 false
```
 **ref:- book *book: Kathy Sierra, pg. 245***  
 36.
 We just used ```==``` to do a little exploration of wrappers. Let's take a more thorough
look at how wrappers work with ```==, !=, and equals()```. We'll talk a lot more about
the ```equals()``` method in later chapters. For now all we have to know is that the
intention of the ```equals()``` method is to determine whether two instances of a given
class are *meaningfully equivalent*. This definition is intentionally subjective; it's
up to the creator of the class to determine what *equivalent* means for objects of the
class in question. The API developers decided that for all the wrapper classes, two
objects are equal if they are of the same type and have the same value. It shouldn't
be surprising that
``` java
Integer i1 = 1000;
Integer i2 = 1000;
if(i1 != i2) System.out.println("different objects");
if(i1.equals(i2)) System.out.println("meaningfully equal");
```

Produces the output:
```
different objects
meaningfully equal
``` 

It's just two wrapper objects that happen to have the same value. Because they
have the same int value, the equals() method considers them to be "meaningfully
equivalent", and therefore returns true. How about this one:
``` java
Integer i3 = 10;
Integer i4 = 10;
if(i3 == i4) System.out.println("same object");
if(i3.equals(i4)) System.out.println("meaningfully equal");
```
This example produces the output:
```
same object
meaningfully equal
```
Yikes! The equals() method seems to be working, but what happened with ==
and != ? Why is != telling us that i1 and i2 are different objects, when == is saying
that i3 and i4 are the same object? In order to save memory, two instances of the
following wrapper objects (created through boxing), will always be == when their
primitive values are the same:
```
■ Boolean
■ Byte
■ Character from \u0000 to \u007f (7f is 127 in decimal)
■ Short and Integer from -128 to 127
```
Note: When == is used to compare a primitive to a wrapper, the wrapper will be
unwrapped and the comparison will be primitive to primitive.
 **ref:- book *book: Kathy Sierra, pg. 246***  


