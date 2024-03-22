import java.util.Scanner;

public class helper{
    static Scanner in = new Scanner(System.in);
    public static double dis(int ar){

        var C_T = new int[6]; // Class Taken
        var T_T = new int[6]; // Total Class taken
        var res = new double[6]; // Result
        double total_attendance = 0;
        System.out.print("Initial Present:"+" ");
        C_T[ar] = in.nextInt();
        System.out.print("Total Class Taken:"+" ");
        T_T[ar] = in.nextInt();
        res[ar] = ((double) C_T[ar] /T_T[ar]);
        res[ar] *= 100;

        total_attendance += res[ar];
        return total_attendance;
    }
}