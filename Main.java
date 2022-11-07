public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Жужік");
        Animal dog2 = new Dog("Бобік");
        Animal cat1 = new Cat("Рижик");
        Animal cat2 = new Cat("Васька");
        Animal cat3 = new Cat("Барон>");

        System.out.println(dog2.getName());


        dog1.run(200);
        System.out.println(dog1.run(200));

        Animal[] animalsArr= new Animal[]{
                dog1,dog2,cat1,cat2,cat3
        };

        dog2.run(100);
        System.out.println(dog2.runResult());

        for(Animal a: animalsArr){
        //   System.out.println("Arr: "+a.run());
            System.out.println(a.toString());
        //   System.out.println("Dogs: :"+a.getCount());

            System.out.println(a.run(250));
            System.out.println(a.runResult());
            System.out.println("Count:"+a.getCount());//a.getCount());

        }
        System.out.println("\nAnimals counting:");
         System.out.println(dog1.getCount());
         System.out.println(dog2.getCount());
         System.out.println(cat1.getCount());
         System.out.println();
    }
}
