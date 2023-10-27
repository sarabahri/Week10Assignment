public class Task {
    private String title;
    private String description;
    private String date;
    private String status;
    private String priority;

    public Task(String title, String description, String date, String status,
                String priority) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.status = status;
        this.priority = priority;
    }
}