class Scientist {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class GetSet {
    public static void main(String[] args) {
        Scientist emp1 = new Scientist();
        emp1.setName("Yann LeCun");
        System.out.println(emp1.getName());
        emp1.setId(1024);
        System.out.println(emp1.getId());
    }
}