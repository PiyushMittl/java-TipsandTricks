
<details>
  <summary>1. Lambda Expression</summary>

## Lambda Expression Examples:  

**Example 1:**
``` java
public void print(){
      System.out.println("hello");
}
```
``` java
() -> {System.out.println("hello");}
or
() -> System.out.println("hello"); // if we have only one line there is no need of writing {}
```
**Example 2:**
``` java
public void sum(int a,int b){
      System.out.println(a+b);
}
```
``` java
(int a,int b) -> System.out.println(a+b);
or
(a,b) -> System.out.println(a+b);
```
**Example 3:**
``` java
public void square(int n){
   return n*n;
}
```
``` java
(int n) -> { return n*n; }
(n) -> { return n*n; }
(n) -> n*n;

n -> n*n;
```

**Notes:**
1. Lambda Expression can have any number of arguments. 1,2,...   
2. For one argument parenthesis are optional  
3. ``` java (a,b) -> System.out.println(a+b); ``` (parenthesis are mandatory if more than one argument is there)  
4. 
``` java 
    (a,b) -> {
                  System.out.println(a+b);
                  System.out.println(a-b);
                  System.out.println(a*b);
            }
```        
curly braces are mandatory if we have more than one line in method body  
5. you can not call lambda function without using functional interface  
 Example for functional interfaces:  
 
 ```
  SAM (Single Abstract Method)
  Runnable -> run()
  Callable -> call()
  Comparable -> compareTo()
  Comparator -> compare()
  ActionListener -> actionPerformed()
  
  ```
6. Prior to `java 1.8` `interfaces` could have only `abstract` methods. but java 1.8 onwards it could have default and static methods also.  

``` java
default void m1(){
}

static void m2(){
}
```
   
7. Functional interface can have only one abstract method and multiple default and static methods.  

``` java
@FunctionalInterface
interface Interf{
public abstract void m1(); // can have only one abstract method
default void m2() {} // can have multipe default method
static void m3() {} // can have multiple static methods
}
```

``` java
@FunctionalInterface
interface Interf{
public abstract void m1(); // can have only one abstract method
public abstract void m4(); // can have only one abstract method
// error
default void m2() {} // can have multipe default method
static void m3() {} // can have multiple static methods
}
```

``` java

interface Interf{
public abstract void m1();
public abstract void m4();
// works fine if remove @FunctionalInterface annotation
default void m2() {}
static void m3() {}
}
```

8. Since below interface doesnot contains any abstract method, is not a functional interface.
``` java
@FuntionalInterface
interface Interf{
}
//error
```

9.  
``` java
@FuntionalInterface
interface Interf{
  public void m1(); // works fine
}

```

10.  
``` java
@FuntionalInterface
interface A{
  public void m1(); 
}
 
@FuntionalInterface
interface B extends A{

}
// works fine
```
since Functional Interface should have at least one abstract method and here its coming from interface A.

11.  
``` java
@FuntionalInterface
interface A{
  public void m1(); 
}
 
@FuntionalInterface
interface B extends A{
  public void m1(); //works fine
}

```
we can override method from parent interface from one funtional interface to another functional interface.


12.  
``` java
@FuntionalInterface
interface A{
  public void m1(); 
}
 
@FuntionalInterface
interface B extends A{
  public void m2(); // error
}

```
since one abstract method is coming from interface A we can not define one more abstract method in functional interface.

13.  
``` java
@FuntionalInterface
interface A{
  public void m1(); 
}
 

interface B extends A{
  public void m2(); // works fine
}

```
</details>
  


<details>
  <summary>2. Functional interface</summary>
</details>



<details>
  <summary>3. Default Methods</summary>

1.7v:  
every method in interface is by default public and abstract   

``` java
 void m1()  
 public void m1()  
 abstract void m1()  
 public void abstract void m1()  
```         
1.8v:  
default and static methods are also allowed  
1.9v:  
private methods are also allowed  
variables:  
private final  

why we need default method in java 8
------
``` java
interface I{
public void m1();
public void m2();
}

class Test1 implements I{
public void m1(){}
public void m2(){}
}

class Test2 implements I{
public void m1(){}
public void m2(){}
}

class Test3 implements I{
public void m1(){}
public void m2(){}
}

class Test4 implements I{
public void m1(){}
public void m2(){}
}
```
here each class need to implement the method available in interface I and if i want to extend the functionality if interface I  
each implementation needs to implement that new method added in interface I, else it will break all the implemented class.  

**Solution:**
default method introduced to overcome this situation.
``` java
interface I{
public void m1();
public void m2();
public void m3(); //error in sub class untill we implement this method in sub class
default void m3(){} //no error in sub class even if we do not implement this method in sub class
}

class Test1 implements I{
public void m1(){}
public void m2(){}
}

class Test2 implements I{
public void m1(){}
public void m2(){}
}

class Test3 implements I{
public void m1(){}
public void m2(){}
}

class Test4 implements I{
public void m1(){}
public void m2(){}
}
```

diamond operator problem in interface
------

``` java
interface I1{
default void m3(){}
}

interface I2{
default void m3(){}
}

class Test1 implements I1,I2{
public static void main(){
//error 
}
}
```
we need to override method in Test1 class to remove error
``` java
interface I1{
default void m3(){}
}

interface I2{
default void m3(){}
}

class Test1 implements I1,I2{
public static void main(){
public void m3(){
//I1.super.m3();//can call m3 from I1
//I2.super.m3();//can call m3 from I2
}// works fine
}
}
```

static methods
----
if static methods are not related to instance variable then why not to allow them in interface.

``` java
interface I1{
default void m1(){}
}


class Test1 implements I1,I2{
public static void main(){

T1.m1();
Test1.m1();//error
m1();//error
Test t1=new Test();
t1.m1();//error

}
}
```



note:
default method can not be defined in a class.

</details>         




pre defined functional interfaces (PFSC)  
4. Predicates     
5. Functions  
         Supplier  
         Consumer  
6. Double Colon Operator (Constructor and Method Reference)  
7. Stream API   
8. Date and Time API  



https://www.baeldung.com/java-8-interview-questions
