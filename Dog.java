public class Dog {
    String name;
    boolean isMale;
    int NumberofPuppies;
    Dog[] listofpuppies;

    public int addPuppies(Dog doggy){
        listofpuppies[NumberofPuppies] = doggy;
        return NumberofPuppies++;

    }
    public void setName(String names){
        name = names;
    }
    public String showName(){
        System.out.println("the dog name is " +name);
        return name;
    }
    public void setnumberofPuppies(int x){
        listofpuppies = new Dog[x];

    }
    public void bark(){
        System.out.println (name+ " Woof! Woof!");
    }
    public int shownumberofpuppies(){
        System.out.println("Number of puppies " +NumberofPuppies);
        return NumberofPuppies;
    } 
    public void showAllPuppies(){
        for (int i = 0; i < NumberofPuppies; i++){
            System.out.println("\n"+"index: "+i);
            System.out.println("Name: "+listofpuppies[i].name);
            System.out.println("is Male: "+listofpuppies[i].isMale);
        }
    }

}