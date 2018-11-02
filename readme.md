**Colleactions**
Question 1.  
What is Arrays class.  
  
Answer.  
Arrays is a utility class which implements Collections class.

**Object**

Queation 2.  
Ways to create an Object.  
  
Answer.  
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
Question 15.  
Can we overload and override static metohds.  
Answer:  

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
Answer:  
The volatile and transient modifiers apply to fields of classes.

The transient modifier tells the Java object serialization subsystem to exclude the field when serializing an instance of the class. When the object is then deserialized, the field will be initialized to the default value; i.e. null for a reference type, and zero or false for a primitive type. Note that the JLS [see 8.3.1.3](https://docs.oracle.com/javase/specs/#8.3.1.3) does not say what transient means, but defers to the [Java Object Serialization Specification](https://docs.oracle.com/javase/6/docs/platform/serialization/spec/serialTOC.html). Other non-standard serialization mechanisms may also pay attention to a field's transient-ness.

The volatile modifier tells the JVM that writes to the field should always be synchronously flushed to memory, and that reads of the field should always read from memory. This means that fields marked as volatile can be safely accessed and updated in a multi-thread application without using native or standard library-based synchronization. Similarly, reads and writes to volatile fields are atomic. (This does not apply to >>non-volatile<< long or double fields, which may be subject to "word tearing" on some JVMs.) The relevant parts of the JLS are [8.3.1.4](https://docs.oracle.com/javase/specs/#8.3.1.4), [17.4](https://docs.oracle.com/javase/specs/#17.4) and [7.7](https://docs.oracle.com/javase/specs/#17.7).  


Question 32.  
will it call Thread constructor.
``` java
Thread[] threads = new Thread[5];
```
Answer:  
Remember that—despite how the code appears—the Thread constructor is not
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

universe of String literals for a program. To make Java more memory efficient, the JVM sets aside a special area of memory called the "String constant pool." When the compiler encounters a String literal, it checks the pool to see if an identical String already exists. If a match is found, the reference to the new literal is directed to the existing String, and no new String literal object is created. (The existing String simply has an additional reference.) Now we can start to see why making String objects immutable is such a good idea. If several reference variables refer to the same String without even knowing it, it would be very bad if any of them could change the String's value.  
You might say, "Well that's all well and good, but what if someone overrides the String class functionality; couldn't that cause problems in the pool?" That's one of the main reasons that the String class is marked final. Nobody can override the behaviors of any of the String methods, so you can rest assured that the String objects you are counting on to be immutable will, in fact, be immutable.

 **ref:- book *book: Kathy Sierra, pg. 434, Chapter 6: Strings, I/O, Formatting, and Parsing***  

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
List is a supertype of ArrayList. Nothing special there—this polymorphic assignment
works the way it always works in Java, regardless of the generic typing.
But what about this?
``` java
class Parent { }
class Child extends Parent { }
List<Parent> myList = new ArrayList<Child>();
```
Think about it for a minute.
Keep thinking...

No, it doesn't work. There's a very simple rule here—the type of the variable
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
List can be assigned to the argument. That could be a List of <Dog>, <Integer>,
<JButton>, <Socket>, whatever. And using the wildcard alone, without the
keyword super (followed by a type), means that you cannot ADD anything to the
list referred to as `List<?>`.

List<Object> is completely different from List<?>. List<Object> means that
the method can take ONLY a List<Object>. Not a List<Dog>, or a List<Cat>.
It does, however, mean that you can add to the list, since the compiler has already
made certain that you're passing only a valid List<Object> into the method.

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
 public class Radio {
 public <T> Radio(T t) { } // legal constructor
}
      
**ref:- book *book: Kathy Sierra, pg. 628***     
 
60.

If you REALLY want to get ridiculous (or fi red), you can declare a class
with a name that is the same as the type parameter placeholder:
``` java
class X { public <X> X(X x) { } }
```
Yes, this works. The X that is the constructor name has no relationship
to the <X> type declaration, which has no relationship to the constructor
argument identifi er, which is also, of course, X. The compiler is able to parse this
and treat each of the different uses of X independently. So there is no naming confl ict
between class names, type parameter placeholders, and variable identifi ers.
      
**ref:- book *book: Kathy Sierra, pg. 629***     
      
61.
Thread lifecycle

Start:
when we create an object of thead.
ex. 
class SampleThread implements Runnable{
public static void  main(String a[]){
Thread t = new Thread(new SampleThead()); // here initializing thread object means now its in start state
t.start();
}
}

Runanble:
class SampleThread implements Runnable{
public static void  main(String a[]){
Thread t = new Thread(new SampleThead()); 
t.start(); // here the thread is in runnable state however thread may be not in running state
}
}

Running:
when thread gets cpu allocation and start its task. its in running state.

Waiting:
when a threat send back to Runnable state called waiting sate.

End/Dead:
when thread completes its execution. it becomes dead

62.
What is race condition.
ans:
when two threads concurrently access the same resource.

63.
a thread can acquire more than one lock.
**ref:- book *book: Kathy Sierra, pg. 736**

64.
static methods can be synchronized. There is only one copy of the static data
you're trying to protect, so you only need one lock per class to synchronize static
methods

``` java
two ways to acquire a lock:
public static int getCount() {
 synchronized(MyClass.class) {
 return count;
 }
}
```
``` java
public static void classMethod() {
 Class cl = Class.forName("MyClass");
 synchronized (cl) {
 // do stuff
 }
}
```

**ref:- book *book: Kathy Sierra, pg. 738**

65.  
deadlock..

``` java
 public class DeadlockRisk {
  private static class Resource {
  public int value;
  }
  private Resource resourceA = new Resource();
  private Resource resourceB = new Resource();
  public int read() {
  synchronized(resourceA) { // May deadlock here
  synchronized(resourceB) {
 return resourceB.value + resourceA.value;
 }
 }
 }

 public void write(int a, int b) {
 synchronized(resourceB) { // May deadlock here
 synchronized(resourceA) {
 resourceA.value = a;
 resourceB.value = b;
 }

Question :
```

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

public final int x = 100;
public final DemoClass dc=new DemoClass();
dc.setXxxx(); //will it work ??

Answer:
yes we can call setters of any final class.
but we can not reassign the reference of another creatd object.

public final DemoClass dc=new DemoClass();
dc.setXxxx(); //yes
dc= new DenoClass();//won work because we can not reassign new reference to final object


Question 68.
if you are facing some issue in the connectivity with your database. how would you diagnose ??

Answer:
telnet and ping

Question 69.
Single server vs Sharding vs partitioning vs clustring vs replication vs (redis)sentinel

Answer:

Question 70.
Types of thread.
Answer:
1. User Thread:  
User threads are threads which are created by the application or user. They are high priority threads. JVM (Java Virtual Machine) will not exit until all user threads finish their execution. JVM wait for these threads to finish their task. These threads are foreground threads.  
2.Daemon Thread :  
Daemon threads are threads which are mostly created by the JVM. These threads always run in background. These threads are used to perform some background tasks like garbage collection and house-keeping tasks. These threads are less priority threads. JVM will not wait for these threads to finish their execution. JVM will exit as soon as all user threads finish their execution. JVM doesn’t wait for daemon threads to finish their task.  

Question 71.
What is daemon thread.
Answer:

Question 72.  
what is join in thread.  
Answer.  
when we join t2 with t1, t2 will not starts its execution until t1 finishes its work.  
marriage ceremony example
like we print cards first then we pack the cards in envelope then we distribute the cards.

thread t1 is running.
t2->t1 (t2 joins t1)
t3->t2 (t3 joins t2)

t2 joins t1 means t2 will start execution once t1 fininshes its work.
t3 joins t2 means t3 will start execution once t2 fininshes its work.

excution sequence t1->t2->t3


Question 73:
Thread related methods in Object and Thread class.
Answer.
Methods from the java.lang.Thread Class  

Some of the methods that can
help us influence thread scheduling are as follows:
```
public static void sleep(long millis) throws InterruptedException
public static void yield()
public final void join() throws InterruptedException
public final void setPriority(int newPriority)
```
Note that both sleep() and join() have overloaded versions not shown here.

Expect to see exam questions that look for your understanding of
what is and is not guaranteed! You must be able to look at thread code and determine
whether the output is guaranteed to run in a particular way or is indeterminate.


Methods from the java.lang.Object Class  
Every class in Java inherits the
following three thread-related methods:
```
public final void wait() throws InterruptedException
public final void notify()
public final void notifyAll()
```
**ref:- book *book: Kathy Sierra, pg. 718, chapter 9:Threads**

Question 74:
what is The Thread Scheduler
Answer:
The thread scheduler is the part of the JVM (although most JVMs map Java threads
directly to native threads on the underlying OS) that decides which thread should
run at any given moment, and also takes threads out of the run state. Assuming a
single processor machine, only one thread can actually run at a time. Only one stack
can ever be executing at one time. And it's the thread scheduler that decides which
thread—of all that are eligible—will actually run. When we say eligible, we really
mean in the runnable state.
Any thread in the runnable state can be chosen by the scheduler to be the one and
only running thread. If a thread is not in a runnable state, then it cannot be chosen to be
the currently running thread. And just so we're clear about how little is guaranteed here:
The order in which runnable threads are chosen to run is not guaranteed.
Although queue behavior is typical, it isn't guaranteed. Queue behavior means
that when a thread has finished with its "turn," it moves to the end of the line of the
runnable pool and waits until it eventually gets to the front of the line, where it can
be chosen again. In fact, we call it a runnable pool, rather than a runnable queue, to
help reinforce the fact that threads aren't all lined up in some guaranteed order.

**ref:- book *book: Kathy Sierra, pg. 717, chapter 9:Threads**

Question 75:
What is Sleep,Yield,Wait,  method.
Answer:

So far we've looked at three ways a running thread could leave the running state:
■ A call to sleep() Guaranteed to cause the current thread to stop executing
for at least the specified sleep duration (although it might be interrupted
before its specified time).
■ A call to yield() Not guaranteed to do much of anything, although
typically it will cause the currently running thread to move back to runnable
so that a thread of the same priority can have a chance.
■ A call to join() Guaranteed to cause the current thread to stop executing
until the thread it joins with (in other words, the thread it calls join()
on) completes, or if the thread it's trying to join with is not alive, however,
the current thread won't need to back out.
Besides those three, we also have the following scenarios in which a thread might
leave the running state:
■ The thread's run() method completes. Duh.
■ A call to wait() on an object (we don't call wait() on a thread, as we'll
 see in a moment).
■ A thread can't acquire the lock on the object whose method code it's
 attempting to run.
■ The thread scheduler can decide to move the current thread from running
 to runnable in order to give another thread a chance to run. No reason is
 needed—the thread scheduler can trade threads in and out whenever it likes.
 
**ref:- book *book: Kathy Sierra, pg. 728, chapter 9:Threads**


Question 76:
**Atomicity:** This property ensures that either all the operations of a transaction reflect in database or none. Let’s take an example of banking system to understand this: Suppose Account A has a balance of 400$ & B has 700$. Account A is transferring 100$ to Account B. This is a transaction that has two operations a) Debiting 100$ from A’s balance b) Creating 100$ to B’s balance. Let’s say first operation passed successfully while second failed, in this case A’s balance would be 300$ while B would be having 700$ instead of 800$. This is unacceptable in a banking system. Either the transaction should fail without executing any of the operation or it should process both the operations. The Atomicity property ensures that.  

