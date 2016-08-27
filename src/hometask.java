import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Aleksandr on 26.08.2016.
 */
public class hometask {
    public static void main(String [] agrs){
            Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 чисел");
        int []a=new int[10];
        a[0]=scanner.nextInt();
        a[1]=scanner.nextInt();
        a[2]=scanner.nextInt();
        a[3]=scanner.nextInt();
        a[4]=scanner.nextInt();
        a[5]=scanner.nextInt();
        a[6]=scanner.nextInt();
        a[7]=scanner.nextInt();
        a[8]=scanner.nextInt();
        a[9]=scanner.nextInt();

        Arrays.sort(a);
        String text=Arrays.toString(a);
        System.out.println(text);
        scanner.close();
    }
}
