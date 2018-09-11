1. What is Arrays class.
2. Ways to create an Object.
3. Difference b/w "?" and Object in generics.
4. Multiply 50 digit numbers.
5. Will finally be called if there is a return statement.
6. What is Static import.
7. what is final,finally and finalize.
8. thread implementation (Thread class and Runnable interface).
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
21. Why we can have only one null key in HashMap.
22. Collection vs Collection.
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
look at how wrappers work with ```==```, ```!=```, and ```equals()```. We'll talk a lot more about
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
Autoboxing (Exam Objective 3.1) 245
246 Chapter 3: Assignments
It's just two wrapper objects that happen to have the same value. Because they
have the same int value, the ```equals()``` method considers them to be *meaningfully
equivalent*, and therefore returns true. How about this one:
```java
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
Yikes! The ```equals()``` method seems to be working, but what happened with ```==```
and ```!= ?``` Why is ```!=``` telling us that ```i1``` and ```i2``` are different objects, when ```==``` is saying
that ```i3``` and ```i4``` are the same object? In order to save memory, two instances of the
following wrapper objects (created through boxing), will always be ```==``` when their
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
37.
``` java

public class Demo{

Demo(Object o)
{
// do something..
}

Demo(String o)
{
// do something..
}

public static void main(String a[]){
 Demo d=new Demo(null); // which one would be called ??

}

}
```
38. why Map is not the part of collection.
39. does abstract class has contructor??
Abstract classes have constructors, and those constructors are always called when a concrete subclass is instantiated.
40. 
Floating-point numbers have slightly different assignment behavior than integer types. First, you must know that every floating-point literal is implicitly a double (64 bits), not a float. So the literal 32.3, for example, is considered a double. If you try to assign a double to a float, the compiler knows you don't have enough room in a 32-bit float container to hold the precision of a 64-bit double, and it lets you know. The following code looks good, but won't compile:
```
float f = 32.3;
```
You can see that 32.3 should fit just fine into a float-sized variable, but the compiler won't allow it. In order to assign a floating-point literal to a float variable, you must either cast the value or append an f to the end of the literal. The following assignments will compile:
```
float f = (float) 32.3;
float g = 32.3f;
float h = 32.3F;
```
41.
``` java
class AddBoxing {
static void go(Integer x) { System.out.println("Integer"); }
static void go(long x) { System.out.println("long"); }
public static void main(String [] args) {
int i = 5;
go(i); // which go() will be invoked?
} }
```
As we've seen earlier, if the only version of the go() method was one that took an Integer, then Java 5's boxing capability would allow the invocation of go() to succeed. Likewise, if only the long version existed, the compiler would use it to handle the go() invocation. The question is, given that both methods exist, which one will be used? In other words, does the compiler think that widening a primitive parameter is more desirable than performing an autoboxing operation? The answer is that the compiler will choose widening over boxing, so the output will be
```
long
```
42.
Java 5's designers decided that the most important rule should be that preexisting code should function the way it used to, so since widening capability already existed, a method that is invoked via widening shouldn't lose out to a newly created method that relies on boxing. Based on that rule, try to predict the output of the following:
``` java
class AddVarargs {
static void go(int x, int y) { System.out.println("int,int");}
static void go(byte... x) { System.out.println("byte... "); }
public static void main(String[] args) {
byte b = 5;
go(b,b); // which go() will be invoked?
}
}
```
250 Chapter 3: Assignments
As you probably guessed, the output is
```
int,int
```
Because, once again, even though each invocation will require some sort of conversion, the compiler will choose the older style before it chooses the newer style, keeping existing code more robust. So far we've seen that
```
■ Widening beats boxing
■ Widening beats var-args
```
At this point, inquiring minds want to know, does boxing beat var-args?
```
class BoxOrVararg {
static void go(Byte x, Byte y)
{ System.out.println("Byte, Byte"); }
static void go(byte... x) { System.out.println("byte... "); }
public static void main(String [] args) {
byte b = 5;
go(b,b); // which go() will be invoked?
} }
```
As it turns out, the output is
```
Byte, Byte
```
A good way to remember this rule is to notice that the var-args method is "looser" than the other method, in that it could handle invocations with any number of byte parameters. A var-args method is more like a catch-all method, in terms of what invocations it can handle, and as we'll see in Chapter 5, it makes most sense for catch-all capabilities to be used as a last resort.
43.
Earlier versions of the exam put big emphasis on operator precedence ```(like: What’s the result of: x = y++ + ++x/z;)```. Other than a very basic knowledge
of precedence ```(such as: * and / are higher precedence than + and -)```, you won’t need to study operator precedence, except that when using a compound operator, the expression on the right side of the = will always be evaluated first. For example, you might expect
```
x *= 2 + 5;
```
to be evaluated like this:
```
x = (x * 2) + 5; // incorrect precedence
```
since multiplication has higher precedence than addition. But instead, the expression on the right is always placed inside parentheses. it is evaluated like this:
```
x = x * (2 + 5);
```
44.
Why string is immutable ??

One of the key goals of any good programming language is to make efficient use of memory. As applications grow, it's very common for String literals to occupy large amounts of a program's memory, and there is often a lot of redundancy within the
434 Chapter 6: Strings, I/O, Formatting, and Parsing
universe of String literals for a program. To make Java more memory efficient, the JVM sets aside a special area of memory called the "String constant pool." When the compiler encounters a String literal, it checks the pool to see if an identical String already exists. If a match is found, the reference to the new literal is directed to the existing String, and no new String literal object is created. (The existing String simply has an additional reference.) Now we can start to see why making String objects immutable is such a good idea. If several reference variables refer to the same String without even knowing it, it would be very bad if any of them could change the String's value.  
You might say, "Well that's all well and good, but what if someone overrides the String class functionality; couldn't that cause problems in the pool?" That's one of the main reasons that the String class is marked final. Nobody can override the behaviors of any of the String methods, so you can rest assured that the String objects you are counting on to be immutable will, in fact, be immutable.

45.
``` java
String s=new String("hello");
StringBuffer sb=new StringBuffer("hello");
if(s.equals(sb))
{
System.out.println("equals");
}
else
{
System.out.println("not equals");
}
```

46.
``` java
The following legal code demonstrates a try with a finally but no catch:
try {
 // do stuff
} finally {
 //clean up
}
The following legal code demonstrates a try, catch, and finally:
try {
 // do stuff
} catch (SomeException ex) {
 // do exception handling
} finally {
 // clean up
}
The following ILLEGAL code demonstrates a try without a catch or finally:
try {
 // do stuff
}
// need a catch or finally here
System.out.println("out of try block");
The following ILLEGAL code demonstrates a misplaced catch block:
try {
 // do stuff
}
// can't have code between try/catch
System.out.println("out of try block");
catch(Exception ex) { }
```



It is illegal to use a try clause without either a catch clause or a fi nally
clause. A try clause by itself will result in a compiler error. Any catch clauses must
immediately follow the try block. Any fi nally clause must immediately follow the last
catch clause (or it must immediately follow the try block if there is no catch). It is legal
to omit either the catch clause or the fi nally clause, but not both

```
You can’t sneak any code in between the try, catch, or fi nally blocks.
The following won’t compile:
try {
 // do stuff
}
System.out.print("below the try"); //Illegal!
catch(Exception ex) { }
```
 **ref:- book *book: Kathy Sierra, pg. 261***  
 
 47.
 So let's look at what else might cause a hashCode() method to fail. What
happens if you include a transient variable in your hashCode() method? While
that's legal (compiler won't complain), under some circumstances an object you
put in a collection won't be found. As you know, serialization saves an object so
that it can be reanimated later by deserializing it back to full objectness. But danger
Will Robinson—remember that transient variables are not saved when an object is
serialized.

 **ref:- book *book: Kathy Sierra, pg. 555***  

48.
find last location of 1 in the descending sorted array which contains only 0 and 1.

eaxmple:
1111000

in a most efficient way.

ans: divide and conquer.

49.
can we define main method as private.
if yes then will it compile ??

50.
what is 'headSet()' and 'tailSet()'

``` java
import java.util.TreeSet;

