package w13.w4;

public class Storage<T> {
    private T item;
    public Storage() {
    }
    public Storage(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}