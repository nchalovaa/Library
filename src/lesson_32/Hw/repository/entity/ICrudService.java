package repository.entity;

public interface ICrudService<T,R> {
    R add();

    R get(T id);

    R[] getAll();

    R edit(T id);

    boolean remove(T id);


}
