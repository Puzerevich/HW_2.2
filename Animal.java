public class Animal {
    private String name;
    private int    age;
    private String color;
    private int runDistance;
    private int swimDistance;
    protected static int animalCount=0;

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

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected String getCount() {
//        return "Об'єктів класу ANIMAL створено: "+Integer.toString(animalCount);
        return Integer.toString(animalCount);
    }

    // Methods
    public int run(){
        return getRunDistance();
    }
    public int run(int dist){
        this.runDistance = dist;
        return getRunDistance();
    }
    public String runResult(){
        return Integer.toString(getRunDistance());
    }

    public int swim(){
        return getSwimDistance();
    }
    protected int swim(int dist){
        this.swimDistance = dist;
        return getSwimDistance();
    }
    public String swimResult(){
        return Integer.toString(getSwimDistance());
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", run_Distance=" + runDistance +
                ", swim_Distance=" + swimDistance +
                ", color='" + color + '\'' +
                '}';
    }

}