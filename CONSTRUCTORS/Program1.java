public class Program1{
    public static void main(String[] args) {
        int[] arr={5,5,7,2,1,8,6};
        int[] rarr= new int[arr.length];
        int n=2;
        System.arraycopy(arr, 2, rarr, 0, 5);
        System.arraycopy(arr, 0, rarr, 5, 2);
        for(int i:rarr){
            System.out.print(i+" ");
        }
    }
}