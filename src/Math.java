
public class Math {

    public static void main(String[] args) {

        int[] arr = {12, 18, 20};
        System.out.println(sum(arr));

    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s;
    }
}
