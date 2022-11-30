package day6;

import java.util.Random;

public class Teacher {
    private String teacherName;
    private String subject;

    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
   public void evaluate (Student student){
       Random random = new Random ();
       int a = random.nextInt(4) + 2;

       String rating = "";
       switch (a) {
           case 2:
               rating = "Неудовлетворительно";
               break;
           case 3:
               rating = "Удовлетворительно";
               break;
           case 4:
               rating = "Хорошо";
               break;
           case 5:
               rating = "Отлично";
               break;
       }
       System.out.println("Преподаватель " + this.teacherName + " оценил студента с именем " +  student.getStudentName() + " по предмету " + this.subject + " на оценку " + rating);
    }
}
