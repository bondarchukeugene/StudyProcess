public class Code extends Task {
    String codeText;

    public Code(int id, String taskText) {
        super(id, taskText);
        this.codeText = " default value for code";
    }

    public Code(int id, String taskText, String codeText) {
        super(id, taskText);
        this.codeText = codeText;
    }
//        public static void main(String[] args) {
//        Code code = new Code(1, "Task text");
//        System.out.println(code.codeText);
//
//    }
}