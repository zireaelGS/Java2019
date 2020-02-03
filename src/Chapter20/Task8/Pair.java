package Chapter20.Task8;

public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        setFirst(first);
        setSecond(second);
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
