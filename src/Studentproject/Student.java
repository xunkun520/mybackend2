package Studentproject;

public class Student {
    // 设计一个 Student 类，表示一个学生。
    //属性（全部 private）：
    //name（String）：姓名
    //studentId（String）：学号
    //score（int）：成绩
    //要求：
    //为每个属性提供 getter / setter
    //提供两个构造方法：
    //无参构造：不接收参数，属性先置为默认值
    //有参构造：创建对象时一次性指定姓名、学号、成绩
    //实现 introduce() 方法，输出：
    //我是xxx，学号xxxxxxxx，成绩xx
    private String name;
    private String studentID;
    private int score;
    public Student(String name, String studentID, int score){
        this.name=name;
        this.studentID=studentID;
        this.score=score;
    }

    public Student() {

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setStudentID(String studentID){
        this.studentID=studentID;
    }
    public String getStudentID(){
        return this.studentID;
    }
    public void setScore(int score){
        this.score=score;
    }
    public int getScore(){
        return this.score;
    }
    public void introduce(){
        System.out.println("我是"+this.name+","+"学号"+this.studentID+","+"成绩"+this.score+"分");
    }
}
