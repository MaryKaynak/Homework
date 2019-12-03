package day35_3;


public class Person {

    String name;
    int age;
    int weight;
    int leg;
    String eyeColor;

    public Person(){
        age = 21;
        weight = 80;
        leg = 2;
        eyeColor = "Brown";
        name = "Yunus";
    }
    public Person(String name,int age){
        this();
        }
        public Person(String name,int age,int leg){
        this.name = name;
        this.age = age;
        this.leg = leg;

        }
        public Person(String name,int age,int weight,int leg){
          this();
        }
        public Person(String nam,int ages,int weigh,int legs,String eyeColors){
             name = nam;
             age = ages;
             weight = weigh;
             leg = legs;
             eyeColor = eyeColors;

        }
        public String result(){
        return "Person Name: " + name + "\n"
                + "Person age: " + age + "\n"
                + "Person weight: " + weight + "\n"
                + "Person leg: " + leg + "\n"
                + "Person eye color: " + eyeColor;
        }

    }


