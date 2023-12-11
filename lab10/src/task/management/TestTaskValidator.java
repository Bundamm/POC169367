package task.management;

public class TestTaskValidator {
    public static void main(String[] args) {
        SimpleTaskValidator taskValidator = new SimpleTaskValidator();
        String taskId1 = "23451";
        String taskId2 = null;
        String taskId3 = "bbbbb";
        System.out.println(taskValidator.isValidTask(taskId1));
        System.out.println(taskValidator.isValidTask(taskId2));
        System.out.println(taskValidator.isValidTask(taskId3));
        int priority1 = 7;
        int priority2 = 3;
        System.out.println(taskValidator.isPriorityHigh(priority1));
        System.out.println(taskValidator.isPriorityHigh(priority2));
        SimpleTaskValidator taskValidator2 = new SimpleTaskValidator();
        String taskId4 = "3124455";
        System.out.println(taskValidator.isValidTask(taskId4));
        int priority3 = 1;
        System.out.println(taskValidator.isPriorityHigh(priority3));
    }
}
