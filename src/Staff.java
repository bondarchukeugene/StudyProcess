public interface Staff {

    public void giveHelp (Student student);

    default void giveSupplementaryMaterials (Student student) {
        System.out.println("Please see habr.com");
    }
}
