public class Commit {

    private String description;
    private int uniqueID;

    public Commit(String description, int uniqueID) {
        this.description = description;
        this.uniqueID = uniqueID;
    }


    public String getDescription() {
        return this.description;
    }


    public int getUniqueID() {
        return this.uniqueID;
    }
}
