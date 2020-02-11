public class Bear extends Animal{
    private String name;
    private String favoriteFood = "fish";

    public Bear(String name){
        super(name, "fish");
        this.name = name;
    }

    public void sleep(){
        System.out.println(this.name + " hibernates for 4 months");
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
