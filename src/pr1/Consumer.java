package pr1;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
