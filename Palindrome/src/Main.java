import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;

        }
        if(original!=reversed_n){
            System.out.println(reversed_n);
            System.out.println("Palindrome=NO");
        }
        else{
            System.out.println(reversed_n);
            System.out.println("Palindrome=YES");
        }

    }
}