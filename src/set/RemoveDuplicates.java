package set;

/**
 * Created by Sepehr on 2017-01-20.
 */
public class RemoveDuplicates {
    public static int[] uniqueElements(int[] ints) {
        MaxSet<Integer> ms = new MaxSet<>();
        for (int i : ints) {
            ms.add(i);
        }
        int i = ms.size() - 1;
        int[] result = new int[i + 1];
        while (!ms.isEmpty()) {
            int max = ms.getMax();
            result[i] = max;
            ms.remove(max);
            i--;
        }
        return result;
    }

    //test method
    public static void main(String args[]){
        int[] ints = {7, 5, 3, 5, 2, 2, 7};
        int[] res = RemoveDuplicates.uniqueElements(ints);
        for (int i: res) System.out.print(i + ", ");
    }
}
