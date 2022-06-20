import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1.Employee Attendance");
        System.out.println("2.Wage per day for the Employee");
        System.out.println("3.Wage per day for the Part Time Employee");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                Employee.attendanceOfEmployee();
                break;
            case 2:
                Employee.wageOfEmployee();
                break;
            case 3:
                Employee.partTimeEmployee();
                break;
            default:
                System.out.println("Choose the Correct Option");
        }
    }
}
