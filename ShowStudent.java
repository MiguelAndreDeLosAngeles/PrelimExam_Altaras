public class ShowStudent{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter ID number");
	int ID = sc.next();
	System.out.println("Enter Credit: ");
	int Credit = sc.nextInt();
	System.out.println("Enter Points");
	int Points = sc.nextInt();
	Student s= new Student(ID,Credit,Points);
	System.out.println(s);
}
}