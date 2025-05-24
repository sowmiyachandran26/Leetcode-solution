
import java.util.Scanner;

class leetcode1{
    public boolean isPalindrome(int x) {
        int rem=0;
        int res=0;
        int ans=x;

        if(x<0){
            return false;
        }
        else{
            while(x!=0){
                 rem=x%10;
                 res=rem+res*10;
                x=x/10;
                // System.out.println(res);
            }
         if(res==ans){
            return true;
         }
         else{
            return false;
         }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
          leetcode1 pali=new leetcode1();
        
     System.out.println(pali.isPalindrome(a));
    }
}
