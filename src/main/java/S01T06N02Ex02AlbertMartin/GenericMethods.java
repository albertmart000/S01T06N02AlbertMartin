package S01T06N02Ex02AlbertMartin;

public class GenericMethods {
    public static void main(String[] args) {

        getGenericObject(1, 2, 3, 4, 5);

    }

    @SafeVarargs
    private static GenericObject getGenericObject(Integer... integers) {
        GenericObject genericObject= new GenericObject<>(integers);
        System.out.println("Els arguments de GenericObject son:");
        for (Integer integer : integers)
            System.out.println("- " + integer);

        return genericObject;
    }

}


