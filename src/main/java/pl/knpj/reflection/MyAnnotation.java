package pl.knpj.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String name() default "def name";
    int uses();

}
