//This program is done by Ronak Bhalgami(21CE009)
import java.util.Arrays;

public class PR1 {
    public static void main(String[] args) {
        P7_1[] s = new P7_1[4];
        s[0] = new P7_1("Ronak", 18, 35);
        s[1] = new P7_1("Keval", 18, 94);
        s[2] = new P7_1("Om", 19, 53);
        s[3] = new P7_1("Darshan", 18, 82);
        System.out.println("------------------------------------ --------------");
        System.out.println("Before sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("------------------------------------ --------------");
        Arrays.sort(s);
        System.out.println("After sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("------------------------------------ --------------");
    }
}