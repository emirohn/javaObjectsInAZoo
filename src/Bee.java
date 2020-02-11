public class Bee extends Animal{
    private String name;
    private String favoriteFood = "pollen";

    public Bee(String name){
        super(name, "pollen");
        this.name = name;
    }

    public void sleep(){
        System.out.println(this.name + " never sleeps");
    }

    public void eat(String food){
        if(food.equals(favoriteFood)){
            System.out.println(this.name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }

}
