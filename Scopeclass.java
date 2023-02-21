public class Scopeclass {        
public String name;       
public String address;
public int age;


void showdata(){
System.out.println("Name : "+name);
System.out.println("Address : "+address);
System.out.println("Age : "+age);

}

}



class Secondclass extends Scopeclass {   


void show(){
System.out.println("This is subclass");

}

}

class Main {


public static void main (String args [] )
{

Scopeclass sc=new Scopeclass();
sc.name="Sanaullah";
sc.address="Sukkur IBA ";
sc.age=18;
sc.showdata();
Secondclass sc2=new Secondclass();
sc2.show();
}}