**Consistency:** To preserve the consistency of database, the execution of transaction should take place in isolation (that means no other transaction should run concurrently when there is a transaction already running). For example account A is having a balance of 400$ and it is transferring 100$ to account B & C both. So we have two transactions here. Let’s say these transactions run concurrently and both the transactions read 400$ balance, in that case the final balance of A would be 300$ instead of 200$. This is wrong. If the transaction were to run in isolation then the second transaction would have read the correct balance 300$ (before debiting 100$) once the first transaction went successful.  

**Isolation:** For every pair of transactions, one transaction should start execution only when the other finished execution. I have already discussed the example of Isolation in the Consistency property above.  

**Durability:** Once a transaction completes successfully, the changes it has made into the database should be permanent even if there is a system failure. The recovery-management component of database systems ensures the durability of transaction.

Question 77:
what is fork and join in threading.

Question 78:
what is class level and object level lock in java.

``` java

// Java program to illustrate 
// Object lock concept 
class Geek implements Runnable { 
    public void run() 
    { 
        Lock(); 
    } 
    public void Lock() 
    { 
        System.out.println(Thread.currentThread().getName()); 
        synchronized(this) 
        { 
            System.out.println("in block "
                + Thread.currentThread().getName()); 
            System.out.println("in block " +  
                Thread.currentThread().getName() + " end"); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        Geek g = new Geek(); 
        Thread t1 = new Thread(g); 
        Thread t2 = new Thread(g); 
        Geek g1 = new Geek(); 
        Thread t3 = new Thread(g1); 
        t1.setName("t1"); 
        t2.setName("t2"); 
        t3.setName("t3"); 
        t1.start(); 
        t2.start(); 
        t3.start(); 
    } 
} 
```


