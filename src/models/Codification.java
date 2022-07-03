package models;

public class Codification {
    private int id;

    public Codification(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Codification []";
    }

}
