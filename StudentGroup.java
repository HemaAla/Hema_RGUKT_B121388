import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	private int length;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
	public void changeLength(int l)
	{
		this.length=l;
		this.students = new Student[this.length];
	}
	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students ==null)
		      throw new IllegalArgumentException();
		else{
		      StudentGroup s1=new StudentGroup(students.length);
		      this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		//return null;
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		      return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		      this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
		      throw new IllegalArgumentException();
		else{
		      Student[] s;
		      s=this.students;
		     // System.out.println(s[4].getId());
		     // System.out.println(students[4].getId());
		     StudentGroup s1=new StudentGroup(this.students.length+1);
		     //System.out.println(s1.students.length);
		      s1.students[0]=student;
		      for(int i=0;i<this.students.length;i++)
		      {
		            s1.students[i+1]=s[i];
		      }
		      this.changeLength(s1.students.length);
		      //System.out.println(this.students.length);
		      //tudentGroup(this.students.length);
		      this.students=s1.students;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
		      throw new IllegalArgumentException();
		else
		{
		      Student[] s;
		      s=this.students;
		      StudentGroup s1=new StudentGroup(this.students.length+1);
		      int i;
		      for(i=0;i<this.students.length;i++)
		      {
		            s1.students[i]=s[i];
		      }
		    //  System.Array.Resize(Student students, students.length + 1);
		      s1.students[s1.students.length-1]=student;
		     // System.out.println(students[i-1].getId());
		    //this.students.hashCode();
		    //System.out.println(s1.students.length);
		   this.changeLength(s1.students.length);
		    //System.out.println(this.students.length);
		      this.students=s1.students;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		{
		      Student[] s;
		      s=this.students;
		      StudentGroup s1=new StudentGroup(this.students.length+1);
		      for(int i=0;i<index;i++)
		      {
		            s1.students[i]=s[i];
		      }
		      s1.students[index]=student;
		      for(int i=index+1;i<this.students.length;i++)
		      {
		            s1.students[i]=s[i-1];
		      }
		      this.changeLength(s1.students.length);
		      this.students=s1.students;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		{
		      Student[] s;
		      s=this.students;
		      StudentGroup s1=new StudentGroup(this.students.length-1);
		      for(int i=0;i<index;i++)
		      {
		            s1.students[i]=s[i];
		      }
		      for(int i=index;i<this.students.length;i++)
		      {
		            s1.students[i]=s[i+1];
		      }
		      this.changeLength(s1.students.length);
		      this.students=s1.students;
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int l=-1;
		for(int i=0;i<this.students.length;i++)
		{
		      if(this.students[i].getId()==student.getId() && this.students[i].getFullName().equals(student.getFullName()) && this.students[i].getBirthDate().compareTo(student.getBirthDate())==0 && this.students[i].getAvgMark()==student.getAvgMark())
		      {
		           l=i;
		           break;
		      }
		}
		if(l==-1)
		      throw new IllegalArgumentException("Student not exist");
		else{
		      this.remove(l);
		      }
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length)
		      throw new IllegalArgumentException();
		else
		{
		      Student[] s;
		      s=this.students;
		      StudentGroup s1=new StudentGroup(index+1);
		      for(int i=0;i<index+1;i++)
		      {
		            s1.students[i]=s[i];
		      }
		      this.changeLength(s1.students.length);
		      this.students=s1.students;
	      } 
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int l=-1;
		for(int i=0;i<this.students.length;i++)
		{
		      if(this.students[i].getId()==student.getId() && this.students[i].getFullName().equals(student.getFullName()) && this.students[i].getBirthDate().compareTo(student.getBirthDate())==0 && this.students[i].getAvgMark()==student.getAvgMark())
		      {
		           l=i;
		           break;
		      }
		}
		if(l==-1)
		      throw new IllegalArgumentException();
		else
		      this.removeFromIndex(l);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int l=-1;
		for(int i=0;i<this.students.length;i++)
		{
		       if(this.students[i].getId()==student.getId() && this.students[i].getFullName().equals(student.getFullName()) && this.students[i].getBirthDate().compareTo(student.getBirthDate())==0 && this.students[i].getAvgMark()==student.getAvgMark())
		      {
		           l=i;
		           break;
		      }
		  }
		 if(l==-1)
		      throw new IllegalArgumentException();
		 else
		      this.removeToIndex(l);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<this.students.length;i++)
		{
		      for(int j=0;j<this.students.length-1;j++)
		      {
		            if(this.students[j].getId()>this.students[j+1].getId())
		            {
		                  Student s=students[j];
		                  students[j]=students[j+1];
		                  students[j+1]=s;
		            }
		      }
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
