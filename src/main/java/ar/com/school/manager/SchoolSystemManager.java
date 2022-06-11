package ar.com.school.manager;

public abstract class SchoolSystemManager <E>{
    public abstract void create(E input);
    public abstract void update(E input);
    public abstract void delete(E input);
}
