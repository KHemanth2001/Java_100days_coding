public class towerOfHanoi {
    public static void TowerOfHanoi(int n,String src, String helper, String desc){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+ desc);
            return;
        }
        TowerOfHanoi(n-1,src,desc,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+ desc);
        TowerOfHanoi(n-1,helper,src,desc);
    }
    public static void main(String[] args) {
        int n=3;
        TowerOfHanoi(n,"S","H","D");

    }
}
