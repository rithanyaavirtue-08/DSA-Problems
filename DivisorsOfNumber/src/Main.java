import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> Num=new ArrayList<>();
        int n=sc.nextInt();

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                Num.add(i);
                if (i != n / i) {
                Num.add(n / i);
            }
            }
        }
        Collections.sort(Num);
        for(int i=0;i<Num.size();i++){
        System.out.print(Num.get(i)+" ");
    }}
}