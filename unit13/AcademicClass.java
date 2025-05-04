import java.util.*;

public class AcademicClass
{
    private Teacher teacher;
    private ArrayList<Student> students;
    
    public AcademicClass(Teacher teacher)
    {
        this.teacher = teacher;
        students = new ArrayList<>();
    }
    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    public void printClassInfo()
    {
        System.out.println("Teacher: " + teacher.getName() + "; " + teacher.getSubject());
        
        System.out.println("Students: ");
        for (Student s : students)
        {
            System.out.println(s.getName());
        }
    }
    
    public ArrayList<String> studentsWithFavNumber(int n)
    {
        ArrayList<String> result = new ArrayList<>();
        for (Student s : students)
        {
            if (s.getFavNumber() == n)
            {
                result.add(s.getName());
            }
        }
        return result;
    }
    
    public ArrayList<String> studentsWithOddFavNumbers()
    {
        ArrayList<String> result = new ArrayList<>();
        
        for (Student s : students)
        {
            if (s.getFavNumber() % 2 == 1)
            {
                result.add(s.getName());
            }
        }
        return result;
    }
    
    //test 
    
    public static void main(String[] args)
    {
        Teacher t = new Teacher ("Ms. Briley", "Math");
        AcademicClass mathClass = new AcademicClass(t);
        
        mathClass.addStudent(new Student("Alice", 7));
        mathClass.addStudent(new Student("Bob", 2));
        mathClass.addStudent(new Student ("Charlie", 7));
        
        mathClass.printClassInfo();
        System.out.println("Students with fav number 7: " + mathClass.studentsWithFavNumber(7));
        System.out.println("Students with ODD fav numbers: " + mathClass.studentsWithOddFavNumbers());
        
    }
}