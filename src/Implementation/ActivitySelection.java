package Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {

    public static class Task {
        int start;
        int end;

        Task(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void PrintTask(ArrayList<Task> activities) {
        for (Task task : activities) {
            System.out.println(task.start + " " + task.end);
        }
    }

    public static void numberTasks(ArrayList<Task> activities) {
        Collections.sort(activities, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {

                return o1.end < o2.end ? -1 : 1;

            }
        });
        PrintTask(activities);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        int count = 0;
        int max_end = -10;
        for (Task task : activities) {
            if (task.start > max_end) {
                max_end = task.end;
                count++;
                System.out.println(task.start + " " + task.end);
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        ArrayList<Task> activities = new ArrayList<Task>(6);
        activities.add(new Task(5, 9));
        activities.add(new Task(1, 2));
        activities.add(new Task(3, 4));
        activities.add(new Task(0, 6));
        activities.add(new Task(5, 7));
        activities.add(new Task(8, 9));
        numberTasks(activities);


    }
}
