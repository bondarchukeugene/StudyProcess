public class Test extends Task implements Autochecked {

    String [] testKeys;

    public Test(int id, String taskText) {
        super(id, taskText);
        this.testKeys = new String[]{"a","b","c"};
    }

    public Test(int id, String taskText, String[] testKeys) {
        super(id, taskText);
        this.testKeys = testKeys;
    }

//    @Override
//    public String toString() {
//        return "Test{" +
//                "id=" + id +
//                '}';
//    }
}
