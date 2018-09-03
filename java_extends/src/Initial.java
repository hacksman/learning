public class Initial {

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "wangcai";
        System.out.println("狗的名字叫做:" + dog.name);
        dog.eat();
        System.out.println("现在动物的年龄是:" + dog.age);
    }

}
