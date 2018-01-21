package pl.sda.queues;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MyQueue<Task> tasks = new MyQueue<>();
        for (int i = 0; i < 10; i++) {
            Task task = new Task();
            task.setTitle("task " + i);
            task.setCreationDate(LocalDate.now());
            tasks.offer(task);
        }

        for (Task task : tasks) {
            System.out.println("Zadanie: " + task.getTitle() + ",  " + task.getCreationDate());
        }


    }
}
