public class Data extends Print{
    private final int id;
    private String name;

    private static int counter = 0;

    public Data(String name) {
        this.id = ++counter;
        this.name = name;
        this.print("Added new data: ");
        this.printData();
    }

    public void setName(String name) {
        this.name = name;
        this.print("Data updated: ");
        this.printData();
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void printData() {
        this.print("ID: " + this.id + ", Name: " + this.name + "\n");
    }
}


