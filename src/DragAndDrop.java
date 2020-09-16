public class DragAndDrop extends Task implements Autochecked {
    String [][] options;

    public DragAndDrop(int id, String taskText) {
        super(id, taskText);
        this.options = new String[][]{{"a","b"},{"c","d"}};
    }

    public DragAndDrop(int id, String taskText,String[][] options) {
        super(id, taskText);
        this.options = options;
    }
}
