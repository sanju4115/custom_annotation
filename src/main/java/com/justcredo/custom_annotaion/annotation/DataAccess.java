package com.justcredo.custom_annotaion.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface DataAccess {
    String entity();
}