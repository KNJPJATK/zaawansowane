package pl.knpj.reflection;

@MyAnnotation(uses = 5)
public class AwesomeClass {

    private AwesomeClass() {}

    private Integer awesomeMethod() {
        return 5;
    }

    protected static String method2(String str1, String str2, Integer i) {
        StringBuilder str = new StringBuilder();
        if (i != null) {
            for (int j = 0; j < Math.abs(i); j++) {
                str.append(str1).append(" ");
            }
        }
        str.append(str2);
        return str.toString();
    }

}
