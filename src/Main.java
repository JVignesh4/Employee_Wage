import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1.Employee Attendance");
        System.out.println("2.Wage per day for the Employee");
        System.out.println("3.Wage per day for the Part Time Employee");
        System.out.println("4.Wage Calculation Using Switch Case");
        System.out.println("5.Employee Wage for 20 Days");
        System.out.println("6.Employee Monthly Wage");
        System.out.println("Enter the choice: ");
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
            case 4:
                Employee.empWageSwitchCase();
                break;
            case 5:
                Employee.empWageDays();
                break;
            case 6:
                Employee.employeeWageMonthly();
                break;
            default:
                System.out.println("Choose the Correct Option");
        }
    }
}
