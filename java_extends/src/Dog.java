public class Dog extends Animal {
    public void eat() {
        System.out.println("狗可以吃东西");
    }

    public Dog() {
        System.out.println("Dog初始化方法执行了");
    }

    public void SuperTry(){
        System.out.println("这里调用子类的吃方法:");
        eat();
        System.out.println("这里调用父类的吃方法:");
        super.eat();
    }

    @Override
    public String toString() {
        return "Dog[age=" + super.age + "]";
    }


}
