public class leetcode3 {
    public static void main(String[] args) {
        int a=0;
        int[] nums= {9,8,7,6,5,4,3,2,1,0};
        for(int i=0;i<=nums.length-1;i++){
            a=a*10+nums[i];
            System.out.println(a);
        }
      
            System.out.println(a+1);
        
    }
}
