package task.management;

public interface TaskValidator {
    public abstract boolean isValidTask(String taskId);
    public abstract boolean isPriorityHigh(int priority);
}
