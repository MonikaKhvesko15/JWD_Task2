package com.epam.task2.enter;

import com.epam.task2.enter.check.CheckCorrectName;
import com.epam.task2.enter.check.CheckEnterCorrectUserName;

import java.util.Scanner;

public class ConsoleEnterUserName implements EnterUserName{
    public String getUserName() {

        CheckCorrectName check=new CheckEnterCorrectUserName();
        Scanner scanner=new Scanner(System.in);
        System.out.print(">> ");

        if(!check.checkName(scanner.nextLine())){
            System.out.print(">> ");
        }

        String userName= scanner.nextLine();

        return userName;
    }
}
