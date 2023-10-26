import java.util.ArrayList;

public class Project {
    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<TeamMember> members = new ArrayList<>();
    private String name;
    private String description;
    private String startDate, endDate;

    public Project(String name, String description, String startDate, String endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
    
    public void addMember(TeamMember member) {
        members.add(member);
    }

    public void removeMember(TeamMember member) {
        members.add(member);
    }
}