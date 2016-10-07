package upm.IWVG.SwC.Tamara;

public class User {

    private int number;

    private String name;

    private String familyName;
    
    private String fullName;

    public User(int number, String name, String familyName) {
        this.number = number;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
        this.setFullName();
    }
    
    private String format(String string) {
        string = string.trim();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    private void setFullName() {
        this.fullName= this.name + " " + this.familyName;
    }
    
    public String getFullName(){
    	return this.fullName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

}
