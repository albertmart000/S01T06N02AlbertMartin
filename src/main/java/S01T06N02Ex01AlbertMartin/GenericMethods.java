package S01T06N02Ex01AlbertMartin;

public class GenericMethods {
    public static void main(String[] args) {

        //Construïm dos objectes GenericObject amb qualsevol tipus de paràmetre i amb qualsevol
        //ordre pero fent servir el mateix constructor de la classe genèrica.
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

        return buildGenericObject(person1, string1, integer1);
    }

    private static GenericObject buildGenericObject2() {
        String string2 = "String2";
        int integer2 = 50;
        Person person2 = new Person("Nom2", "Cognom2", 50);

        return buildGenericObject(integer2, person2, string2);
    }

    private static <T, S, U> GenericObject buildGenericObject(T t, S s, U u) {
        return new GenericObject<>(t, u, s);
    }

}
