
1.Lambda Expression  
2. Functional interface  
3. Default Methods  
pre defined functional interfaces (PFSC)  
      4. Predicates     
      5. Functions  
         Supplier  
         Consumer  
6. Double Colon Operator (Constructor and Method Reference)  
7. Stream API   
8. Date and Time API  

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
 ``
  Runnable 
  Callable
  Comparable
  
  (Marker Interface)
  Serializable
  RandonAccess
  Cloneable
  SigleThreadModel
  ``
  
https://www.baeldung.com/java-8-interview-questions

