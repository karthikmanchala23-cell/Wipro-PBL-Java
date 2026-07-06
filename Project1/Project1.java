package Project1;

public class Project1 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter employee id");
            return;
        }

        int empId = Integer.parseInt(args[0]);

        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"};
        char[] desCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] dept = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        boolean found = false;

        for (int i = 0; i < empNo.length; i++) {

            if (empNo[i] == empId) {

                found = true;

                String designation = "";
                int da = 0;

                switch (desCode[i]) {

                    case 'e':
                        designation = "Engineer";
                        da = 20000;
                        break;

                    case 'c':
                        designation = "Consultant";
                        da = 32000;
                        break;

                    case 'k':
                        designation = "Clerk";
                        da = 12000;
                        break;

                    case 'r':
                        designation = "Receptionist";
                        da = 15000;
                        break;

                    case 'm':
                        designation = "Manager";
                        da = 40000;
                        break;
                }

                int salary = basic[i] + hra[i] + da - it[i];

                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(empNo[i] + "\t" + empName[i] + "\t\t" + dept[i] + "\t\t" + designation + "\t\t" + salary);

                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + empId);
        }
    }
}