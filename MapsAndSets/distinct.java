import java.util.HashSet;

public class distinct {

    public static int distinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr) {
            set.add(ele);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Distinct count: " + distinct(arr));
    }
}