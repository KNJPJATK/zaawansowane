package pl.knpj.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clz = AwesomeClass.class;
        Method awesomeMethod = clz.getDeclaredMethod("awesomeMethod");
        Constructor constructor = clz.getDeclaredConstructor();
        unlock(awesomeMethod, constructor);
        AwesomeClass instance = (AwesomeClass) constructor.newInstance();
        Integer result = (Integer) awesomeMethod.invoke(instance);
        System.out.println(result);

        Method method2 = clz.getDeclaredMethod("method2", String.class, String.class, Integer.class);
        unlock(method2);
        String result2 = (String) method2.invoke(null, "Arg1", "Arg2", new Integer(5));
        System.out.println(result2);

        for (Annotation annotation : clz.getDeclaredAnnotations()) {
            System.out.println(annotation.toString());
            if (annotation instanceof MyAnnotation) {
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                System.out.println(myAnnotation.uses());
            }
        }
    }

    private static void unlock(Executable... execs) {
        if (execs != null) {
            for (Executable exec : execs) {
                exec.setAccessible(true);
            }
        }
    }

}
