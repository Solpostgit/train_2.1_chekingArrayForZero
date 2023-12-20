public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int [] arr = new int[] {5};
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 6;
        arr[4] = 7;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}