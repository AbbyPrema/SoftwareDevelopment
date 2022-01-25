
package personlist;


public class PartTimeStudent extends Person{
    
    private int numCourses;
    
    public PartTimeStudent(int numCourses){
    
    this.numCourses=numCourses;
    }
    public int getNumCourse(){
    return numCourses;

    }
    public void setNumCourse(int numCourses){
    this.numCourses=numCourses;
}
}