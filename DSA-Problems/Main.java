import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
    static int countDigits(int n) {

        int count=0;
        if(n==0){
            return 1;
        }
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;

    }



}