package ScoreProgram;

import java.util.ArrayList;

public class Korean implements Subject{
    private int classID;
    private ArrayList<Student> student= new ArrayList<Student>();
    //과목 개설
    public Korean(int classID) {
        this.classID = classID;
    }
    //학생 수강 신청
    @Override
    public void sugangAdmit(Student student) {
        this.student.add(student);
    }
}
