package Task02_02;

import java.util.Objects;

public class Pair<I, S> {
    private I i;
    private S s;

    public Pair(I i, S s){
        this.i = i;
        this.s = s;
    }

    public static <I, S> Pair<I, S> of(I i, S s){
        return new Pair(i, s);
    }

    public I getFirst(){
        return i;
    }
    public S getSecond(){
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(i, pair.i) &&
                Objects.equals(s, pair.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, s);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "i=" + i +
                ", s=" + s +
                '}';
    }
}
