public class Giraffe extends Animal{

        private String name;
        private String favoriteFood = "leaves";

        public Giraffe(String name){
            super(name, "leaves");
            this.name = name;
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

