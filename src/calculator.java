import java.text.DecimalFormat;
import java.util.Scanner;

public class    calculator{
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var df = new DecimalFormat("#.##");

        System.out.print("What is the percentage criteria (in %) ?: ");
        int percentage_criteria = in.nextInt();
        System.out.print("The no.of course: ");
        int no_of_course = in.nextInt();
        System.out.println("Name Them");
        in.nextLine();

        String[] course = new String[no_of_course];
        int[] should_attend_or_not = new int[no_of_course];
        int[] no_of_classes = new int[no_of_course];
        int[] total_class = new int[no_of_course];
        float[] percentage_of_course = new float[no_of_course];


        for(int i = 0; i < no_of_course; i++){
            course[i] = in.nextLine();
        }


        for(int j = 0; j < no_of_course; j++){  // Taking Classes Inputs
            System.out.println(course[j]);
            System.out.print("Initial classes: ");
            no_of_classes[j] = in.nextInt();
            System.out.print("Total classes: ");
            total_class[j] = in.nextInt();
        }

        for (int n = 0; n < no_of_course; n++){
            if ( no_of_classes[n] <= total_class[n]){
                    percentage_of_course[n] = (float) no_of_classes[n] /total_class[n];
                    percentage_of_course[n] *= 100;
                    System.out.println(course[n]+": "+df.format(percentage_of_course[n])+" %");
                    should_attend_or_not[n] = (percentage_criteria * total_class[n] - 100 * no_of_classes[n])/(100 - percentage_criteria);

                    if(should_attend_or_not[n] > 0){
                        System.out.println("You should attend next " + should_attend_or_not[n]+ " classes of "+ course[n] +" to get on back on track");
                    }
                    else {
                        System.out.println("You can bunk next " + ((100 * no_of_classes[n] - percentage_criteria * total_class[n])/percentage_criteria) + " classes of "+ course[n] );
                    }

            }
            else{
                throw new IllegalArgumentException(" No.of Initial classes can not be greater than Total No. of classes");
            }
        }
    }
}
