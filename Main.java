public class Main {
    public static void main(String[] args) {
        User john = new User("John", 1954, 2, 18);
        john.displayInfo();
        Admin nicolas = new Admin( "nicolus",1964 ,1, 7 );
        nicolas.displayInfo();

        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
    }
}
