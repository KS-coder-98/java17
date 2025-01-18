package pl.krzysiek.javaClass;

import java.util.Arrays;

public class Exp1 {

    String[] tasks = new String[15];
    int index = 0;

    class MenageTasks {
        void addTask(String task) {
            tasks[index++] = task;
        }

        void displayTask() {
            Arrays.stream(tasks).limit(index).forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        Exp1 exp1 = new Exp1();

        MenageTasks menageTasks = exp1.new MenageTasks();
        menageTasks.addTask("1");
        menageTasks.addTask("2");
        menageTasks.addTask("3");
        MenageTasks menageTasks2 = exp1.new MenageTasks();
        menageTasks2.addTask("5");
        menageTasks2.addTask("6");
        menageTasks2.addTask("7");
        menageTasks.displayTask();
        System.out.println("#######");
        menageTasks2.displayTask();

    }
}
