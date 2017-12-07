package pl.knpj;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ArrayUtilsTest {

    private ArraysUtils a;

    @Before
    public void setup() {
        a = new ArraysUtils();
    }

    @Test(expected = NullPointerException.class)
    public void makeArrayTest_Null() {
        a.makeArray(null);
    }

    @Test
    public void makeArrayTest_EmptyArray() {
        int[] emptyArray = new int[0];
        int[] result = a.makeArray(emptyArray);
        assertArrayEquals(emptyArray, result);
    }

    @Test
    public void makeArrayTest_4ElementsArray() {
        int[] expectedArray = {1, 2, 3, 4};
        int[] result = a.makeArray(expectedArray);
        assertArrayEquals(expectedArray, result);
    }

    @Test
    public void makeArrayPrivateTest_4ElementsArray() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int[] expectedArray = {1, 2, 3, 4};
        Method method = ArraysUtils.class.getDeclaredMethod("makeArrayPrivate", int[].class);
        method.setAccessible(true);
        int[] result = (int[]) method.invoke(a, expectedArray);
        assertArrayEquals(expectedArray, result);
    }

}
