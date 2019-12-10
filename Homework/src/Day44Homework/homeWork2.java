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
        }
    }
}
