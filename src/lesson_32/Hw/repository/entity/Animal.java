package repository.entity;

public class Animal implements ICrudService<Long,Animal> {
    protected long id;
    protected String color;

    public Animal(long id, String color) {
        this.id = id;
        this.color = color;
    }


    @Override
    public Animal add() {
        return null;
        // я больше не могу
    }

    @Override
    public Animal get(Long id) {
        return null;
        // я больше не могу
    }

    @Override
    public Animal[] getAll() {
        return new Animal[0];
        // я больше не могу
    }

    @Override
    public Animal edit(Long id) {
        return null;
        // я больше не могу
    }

    @Override
    public boolean remove(Long id) {
        return false;
        // я больше не могу
    }
}
