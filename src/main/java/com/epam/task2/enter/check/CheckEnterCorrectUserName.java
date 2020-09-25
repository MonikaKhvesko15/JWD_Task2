package com.epam.task2.enter.check;

public class CheckEnterCorrectUserName implements CheckCorrectName {
    public boolean checkName(String name) {
        boolean flag;
        if (Character.isUpperCase(name.charAt(0))) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}
