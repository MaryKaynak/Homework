package Day44Homework;



//write a Sum class
//create a sum method that accepts 2 int parameters, x, y and returns int as a result;
//create a sum method overload that accepts 3 parameters and takes 3 int parameters, x, y, z
//create a sum method overload that accepts 2 double parameters x, y, and returns a double.
//in your main method call the class and run these 3 methods.
public class homeWork2 {
    static class Sum{
        public int sum(int x,int y){
        return x+y;
        }
        public int sum(int x,int y,int z){
            return x+y+z;
        }
        public double sum(double x,double y){
            return x+y;
        }

        public static void main(String[] args) {

            Sum sum = new Sum();
            System.out.println(sum.sum(10,20));
            System.out.println(sum.sum(25,10,19));
            System.out.println(sum.sum(10.0,10.5));

//2. Can we overload methods on return type?    We cannot overload by return type.
//will this work???? why? why not?              However, Overloading methods on return type are possible in cases,
//                                              where the data type of the function being called is explicitly specified.
//                                               If we do static it is works

//public class Main
//{
//    public int foo() { return 10; }

//    public char foo() { return 'a'; }

//    public static void main(String args[])
//    {
//    }
//}

//3. Can we overload static methods?    Yes we can have two ore more static methods with same name, but differences in input parameters
//4. Can we overload methods that differ only by static keyword?    We cannot overload two methods in Java if they differ only  by static keyword
//                                                                  (number of parameters and types of parameters is same)
//will this work???? why? why not?
//public class Test
//{
//    public static void foo()
//    {
//        System.out.println("Test.foo() called ");
//    }
//    public void foo()
//    { // Compiler Error: cannot redefine foo()
//        System.out.println("Test.foo(int) called ");
//    }
//    public static void main(String args[])
//    {
//        Test.foo();
//    }
//}

//5. Can we overload main() in Java?    we can overload main() in Java.
//6. What is the difference between Overloading and Overriding?

                        // OVERLOADING                                                        OVERRIDING
           //  1. 	Method overloading is a compile time polymorphism. 	             Method overriding is a run time polymorphism.
           //  2. 	It help to rise the readability of the program. 	             While it is used to grant the specific implementation of the method which is already provided by its parent class or super class.
           //  3. 	It is occur within the class. 	                                 While it is performed in two classes with inheritance relationship.
           //  4. 	Method overloading may or may not require inheritance. 	         While method overriding always needs inheritance.
           //  5. 	In this, methods must have same name and different signature.  	 While in this, methods must have same name and same signature
            //  6. 	In method overloading, return type can or can not be be same,    While in this, return type must be same or co-variant.
            //  but we must have to change the parameter.

//7. Can we Override static methods in java?   yes we can
//it is related to question 7.
//what is the output of this program? why? why not?

         //   if we make all classes static it works.  static class Base, static class Derived, static class Test
//class Base
//{
//    public static void display()
//    {
//        System.out.println("Static or class method from Base");
//    }
//    public void print()
//    {
//        System.out.println("Non-static or Instance method from Base");
//    }
//}

//class Derived extends Base
//{
//public static void display()
//{
//    System.out.println("Static or class method from Derived");
//}
//public void print()
//{
//    System.out.println("Non-static or Instance method from Derived");
//}
//}

//public class Test
//{
//    public static void main(String args[ ])
//    {
//        Base obj1 = new Derived();
//        obj1.display();

//        obj1.print();
//    }
//}





        }
    }
}
