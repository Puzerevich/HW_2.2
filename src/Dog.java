public class Dog extends Animal{

        public static int dogCount=0;

        //Constructors
        public Dog(){
            dogCount++;
           // animalCount++;
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
            if(getRunDistance()<=500){
                return super.getName()+" пробіг "+ getRunDistance()+" м.";
            }
            else{
                return getName()+" не зміг пробігти "+ getRunDistance()+"м. Собаки можуть пробігти не більше 500 м.";
            }
        }
        // SWIM
        public String swimResult(){
           if(getSwimDistance()<=10){
               return getName()+" проплив "+ getSwimDistance()+" м.";
           }
           else{
               return getName()+" не зміг проплити "+ getSwimDistance()+"м. Собаки можуть проплити не більше 10 м.";
           }
        }

        public String Result(int dist){
               setSwimDistance(dist);
               return swimResult();
       }

        @Override
        public String getCount() {
            return "Об'єктів класу Animal створено:"+Integer.toString(animalCount)+" \nОб'єктів класу DOG створено: "+Integer.toString(dogCount);
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", run_Distance=" + getRunDistance() +
                    ", swim_Distance=" + getSwimDistance() +
                    ", color='" + getColor() + '\'' +
                    '}';
        }
    }
