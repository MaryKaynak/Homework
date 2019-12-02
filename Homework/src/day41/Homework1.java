package day41;

public class Homework1 {
}
//    What will be the output of the following Java program?
//class X
//{
//    //Class X Members
//}
//
//class Y
//{
//    //Class Y Members
//}
//
//class Z extends X, Y
//{
//    //Class Z Members
//}
//       Answer Class cannot extend multiple classes
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//class A
//{
//    int i = 10;
//}
//
//class B extends A
//{
//    int i = 20;
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        A a = new B();
//
//        System.out.println(a.i);
//    }
//}          ///////   Answer is 10
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//class A
//{
//    {
//        System.out.println(1);
//    }
//}
//
//class B extends A
//{
//    {
//        System.out.println(2);
//    }
//}
//
//class C extends B
//{
//    {
//        System.out.println(3);
//    }
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//}    Answer
//             1
//             2
//             3
//
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//class A
//{
//    String s = "Class A";
//}
//
//class B extends A
//{
//    String s = "Class B";
//
//    {
//        System.out.println(super.s);
//    }
//}
//
//class C extends B
//{
//    String s = "Class C";
//
//    {
//        System.out.println(super.s);
//    }
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//
//        System.out.println(c.s);
//    }
//          Answer   Class A
//                   Class B
//                   Class C
//}
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//class A
//{
//    static
//    {
//        System.out.println("THIRD");
//    }
//}
//
//class B extends A
//{
//    static
//    {
//        System.out.println("SECOND");
//    }
//}
//
//class C extends B
//{
//    static
//    {
//        System.out.println("FIRST");
//    }
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//}
//        Answer     THIRD
//                   SECOND
//                   FIRST
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//class A
//{
//    public A()
//    {
//        System.out.println("Class A Constructor");
//    }
//}
//
//class B extends A
//{
//    public B()
//    {
//        System.out.println("Class B Constructor");
//    }
//}
//
//class C extends B
//{
//    public C()
//    {
//        System.out.println("Class C Constructor");
//    }
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//}
//       Answer        Class A Constructor
//                     Class B Constructor
//                     Class C Constructor
//
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//class X
//{
//    static void staticMethod()
//    {
//        System.out.println("Class X");
//    }
//}
//
//class Y extends X
//{
//    static void staticMethod()
//    {
//        System.out.println("Class Y");
//    }
//}
//
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        Y.staticMethod();
//    }
//}     Answer Class Y
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//class X
//{
//    public X(int i)
//    {
//        System.out.println(1);
//    }
//}
//
//class Y extends X
//{
//    public Y()
//    {
//        System.out.println(2);
//    }
//}
//}
//   Answer There is no default constructor available in'X'
