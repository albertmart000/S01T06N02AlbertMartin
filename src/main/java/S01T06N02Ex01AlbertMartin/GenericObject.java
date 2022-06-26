package S01T06N02Ex01AlbertMartin;

public class GenericObject<T, S, U> {

    private T t;
    private S s;
    private U u;
    private String profession;

    public GenericObject(T t, U u, S s, String profession) {
        this.t = t;
        this.s = s;
        this.u = u;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return
                "\n{t= " + t +
                "\ns= " + s +
                "\nu= " + u +
                "\nprofession= " + profession + '}';

    }
}
