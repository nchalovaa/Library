package repository.entity;

public class Book implements ICrudService<Integer, Book> {

    protected int id;
    protected String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public Book add() {
        return null;
        // я больше не могу
    }

    @Override
    public Book get(Integer id) {
        return null;
        // я больше не могу
    }

    @Override
    public Book[] getAll() {
        return new Book[0];
        // я больше не могу
    }

    @Override
    public Book edit(Integer id) {
        return null;
        // я больше не могу
    }

    @Override
    public boolean remove(Integer id) {
        return false;
        // я больше не могу
    }
}
