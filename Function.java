import java.util.*;
public class Function {
    public static int sockMerchant(int n, int ar[]) {
        // Write your code here
        int count=0,indx=0,i=0,j=1;
        while(i<n-1){
            while(j<n){
                if(ar[i]==ar[j]){
                    count++;
                    ar[j]=0;
                    i++;
                    j++;
                }
                j++;
            }
            i++;
            j=i+1;
        }
        return count;

    }

    public static void main(String[] args) {
        int n=9;
        int[] ar={10,20,20,10,10,30,50,10,20};
        System.out.println(sockMerchant(n,ar));
    }
}
