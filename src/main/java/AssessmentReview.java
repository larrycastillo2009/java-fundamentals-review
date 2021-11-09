import java.util.ArrayList;
import java.util.Arrays;

public class AssessmentReview {
    public static int cubed(int arg) {
        return arg * arg * arg;
    }

    public static int difference(int first, int second) {
        return first - second;
    }

    public static double difference(double first, double second) {
        return first - second;
    }

    public static double median(int[] arr) {
        Arrays.sort(arr);
        double median;
        if (arr.length % 2 == 0) {
            median = ((double) arr[arr.length / 2] + (double) arr[arr.length / 2 - 1]) / 2;
        } else {
            median = (double) arr[arr.length / 2];
        }

        return median;
    }

    public static boolean isUpperCase(String s)
    {
        for (int i=0; i<s.length(); i++)
        {
            if (!Character.isUpperCase(s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats){
        for (Cat cat: cats){
            if(isUpperCase(cat.getColor())){
                continue;
            }else {
                String newColor = cat.getColor().toUpperCase();
                cat.setColor(newColor);
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(cubed(3));
//        System.out.println(difference(10,5));
//        System.out.println(difference(10.5,5.7));
//        int[] arr = {1, 3, 4, 2, 6, 5, 8, 7};
//        System.out.println(median(arr));
//        System.out.println(median(new int[]{1, 3, 4, 2, 6, 5, 8, 7}));
//        System.out.println(median(new int[]{2, 20, 3, 7, 7, 5, 8, 7, 10, 0}));
//        System.out.println(median(new int[]{1, 3, 4, 2, 6, 5, 8, 7}));

        System.out.println(4.5 == AssessmentReview.median(new int[]{1, 3, 4, 2, 6, 5, 8, 7}));
        System.out.println(7.0 == AssessmentReview.median(new int[]{2, 20, 3, 7, 7, 5, 8, 7, 10, 0}));
    }
}
