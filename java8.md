
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
Lambda Expression  
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
Lambda Expression  
``` java
(int a,int b) -> System.out.println(a+b);
or
(a,b) -> System.out.println(a+b);
```




https://www.baeldung.com/java-8-interview-questions

