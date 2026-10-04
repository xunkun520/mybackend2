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
        Student s2=new Student("李四五","20261301011",149);
        s2.introduce();
        Student s4 = new Student();
        s4.setName("张三七");
        s4.setStudentID("20260908012");
        s4.setScore(15);
        s4.introduce();
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
        GraduateStudent g2=new GraduateStudent("李老师","王五二","20251301016",147);
        g2.introduce();
        g2.research();
    }
}
