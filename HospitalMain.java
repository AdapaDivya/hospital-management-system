import java.util.*;
class HospitalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HospitalUI.showLogo();
        HospitalUI.loading();

        while(true) {

            System.out.println(HospitalUI.YELLOW + "===== MAIN MENU =====" + HospitalUI.RESET);
            System.out.println(HospitalUI.ORANGE + "1. Register Patient" + HospitalUI.RESET);
            System.out.println(HospitalUI.BLUE + "2. Add Doctor" + HospitalUI.RESET);
            System.out.println(HospitalUI.GREEN + "3. View Patients" + HospitalUI.RESET);
            System.out.println(HospitalUI.PURPLE + "4. View Doctors" + HospitalUI.RESET);
            System.out.println(HospitalUI.CYAN + "5. Create Medical Record" + HospitalUI.RESET);
            System.out.println(HospitalUI.YELLOW + "6. View Records" + HospitalUI.RESET);
            System.out.println(HospitalUI.RED + "7. Exit" + HospitalUI.RESET);

            try {
                int ch = sc.nextInt();
                sc.nextLine(); // fix input issue

                switch(ch) {

                    case 1:
                        System.out.println("Enter id:");
                        int pid = sc.nextInt();
                        System.out.println("Enter name:");
                        sc.nextLine();
                        String pname = sc.nextLine();
                        System.out.println("Enter age:");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter problem:");
                        String problem = sc.nextLine();

                        if(age <= 0) {
                            System.out.println(HospitalUI.RED + "Invalid Age!" + HospitalUI.RESET);
                            break;
                        }

                        HospitalService.addPatient(new Patient(pid, pname, age, problem));
                        break;

                    case 2:
                        System.out.println("Enter id:");
                        int did = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter name:");
                        String dname = sc.nextLine();
                        System.out.println("Enter department:");
                        String dept = sc.nextLine();

                        HospitalService.addDoctor(new Doctor(did, dname, dept));
                        break;

                    case 3:
                        HospitalService.viewPatients();
                        break;

                    case 4:
                        HospitalService.viewDoctors();
                        break;

                    case 5:
                        System.out.println("Enter patientId doctorId diagnosis");
                        int p = sc.nextInt();
                        int d = sc.nextInt();
                        sc.nextLine();
                        String diag = sc.nextLine();

                        HospitalService.createRecord(p, d, diag);
                        break;

                    case 6:
                        HospitalService.viewRecords();
                        break;

                    case 7:
                        System.out.println(HospitalUI.PURPLE + "Exiting System..." + HospitalUI.RESET);
                        System.exit(0);

                    default:
                        System.out.println(HospitalUI.RED + "Invalid Choice" + HospitalUI.RESET);
                }

            } catch(InputMismatchException e) {
                System.out.println(HospitalUI.RED + "Invalid Input! Please enter correct data." + HospitalUI.RESET);
                sc.nextLine(); // clear buffer
            }
        }
    }
}