abstract class Animal { // abstract class

    {
    
        System.out.println("All animals");
    }

    abstract void sound(); // abstract method

}

class dog extends Animal {

    public void sound() {
        System.out.println("Dog is barking");
    }
}

class Lion extends Animal {

    public void sound() { // method

        System.out.println("lion is Roar");
    }

}

public class Abstract {

    public static void main(String[] args) {

        dog d = new dog();
        Lion l = new Lion();

        d.sound();
        l.sound();

    }
}