package goit.javaOnline.homeWork6;

public class Hello {

    private String userName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void helloUser(String userName){

        System.out.println("Hi, " + userName + " welcome you on our MusicalShop");
        System.out.println("In our shop you can buy Piano,Trumpet and Guitar");

    }
}
