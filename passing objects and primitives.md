# Passing Variables into Methods (Objective 7.3)
7.3 Determine the effect upon object references and primitive values when they are passed
into methods that perform assignments or other modifying operations on the parameters.
Methods can be declared to take primitives and/or object references. You need to
know how (or if) the caller's variable can be affected by the called method. The
difference between object reference and primitive variables, when passed into
methods, is huge and important. To understand this section, you'll need to be
comfortable with the assignments section covered in the first part of this chapter.
Passing Object Reference Variables
When you pass an object variable into a method, you must keep in mind that you're
passing the object reference, and not the actual object itself. Remember that a
reference variable holds bits that represent (to the underlying VM) a way to get to
a specific object in memory (on the heap). More importantly, you must remember
that you aren't even passing the actual reference variable, but rather a copy of the
reference variable. A copy of a variable means you get a copy of the bits in that
variable, so when you pass a reference variable, you're passing a copy of the bits
representing how to get to a specific object. In other words, both the caller and the
called method will now have identical copies of the reference, and thus both will
refer to the same exact (not a copy) object on the heap.
For this example, we'll use the Dimension class from the java.awt package:
 1. import java.awt.Dimension;
 2. class ReferenceTest {
Passing Object Reference Variables (Exam Objective 7.3) 213
 3. public static void main (String [] args) {
 4. Dimension d = new Dimension(5,10);
 5. ReferenceTest rt = new ReferenceTest();
 6. System.out.println("Before modify() d.height = "
 + d.height);
 7. rt.modify(d);
 8. System.out.println("After modify() d.height = "
 + d.height);
 9. }
10. void modify(Dimension dim) {
11. dim.height = dim.height + 1;
12. System.out.println("dim = " + dim.height);
13. }
14. }
When we run this class, we can see that the modify() method was indeed able to
modify the original (and only) Dimension object created on line 4.
C:\Java Projects\Reference>java ReferenceTest
Before modify() d.height = 10
dim = 11
After modify() d.height = 11
Notice when the Dimension object on line 4 is passed to the modify() method,
any changes to the object that occur inside the method are being made to the object
whose reference was passed. In the preceding example, reference variables d and dim
both point to the same object.
Does Java Use Pass-By-Value Semantics?
If Java passes objects by passing the reference variable instead, does that mean Java
uses pass-by-reference for objects? Not exactly, although you'll often hear and read
that it does. Java is actually pass-by-value for all variables running within a single
VM. Pass-by-value means pass-by-variable-value. And that means, pass-by-copy-ofthe-variable!
(There's that word copy again!)
It makes no difference if you're passing primitive or reference variables, you are
always passing a copy of the bits in the variable. So for a primitive variable, you're
passing a copy of the bits representing the value. For example, if you pass an int
variable with the value of 3, you're passing a copy of the bits representing 3. The
called method then gets its own copy of the value, to do with it what it likes.
214 Chapter 3: Assignments
And if you're passing an object reference variable, you're passing a copy of the
bits representing the reference to an object. The called method then gets its own
copy of the reference variable, to do with it what it likes. But because two identical
reference variables refer to the exact same object, if the called method modifies the
object (by invoking setter methods, for example), the caller will see that the object
the caller's original variable refers to has also been changed. In the next section,
we'll look at how the picture changes when we're talking about primitives.
The bottom line on pass-by-value: the called method can't change the caller's
variable, although for object reference variables, the called method can change the
object the variable referred to. What's the difference between changing the variable
and changing the object? For object references, it means the called method can't
reassign the caller's original reference variable and make it refer to a different object,
or null. For example, in the following code fragment,
void bar() {
 Foo f = new Foo();
 doStuff(f);
}
void doStuff(Foo g) {
 g.setName("Boo");
 g = new Foo();
}
reassigning g does not reassign f! At the end of the bar() method, two Foo objects
have been created, one referenced by the local variable f and one referenced by
the local (argument) variable g. Because the doStuff() method has a copy of the
reference variable, it has a way to get to the original Foo object, for instance to call
the setName() method. But, the doStuff() method does not have a way to get to
the f reference variable. So doStuff() can change values within the object f refers
to, but doStuff() can't change the actual contents (bit pattern) of f. In other
words, doStuff() can change the state of the object that f refers to, but it can't
make f refer to a different object!
Passing Primitive Variables
Let's look at what happens when a primitive variable is passed to a method:
class ReferenceTest {
 public static void main (String [] args) {
Passing Primitive Variables (Exam Objective 7.3) 215
 int a = 1;
 ReferenceTest rt = new ReferenceTest();
 System.out.println("Before modify() a = " + a);
 rt.modify(a);
 System.out.println("After modify() a = " + a);
 }
 void modify(int number) {
 number = number + 1;
 System.out.println("number = " + number);
 }
}
In this simple program, the variable a is passed to a method called modify(),
which increments the variable by 1. The resulting output looks like this:
Before modify() a = 1
number = 2
After modify() a = 1
Notice that a did not change after it was passed to the method. Remember, it was
a copy of a that was passed to the method. When a primitive variable is passed to a
method, it is passed by value, which means pass-by-copy-of-the-bits-in-the-variable.
