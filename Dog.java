public class Dog extends Animal{

        public static int dogCount=0;

        //Constructors
        public Dog(){
            dogCount++;
        }

        public Dog(String name) {
            this();
            this.setName(name);
        }

        public Dog(String name, int age) {
            this();
            super.setName(name); super.setAge(age);
        }

        public Dog(String name, int age, String color) {
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
                return getName()+" не зміг пробігти "+getRun_Distance()+"м. Собаки можуть пробігти не більше 500 м.";
            }
        }
        // SWIM
        public String swimResult(){
           if(getSwim_Distance()<=10){
               return getName()+" проплив "+getSwim_Distance()+" м.";
           }
           else{
               return getName()+" не зміг проплити "+getSwim_Distance()+"м. Собаки можуть проплити не більше 10 м.";
           }
        }

        public String Result(int dist){
               setSwim_Distance(dist);
               return swimResult();
       }

        @Override
        public String getCount() {
            return "Об'єктів класу DOG створено: "+Integer.toString(dogCount);
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", run_Distance=" + getRun_Distance() +
                    ", swim_Distance=" + getSwim_Distance() +
                    ", color='" + getColor() + '\'' +
                    '}';
        }
    }