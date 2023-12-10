package pl.pingwit.lesson20.task4;

public class GenericClass<T> {
    private T item;

    public GenericClass(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void getType() {
        Class<?> clazz = item.getClass();
        String name = clazz.getName();
        System.out.println(clazz);
        System.out.println(name);
    }
}
