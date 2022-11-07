public class Animal {
    private String name;
    private int    age;
    private String color;
    private int    run_Distance;
    private int    swim_Distance;
    private static int animalCount=0;

    // Constructors
    Animal(){
        animalCount++;
    }
    public Animal(String name) {
        this();
        this.name = name;
    }

    public Animal(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String color) {
        this();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRun_Distance() {
        return run_Distance;
    }

    public void setRun_Distance(int run_Distance) {
        this.run_Distance = run_Distance;
    }

    public int getSwim_Distance() {
        return swim_Distance;
    }

    public void setSwim_Distance(int swim_Distance) {
        this.swim_Distance = swim_Distance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCount() {
        return "Об'єктів класу ANIMAL створено: "+Integer.toString(animalCount);
    }

    // Methods
    public int run(){
        return getRun_Distance();
    }
    public int run(int dist){
        this.run_Distance = dist;
        return getRun_Distance();
    }
    public String runResult(){
        String tmp = Integer.toString(getRun_Distance());
        return tmp;
    }

    public int swim(){
        return getSwim_Distance();
    }
    protected int swim(int dist){
        this.swim_Distance = dist;
        return getSwim_Distance();
    }
    public String swimResult(){
        String tmp = Integer.toString(getSwim_Distance());
        return tmp;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", run_Distance=" + run_Distance +
                ", swim_Distance=" + swim_Distance +
                ", color='" + color + '\'' +
                '}';
    }

}