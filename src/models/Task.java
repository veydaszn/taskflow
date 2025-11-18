package models;


public class Task {
private String title;
private String description;
private String priority; // Low, Medium, High
private String status; // Pending, In Progress, Completed


public Task(String title, String description, String priority) {
this.title = title;
this.description = description;
this.priority = priority;
this.status = "Pending";
}


public void setStatus(String status) {
this.status = status;
}


public String getTitle() { return title; }
public String getDescription() { return description; }
public String getPriority() { return priority; }
public String getStatus() { return status; }


@Override
public String toString() {
return title + " (" + priority + ") — " + status;
}
}
