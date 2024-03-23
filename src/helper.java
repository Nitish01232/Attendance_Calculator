import java.util.Scanner;

public class helper{
    static Scanner in = new Scanner(System.in);
    public static double dis(int ar){
        boolean x = true;
        var C_T = new int[6]; // Class Attended
        var T_T = new int[6]; // Total Class taken
        var res = new double[6]; // Result
        double total_attendance = 0;
        while (ar <=4 && x){
            System.out.print("Initial Present:"+" ");
            C_T[ar] = in.nextInt();
            System.out.print("Total Class Taken:"+" ");
            T_T[ar] = in.nextInt();
            if (C_T[ar] < T_T[ar] ){
                res[ar] = ((double) C_T[ar] /T_T[ar]);
                res[ar] *= 100;
            }
            else{
                System.out.println("It is Impossible");
                x = false;
            }
        }

        total_attendance += res[ar];
        return total_attendance;
    }
}