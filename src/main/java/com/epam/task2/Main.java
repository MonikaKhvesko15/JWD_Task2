package com.epam.task2;

//Создать класс Hello, который будет приветствовать любого пользователя при вводе его имени
//через командную строку.

import com.epam.task2.enter.ConsoleEnterUserName;
import com.epam.task2.enter.EnterUserName;
import com.epam.task2.logic.Hello;
import com.epam.task2.view.ConsolePrintUserGreetingFactory;
import com.epam.task2.view.PrintFactory;
import com.epam.task2.view.PrintUserGreeting;

public class Main {
    public static void main(String[] args) {

        //receive correct user name
        EnterUserName enterUserName=new ConsoleEnterUserName();
        String userName=enterUserName.getUserName();

        //compose a user's greeting
        Hello hello = new Hello();
        String userGreeting = hello.sayHello(userName);

        //view result
        PrintFactory printFactory = new ConsolePrintUserGreetingFactory();
        PrintUserGreeting printUserGreeting = printFactory.createPrint();
        printUserGreeting.printUserGreeting(userGreeting);

    }
}
