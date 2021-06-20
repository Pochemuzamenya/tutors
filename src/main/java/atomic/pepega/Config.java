package atomic.pepega;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> type);
}
