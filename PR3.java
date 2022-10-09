//This program is done by Ronak Bhalgami(21CE009)
import java.util.ArrayList;
import java.util.Scanner;

public class PR3 {
    public static void main(String[] args) {
        ArrayList<P7_3> obj = new ArrayList<P7_3>();
        int i = 1;
        while (i < 6) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter following details :-");
            System.out.print("Age : ");
            int age = sc.nextInt();
            System.out.print("Net monthly Income : ");
            double netincome = sc.nextDouble();
            System.out.print("Total work Experience : ");
            int exp = sc.nextInt();
            System.out.print("Citizenship : ");
            String citizenship = sc.next();
            obj.add(new P7_3(age, netincome, exp, citizenship));
            i++;
        }
        System.out.println("--------------------------------------------------");
        for (int j = 1; j < obj.size() + 1; j++) {
            System.out.println("AccHolder " + j + " is " + obj.get(j - 1).eligibility());
        }
    }
}
