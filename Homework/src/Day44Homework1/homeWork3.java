package Day44Homework1;

public class homeWork3 {
    //1. what is polymorphism
    //Polymorphism is considered as one of the important features of Object Oriented Programming.
    // Polymorphism allows us to perform a single action in different ways.
    // In other words, polymorphism allows you to define one interface and have multiple implementations.
//2. what are the types of polymorphism
     // Compile time Polymorphism
     // Runtime Polymorphism
//3. what is static binding, what is dynamic binding?
   // Static Binding: The binding which can be resolved at compile time by compiler is known as static or early binding.
    // Binding of all the static, private and final methods is done at compile-time .
    //Dynamic Binding: In Dynamic binding compiler doesn’t decide the method to be called.
    // Overriding is a perfect example of dynamic binding. In overriding both parent and child classes have same method .

//Polymorphism in java

//1) What is the output of the following program?
//class Poly
//{
//    protected void getData()
//    {
//        System.out.println("Inside Poly");
//    }
//}
//class TechnoStudy extends Poly
//{
//    protected void getData()
//{
//    System.out.println("Inside TechnoStudy");
//}
//}

//public class Test
//{
//    public static void main(String[] args)
//    {
//        Poly obj = new TechnoStudy();
//        obj.getData();
//    }
//}
   // Answer  B
//a) Inside Poly
//b) Inside TechnoStudy
//c) Compilation error
//d) Runtime error



//2) What is the output of the following program?

//class Test
//{
//    void myMethod()
//    {
//        System.out.println("TechnoStudy");
//    }
//}
//public class Derived extends Test
//{
//    void myMethod()
//    {
//        System.out.println("Poly");
//    }


//    public static void main(String[] args)
//{
//    Derived object = new Test();
//    object.myMethod();
//}
//}
    // Answer A
//a) TechnoStudy
//b) Poly
//c) Compilation error
//d) Runtime error

//3) What is the output of the following program?


//class Poly
//{
//    protected void getData()
//    {
//        System.out.println("Inside Poly");
//    }
//}
//class TechnoStudy extends Poly
//{
//    protected void getData()
//{
//    System.out.println("Inside TechnoStudy");
//}

//protected void getValue()
//{
//    System.out.println("TechnoStudy");
//}
//}

//public class Test
//{
//    public static void main(String[] args)
//    {
//        Poly obj = new TechnoStudy();
//        obj.getValue();
//    }
//}
   // Answer  A Java can not find symbol getValue()
//a) Compilation error
//b) Runtime error
//c) TechnoStudy
//d) None of these


//4) What is the output of the following program?

//interface Poly
//{
//    void myMethod();
//    void getInfo();
//}

//abstract class Geeks implements Poly
//{
//    void getData()
//    {
//        System.out.println("Poly");
//    }
//}

//public class Test extends Geeks
//{
//    public void myMethod()
//{
//    System.out.println("TechnoStudy");
//}
//public void getInfo()
//{
//    System.out.println("Geeks");
//}

//public static void main(String[] args)
//{
//    Geeks obj = new Test();
//    obj.getInfo();
//}
//}
    // Answer A
//a) Geeks
//b) Compilation error
//c) Runtime error
//d) None of these


//5) What is the output of the following program?

//filter_none
//edit
//play_arrow

//brightness_4
//class Test
//{
//    public void Poly()
//    {
//        System.out.println("TechnoStudy");
//    }
//}
//public class Derived extends Test
//{
//    public void Poly()
//{
//    System.out.println("Poly");
//}
//public static void main(String[] args)
//{
//    Derived obj = new Test();
//    obj.Poly();
//}
//}
    // VAnswer A
//a) Compilation error
//b) Runtime error
//c) Poly
//d) TechnoStudy
}
