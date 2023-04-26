package Lesson_6;
import java.util.ArrayList;

public class Main {

    public static class Student {
        private String name = "";
        private String group = "MPEI-";
        private int course = 1;
        private int rating = 0;

        public Student(String name, int course, int rating) {
            this.name = name;
            this.group = this.group + (2023-course);
            this.course = course;
            this.rating = rating;
        }

        public String getName() {
            return this.name;
        }

        public int getCourse() {
            return this.course;
        }

        public int getRating() {
            return this.rating;
        }

        public void nextCourse() {
            ++this.course;
        }

        public String toString() {
            return "Студент " + this.name + ", из группы " + this.group + " обучается на курсе " + this.course + " со средним баллом " + this.rating;
        }
    }

    private static void checkRating(ArrayList<Student>studentsList){
        for (int i=0;i<studentsList.size();i++){
            if (studentsList.get(i).getRating()<3){
                studentsList.remove(i);
                i--;
            } else {
                studentsList.get(i).nextCourse();
            }
        }
    }

    private static void printStudent(ArrayList<Student>studentList,int course){
        for (Student student:studentList) {
            if(student.getCourse()==course){
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Student student1= new Student("Rogoza", 2, 5);
        Student student2= new Student("Vodyanov", 2, 5);
        Student student3= new Student("Belyaev", 1, 2);
        Student student4= new Student("Voevodskii", 3, 5);

        ArrayList<Student> studentsList=new ArrayList<Student>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);

        checkRating(studentsList);

        printStudent(studentsList,1);
        printStudent(studentsList,2);
        printStudent(studentsList,3);
        printStudent(studentsList,4);
    }
}