public class Javaapp {

    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet();
        ts.add(20);
        ts.add(40);
        ts.add(60);
        ts.add(80);
        System.out.println("ceiling(15)  : "+ts.ceiling(15));
        System.out.println("ceiling(25)  : "+ts.ceiling(25));
        System.out.println("floor(65)    : "+ts.floor(65));
        System.out.println("floor(85)    : "+ts.floor(85));
        System.out.println("headSet(65)  : "+ts.headSet(65));
        System.out.println("tailSet(25)  : "+ts.tailSet(25));
    }
}
```

```
ceiling(15)  : 20
ceiling(25)  : 40
floor(65)    : 60
floor(85)    : 80
headSet(65)  : [20, 40, 60]
tailSet(25)  : [40, 60, 80]
```

``` java
TreeSet<Integer> subset = new TreeSet<Integer>();
 subset = (TreeSet)times.headSet(1600);
 System.out.println("J5 - last before 4pm is: " + subset.last());
 TreeSet<Integer> sub2 = new TreeSet<Integer>();
 sub2 = (TreeSet)times.tailSet(2000);
 System.out.println("J5 - first after 8pm is: " + sub2.first());
 // Java 6 version using the new lower() and higher() methods
 System.out.println("J6 - last before 4pm is: " + times.lower(1600));
 System.out.println("J6 - first after 8pm is: " + times.higher(2000));
