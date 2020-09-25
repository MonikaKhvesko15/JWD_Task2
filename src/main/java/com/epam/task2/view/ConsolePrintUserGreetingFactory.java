package com.epam.task2.view;

public class ConsolePrintUserGreetingFactory implements PrintFactory {
    public PrintUserGreeting createPrint() {
        return new ConsolePrintUserGreeting();
    }
}
