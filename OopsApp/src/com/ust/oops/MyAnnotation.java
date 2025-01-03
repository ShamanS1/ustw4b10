package com.ust.oops;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target({ ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
 
// Custom annotation
@interface MyAnnotation
{
    String value() default "CustomAnnotation";
}