
public class student {
//this program is to illstruct the use of static keyword
	//static is used for which is common among all eg:college name,bank name
// when we declare a variable as static the memory is allocated only once while class loading in the class area.
	//thus we can save the memory.
	int stuid;
	String stuname;
	static String colgname="iit";
	student(int id,String name)
	{
		stuid=id;
		stuname=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student(101,"shiva");
		student s2=new student(102,"sai");
		System.out.println(s1.colgname);
		System.out.println(s2.colgname);

	}

}
