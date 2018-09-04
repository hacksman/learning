public class Initial {

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "wangcai";
        System.out.println("狗的名字叫做:" + dog.name);
        dog.eat();
        System.out.println("现在动物的年龄是:" + dog.age);

        // super try
        dog.SuperTry();

        // object try
        System.out.println(dog);

        // equals
        Dog dogEqual1 = new Dog();
        Dog dogEqual2 = new Dog();
        if (dogEqual1.equals(dogEqual2)){
            System.out.println("两个对象相同");
        }else {
            System.out.println("两个对象的值不同");
        }

    }

}