```
```
This should produce the following:
J5 - last before 4pm is: 1545
J5 - first after 8pm is: 2010
J6 - last before 4pm is: 1545
J6 - first after 8pm is: 2010
```


We've talked about searching lists and arrays. Let's turn our attention to searching
TreeSets and TreeMaps. Java 6 introduced (among others) two new interfaces:
java.util.NavigableSet and java.util.NavigableMap. For the purposes
of the exam, you’re interested in how TreeSet and TreeMap implement these
interfaces.
Imagine that the Santa Cruz–Monterey ferry has an irregular schedule. Let's
say that we have the daily Santa Cruz departure times stored, in military time, in a
TreeSet. Let's look at some code that determines two things:
 1. The last ferry that leaves before 4 (1600 hours)
 2. The first ferry that leaves after 8 (2000 hours)
 ``` java
import java.util.*;
public class Ferry {
 public static void main(String[] args) {
 TreeSet<Integer> times = new TreeSet<Integer>();
 times.add(1205); // add some departure times
 times.add(1505);
 times.add(1545);
 times.add(1830);
 times.add(2010);
 times.add(2100);
 // Java 5 version
 TreeSet<Integer> subset = new TreeSet<Integer>();
 subset = (TreeSet)times.headSet(1600);
 System.out.println("J5 - last before 4pm is: " + subset.last());
 TreeSet<Integer> sub2 = new TreeSet<Integer>();
 sub2 = (TreeSet)times.tailSet(2000);
 System.out.println("J5 - first after 8pm is: " + sub2.first());
 // Java 6 version using the new lower() and higher() methods
 System.out.println("J6 - last before 4pm is: " + times.lower(1600));
 System.out.println("J6 - first after 8pm is: " + times.higher(2000));
 }
}
```
```      
This should produce the following:
J5 - last before 4pm is: 1545
J5 - first after 8pm is: 2010
J6 - last before 4pm is: 1545
J6 - first after 8pm is: 2010
```      
As you can see in the preceding code, before the addition of the NavigableSet
interface, zeroing in on an arbitrary spot in a Set—using the methods available in
Java 5—was a compute-expensive and clunky proposition. On the other hand, using
the new Java 6 methods lower() and higher(), the code becomes a lot cleaner.
For the purpose of the exam, the NavigableSet methods related to this type of
navigation are lower(), floor(), higher(), ceiling(), and the mostly parallel
NavigableMap methods are lowerKey(), floorKey(), ceilingKey(), and
higherKey(). The difference between lower() and floor() is that lower()
returns the element less than the given element, and floor() returns the element
less than or equal to the given element. Similarly, higher() returns the element
greater than the given element, and ceiling() returns the element greater than or
equal to the given element. Table 7-4 summarizes the methods you should know for
the exam. 

**other Navigation method**  
Polling  
Descending Order

 **ref:- book *book: Kathy Sierra, pg. 589***  
 
 
 51.
 It’s important to know some of the details of natural ordering. The
following code will help you understand the relative positions of uppercase characters,
lowercase characters, and spaces in a natural ordering:
``` java
String[] sa = {">ff<", "> f<", ">f <", ">FF<" }; // ordered?
PriorityQueue<String> pq3 = new PriorityQueue<String>();
for(String s : sa)
 pq3.offer(s);
for(String s : sa)
 System.out.print(pq3.poll() + " ");
 ```
 
This produces  
```
> f< >FF< >f < >ff<
```
If you remember that spaces sort before characters and that uppercase
letters sort before lowercase characters, you should be good to go for the exam.  
 **ref:- book *book: Kathy Sierra, pg. 595***  
