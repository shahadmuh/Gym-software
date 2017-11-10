public class Gym {
private String name;
private String location;
private int numOfActivity;
private Activity[] activities;
public Gym(String n, String loc, int size){
name=n;
location=loc;
activities=new Activity[size];
numOfActivity=0;}

public Activity[] getActivities(){
return activities;}

public boolean isEmpty(){
if (numOfActivity==0)
return true;
return false;
}

public boolean isFull(){
if (numOfActivity>=activities.length)
return true;
return false;
}

public boolean addActivity(Activity act){
if (numOfActivity<activities.length){
activities[numOfActivity]=new Activity(act);
numOfActivity++;
return true;}
return false;}


public int searchActivity(String name1){
for (int i=0;i<numOfActivity;i++){
if (activities[i].getaName().equals(name1))
return i;}
return -1;
}

public boolean removeActivity(String name1){
int index=-1;
for(int i=0;i<numOfActivity;i++)
if (activities[i].getaName().equals(name1)){
index=i;
break;}
if (index!=-1){
for (int j=index;j<numOfActivity-1;j++)
activities[j]=activities[j+1];
activities[--numOfActivity]=null;
return true;}
return false;}

public int sumOfIndividuals(){
int sum=0;
for (int i=0;i<numOfActivity;i++)
sum+=(activities[i].getNumOfIndividual());
return sum;}

public Activity[] arrayOfActivity(int iNum){
int counter=0,i;
int counter1=0;
for (i=0;i<numOfActivity;i++)
if (activities[i].getNumOfIndividual()>iNum)
counter++;
Activity[] arr=new Activity[counter];
for (i=0;i<numOfActivity;i++)
if (activities[i].getNumOfIndividual()>iNum)
arr[counter1++]=activities[i];
return arr;}


public int getNumOfActivity(){
return numOfActivity;}

public String toString(){
String s="",f;
f=" Name: "+name+"\nLocation: "+location+"\nNumber Of Activities: "+numOfActivity;
for (int i=0;i<numOfActivity;i++)
s=activities[i].toString();
return f+s;
}}
