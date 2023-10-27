public class RecurringTask extends Task {
    public RecurringTask(String title, String description, String date, String status,
                         String priority) {
        super(title, description, date, status, priority);
    }

    public void inProgress() {
        String status = "pending";
    }
    public void finishedTask() {
        String status = "complete";
    }
}
