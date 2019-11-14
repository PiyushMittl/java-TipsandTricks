**Colleactions**  
**Question 1.**  
What is Arrays class.  
<details>
<summary>Answer</summary>
Arrays is a utility class which implements Collections class.
</details>

**Object**

**Queation 2.**  
How many ways are there to create an Object.
<details>
  <summary>Answer</summary>
	
**A.** Using new keyword  
This is the most common way to create an object in java. Almost 99% of objects are created in this way.  
```
MyObject object = new MyObject();
```
**B.** Using `Class.forName()`  
If we know the name of the class & if it has a public default constructor we can create an object in this way.  
```
MyObject object = (MyObject) Class.forName("subin.rnd.MyObject").newInstance();
```  
**C.** Using `clone()`  
The clone() can be used to create a copy of an existing object.  
```
MyObject anotherObject = new MyObject();
MyObject object = (MyObject) anotherObject.clone();
```
**D.** Using `object deserialization`  
Object deserialization is nothing but creating an object from its serialized form.  
```
ObjectInputStream inStream = new ObjectInputStream(anInputStream );
MyObject object = (MyObject) inStream.readObject();
```

</details>

**Queation 3.**  
Difference b/w "?" and Object in generics.  
<details>
  <summary>Answer</summary>
</details>

**Queation 4.**  
Multiply 50 digit numbers.  
<details>
  <summary>Answer</summary>
</details>


**Queation 5.**  
Will finally be called if there is a return statement.  
**Answer:**  
Yes.  
Finally can be called if there is no return statement.  

**Queation 6.**  
What is Static import.  

<details>
  <summary>Answer</summary>

``` java
import static java.lang.System.*;    
class StaticImportExample{  
  public static void main(String args[]){  
     
   out.println("Hello");//Now no need of System.out  
   out.println("Java");  
  
 }   
}   
```

</details>


**Queation 7.**  
what is final,finally and finalize.  
<details>
  <summary>Answer</summary>
</details>
  
**Queation 8.**  
thread implementation (Thread class and Runnable interface).  
<details>
  <summary>Answer</summary>
</details>

**Queation 9.**  
What is class loader. Types of class loader.  
<details>
  <summary>Answer</summary>
	
Bootstrap, Extension, System (BSE)    
A Java Classloader is of three types:
``
**BootStrap ClassLoader:**  A Bootstrap Classloader is a Machine code which kickstarts the operation when the JVM calls it. It is not a java class. Its job is to load the first pure Java ClassLoader. Bootstrap ClassLoader loads classes from the location rt.jar. Bootstrap ClassLoader doesn’t have any parent ClassLoaders. It is also called as the Primodial ClassLoader.  
**Extension ClassLoader:** The Extension ClassLoader is a child of Bootstrap ClassLoader and loads the extensions of core java classes from the respective JDK Extension library. It loads files from jre/lib/ext directory or any other directory pointed by the system property java.ext.dirs.  
**System ClassLoader:** An Application ClassLoader is also known as a System ClassLoader. It loads the Application type classes found in the environment variable CLASSPATH, -classpath or -cp command line option. The Application ClassLoader is a child class of Extension ClassLoader.  
``

</details>

**Queation 10.**  
Can we have try without catch (yes).  

**Queation 11.**  
Base class of Exception.  

**Queation 12.**  
Example/program for RuntimeException and Exception.  

**Queation 13.**  
Singleton design pattern (sample code).  
**Answer:**  
https://piyushanandmittal.blogspot.com/2018/06/javadesignpatternsingleton.html

**Queation 14.**  
How to create immutable class.    
  
***Question 15.***  
Can we overload and override static metohds.  
<details>
  <summary>Answer</summary>


Static methods can not be overridden because there is nothing to override, as they would be two different methods. For example
``` java
static class Class1 {
    public static int Method1(){
          return 0;
    }
}
static class Class2 extends Class1 {
    public static int Method1(){
          return 1;
    }

}
public static class Main {
    public static void main(String[] args){
          //Must explicitly chose Method1 from Class1 or Class2
          Class1.Method1();
          Class2.Method1();
    }
}
```
And yes static methods can be overloaded just like any other method.  

</details>

**Question :**  
16. IS-A and HAS-A relationship with aggregation and composition example.  
**Answer:**  
Association is relation between two separate classes which establishes through their Objects. Association can be one-to-one, one-to-many, many-to-one, many-to-many.  
In Object-Oriented programming, an Object communicates to other Object to use functionality and services provided by that object.     
  
**Composition and Aggregation are the two forms of association.**  
  
```
Bank —> accountholder1  
     —> accountholder2  
     —> accountholder3
```
Above example is Aggregation
It represents Has-A relationship.
It is a unidirectional association i.e. a one way relationship. For example, department can have students but vice versa is not possible and thus unidirectional in nature.
In Aggregation, both the entries can survive individually which means ending one entity will not effect the other entity


Composition

Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.

It represents part-of relationship.
In composition, both the entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the other entity.

Ref:
www.geeksforgeeks.org/association-composition-aggregation-java/amp/

