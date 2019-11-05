public class HomeworkDos {
    public static void main(String[] args) {

                int[] a1 = {5,8,7};
                int[] a2 = {5,6,7};
                boolean areEqual = true;
                for(int i=0; i<a1.length;i++) {
                    if (a1[i] == a2[i]) {
                        areEqual = true;
                    }else{
                        areEqual=false;
                        break;
                    }
                }
                if(areEqual) {
                    System.out.println("They are equal");
                }else{
                    System.out.println("They are not equal");
                }


            }
        }



