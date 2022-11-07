public class Cat extends Animal{

    public static int catCount=0;

    //Constructors
    public Cat(){
        catCount++;
    }
    public Cat(String name) {
        this();
        this.setName(name);
    }

    public Cat(String name, int age) {
        this();
        super.setName(name); super.setAge(age);
    }

    public Cat(String name, int age, String color) {
        this();
        super.setName(name); super.setAge(age); super.setColor(color);
    }

    // Methods
    // RUN
    public String runResult(){
        if(getRun_Distance()<=500){
            return super.getName()+" пробіг "+getRun_Distance()+" м.";
        }
        else{
            return getName()+" не зміг пробігти "+getRun_Distance()+"м. Коти можуть пробігти не більше 200 м.";
        }
    }
    // SWIM
        public String swimResult(){
               return "Коти не вміють плавати!";
        }
        public String swimResult(int dist){
               return "Коти не вміють плавати!";
        }

    @Override
    public String getCount() {
        return "Об'єктів класу CAT створено: "+Integer.toString(catCount);
    }

}