18. (intâ€¦ values) is passed as parameter to a method when you are not aware of the number of input parameter but know that the type of parameter(
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
Question 30.  
Answer:  
``` java
      void doStuff(int... x) { } // expects from 0 to many ints as parameters
      void doStuff2(char c, int... x) { } // expects first a char, then 0 to many ints  
      void doStuff3(Animal... animal) { } // 0 to many Animals
    Illegal:
      void doStuff4(int x...) { } // bad syntax
      void doStuff5(int... x, char... y) { } // too many var-args
      void doStuff6(String... s, byte b) { } // var-arg must be last
```      
Question 31.  
Difference between transient and volatile in Java?  
<details>
  <summary>Answer</summary>

The volatile and transient modifiers apply to fields of classes.  

The transient modifier tells the Java object serialization subsystem to exclude the field when serializing an instance of the class. When the object is then deserialized, the field will be initialized to the default value; i.e. null for a reference type, and zero or false for a primitive type. Note that the JLS [see 8.3.1.3](https://docs.oracle.com/javase/specs/#8.3.1.3) does not say what transient means, but defers to the [Java Object Serialization Specification](https://docs.oracle.com/javase/6/docs/platform/serialization/spec/serialTOC.html). Other non-standard serialization mechanisms may also pay attention to a field's transient-ness.

The volatile modifier tells the JVM that writes to the field should always be synchronously flushed to memory, and that reads of the field should always read from memory. This means that fields marked as volatile can be safely accessed and updated in a multi-thread application without using native or standard library-based synchronization. Similarly, reads and writes to volatile fields are atomic. (This does not apply to >>non-volatile<< long or double fields, which may be subject to "word tearing" on some JVMs.) The relevant parts of the JLS are [8.3.1.4](https://docs.oracle.com/javase/specs/#8.3.1.4), [17.4](https://docs.oracle.com/javase/specs/#17.4) and [7.7](https://docs.oracle.com/javase/specs/#17.7).  

</details>

Question 32.  
will it call Thread constructor.
``` java
Thread[] threads = new Thread[5];
```
Answer:  
Remember thatâ€”despite how the code appearsâ€”the Thread constructor is not
being invoked. We're not creating a Thread instance, but rather a single Thread
array object. After the preceding statement, there are still no actual Thread objects!  

Remember, arrays must always be given a size at the time they are constructed.  
The JVM needs the size to allocate the appropriate space on the heap for the new
array object. It is never legal, for example, to do the following:  
```
int[] carList = new int[]; // Will not compile; needs a size
```
  
**ref:- *book: Kathy Sierra, pg. 221***  
  
  
Question 33.   
``` java
Thread[] threads = new Thread[5]; // works fine
Thread[] threads = new Thread[]; // Will not compile; needs a size
int[][] myArray = new int[3][]; // works fine, how its working fine when there is no column size given ??
```
**ref:- book *book: Kathy Sierra, pg. 223***  

Question 34.  
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

Question 35.  
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
 
 
 Question 36.  
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
â–  Boolean
â–  Byte
â–  Character from \u0000 to \u007f (7f is 127 in decimal)
â–  Short and Integer from -128 to 127
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

Question 40. 
What is Floating point number and Double numbers in java and whats the relation between them.  
Answer:  
`Floating-point` numbers have slightly different assignment behavior than `integer` types. First, you must know that every floating-point literal is implicitly a `double (64 bits)`, not a `float`. So the literal `32.3`, for example, is considered a double. If you try to assign a double to a float, the compiler knows you don't have enough room in a `32-bit` float container to hold the precision of a `64-bit` double, and it lets you know. The following code looks good, but won't compile:  
```
float f = 32.3;
```
You can see that `32.3` should fit just fine into a float-sized variable, but the compiler won't allow it. In order to assign a floating-point literal to a float variable, you must either cast the value or append an f to the end of the literal. The following assignments will compile:  
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
â–  Widening beats boxing
â–  Widening beats var-args
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
Earlier versions of the exam put big emphasis on operator precedence ```(like: Whatâ€™s the result of: x = y++ + ++x/z;)```. Other than a very basic knowledge
of precedence ```(such as: * and / are higher precedence than + and -)```, you wonâ€™t need to study operator precedence, except that when using a compound operator, the expression on the right side of the = will always be evaluated first. For example, you might expect
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

**Question:44**  
Why string is immutable ??

<details>
  <summary>Answer</summary>

One of the key goals of any good programming language is to make efficient use of memory. As applications grow, it's very common for String literals to occupy large amounts of a program's memory, and there is often a lot of redundancy within the

universe of String literals for a program. To make Java more memory efficient, the JVM sets aside a special area of memory called the "String constant pool." When the compiler encounters a String literal, it checks the pool to see if an identical String already exists. If a match is found, the reference to the new literal is directed to the existing String, and no new String literal object is created. (The existing String simply has an additional reference.) Now we can start to see why making String objects immutable is such a good idea. If several reference variables refer to the same String without even knowing it, it would be very bad if any of them could change the String's value.  
You might say, "Well that's all well and good, but what if someone overrides the String class functionality; couldn't that cause problems in the pool?" That's one of the main reasons that the String class is marked final. Nobody can override the behaviors of any of the String methods, so you can rest assured that the String objects you are counting on to be immutable will, in fact, be immutable.

 **ref:- book *book: Kathy Sierra, pg. 434, Chapter 6: Strings, I/O, Formatting, and Parsing***  

</details>

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
You canâ€™t sneak any code in between the try, catch, or fi nally blocks.
The following wonâ€™t compile:
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
Will Robinsonâ€”remember that transient variables are not saved when an object is
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

<details>
  <summary>Answer</summary>
	
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
of the exam, youâ€™re interested in how TreeSet and TreeMap implement these
interfaces.
Imagine that the Santa Cruzâ€“Monterey ferry has an irregular schedule. Let's
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
interface, zeroing in on an arbitrary spot in a Setâ€”using the methods available in
Java 5â€”was a compute-expensive and clunky proposition. On the other hand, using
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
 
</details>
 
 
51.
Itâ€™s important to know some of the details of natural ordering. The
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

52.
can we use Collections.sort() on HashSet,HashMap ??
ans:
no only lists implementations are allowed to paased in Collections.sort().

if you would try to store Hash implementation then you will get following error.

```
The method sort(List<T>) in the type Collections is not applicable for the arguments (Set<String>)
```

to sort HashSet and HashMet we have TreeMap and TreeSet implementations.

53.
Generic collections give you the same benefits of type safety that you've always had
with arrays, but there are some crucial differences that can bite you if you aren't
prepared. Most of these have to do with polymorphism.
You've already seen that polymorphism applies to the "base" type of the
collection:
``` java
List<Integer> myList = new ArrayList<Integer>();
```
In other words, we were able to assign an ArrayList to a List reference, because
List is a supertype of ArrayList. Nothing special thereâ€”this polymorphic assignment
works the way it always works in Java, regardless of the generic typing.
But what about this?
``` java
class Parent { }
class Child extends Parent { }
List<Parent> myList = new ArrayList<Child>();
```
Think about it for a minute.
Keep thinking...

No, it doesn't work. There's a very simple rule hereâ€”the type of the variable
declaration must match the type you pass to the actual object type. If you declare
List<Foo> foo then whatever you assign to the foo reference MUST be of the
generic type <Foo>. Not a subtype of <Foo>. Not a supertype of <Foo>. Just <Foo>.
These are wrong:
``` java      
List<Object> myList = new ArrayList<JButton>(); // NO!
List<Number> numbers = new ArrayList<Integer>(); // NO!
// remember that Integer is a subtype of Number
But these are fine:
List<JButton> myList = new ArrayList<JButton>(); // yes
List<Object> myList = new ArrayList<Object>(); // yes
List<Integer> myList = new ArrayList<Integer>(); // yes
```
      
54.
Object[] myArray = new JButton[3]; // yes
but not this:
List<Object> list = new ArrayList<JButton>(); // NO!
      
 **ref:- book *book: Kathy Sierra, pg. 605***        
 
55.
 void foo(List<? extends Serializable> list) // odd, but correct
 // to use "extends"
 This looks strange since you would never say this in a class declaration because
Serializable is an interface, not a class. But that's the syntax, so burn it in!

 **ref:- book *book: Kathy Sierra, pg. 618***        
 
56.  

``` java
public void foo(List<?> list) { }
public void foo(List<Object> list) { }
```

If there IS a difference (and we're not yet saying there is), what is it?
There IS a huge difference. `List<?>`, which is the `wildcard <?>` without the
keywords extends or super, simply means "any type." So that means any type of
List can be assigned to the argument. That could be a List of `<Dog>, <Integer>,
<JButton>, <Socket>,` whatever. And using the wildcard alone, without the
keyword super (followed by a type), means that you cannot ADD anything to the
list referred to as `List<?>`.

List<Object> is completely different from List<?>. List<Object> means that
the method can take ONLY a List<Object>. Not a List<Dog>, or a List<Cat>.
It does, however, mean that you can add to the list, since the compiler has already
made certain that you're passing only a valid List<Object> into the method.



An instance of `HashMap<String, String>` matches `Map<String, ?>` but not `Map<String, Object>`. Say you want to write a method that accepts maps from Strings to anything: If you would write
``` java
public void foobar(Map<String, Object> ms) {
    ...
}
```
you can't supply a HashMap<String, String>. If you write
``` java
public void foobar(Map<String, ?> ms) {
    ...
}
```
it works!

A thing sometimes misunderstood in Java's generics is that `List<String>` is not a subtype of `List<Object>`. (But `String[]` is in fact a subtype of `Object[]`, that's one of the reasons why generics and arrays don't mix well. (arrays in Java are covariant, generics are not, they are invariant)).

Sample: If you'd like to write a method that accepts Lists of InputStreams and subtypes of InputStream, you'd write
``` java
public void foobar(List<? extends InputStream> ms) {
    ...
}
```
By the way: Joshua Bloch's Effective Java is an excellent resource when you'd like to understand the not so simple things in Java. (Your question above is also covered very well in the book.)



"?" is inclusive of "Object" in the class hierarchy. You could say that String is a type of Object and Object is a type of ?. Not everything matches Object, but everything matches ?.
``` java
int test1(List<?> l) {
  return l.size();
}

int test2(List<Object> l) {
  return l.size();
}

List<?> l1 = Lists.newArrayList();
List<Object> l2 = Lists.newArrayList();
test1(l1);  // compiles because any list will work
test1(l2);  // compiles because any list will work
test2(l1);  // fails because a ? might not be an Object
test2(l2);  // compiled because Object matches Object
```


``` java
import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	/**
	 * method can accept only List of Object ex. List<Object> listOfString=new ArrayList();
	 * else it will throw error
	 * @param list
	 */
	public static void isNotGenerics(List<Object> list){
		
	}
	
	/**
	 * method can accept any type of list 
	 * ex. List<Object> listOfObject=new ArrayList(); 
	 * List<String> listOfString=new ArrayList(); 
	 * List<GenericsTest> listOfGenericTest=new ArrayList();
	 * else it will throw error
	 * @param list
	 */
	public static void isGenerics(List<?> list){
		
	}
	
	
	public static void main(String[] args) {
		
		List<GenericsTest> listOfString=new ArrayList();
		listOfString.add(new GenericsTest());
		
		isGenerics(listOfString); //no error
		isNotGenerics(listOfString); //error
		
	}
}

```





 **ref:- book *book: Kathy Sierra, pg. 619***     
 
 57.
 The <E> is a placeholder for the type you pass in. The List interface is behaving
as a generic "template" (sort of like C++ templates), and when you write your code,
you change it from a generic List to a List<Dog> or List<Integer>, and so on.
The E, by the way, is only a convention. Any valid Java identifier would work
here, but E stands for "Element," and it's used when the template is a collection. The
other main convention is T (stands for "type"), used for, well, things that are NOT
collections
      
 **ref:- book *book: Kathy Sierra, pg. 622***     
 
 58.
 using of Templates.
 ``` java
 public class UseTwo<T, X> {
 T one;
 X two;
 UseTwo(T one, X two) {
 this.one = one;
 this.two = two;
 }
 T getT() { return one; }
 X getX() { return two; }

// test it by creating it with <String, Integer>
 public static void main (String[] args) {
 UseTwo<String, Integer> twos =
 new UseTwo<String, Integer>("foo", 42);
 String theT = twos.getT(); // returns a String
 int theX = twos.getX(); // returns Integer, unboxes to int
 }
 
}
```
 **ref:- book *book: Kathy Sierra, pg. 627***     
 
 
 59.  
 ``` java
 public class Radio {
 public <T> Radio(T t) { } // legal constructor
}
```

**ref:- book *book: Kathy Sierra, pg. 628***     
 
60.

If you REALLY want to get ridiculous (or fi red), you can declare a class
with a name that is the same as the type parameter placeholder:
``` java
class X { 
public <X> X(X x) { } 
}
```
Yes, this works. The X that is the constructor name has no relationship
to the <X> type declaration, which has no relationship to the constructor
argument identifi er, which is also, of course, X. The compiler is able to parse this
and treat each of the different uses of X independently. So there is no naming confl ict
between class names, type parameter placeholders, and variable identifi ers.
      
**ref:- book *book: Kathy Sierra, pg. 629***     
      
***Question 61:***  
What is base condition in recursion?
<details>
  <summary>Answer</summary>
	  
In recursive program, the solution to base case is provided and solution of bigger problem is expressed in terms of smaller problems.
``` java
int fact(int n)
{
    if (n < = 1) // base case
        return 1;
    else    
        return n*fact(n-1);    
}
```
In the above example, base case for `n < = 1` is defined and larger value of number can be solved by converting to smaller one till base case is reached.

</details>


62.

63.

64.

65.  


Question 66.
``` java
public class DemoClass{

public static DemoStatic(){
System.out.println("hello");
}

public static void main(String s[]){
 DemoClass dc=null;
 dc.DemoStatic();
}
}
```
what would be the output.

Answer:
```
hello
```

Question 67.  
``` java
public final int x = 100;
public final DemoClass dc=new DemoClass();
dc.setXxxx(); //will it work ??
```

Answer:
yes we can call setters of any final class.
but we can not reassign the reference of another creatd object.
``` java
public final DemoClass dc=new DemoClass();
dc.setXxxx(); //yes
dc= new DenoClass();//won work because we can not reassign new reference to final object
```

Question 68.
if you are facing some issue in the connectivity with your database. how would you diagnose ??

Answer:
telnet and ping

***Question 69:***  
Single server vs Sharding/partitioning vs clustring vs replication vs (redis)sentinel.  
  
<details>
  <summary>Answer</summary>

***Replication:***  
The strategy of duplicating data across more than one node. There are many varieties, simplest being Master-Slave(s) or Leader-Follower and can either be synchronous or asynchronous.  
1. To have high availability of data. Even if a node goes down, the data is still available from other nodes in the cluster.  
2. Separate nodes for write and read. Data is replicated from the write cluster to all read clusters. This ensures that under high transaction volumes, the read operations are not getting delayed by write operations and vice-versa.  
3. Multiple nodes for read operations and for write operations. This ensures that the read and the write operations are load balanced across multiple nodes resulting in higher scalability and data throughput.  

***Sharding/Partitioning:***    
Sharding, also often called partitioning, involves splitting data up based on keys. This increases performance because it reduces the hit on each of the individual resources, allowing them to share the burden rather than having it all in one place.  
For example, you can use a hash function on your Redis keys to turn them into numbers. Then, if you want two shards, you can send all the even-numbered keys to one instance while placing all of the odd-numbered keys to the second instance. This could be done using other algorithms for different numbers of shards.  

Redis sharding can be implemented in several ways:  

*Client side partitioning:* Clients select the proper Redis instance to read or write a particular key.  
*Proxy-assisted partitioning:* A proxy is used to handle requests and send the requests to the proper Redis instance.  
*Query routing:* The query is sent to a random instance, which then takes on the responsibility of redirecting the client to the proper Redis instance.  

***clustring***  
Database clustering is a bit of an ambiguous term, some vendors consider a cluster having two or more servers share the same storage, some others call a cluster a set of replicated servers.  

Replication defines the method by which a set of servers remain synchronized without having to share the storage being able to be geographically disperse, there are two main ways of going about it:  

master-master (or multi-master) replication: Any server can update the database. It is usually taken care of by a different module within the database (or a whole different software running on top of them in some cases).  

Downside is that it is very hard to do well, and some systems lose ACID properties when in this mode of replication.  

Upside is that it is flexible and you can support the failure of any server while still having the database updated.  

master-slave replication: There is only a single copy of authoritative data, which is the pushed to the slave servers.  
 
Downside is that it is less fault tolerant, if the master dies, there are no further changes in the slaves.  

Upside is that it is easier to do than multi-master and it usually preserve ACID properties.  

Load balancing is a different concept, it consists distributing the queries sent to those servers so the load is as evenly distributed as possible. It is usually done at the application layer (or with a connection pool). The only direct relation between replication and load balancing is that you need some replication to be able to load balance, else you'd have a single server.  


*How does cluster architecture work?*  
In cluster architecture, all requests are split with many computers so that an individual user request is executed and produced by a number of computer systems. The clustering is serviceable definitely by the ability of load balancing and high-availability. If one node collapses, the request is handled by another node. Consequently, there are few or no possibilities of absolute system failures.  

*Types of Database Clusters*  

Database Cluster is highly comprehensive. It covers multiple tiers and arrangements depending on the requirement of the system. Here, we will brief three types of cluster computing architectures. Failover clusters, high-performance clusters, and load balancing clusters.  

*1. Failover/High Availability clusters:* A machine can go wrong or stop working anytime. System administrators manage such failovers and fix issues efficiently. Here, the clusters come to the rescue. Cluster prepares the service availability by replicating servers and by redundant software and hardware reconfiguration. So, every system is controlling the other and works on requests if any one node fails. These types of clusters are profitable for those users who depend on their computer systems completely. For example, e-commerce, websites, etc.  

The system should be capable enough to know which all systems are running, from which IP is running, which request and what would be the progression of action in case of a crash. The important thing is that the servers should not stop working anyway.  

*2. High-Performance Clusters:* The purpose of developing high-performance database clusters is to produce high performing computer systems. They operate co-extending programs that are needed for time-exhaustive computations. Such variety of clusters are commonly preferred by the scientific industries. The basic aim is intelligently sharing the workload.  

*3. Load Balancing Clusters:* These database clusters serve for distributing loads between different servers. They strive to provide an increased network capacity, finally increasing the performance. Systems in this network integrate their nodes, with the help of which user requests are equally divided across the participating nodes. The system is not working together, rather it redirects requests individually as they occur.  


reference:  
http://www.ndimensionz.com/kb/what-is-database-clustering-introduction-and-brief-explanation/

</details>

***Question 70:***  
what is master and slave replica-set.  
***Answer:***  


***Question 71:***  
``` java
public static void main(String [ ] args) {
     try{
         System.out.println("1");
         method();
     }
     catch(IOException e) {
         System.out.println("4");
     }
}

public static void method() throws IOException {
     try {
         System.out.println("2");
         throw new IOException();
     }
     catch(IOException e) {
         System.out.println("3");
     }
 }
```

overloading and overriding
https://www.google.co.in/amp/s/www.geeksforgeeks.org/overriding-in-java/amp/


***Question 72:***  
what is the output of following code snippet.

``` java
public static void main(String a[]){
int count=0;
public void add (Object o)
{
super.add(o);
count++;
}

public void addAll (Object o)
{
count=o.lenght();
super.addAll(o);
}
}
```
List<String> list=new ArrayList();
	list.add("one");
	list.add("two");
	list.add("three");
addAll(list);	

***Answer:***  
output would be 6  
since addAll lenght will count it as 3 and then again addAll from super class will call child method to add element which will again increment count with three.  


***Question 73:***  
Implement cache (TTl,LRU)  
***Answer***  


***Question 74:***  
phonebook structure  
***Answer***  


***Question 74:***  
read propery and put properties in cache of jvm. but you have to update properties and you don't have to restart app and have to update cache in jvm.  
***Answer***  

***Question 75:***  
***Answer***  
The overriding method cannot have a more restrictive access modifier than the method being overridden (for example, you can't override a method marked public and make it protected).  

**ref:- book *book: Kathy Sierra, pg. 105***   

***Question 75:***  
private vs final methods.  
***Answer***  
private method can not be accessed outside other class and due to which can not override do.  
a final methid can be accessed as per its access modifier but can not be override.  

***Question 76:***  
If a method is overridden but you use a polymorphic (supertype) reference to refer to the subtype object with the overriding method, the compiler assumes youâ€™re calling the supertype version of the method. If the supertype version declares a checked exception, but the overriding subtype method does not, the compiler still thinks you are calling a method that declares an exception.  
``` java
class Animal {  
public void eat() throws Exception {
// throws an Exception  
	} 
} 
class Dog2 extends Animal {
public void eat() { /* no Exceptions */}  
public static void main(String [] args) {
Animal a = new Dog2();
Dog2 d = new Dog2();
d.eat();           // ok
a.eat();           // compiler error -
// unreported exception  } 
}
```
This code will not compile because of the Exception declared on the Animal eat() method. This happens even though, at runtime, the eat() method used would be the Dog version, which does not declare the exception.  


***Question 77:***
``` java
class UseAnimals {
	public void doStuff(Animal a) {
		System.out.println("In the Animal version");
	}

	public void doStuff(Horse h) {
		System.out.println("In the Horse version");
	}

	public static void main(String[] args) {
		UseAnimals ua = new UseAnimals();
		Animal animalObj = new Animal();
		Horse horseObj = new Horse();
		ua.doStuff(animalObj);
		ua.doStuff(horseObj);
		
		Animal animalRefHorseObj = new Horse();
		ua.doStuff(animalRefHorseObj);
	}
}
```

***Answer:***

The output is what you expect:
in the Animal version
in the Horse version
in the Animal version

**ref:- book *book: Kathy Sierra, pg. 112***   


***Question 78:***
What if i create a protected constructor
Does it mean we can create object in child class only ??
Can we start thread twice
How to create deadlock
Synchronized block in static method
Pg 738 ch 9

***Question 79:***
Why character array is better than String for Storing password in Java

<details>
  <summary>Answer</summary>

Since Strings are immutable in Java if you store password as plain text it will be available in memory until Garbage collector clears it and since String are used in String pool for reusability there is pretty high chance that it will be remain in memory for long duration, which pose a security threat. Since any one who has access to memory dump can find the password in clear text and that's another reason you should always used an encrypted password than plain text. Since Strings are immutable there is no way contents of Strings can be changed because any change will produce new String, while if you char[] you can still set all his element as blank or zero and it will not left any string in memory like string due to immutability. So Storing password in character array clearly mitigates security risk of stealing password.


We should not store our password in string because when we change the value of our string variable it doesnâ€™t update the value of existing variable instead it creates a new string and left earlier in constant pool or heap for GC which can be a security breach
Anyone who can get a memory dump can access the password in plain txt

But if you use char array you can actually update the value of array and it will not left any string in memory.
</details>

	
***Question 80:***
Why wait() and notify() is defined in Object class.
Ans:
These methods works on the locks and locks are associated with Object and not Threads. Hence, it is in Object class. The methods wait(), notify() and notifyAll() are not only just methods, these are synchronization utility and used in communication mechanism among threads in Java.


***Question 81:***
Qsn:
byte b=128; //you will get error here 
b=(byte)128; //will work fine


byte b=3;
b += 7;  //will work; it actually puts implicit cast

byte b=3;
b = (byte) (b+7) //wont compile without cast

***Question 82:***
Qsn:
Local variable inside method should always be initialized but instance variables are optional to initialized.
Below is the default values.
Obj reference: null
byte, short, int, long: 0
Float, double: 0.0
boolean: false
char: â€˜\u0000â€™



***Question 83:***

``` java
class Animal {
}

class Dog extends Animal {
}

class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a1 = d;
		// upcast ok with no explicit cast
		Animal a2 = (Animal) d;
		// upcast ok with an explicit cast
	}
}
```

**ref:- book *book: Kathy Sierra, pg. 118***   


***Question 84:***

``` java

class Overloading2 {
	public void doStuff(Integer i) {
		System.out.println("Integer method called");
	}

	public void doStuff(double d) {
		System.out.println("double method called");
	}

	public void doStuff(float d) {
		System.out.println("float method called");
	}

	
	public static void main(String[] args) {
		Overloading2 o2=new Overloading2();
		o2.doStuff(10.5);
		//double method called (floating point numbers are treated as double by default)
		o2.doStuff(10);
		//float method would be called by default (boxing to wrapper has least priviledge)
	}
}


```


***Question 85:***
``` java
class Foo {
	Bar myBar = new Bar();

	void changeIt(Bar myBar) {
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
		myBar = new Bar();
		myBar.barNum = 420;
		System.out.println("myBar.barNum in changeIt is now " + myBar.barNum);
	}

	public static void main(String[] args) {
		Foo f = new Foo();
		System.out.println("f.myBar.barNum is " + f.myBar.barNum);
		f.changeIt(f.myBar);
		System.out.println("f.myBar.barNum after changeIt is " + f.myBar.barNum);
	}
}
```

 The preceding code prints out this:  
``
  f.myBar.barNum is 28  
  myBar.barNum in changeIt is 99  
  myBar.barNum in changeIt is now 420  
  f.myBar.barNum after changeIt is 99
 `` 
  
    You can see that the shadowing variable (the local parameter myBar in changeIt()) can still affect the myBar instance variable, because the myBar parameter receives a reference to the same Bar object. But when the local myBar is reassigned a new Bar object, which we then modify by changing its barNum value, Foo’s original myBar instance variable is untouched.

**ref:- book *book: Kathy Sierra, pg. 218***


Question: ConcurrentHashMap vs SynchronisedHashMap

<details>
  <summary>Answer</summary>

Synchronized HashMap：

Each method is synchronized using an object level lock. So the get and put methods on synchMap acquire a lock.
Locking the entire collection is a performance overhead. While one thread holds on to the lock, no other thread can use the collection.
ConcurrentHashMap was introduced in JDK 5.

There is no locking at the object level,The locking is at a much finer granularity. For a ConcurrentHashMap, the locks may be at a hashmap bucket level.
The effect of lower level locking is that you can have concurrent readers and writers which is not possible for synchronized collections. This leads to much more scalability.
ConcurrentHashMap does not throw a ConcurrentModificationException if one thread tries to modify it while another is iterating over it.
This article Java 7: HashMap vs ConcurrentHashMap is a very good read. Highly recommended.

</details>
  

***Question:***
How to reverse a linked list without using extra space.

https://javarevisited.blogspot.com/2013/03/top-15-data-structures-algorithm-interview-questions-answers-java-programming.html?m=1


***Question:***
Java sleep() and wait() – Discussion

<details>
  <summary>Answer</summary>

```
sleep() is a method which is used to pause the process for few seconds or the time we want to. But in case of wait() method, thread goes in waiting state and it won’t come back automatically until we call the notify() or notifyAll().

The major difference is that wait() releases the lock or monitor while sleep() doesn’t releases the lock or monitor while waiting. wait() is used for inter-thread communication while sleep() is used to introduce pause on execution, generally.

Thread.sleep() sends the current thread into the “Not Runnable” state for some amount of time. The thread keeps the monitors it has acquired — i.e. if the thread is currently in a synchronized block or method no other thread can enter this block or method. If another thread calls t.interrupt(). it will wake up the sleeping thread.

While sleep() is a static method which means that it always affects the current thread (the one that is executing the sleep method). A common mistake is to call t.sleep() where t is a different thread; even then, it is the current thread that will sleep, not the t thread.
```
Read more : Working with wait() and notify()
2. Java sleep() and wait() – Example
``` java
synchronized(LOCK) {   
    Thread.sleep(1000); // LOCK is held
}
synchronized(LOCK) 
{   
    LOCK.wait(); // LOCK is not held
}
```
Read more : Difference between yield() and join()
3. Java sleep() vs wait() – Summary

Let categorize all above points in short to remember.

3.1. Method called on
```
wait() – Call on an object; current thread must synchronize on the lock object.
sleep() – Call on a Thread; always currently executing thread.
3.2. Synchronized

wait() – when synchronized multiple threads access same Object one by one.
sleep() – when synchronized multiple threads wait for sleep over of sleeping thread.
3.3. Lock duration

wait() – release the lock for other objects to have chance to execute.
sleep() – keep lock for at least t times if timeout specified or somebody interrupt.
3.4. wake up condition

wait() – until call notify(), notifyAll() from object
sleep() – until at least time expire or call interrupt().
3.5. Usage

sleep() – for time-synchronization
wait() – for multi-thread-synchronization.
Hope above information will add some value in your knowledge-base.
```
https://www.google.co.in/amp/s/howtodoinjava.com/java/multi-threading/sleep-vs-wait/amp/

</details>
 


***Question:***
Which pattern is used when we call ``` Collections.sort(al,nameComparator()); ```
Answer:
Strategy design pattern is used when we use comparator design pattern.
Because here we pass the object of nameComparator() to Collections class and on the basis of object 
It further descide what sorting it should perform.  


***Question:***
Class not found vs class def not found.
  

***Question:***  
What is throable.  


***Question:***  
Can we cath errors.  
Ans:  
Yes. 


***Question:***  
Thread related methods in Thread and Object class.  
Ans:  
Thread class: sleep, yield, join, setPriority.  
Object class: wait, notify, notifyAll.  



***Question:***  
Mirror a binary tree.  
Answer:  

Iterative sol1 :  
``` java
public static TreeNode mirrorBinaryTreeIterative(TreeNode root){
    if(root == null || (root.left == null && root.right == null))
        return root;

    TreeNode parent = root;
    Stack<TreeNode> treeStack = new Stack<TreeNode>();
    treeStack.push(root);

    while(!treeStack.empty()){
        parent = treeStack.pop();

        TreeNode temp = parent.right;
        parent.right = parent.left;
        parent.left = temp;

        if(parent.right != null)
            treeStack.push(parent.right);
        if(parent.left != null)
            treeStack.push(parent.left);
    }
    return root;
}
```
Iterative sol2:  
``` java
public void mirrorIterative() {
    Queue<TreeNode> nodeQ = new LinkedList<TreeNode>();
    nodeQ.add(root);
    while(!nodeQ.isEmpty()) {
        TreeNode node = nodeQ.remove();
        if(node.leftChild == null && node.rightChild == null)
            continue;
        if(node.leftChild != null && node.rightChild != null) {
            TreeNode temp = node.leftChild;
            node.leftChild = node.rightChild;
            node.rightChild = temp;
            nodeQ.add(node.leftChild);
            nodeQ.add(node.rightChild);
        }
        else if(node.leftChild == null) {
            node.leftChild = node.rightChild;
            node.rightChild = null;
            nodeQ.add(node.leftChild);
        } else {
            node.rightChild = node.leftChild;
            node.leftChild = null;
            nodeQ.add(node.rightChild);
        }
    }
}
```



***Question:***  
``` java
   class GameShape {
                   public void displayShape() {
                     System.out.println("displaying shape");
                   }
// more code }
Inheritance, Is-A, Has-A (Exam Objective 5.5) 93
  class PlayerPiece extends GameShape {
     public void movePiece() {
       System.out.println("moving game piece");
     }
// more code }
  class TilePiece extends GameShape {
      public void getAdjacent() {
        System.out.println("getting adjacent tiles");
      }
// more code }
Now imagine a test class has a method with a declared argument type of GameShape, that means it can take any kind of GameShape. In other words, any subclass of GameShape can be passed to a method with an argument of type GameShape. This code
  public class TestShapes {
     public static void main (String[] args) {
PlayerPiece player = new PlayerPiece(); TilePiece tile = new TilePiece(); doShapes(player);
doShapes(tile);
}
public static void doShapes(GameShape shape) { shape.displayShape();
} }
```
```
Outputs:
  displaying shape
  displaying shape
The key point is that the doShapes() method is declared with a GameShape argument but can be passed any subtype (in this example, a subclass) of GameShap
```
  

***Question:***
``` java
class Dad
{
    protected static String me = "dad";

    public void printMe()
    {
        System.out.println(me);
    }
}

class Son extends Dad
{
    protected static String me = "son";
}

public void doIt()
{
    new Son().printMe();
}
```
```
Output:
dad
```
  


***Question:***  
Overriding

<details>
  <summary>Answer</summary>

``` java
package com.piyush.ds.arrays.operation;

class Parent {
	protected static String s="Parent";
	public void print() {
		System.out.println(s);
	}
}
class Child1 extends Parent {
	static String s="Child";
	public void print() {
		System.out.println(s);
	}
}

class Child2 extends Parent {
	static String s="Child";
//	public void print() {
//		System.out.println(s);
//	}
}

public class OverrideDemo1{
	public static void main(String[] args) {

/*Tip 1*/		
		Parent p=new Child1();
		//method is always called from the object class not from the reference class (Parent is reference class and new Child() is object class)
		
		//method existence is checked from reference variable because is checked at compile time. 
		//when you compile your code the method existence will be checked from reference variable class only.
		//when you run your program the method from the object class gets executed which is called overriding.
		p.print();
		
		//in case of data members we do not have overriding facility instead we have hiding concept here.
		//data members  always be accessed from parent class because we bind data member's value at compile time and that time what we know we reference class 
		//thats why we get the value from reference class
		// say Parent p=args[0]  //here we do not know which class reference we are having here thats why it binds data member value from reference class only
		System.out.println(p.s);

/*Tip 2*/		
		Parent p1=new Child2();
		p1.print();
		//here no hiding would happen because there is no method overriding 
		//reason: because if you do data hiding method might get corrupted because you might declare Object s=new ***() not string. which will cuase a disaster.

/*Tip 3*/		
		System.out.println();
		
		
		Parent p3=new Parent();
		Child1 c3=(Child1)p3;//run time exception
		
		Parent p4=new Child2();
		Child1 c4=(Child1)p4;//works well
		
/*Tip 4*/		
		Parent p5=new Child1();
		System.out.println(((Child1)p5).s);//works well
		
		Child1 c5=new Child1();
		System.out.println(((Parent)c5).s);//works well
		
	}
	
}
```

</details>
  

***Question:***  
How to prevent your class from being clonned.
***Answer***  

**Question:**  
alternate Singleton.  
Ans: enum  

**Question:**  
What is producer consumer problem.  
<details>
  <summary>Answer</summary>

``` java
package ProducerConsumer;
import java.util.LinkedList;
import java.util.Queue;
public class ProducerConsumerExample2 {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer(2);
        Thread producerThread = new Thread(() -> {
            try {
                int value = 0;
                while (true) {
                    buffer.add(value);
                    System.out.println("Produced " + value);
                    value ++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    int value = buffer.poll();
                    System.out.println("Consume " + value);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }
    static class Buffer {
        private Queue<Integer> list;
        private int size;
        public Buffer(int size) {
            this.list = new LinkedList<>();
            this.size = size;
        }
        public void add(int value) throws InterruptedException {
            synchronized (this) {
                while (list.size() >= size) {
                    wait();
                }
                list.add(value);
                notify();
            }
        }
        public int poll() throws InterruptedException {
            synchronized (this) {
                while (list.size() == 0) {
                    wait();
                }
                int value = list.poll();
                notify();
                return value;
            }
        }
    }
}
```

</details>



**Question:**  
What would be the value of i  

``` java
...
int i=0;
function(){
i++;
}
print(i);


T1.function();
T2.function();
.
.
T10.function();

.....
```

<details>
  <summary>Answer</summary>
The value of i would be unpredictable.  
</details>


  

**Questions:**  
Hashtable does not allow null keys or values, while HashMap allows null values and 1 null key.
  
Why is this so?  
How is it useful to have such a key and values in HashMap?  

<details>
  <summary>Answer</summary>

> 1\. Why is this so?

HashMap is newer than Hashtable and fixes some of its limitations.

I can only guess what the designers were thinking, but here are my guesses:

 * Hashtable calculates a hash for each key by calling [`hashCode`][2] on each key. This would fail if the key were null, so this could be a reason for disallowing nulls as keys. 
 * The method [`Hashtable.get`][1] returns null if the key is not present. If null were a valid value it would be ambiguous as to whether null meant that the key was present but had value null, or if the key was absent. Ambiguity is bad, so this could be a reason for disallowing nulls as values.

However it turns out that sometimes you do actually want to store nulls so the restrictions were removed in HashMap. The following warning was also included in the documentation for [`HashMap.get`][3]:

> A return value of null does not necessarily indicate that the map contains no mapping for the key; it is also possible that the map explicitly maps the key to null.

---

> 2\. How is it useful to have such a key and values in HashMap?

It is useful to explicitly store null to distinguish between a key that you *know* exists but doesn't have an associated value and a key that doesn't exist. An example is a list of registered users and their birthdays. If you ask for a specific user's birthday you want to be able to distinguish between that user not existing and the user existing but they haven't entered their birthday.

I can't think of any (good) reason for wanting to store null as a key, and in general I'd advise against using null as a key, but presumably there is at least one person somewhere that needs that keys that can be null.

[1]: https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html#get-java.lang.Object-
[2]: https://docs.oracle.com/javase/8/docs/api/java/util/Objects.html#hashCode-java.lang.Object-
[3]: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#get-java.lang.Object-

The value of i would be unpredictable.  
</details>


**Questions:**  
How to implement your own HashMap.
<details>
  <summary>Answer</summary>
</details>


**Questions:**  
What is fork,join and forkjoinpool.
<details>
  <summary>Answer</summary>
</details>


