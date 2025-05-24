import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine().toLowerCase();
        String b=scan.nextLine().toLowerCase();
      char[] arr1= a.toCharArray();
      char[] arr2=b.toCharArray();
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      String res1= new String(arr1);
      String res2= new String(arr2);
      if(res1.equals(res2)){
        System.out.print("Anagram");
      }
      else
      System.out.print("Not Anagram");

    }
}
