package pl.knpj;

public class ArraysUtils {

    public int[] makeArray(int... e) {
        int[] array = new int[e.length];
        for (int i = 0; i < e.length; i++) {
            array[i] = e[i];
        }
        return array;
    }

    private int[] makeArrayPrivate(int[] e) {
        int[] array = new int[e.length];
        for (int i = 0; i < e.length; i++) {
            array[i] = e[i];
        }
        return array;
    }

}
