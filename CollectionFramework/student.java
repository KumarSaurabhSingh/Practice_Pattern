import java.util.Objects;

public class student implements Comparable<student>{

    String name;
    int rollNo;
    
    public student(String name, int rollNo){ //Constructor

        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString(){ //This is returning the context in structured way
            //return "Student{} " + "name ='" + name + '\'' + ",rollNo" + rollNo + '}';
            return name + "  " + rollNo;
    }

    // The below hashcode and equal will take care whether no same entries added with same rollNo.@interface
    //added by command + "."
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        student other = (student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }

    @Override
    public int compareTo(student that) {  // This methos will comare the current with the next. If negative then that is greater and vice versa if positive
        return this.rollNo - that.rollNo;  //Added for Collections.sort(newList);
    }

    

}