Output:
```
t1
in block t1
in block t1 end
t2
in block t2
in block t2 end
t3
in block t3
in block t3 end
```


``` java

in block t3
in block t3
in block t3// Java program to illustrate class level lock 
class Geek implements Runnable { 
    public void run() 
    { 
        Lock(); 
    } 
  
    public void Lock() 
    { 
        System.out.println(Thread.currentThread().getName()); 
        synchronized(Geek.class) 
        { 
            System.out.println("in block " 
                + Thread.currentThread().getName()); 
            System.out.println("in block " 
                + Thread.currentThread().getName() + " end"); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        Geek g1 = new Geek(); 
        Thread t1 = new Thread(g1); 
        Thread t2 = new Thread(g1); 
        Geek g2 = new Geek(); 
        Thread t3 = new Thread(g2); 
        t1.setName("t1"); 
        t2.setName("t2"); 
        t3.setName("t3"); 
        t1.start(); 
        t2.start(); 
        t3.start(); 
    } 
} 
```

Output:
```
t1
in block t1
in block t1 end
t2
in block t2
in block t2 end
t3
in block t3
in block t3 end
```

reference:
https://www.geeksforgeeks.org/object-level-class-level-lock-java/


Question 79:
what is Callable and Runnable.

Question 80:
what is executor framework.

