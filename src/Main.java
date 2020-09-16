import java.util.Random;

public class Main {

    public static void main(String[] args) {
       int numberofTask = getRandomNumberofTasks();
       Task[] tasksArray = new Task[numberofTask];
       tasksArray = createTasklist(numberofTask);
       printTaskarray(tasksArray);
       Mentor mentorOne = new Mentor("Vasya","Ivanob",35);
       Student studentOne = new Student("Jane","Petrova",23,0,mentorOne,false);
       studentOne.solveTasks(tasksArray);
       System.out.println(studentOne.getPassedTasksCount());
    }

    public static Task[] createTasklist (int numberOfTasks){

        Task[] tasksArray = new Task[numberOfTasks];
        Task obj = null;
        Random randomizer = new Random();
        for (int i=0; i< tasksArray.length; i++) {
            int randomNumber = randomizer.nextInt(3);
            switch(randomNumber) {
                case 0:
                    obj = new Test(i,"Test text");
                    break;
                case 1:
                    obj = new DragAndDrop(i,"Some task text");
                    break;
                case 2:
                    obj = new Code(i,"Some task text");
                    break;
            }
            tasksArray[i] = obj;
        }
        return tasksArray;
    }

    public static void printTaskarray (Task[] tasksArray){
        for (Task obj:tasksArray
             ) {
            System.out.println(obj);

        }
    }

    public static int getRandomNumberofTasks (){
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(30);
        return randomNumber;
    }


    //one more test
}

