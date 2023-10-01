public class Main {
    public static void main(String[] args) {
        int c = 6;
        int b = 8;
        int a = c - b;

        int[] arr = new int[c];
        try{
            arr[b]=23;
//            int[] arr2 = new int[a];

        }catch (IndexOutOfBoundsException | NegativeArraySizeException i){
            System.out.println("Warning");}

    }
}