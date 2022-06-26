package S01T06N01Ex02AlbertMartin;

public class GenericObject<T, S, U> {

    private T t;
    private S s;
    private U u;

    public GenericObject(T t, U u, S s) {
        this.t = t;
        this.s = s;
        this.u = u;
    }

    @Override
    public String toString() {
        return
                "\n{t= " + t +
                "\ns= " + s +
                "\nu= " + u +'}';

    }
}
