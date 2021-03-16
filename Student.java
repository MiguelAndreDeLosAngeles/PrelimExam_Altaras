import java.util.Scanner;

public classs Student{

	int ID;
	int Credit;
	int Points;
	int double PointAverage;	
public Student(){
}

public Student(int ID1, int Credit1, int Points1){
super();
	ID=ID1;
	Credit=Credit1
	Points=Points1;
	calculatePointAverage();
}
	public int getID(){
return ID;
}
	public void setID(int ID1){
ID=ID1;
}
	public int getCredit(){
return Credit;
}
	public void setCredit(int Credit1){
Credit=Credit1;
}
	public int getPoints(){
return Points;
}
	public void setPoints(int Points1){
Points=Points1;
}

public String toString(){
return "ID:" + ID + "Credits:" + Credit + "Point:" + Points + " Avergage:" + PointAverage; 
}

public void calculatePointAverage(){
PointAverage = Points/(double) Credits;
}
}