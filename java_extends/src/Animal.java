public class Animal {
    int age = 10;
    String name;
    public void eat(){
        System.out.println("动物具有吃东西的能力");
    }

    public Animal(){
        age = 20;
        System.out.println("animal初始化方法执行了");
    }

}
