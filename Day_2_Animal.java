 class Animal{
    String name;
    int age;
    Animal(String n, int a){
        name = n;
        age = a;

    }
    void describe(){
        System.out.println("Name: "+ name+" Age: "+ age);
    }void sound(){
        System.out.println(".....");
    }}
    class Dog extends Animal{
    Dog(String n,int a){
       super(n,a);
    }
    @Override
    void sound(){
        System.out.println(name+ " says: Woof! ");
    }
    void fetch(){
        System.out.println(name+" is fetching the ball ");
    }
}
class Cat extends Animal{
    Cat(String i,int y){
        super(i, y);
    }
    @Override
    void sound(){
        System.out.println(name+ " says: Meow! ");
} void purr(){
    System.out.println(name+ " is purring ");
}
}
 class test{
    public static void main(String[] args){
        Dog d = new Dog(" Buddy", 3);
        Cat c = new Cat("Mochi", 2);

        d.describe();
        d.sound();
        d.fetch();

        c.describe();
        c.sound();
        c.purr();
    }

 }
