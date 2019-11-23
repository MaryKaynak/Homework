package Day35_1;

public class Bank {

   // class Bank {
        public int year;
        public String name;
        public int telNo;
        public int serial;
        public boolean trustworthiness;

        public Bank() {
            year = 0;
            name = "Unknow bank name";
            telNo = 0;
            serial = 0;
        }

        public Bank(boolean n) {
            this(1999, "Wells Fargo", 23456, 4);
            trustworthiness = n;
        }

        public Bank(int x, String name, int telNo, int num) {
            this.year = x;
            this.name = name;
            this.telNo = telNo;
            serial = num;

        }

        public Bank(int year, String name, int telNo, int num, boolean n) {
            this.year = year;
            serial = num;
            this.name = name;
            trustworthiness = n;
        }

        public String printOut() {
            return "Bank Year:" + year + "\n"
                    + "Bank Name:" + name + "\n"
                    + "Serial Number:" + serial + "\n"
                    + "Trustworthiness:" + trustworthiness;

        }

    }




