public class Tiger extends Animal{

    private String name;
    private String favoriteFood = "meat";

    public Tiger(String name){
        super(name, "meat");
        this.name = name;
    }

    public void sleep(){
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            sleep();
        }
    }
}
