package Animal;

public class animal {
    private String name;
    private int month;
    private String species;

    public animal(){

    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat(){
        System.out.println(this.getName()+"在吃东西");
    }

}
