package S01T06N02Ex01AlbertMartin;

public class GenericMethods {
    public static void main(String[] args) {

        //Construïm dos objectes GenericObject amb 3 paràmetres generics i
        //un paràmetre no generic.
        GenericObject genericObject1 = buildGenericObject1();
        GenericObject genericObject2 = buildGenericObject2();

        // Mostrem a la consola el resultat i els comparem.
        System.out.println("Els arguments de genericObject1 son:" + genericObject1);
        System.out.println("Els arguments de genericObject2 son:" + genericObject2);
    }

    private static GenericObject buildGenericObject1() {
        Person person1 = new Person("Nom1", "Cognom1", 25);
        String string1 = "String1";
        int integer1 = 100;
        String profession1 = "Programmer";

        return buildGenericObject(person1, string1, integer1, profession1);
    }

    private static GenericObject buildGenericObject2() {
        String string2 = "String2";
        int integer2 = 50;
        Person person2 = new Person("Nom2", "Cognom2", 50);
        String profession2 = "Developer";


        return buildGenericObject(integer2, person2, string2, profession2);
    }

    private static <T, S, U> GenericObject buildGenericObject(T t, S s, U u, String profession) {
        return new GenericObject<>(t, u, s, profession);
    }

}
