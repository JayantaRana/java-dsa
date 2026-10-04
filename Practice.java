// class Animal {

//     void eat() {
//         System.out.println("Eating");
//     }
// }

// class Dog extends Animal {

//     void bark() {
//         System.out.println("Barking");
//     }
// }

// class Practice {
//     public static void main(String[] args) {
//         Dog d = new Dog();

//         d.eat();
//         d.bark();
//     }
// }

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Practice {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(45);
        list.add(19);

        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            if (it.next() == 45) {
                it.remove();
            }

        }
        System.out.println(list);
    }
}