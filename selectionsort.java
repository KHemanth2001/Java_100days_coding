public class selectionsort {
    public static void main(String[] args) {
        int[] ar={3,4,1,2,7};
        for(int i=0;i<ar.length-1;i++){
            int sm=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[sm]>ar[j]){
                    sm=j;
                }
            }
            int t=ar[i];
            ar[i]=ar[sm];
            ar[sm]=t;
        }

        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
