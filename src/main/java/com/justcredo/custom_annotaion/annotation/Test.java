package com.justcredo.custom_annotaion.annotation;

import com.justcredo.custom_annotaion.others.CustomValue;
import org.springframework.stereotype.Component;

@Component
public class Test {

    private String str ;

    @DataAccess(entity="value")
    private String value;

    @DataAccess(entity="")
    private String value2;

    @DataAccess(entity="xyz")
    private String value3;

    public void test(){
        System.out.println("test method executed");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }
}
