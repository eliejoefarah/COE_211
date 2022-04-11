import java.util.Scanner;
public class Skeleton {
    public static void main(String[] args) {
        // Initialize array of integers
        Scanner scan = new Scanner(System.in);
        int grades[] = new int[5];
        int attendance, midterm, assignment; 
        double sum=0;
        // for loop to get user input & store in array
        for (int i =0; i<5; i++){
            System.out.println("Input the grade of assignment " + (i+1) + ":");
            int grade = scan.nextInt();
            grades[i]= grade;
        }
        for(int i = 0;i<5;i++){
           sum+=grades[i]; 
        }
        double average=(sum)/5.0;

        System.out.println("Input the number of attended labs");
        attendance = scan.nextInt();
        double attendavg = attendance/7.0;
        System.out.println("Input the midterm grade");
        midterm = scan.nextInt();

        double assignmentgrade = (average)*0.3;
        double attendancegrade = (attendavg)*(0.05)*(100);
        double midtermgrade = (midterm)*(0.3);

        System.out.println("Assignments (30%): " + assignmentgrade + "\n Attendance(5%): " + attendancegrade + "\n Midterm (30%): " + midtermgrade);

        // for loop to iterate over the array & perform calculations

        // display output to user
    }
}