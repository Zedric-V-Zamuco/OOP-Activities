public class Activity {
    public static void main (String[] args) {
        
        Dog dugong = new Dog();
        dugong.setnumberofPuppies(6);

        Dog doggy1 = new Dog();
        doggy1.setName("lapuk");
        doggy1.isMale = true;
        
        Dog doggy2 = new Dog();
        doggy2.setName("browny");
        doggy2.isMale = true;
        
        Dog doggy3 = new Dog();
        doggy3.setName("butete");
        doggy3.isMale = true;

        dugong.addPuppies(doggy1);
        dugong.addPuppies(doggy2);
        dugong.addPuppies(doggy3);

        doggy1.showName();
        doggy2.showName();
        doggy3.showName();

        doggy1.bark();
        doggy2.bark();
        doggy3.bark();
        

        dugong.shownumberofpuppies();

        dugong.showAllPuppies();

    }
}