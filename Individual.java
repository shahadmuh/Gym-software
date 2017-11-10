public class Individual{
private int id;
private int age;
public Individual(int id, int age){
this.id=id;
this.age=age;}

public void setId(int idd){
id=idd;
}
public int getId(){
return id;}

public void setAge(int agee){
age=agee;}

public int getAge(){
return age;}

public String toString(){
return "ID: "+id+"\nAge: "+age;
}
}