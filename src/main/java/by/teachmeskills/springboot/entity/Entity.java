package by.teachmeskills.springboot.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class Entity implements IEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    protected Long id;

    public Entity() {
    }

    public Entity(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }
@Override
    public void setId(Long id) {
        this.id = id;
    }
}