Answer:
Using an Executor it is possible to remove the manual creation of threads to execute a command.


** Executor framework with Runnable and Thread pool size **

``` java
package com.journaldev.threadpool;

public class WorkerThread implements Runnable {
  
    private String command;
    
    public WorkerThread(String s){
        this.command=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.command;
    }
}
```

``` java
package com.journaldev.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
```

output:
```
pool-1-thread-2 Start. Command = 1
pool-1-thread-4 Start. Command = 3
pool-1-thread-1 Start. Command = 0
pool-1-thread-3 Start. Command = 2
pool-1-thread-5 Start. Command = 4
pool-1-thread-4 End.
pool-1-thread-5 End.
pool-1-thread-1 End.
pool-1-thread-3 End.
pool-1-thread-3 Start. Command = 8
pool-1-thread-2 End.
pool-1-thread-2 Start. Command = 9
pool-1-thread-1 Start. Command = 7
pool-1-thread-5 Start. Command = 6
pool-1-thread-4 Start. Command = 5
pool-1-thread-2 End.
pool-1-thread-4 End.
pool-1-thread-3 End.
pool-1-thread-5 End.
pool-1-thread-1 End.
Finished all threads
```

reference:
https://www.journaldev.com/1069/threadpoolexecutor-java-thread-pool-example-executorservice


** Executor framework with Callable **
``` java

package com.journaldev.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }
    
    public static void main(String args[]){
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        //Create MyCallable instance
        Callable<String> callable = new MyCallable();
        for(int i=0; i< 100; i++){
            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        for(Future<String> fut : list){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();
    }

}
```

```

Mon Dec 31 20:40:15 PST 2012::pool-1-thread-1
Mon Dec 31 20:40:16 PST 2012::pool-1-thread-2
Mon Dec 31 20:40:16 PST 2012::pool-1-thread-3
Mon Dec 31 20:40:16 PST 2012::pool-1-thread-4
Mon Dec 31 20:40:16 PST 2012::pool-1-thread-5
Mon Dec 31 20:40:16 PST 2012::pool-1-thread-6
Mon Dec 31 20:40:16 PST 2012::pool-1-thread-7
Mon Dec 31 20:40:16 PST 2012::pool-1-thread-8
Mon Dec 31 20:40:16 PST 2012::pool-1-thread-9
Mon Dec 31 20:40:16 PST 2012::pool-1-thread-10
Mon Dec 31 20:40:16 PST 2012::pool-1-thread-2
...
```
reference:
https://www.journaldev.com/1090/java-callable-future-example


