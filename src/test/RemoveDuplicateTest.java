package test;

import org.junit.Test;
import set.RemoveDuplicates;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sepehr on 2017-01-20.
 */
public class RemoveDuplicateTest {

    boolean arrayEquals(int[] a1, int[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    @Test
    public void testUniqueElements() {
        int[] ints = {7, 5, 3, 5, 2, 2, 7};
        int[] res = RemoveDuplicates.uniqueElements(ints);
        int[] expected = {2, 3, 5, 7};
        assertTrue("different elements returns wrong result", arrayEquals(res, expected));
    }

    @Test
    public void testSameElements() {
        int[] ints = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] res = RemoveDuplicates.uniqueElements(ints);
        int[] expected = {1};
        assertTrue("same elements returns wrong result", arrayEquals(res, expected));
    }

    @Test
    public void testEmptyArray() {
        int[] ints = new int[0];
        int[] res = RemoveDuplicates.uniqueElements(ints);
    }

}
