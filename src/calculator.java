import java.text.DecimalFormat;
import java.util.Scanner;

public class calculator{
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


        for(int j = 0; j < no_of_course; j++){
            System.out.println(course[j]);
            System.out.print("Initial classes: ");
            no_of_classes[j] = in.nextInt();
            System.out.print("Total classes: ");
            total_class[j] = in.nextInt();
        }

        for(int k = 0; k < no_of_course; k++){
            percentage_of_course[k] = (float) no_of_classes[k] /total_class[k];
            percentage_of_course[k] *= 100;
            System.out.println(course[k]+": "+df.format(percentage_of_course[k])+" %");
            should_attend_or_not[k] = (percentage_criteria * total_class[k] - 100 * no_of_classes[k])/(100 - percentage_criteria);
        }
        for(int l = 0; l < no_of_course; l++){
            if(should_attend_or_not[l] > 0){
                System.out.println("You should attend next " + should_attend_or_not[l]+ " classes of "+ course[l] +" to get on back on track");
            }
            else {
                System.out.println("You can bunk next " + ((100 * no_of_classes[l] - percentage_criteria * total_class[l])/percentage_criteria) + " classes of "+ course[l] );
            }
        }

    }
}
