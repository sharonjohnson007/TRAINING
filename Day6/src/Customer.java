public class Customer {

    private int ID;
    private String name;
    private char gender;

    public Customer(int ID,String name,char gender){
        this.ID=ID;
        this.name=name;
        this.gender=gender;

    }

    public Customer() {
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return "name(ID)="+name+"("+ID+")";
    }
}
