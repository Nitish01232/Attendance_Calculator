import java.text.DecimalFormat;
public class calculator {
    public static void main(String[] args) {

        var r = new String[6];
        var course = new String[6];
        course[0] = "LA";
        course[1] = "DSA";
        course[2] = "DBMS";
        course[3] = "SE";
        DecimalFormat df = new DecimalFormat("#.##");
        double grade = 0;
        for (int i = 0; i < 4; i++) {
            double T_T = helper.dis(i);
            if (T_T == -1){
                return;
            }
            grade += T_T;
            r[i] = (course[i] + ":" + df.format(T_T) + "%");
        }
        for (int j = 0; j < 4; j++) {
            System.out.println(r[j]);
        }
        grade /= 4;
        System.out.println("Overall Attendance is : " + df.format(grade) + "%");
        if (grade < 75) {
            System.out.println("You should sit more classes");
        } else {
            System.out.println("Yo! You're all Good!");
        }
    }
}