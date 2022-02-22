package oops.constructorExamples;

public class Constructor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();//object creation allocates memory to the members of the class.
		System.out.println(d.a);//0
		System.out.println(d.name);
		System.out.println(d.f);
		System.out.println(d.d);
		System.out.println(d.l);
		System.out.println(d.ch);
		//int a=90;
		//System.out.println(a);
	}
}
class Demo
{
	int a;
	String name;
	float f;
	double d;
	long l;
	char ch;
}
//object creation allocates memory to the members of the class.
//default constructor will allocate default values to the member variables of the class.
//therefore in java, no concept of garbage value is there.