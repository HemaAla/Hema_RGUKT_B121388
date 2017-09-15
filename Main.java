import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		try{
		      Student stud[];
		      StudentGroup gp=new StudentGroup(5);
		      stud=gp.getStudents();
		      for(int i=0;i<stud.length;i++)
		      {
		           String sDate1="1997-08-18";
                       Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
		           stud[i]=new Student(i+1,"Hema"+i,date1,8.74+(double)i);
		      }
		      for(int i=0;i<stud.length;i++)
		      {
		            System.out.println(stud[i].getId()+"  "+stud[i].getFullName()+"  "+stud[i].getBirthDate()+"  "+stud[i].getAvgMark());
		      }
		      Student s[]=gp.getStudents();
		      for(int i=0;i<stud.length;i++)
		      {
		            System.out.println(s[i].getId()+"  "+s[i].getFullName()+"  "+s[i].getBirthDate()+"  "+s[i].getAvgMark());
		      }
		      stud=null;
		      //gp.setStudents(stud);
		      stud=gp.getStudents();
		      for(int i=0;i<stud.length;i++)
		      {
		           String sDate1="1996-08-18";
                       Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
		           stud[i]=new Student(i+1,"swapna"+i,date1,8.74+(double)i);
		      }
		      System.out.println();
		      gp.setStudents(stud);
		      for(int i=0;i<stud.length;i++)
		      {
		            System.out.println(stud[i].getId()+"  "+stud[i].getFullName()+"  "+stud[i].getBirthDate()+"  "+stud[i].getAvgMark());
		      }
		      System.out.println(gp.getStudent(3).getFullName());
		      //System.out.println(gp.getStudent(7).getFullName());
		      System.out.println();
		      String sDate1="1994-08-18";
                  Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
		      Student p=new Student(6,"sony",date1,8.00);
		      gp.setStudent(p,2);
		      for(int i=0;i<stud.length;i++)
		      {
		            System.out.println(stud[i].getId()+"  "+stud[i].getFullName()+"  "+stud[i].getBirthDate()+"  "+stud[i].getAvgMark());
		      }
		      System.out.println();
		      String sDate2="1991-08-18";
                  Date date2=new SimpleDateFormat("yyyy-MM-dd").parse(sDate2);
		      Student q=new Student(12,"ravs",date2,8.00);
		      //System.out.println("hellllo");
		      gp.addFirst(q);
		      Student h[]=gp.getStudents();
		     for(int i=0;i<h.length;i++)
		      {
		           System.out.println(h[i].getId()+"  "+h[i].getFullName()+"  "+h[i].getBirthDate()+"  "+h[i].getAvgMark());
		      }
		      System.out.println();
		      Student y=new Student(8,"maggie",date2,8.00);
		      gp.addLast(y);
		      Student h1[]=gp.getStudents();
		     for(int i=0;i<h1.length;i++)
		      {
		           System.out.println(h1[i].getId()+"  "+h1[i].getFullName()+"  "+h1[i].getBirthDate()+"  "+h1[i].getAvgMark());
		      }
		      
		}
		catch(IllegalArgumentException e)
		{
		      System.out.println("hi");;
		}
		catch(Exception e)
		{
		      System.out.println("hello");;
		}
	}

}
