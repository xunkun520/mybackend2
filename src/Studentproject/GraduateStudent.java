package Studentproject;

public class GraduateStudent extends Student{
    //在 Student 的基础上，新增 GraduateStudent（研究生）类。
    //
    //要求：
    //
    //GraduateStudent 继承 Student
    //新增属性 advisor（String，导师姓名），同样 private + getter/setter
    //提供构造方法，能同时初始化姓名、学号、成绩、导师
    //
    //重写 introduce() 方法，输出中包含导师信息，例如：
    //
    //复制代码
    //
    //我是xx，学号xxxxxxxx，成绩xx，我的导师是xxx
    //新增特有方法 research()，输出"我在做科研
    private String advisor;
    public GraduateStudent(){}
    public GraduateStudent(String advisor,String name,String studentID,int score){
        super(name,studentID,score);
        this.advisor=advisor;
    }
    public void setAdvisor(String advisor){
        this.advisor=advisor;
    }
    public String getAdisor(){
        return advisor;
    }
    public void introduce(){
        System.out.println("我是"+getName()+","+"学号"+getStudentID()+","+"成绩"+getScore()+"分"+",我的导师是"+this.advisor);
    }
    public void research(){
        System.out.println("我在做科研");
    }

}
