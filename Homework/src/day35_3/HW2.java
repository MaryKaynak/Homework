package day35_3;

public class HW2 {
    public static void main(String[] args) {
      Person prsn = new Person();
        System.out.println(prsn.result());
        Person person = new Person("Yusuf",49,70,2,"Green");
        System.out.println("-------------------------------");
        System.out.println(person.result());
        Person person1 = new Person("Zeynep",16,58,2,"Brown");
        System.out.println("--------------------------------");
        System.out.println(person1.result());
        Person person2 = new Person("Nihal",36,62,2,"Brown");
        System.out.println("----------------------------------");
        System.out.println(person2.result());
        Person person3 = new Person();
        System.out.println("----------------------------------");
        System.out.println(person3.eyeColor);
        Person person4 = new Person();
        System.out.println("----------------------------------");
        System.out.println(person4.age);
        Person person5 = new Person();
        System.out.println("----------------------------------");
        System.out.println(person5.name);
        Person person6 = new Person("Mahmut",67,75,2,"Browm");
        System.out.println("----------------------------------");
        System.out.println(person6.result());
        Person person7 = new Person("Gul",56,75,2,"Green");
        System.out.println("----------------------------------");
        System.out.println(person7.result());
        Person person8 = new Person("Mert",30,80,2,"Browm");
        System.out.println("----------------------------------");
        System.out.println(person8.result());
        Person person9 = new Person("Elif",25,56,2,"Browm");
        System.out.println("----------------------------------");
        System.out.println(person6.result());




    }
}
