import java.util.*;
public class spiral {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int n=5;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int r_s=0,r_e=n-1,c_s=0,c_e=n-1;
        while(r_s<=r_e && c_s<=c_e){
            for(int i=c_s;i<=c_e;i++){
                System.out.print(arr[r_s][i]+" ");
            }
            r_s++;
            for(int i=r_s;i<=r_e;i++){
                System.out.print(arr[i][c_e]+" ");
            }
            c_e--;
            for(int i=c_e;i>=c_s;i--){
                System.out.print(arr[r_e][i]+" ");
            }
            r_e--;
            for(int i=r_e;i>=r_s;i--){
                System.out.print(arr[i][c_s]+" ");
            }
            c_s++;
        }

    }
}
