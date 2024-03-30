package problemsolving;

import java.util.Scanner;

public class Problem11 {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        int size=scanner.nextInt();
        int[] health=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements");
            health[i]=scanner.nextInt();
        }
        int gcd=health[0];
        for(int i=1;i<size-1;i++){
            gcd=gcd(gcd,health[i]);
        }
        System.out.println(gcd);

    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