other reference:
https://www.baeldung.com/java-runnable-callable


Question 81:
difference between Callabale and Runnable.

Answer:
1. Callable is introduced in JDK 5.0 but Runnable is introduced in JDK 1.0
2. Callable has call() method but Runnable has run() method.
3. Callable has call method which returns value but Runnable has run method which doesn't return any value.
4. call method can throw checked exception but run method can't throw checked exception.
5. Callable use submit() method to put in task queue but Runnable use execute() method to put in the task queue.

Question 82:
how to crate and prevent deadlock.

Answer:

**Creating dead lock**
``` java
public class TestThread {
   public static Object Lock1 = new Object();
   public static Object Lock2 = new Object();
   
   public static void main(String args[]) {
      ThreadDemo1 T1 = new ThreadDemo1();
      ThreadDemo2 T2 = new ThreadDemo2();
      T1.start();
      T2.start();
   }
   
   private static class ThreadDemo1 extends Thread {
      public void run() {
         synchronized (Lock1) {
            System.out.println("Thread 1: Holding lock 1...");
            
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Thread 1: Waiting for lock 2...");
            
            synchronized (Lock2) {
               System.out.println("Thread 1: Holding lock 1 & 2...");
            }
         }
      }
   }
   private static class ThreadDemo2 extends Thread {
      public void run() {
         synchronized (Lock2) {
            System.out.println("Thread 2: Holding lock 2...");
            
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Thread 2: Waiting for lock 1...");
            
            synchronized (Lock1) {
               System.out.println("Thread 2: Holding lock 1 & 2...");
            }
         }
      }
   } 
}
```

output:
```
Thread 1: Holding lock 1...
Thread 2: Holding lock 2...
Thread 1: Waiting for lock 2...
Thread 2: Waiting for lock 1...
```


**preventing deadlock**

``` java
public class TestThread {
   public static Object Lock1 = new Object();
   public static Object Lock2 = new Object();
   
   public static void main(String args[]) {
      ThreadDemo1 T1 = new ThreadDemo1();
      ThreadDemo2 T2 = new ThreadDemo2();
      T1.start();
      T2.start();
   }
   
   private static class ThreadDemo1 extends Thread {
      public void run() {
         synchronized (Lock1) {
            System.out.println("Thread 1: Holding lock 1...");
            
            try {
               Thread.sleep(10);
            } catch (InterruptedException e) {}
            System.out.println("Thread 1: Waiting for lock 2...");
            
            synchronized (Lock2) {
               System.out.println("Thread 1: Holding lock 1 & 2...");
            }
         }
      }
   }
   private static class ThreadDemo2 extends Thread {
      public void run() {
         synchronized (Lock1) {
            System.out.println("Thread 2: Holding lock 1...");
           
            try {
               Thread.sleep(10);
            } catch (InterruptedException e) {}
            System.out.println("Thread 2: Waiting for lock 2...");
            
            synchronized (Lock2) {
               System.out.println("Thread 2: Holding lock 1 & 2...");
            }
         }
      }
   } 
}
```

output:
```
Thread 1: Holding lock 1...
Thread 1: Waiting for lock 2...
Thread 1: Holding lock 1 & 2...
Thread 2: Holding lock 1...
Thread 2: Waiting for lock 2...
Thread 2: Holding lock 1 & 2...
```

Question 83:
What is producer & consumer and blocking queue.

Answer:

``` java
public class BlockingQueue<T> {
 
    private List<T> queue = new LinkedList<T>();
 
    private int limit = 10;
 
    public synchronized void put(T item) {
        while (queue.size() == limit) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        if (queue.isEmpty()) {
            notifyAll();
        }
        queue.add(item);
    }
 
    public synchronized T take() throws InterruptedException {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        if (queue.size() == limit) {
            notifyAll();
        }
        return queue.remove(0);
    }
     
}
```

reference:
https://www.baeldung.com/java-concurrency-interview-questions


