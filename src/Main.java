public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Animal("Жужік");
        Dog dog2 = new Dog("Бобік");
        Animal cat1 = new Animal("Рижик");
        Cat cat2 = new Cat("Васька");
        Cat cat3 = new Cat("Барон>");

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
       //     System.out.println("Dogs: :"+a.getCount());
        }
        System.out.println("\n");
         System.out.println(dog1.getCount());
         System.out.println(dog2.getCount());
         System.out.println(cat1.getCount());
         System.out.println(cat2.getCount());
    }
}
