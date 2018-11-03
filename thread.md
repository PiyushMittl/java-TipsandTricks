

Question 1.
Types of thread.
Answer:
1. User Thread:  
User threads are threads which are created by the application or user. They are high priority threads. JVM (Java Virtual Machine) will not exit until all user threads finish their execution. JVM wait for these threads to finish their task. These threads are foreground threads.  
2.Daemon Thread :  
Daemon threads are threads which are mostly created by the JVM. These threads always run in background. These threads are used to perform some background tasks like garbage collection and house-keeping tasks. These threads are less priority threads. JVM will not wait for these threads to finish their execution. JVM will exit as soon as all user threads finish their execution. JVM doesn’t wait for daemon threads to finish their task.  

Question 2.
What is daemon thread.
Answer:

Question 3.  
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


Question 4:
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

Question 5:
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

Question 6:
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


Question 7:
**Atomicity:** This property ensures that either all the operations of a transaction reflect in database or none. Let’s take an example of banking system to understand this: Suppose Account A has a balance of 400$ & B has 700$. Account A is transferring 100$ to Account B. This is a transaction that has two operations a) Debiting 100$ from A’s balance b) Creating 100$ to B’s balance. Let’s say first operation passed successfully while second failed, in this case A’s balance would be 300$ while B would be having 700$ instead of 800$. This is unacceptable in a banking system. Either the transaction should fail without executing any of the operation or it should process both the operations. The Atomicity property ensures that.  

**Consistency:** To preserve the consistency of database, the execution of transaction should take place in isolation (that means no other transaction should run concurrently when there is a transaction already running). For example account A is having a balance of 400$ and it is transferring 100$ to account B & C both. So we have two transactions here. Let’s say these transactions run concurrently and both the transactions read 400$ balance, in that case the final balance of A would be 300$ instead of 200$. This is wrong. If the transaction were to run in isolation then the second transaction would have read the correct balance 300$ (before debiting 100$) once the first transaction went successful.  

**Isolation:** For every pair of transactions, one transaction should start execution only when the other finished execution. I have already discussed the example of Isolation in the Consistency property above.  

**Durability:** Once a transaction completes successfully, the changes it has made into the database should be permanent even if there is a system failure. The recovery-management component of database systems ensures the durability of transaction.

Question 8:
what is fork and join in threading.

Question 9:
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


Question 10:
what is Callable and Runnable.

Question 11:
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


Question 12:
difference between Callabale and Runnable.

Answer:
1. Callable is introduced in JDK 5.0 but Runnable is introduced in JDK 1.0
2. Callable has call() method but Runnable has run() method.
3. Callable has call method which returns value but Runnable has run method which doesn't return any value.
4. call method can throw checked exception but run method can't throw checked exception.
5. Callable use submit() method to put in task queue but Runnable use execute() method to put in the task queue.

Question 13:
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

Question 14:
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


