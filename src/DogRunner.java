public class DogRunner {
    public static void main(String[] args){
        Dog myDog1 = new Dog("Sparky", 4);
        Dog myDog2 = new Dog("Toby", 7);
        Dog myDog3 = new Dog("Fiona", 12);
        Dog[] myDogs = {myDog1, myDog2, myDog3};
        System.out.println(myDogs[0].getName());
        System.out.println(myDogs[1].getName());
        System.out.println(myDogs[2].getName());
    }
}
