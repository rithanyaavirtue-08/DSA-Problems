import java.util.Scanner;

public class Armstrong{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int count=0;
        int temp=num;
        double sum=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=num;
        while(temp>0){
           int digit=temp%10;
          sum+=Math.pow(digit,count);
          temp=temp/10;


           }
        if(sum==original){
            System.out.println("It's Armstrong");
        }
        else{
            System.out.println("NO");
        }
        }



    }

