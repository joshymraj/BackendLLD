package CopyConstructors;

public class Exam {
    int examID;
    String examName;

    public Exam(){

    }

    public Exam(int examID, String examName) {
        this.examID = examID;
        this.examName = examName;
    }

    public Exam(Exam exam) {
        this.examID = exam.examID;
        this.examName = exam.examName;
    }

    public int getExamID() {
        return this.examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public String getExamName() {
        return this.examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }
}
