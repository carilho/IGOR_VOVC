package homework_nr_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ToDoList {
    public static void main(String[] args) {

        List<String> tasks = todayTasks();
        System.out.println("Tasks for Today:\n" + tasks);

        Set<String> uniqueTasks = todayUniqueTasks(tasks);
        System.out.println("Unique tasks for Today:\n" + uniqueTasks);
    }

    public static List<String> todayTasks(){

        List<String> tasksToDo = new ArrayList<>();

        tasksToDo.add("To brush my teeth");
        tasksToDo.add("To go to work");
        tasksToDo.add("To buy some food");
        tasksToDo.add("To make homework from Gherman");
        tasksToDo.add("To work some work");
        tasksToDo.add("To practice English");
        tasksToDo.add("To brush my teeth");
        tasksToDo.add("To go to work");
        tasksToDo.add("To buy some food");
        tasksToDo.add("To make homework from Gherman");
        return tasksToDo;
    }

    public static Set<String> todayUniqueTasks(List<String> tasksToDo){
        return new HashSet<>(tasksToDo);
    }
}
