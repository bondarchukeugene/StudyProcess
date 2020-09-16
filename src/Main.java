import java.util.Random;

public class Main {

    public static void main(String[] args) {
       Task[] tasksArray = new Task[30];
       tasksArray = createTasklist();
       printTaskarray(tasksArray);
       Mentor mentorOne = new Mentor("Vasya","Ivanob",35);
       Student studentOne = new Student("Jane","Petrova",23,0,mentorOne,false);
       studentOne.solveTasks(tasksArray);
        System.out.println(studentOne.getPassedTasksCount());
    }

    public static Task[] createTasklist (){

        Task[] tasksArray = new Task[30];
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


    //test changes ndnswdsdsczcxzc
}

