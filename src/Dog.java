package src;

/*
Created by Tomasz Pajewski 28.01.2020
*/
public class Dog extends Animal {
    @Override
    public void speak() {
        // super.speak(); <- jak by wywoływać metode z Animals.speak()
        System.out.println(" Bow Wow ");
    }
}