package pr2;

@FunctionalInterface
public interface Comparator<T> {
    T compare(T a, T b);
}
