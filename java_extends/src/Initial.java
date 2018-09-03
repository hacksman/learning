public class Initial {

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.age = 10;
        dog.name = "wangcai";
        System.out.println("狗的名字叫做:" + dog.name);
        dog.eat();
    }

}
