package com.frank;

import java.util.Stack;

public class ExampleStack {
    private static Stack<String> pastCommands = new Stack<>();
    private static Stack<String> futureCommands = new Stack<>();

    public static void undo() {
        if (!pastCommands.isEmpty()) {
            futureCommands.push(pastCommands.pop());
            // Adding to the future tasks... the last task I did
        }
    }

    public static void redo() {
        if (!futureCommands.isEmpty()) {
            pastCommands.push(futureCommands.pop());
        }
    }

    public static void main(String[] args) {
        pastCommands.push("Draw a box");
        pastCommands.push("Fill in box");
        pastCommands.push("Change the color");
        pastCommands.push("Draw a circle");
        pastCommands.push("Move the circle");

        System.out.println(pastCommands);
        System.out.println("Very last thing done: " + pastCommands.peek());

        undo();

        System.out.println("Very last thing done: " + pastCommands.peek());

        System.out.println("Undo stack: " + pastCommands);
        System.out.println("Redo stack: " + futureCommands);

        redo();

        System.out.println("Undo stack: " + pastCommands);
        System.out.println("Redo stack: " + futureCommands);

    }
}
