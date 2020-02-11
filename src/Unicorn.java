public class Unicorn extends Animal {

    private String name;
    private String favoriteFood = "marshmallows";

    public Unicorn(String name){
        super(name, "marshmallows");
        this.name = name;
    }

    public void sleep(){
        System.out.println(this.name + " sleeps on a cloud");
    }
}
