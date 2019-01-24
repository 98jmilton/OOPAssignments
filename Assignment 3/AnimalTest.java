public class AnimalTest {


    public static void main(String[] args) {
        testMethod1();
        testMethod2();
    }


    private static void testMethod1(){
        System.out.println("TEST METHOD 1");
        Animal[] animals = new Animal[4];
        animals[0] = new Canary("BlueJ");
        animals[1] = new Ostrich("Joschka");
        animals[2] = new Shark("Jaws");
        animals[3] = new Trout("Tim");

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.move((int) (Math.random() * 100));// animal moves a random distance less than 100
        }
    }

    private static void testMethod2(){
        System.out.println("TEST METHOD 2");
        Animal[] animals = new Animal[4];
        animals[0] = new Canary("BlueJ");
        animals[1] = new Ostrich("Joschka");
        animals[2] = new Shark("Jaws");
        animals[3] = new Trout("Tim");

        /* Here i decided to compare the objects within the array in order to return true/false */
        System.out.println("BlueJ == BlueJ? " +animals[0].equals(animals[0]));
        System.out.println("BlueJ == Joschka? " +animals[0].equals(animals[1]));
        System.out.println("Jaws == Tim? " +animals[2].equals(animals[3]));
        System.out.println("Jaws == Jaws? " +animals[2].equals(animals[2]));
    }
}
