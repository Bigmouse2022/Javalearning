package Arraylist;

import java.util.Objects;

public class Cat {
    private String name;
    private int month;
    private String species;

    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + month +
                ", 品种='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
    if (this==obj){
        return true;

    }
    if(obj.getClass()== Cat.class){
        Cat cat=(Cat) obj;
        return cat.getName().equals(name)&&cat.getMonth()==month&&cat.getSpecies().equals(species);
    }
    return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, month, species);
    }
}
