import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class solutions {
    public static void main (String[] args){
        HashMap<String, String> A = new HashMap<String, String>();
            HashMap<String,String > B = new HashMap<String, String>();
        boolean scrap1 = true;
        while (scrap1 = true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter A or B, your number will be deposited in the according dictioanry, typing end will cancel the program");
            String scanner1 = scanner.next();
            Boolean scanner2 = Boolean.valueOf(scanner1);
            if (scanner1.equals("A")){
                Scanner getA = new Scanner(System.in);
                System.out.println("please enter a key and value for dictionary A");
                String[]  resultA = getA.next().split(",");
                String keys = resultA[0], value = resultA[1];
                A.put(keys, value);
                System.out.println(A);
                continue;
            }
            if (scanner1.equals("B")){
                Scanner getB = new Scanner(System.in);
                System.out.println("please enter a key and value for dictionary B");
                String[] resultB = getB.next().split(",");
                String keys1 = resultB[0], values1 = resultB[1];
                B.put(keys1,values1);
                System.out.println(B);
                continue;
            }
            else{
                System.exit(0);
            }
        }
    }
}