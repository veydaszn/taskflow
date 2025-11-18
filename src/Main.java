import models.Task;
import models.User;
import services.TaskManager;


public class Main {
public static void main(String[] args) {
User user = new User("Veyda");
TaskManager tm = new TaskManager();


tm.addTask(new Task("Design UI", "Create wireframes for dashboard", "High"));
tm.addTask(new Task("Write Docs", "Prepare requirement specs", "Medium"));


tm.updateStatus("Design UI", "In Progress");


System.out.println("=== TaskFlow Summary for " + user.getName() + " ===");
for (Task t : tm.getAllTasks()) {
System.out.println(t);
}
}
}
