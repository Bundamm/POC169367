package task.management;

public class SimpleTaskValidator implements TaskValidator{
    @Override
    public boolean isValidTask(String taskId) {
        if(taskId == null){
            return false;
        }
        return taskId.matches("\\d{5}");
    }

    @Override
    public boolean isPriorityHigh(int priority) {
        return priority > 5;
    }
}
