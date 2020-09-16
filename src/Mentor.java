import java.util.Random;

public class Mentor extends Person implements Staff {

    boolean isInGoodMood;
    Random random;

    public Mentor(String name, String surname, int age) {
        super(name, surname, age);
        this.isInGoodMood = true;

    }

    public Mentor(String name, String surname, int age, boolean isInGoodMood) {
        super(name, surname, age);
        this.isInGoodMood = isInGoodMood;
    }

    public boolean makeCodeReview (Task task){
        random = new Random();
        int i = random.nextInt();

        if (i>=1000){
            this.isInGoodMood = true;
            System.out.println("Task solved! Good job");
            return true;
        }else{
            this.isInGoodMood = false;
            System.out.println("Task did not solved! Try again");
            return false;
        }

    }

      @Override
    public void giveHelp(Student student) {
          System.out.println("cheer up"+student.name);
    }

    @Override
    public void giveSupplementaryMaterials(Student student) {

        System.out.println("Please see habr.com");

    }
}
