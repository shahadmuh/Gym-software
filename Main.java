//Shahad Alimhizi
//436201525
import java.util.*;
public class Main {
static Scanner console=new Scanner (System.in);
public static void main (String[] args){
boolean add,add1=false;
int id,age,x,num,idd1,age1,age2,add2;
String acti,coach,day;

Gym Fitness=new Gym("Fitness","Riyadh",5);
//add 2 Activities
for (int i=0;i<2;i++){
System.out.println("Enter The Name Of The Activity:");
String actName=console.next();
System.out.println("Enter The Name Of The Coach:");
String coachName=console.next();
System.out.println("Enter The Day Of The Activity:");
day=console.next();
Activity act=new Activity(actName,coachName,8,day);
add=Fitness.addActivity(act);
if (add)
System.out.println("The Activity Has Been Added Successfully");
else
System.out.println("The Activity Has Not Been Added Successfully, It is Full");}
//add 2 individuals
for (int s=0;s<Fitness.getNumOfActivity();s++){
for (int in=0;in<2;in++){
System.out.println("Enter The Individual's ID: ");
id=console.nextInt();
System.out.println("Enter the Individul's Age: ");
age=console.nextInt();
Individual ind1=new Individual(id,age);
add1=Fitness.getActivities()[s].addIndividual(ind1);

if (add1)
System.out.println("The Individual Has Been Added Successfully");}}

System.out.println(Fitness);

do {
System.out.println("Enter The Number You Want:");
System.out.println("1.Add a new Activity to the Gym.");
System.out.println("2.Delete an Activity from the Gym.");
System.out.println("3.Display the number of Individual for a given Activity.");
System.out.println("4.Find the sum of all the Individuals registered in Fitness Gym.");
System.out.println("5.Display the name of all Activities in Fitness Gym which have number of individuals>6");
System.out.println("6.Exit the program.");
x=console.nextInt();

switch (x){
case 1:{
System.out.println("Enter The Activity Name:");
console.nextLine();
acti=console.nextLine();
System.out.println("Enter The Coach Name:");
coach=console.nextLine();
System.out.println("Enter The Number Of Individuals:");
num=console.nextInt();
System.out.println("Enter The Day Of The Activity:");
day=console.next();
Activity obj1=new Activity(acti,coach,num,day);
boolean additon=Fitness.addActivity(obj1);
for (int s=0;s<num;s++){
System.out.println("Enter The Individual's ID:");
add2=console.nextInt();
System.out.println("Enter The Individual's Age:");
age2=console.nextInt();
Individual ind2=new Individual(add2,age2);
add1=Fitness.getActivities()[Fitness.getNumOfActivity()-1].addIndividual(ind2);}

if (additon)
System.out.println("The Activity Was Added Successfully");
else
System.out.println("The Activity Was Not Added Successfully");

if(add1)
System.out.println("The Individual Was Added Successfully");
else
System.out.println("The Individual Was Not Added Successfully");
break;}

case 2:{
System.out.println("Enter The Name Of The Activity You Want To Delete:");
console.nextLine();
String nname=console.nextLine();
if(Fitness.removeActivity(nname))
System.out.println("The Activity Was Found And The Deletion Was Successful");
else
System.out.println("The Deletion Was Not Successful");
break;}

case 3:
{System.out.println("Enter The Name Of The Activity You Want To Display:");
console.nextLine();
String nameact=console.nextLine();
int index=Fitness.searchActivity(nameact);
if (index==-1)
System.out.println("The Activity Was Not Found");
else
System.out.println(Fitness.getActivities()[index].getNumOfIndividual()); 
break;}

case 4:
System.out.println(Fitness.sumOfIndividuals());
break;

case 5:
System.out.println("The Activities That Have More Than 6 Individuals are: ");
Activity[] list=Fitness.arrayOfActivity(6);
for (int i=0;i<list.length;i++)
System.out.println(list[i].getaName());

break;
}


if (x>6)
System.out.println("The input you entered is incorrect");



}while (x!=6);

}}