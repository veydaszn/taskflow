package services;


import models.Task;
import java.util.ArrayList;
import java.util.List;


public class TaskManager {
private List<Task> tasks = new ArrayList<>();


public void addTask(Task task) {
tasks.add(task);
}


public void updateStatus(String title, String status) {
for (Task t : tasks) {
if (t.getTitle().equalsIgnoreCase(title)) {
t.setStatus(status);
}
}
}


public List<Task> getAllTasks() {
return tasks;
}
}
