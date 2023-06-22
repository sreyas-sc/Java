import java.util.Scanner;
interface ap
{
    void area();
    void perimeter();
}
class circle implements ap{
    double r;
	public circle(double rad){
		r=rad;
	}
    public void area()
    {
        double ar=3.14*r*r;
        System.out.println("The area is:"+ar);
    }
    public void perimeter()
    {
        double peri=2*3.14*r;
        System.out.println("The perimeter is:"+peri);
    }
}
class rectangle implements ap{	
	int l,b;
	public rectangle(int len,int br){
		l=len;
		b=br;
	}	
    public void area()
    {
        int ar=l*b;
        System.out.println("The area is:"+ar);
    }
    public void perimeter()
    {
        int peri=2*(l+b);
        System.out.println("The perimeter is:"+peri);
    }
}
public class areaperi{
    public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("1.Area and perimetre of the circle : ");
	System.out.println("2.Area and the perimeter of the Rectangle : ");
	System.out.println("3. Exit");
	do{
	System.out.println("Enter the choice:");
	int ch=sc.nextInt();
	switch(ch){
		case 1:
			System.out.println("Enter the radius of circle:");
			double r=sc.nextDouble();
			circle obj1=new circle(r);
			obj1.area();
			obj1.perimeter();
			break;
		case 2:
			System.out.println("Enter the length of the rectangle:");
			int l=sc.nextInt();
        	System.out.println("Enter the breadth of the rectangle:");
        	int b=sc.nextInt();
			rectangle obj2=new rectangle(l,b);			
			obj2.area();
			obj2.perimeter();
			break;
		case 3:
			System.out.println("Exited...");
            System.exit(0);
	}
	
}while(true);
}
}
