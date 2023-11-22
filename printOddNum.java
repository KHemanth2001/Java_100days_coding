public class printOddNum {
    public static void printOddNumber(int n){
        for (int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int n=21;
        System.out.println("The odd numbers in the range of n is: ");
        printOddNumber(n);
    }
}
