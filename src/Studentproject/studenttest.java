package Studentproject;

public class studenttest {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("张三");
        s.setStudentID("20260908011");
        s.setScore(150);
        s.introduce();
        Student s1=new Student("李四","20261301010",149);
        s1.introduce();
        GraduateStudent g=new GraduateStudent();
        g.setAdvisor("王老师");
        g.setName("老刘");
        g.setStudentID("20260908012");
        g.setScore(139);
        g.introduce();
        g.research();
        GraduateStudent g1=new GraduateStudent("李老师","王五","20251301011",147);
        g1.introduce();
        g1.research();
    }
}
