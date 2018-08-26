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
ref: pg. 221 Kathy Sierra
