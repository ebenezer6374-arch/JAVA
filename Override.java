class Animal
{
void makeSound(){

    System.out.println("Animal");

}
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog");
        }

void fetch(){
        System.out.println("fetch");
}
        }

public class Override{
    public static void main(String[] args){
    Animal myAnimal = new Dog();
    Dog myDog = new Dog();
// myAnimal.fetch();
    myDog.fetch();
                }
            }
