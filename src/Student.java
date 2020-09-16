import java.util.Objects;

public class Student extends Person {

    private int passedTasksCount;
    private static int allStudentsTasksCount;
    public static int totalAttempts =0;
    private Mentor mentor;
    private boolean areAllTaskspassed;

    public Student(String name, String surname, int age, int passedTasksCount, Mentor mentor, boolean areAllTaskspassed) {

        super(name, surname, age);
        this.passedTasksCount = 0;
        this.mentor = mentor;
        this.areAllTaskspassed = areAllTaskspassed;
    }

    public void solveTasks(Task[] tasksList) {

        for (int i = this.passedTasksCount; i < tasksList.length; i++) {
            this.solveTask(tasksList[i]);
        }
    }

    private void solveTask(Task task) {
        if (task instanceof Autochecked) {
            System.out.println("Task solved by " + this.name + " " + this.surname);
            this.passedTasksCount += 1;
            Student.allStudentsTasksCount += 1;
            totalAttempts+=1;
        } else {
            Mentor mentor = new Mentor("Вася", "Ivanov", 25);
            boolean isMentorHelp = false;
            while (mentor.makeCodeReview(task)) {
                totalAttempts+=1;
            }
            this.passedTasksCount+=1;
            Student.allStudentsTasksCount += 1;
            totalAttempts+=1;

              ;
            }
        }



    public int getPassedTasksCount() {
        return passedTasksCount;
    }

    public static int getAllStudentsTasksCount() {
        return allStudentsTasksCount;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public boolean isAreAllTaskspassed() {
        return areAllTaskspassed;
    }

    public void setPassedTasksCount(int passedTasksCount) {
        this.passedTasksCount = passedTasksCount;
    }

    public static void setAllStudentsTasksCount(int allStudentsTasksCount) {
        Student.allStudentsTasksCount = allStudentsTasksCount;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void setAreAllTaskspassed(boolean areAllTaskspassed) {
        this.areAllTaskspassed = areAllTaskspassed;
    }
}



