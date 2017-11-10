public class Activity {
private String actName;
private String coachName;
private int numOfIndividual;
private String day;
private Individual[] individuals;
public Activity(String aName, String cName, int size, String d){
actName=aName;
coachName=cName;
numOfIndividual=0;
day=d;
individuals=new Individual[size];}

public Activity(Activity act){
actName=act.actName;
coachName=act.coachName;
day=act.day;
numOfIndividual=act.numOfIndividual;
individuals=new Individual[act.individuals.length];
for (int s=0;s<act.numOfIndividual;s++)
individuals[s]=act.individuals[s];
}

public boolean addIndividual(Individual ind){
if (numOfIndividual<individuals.length){
individuals[numOfIndividual++]=ind;
return true;}
return false;}

public String getaName(){
return actName;}

public String getcName(){
return coachName;}

public int getNumOfIndividual(){
return numOfIndividual;}

public String toString(){
String s="",f;
for (int i=0;i<numOfIndividual;i++)
s=individuals[i].toString();
f="Actor name: "+actName+"\nCoach Name: "+coachName+"\nNumber Of Individual: "+numOfIndividual+"\n";
return f+s;
}
}