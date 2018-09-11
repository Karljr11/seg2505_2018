public class PersonInfo4 {

    public static String firstName = "Karl J.";
    public static String lastName = "Dupuy";
    public static int studentNo = 300018154;
    public static String desc = "Hi c'est Karl";
    public static String description = "Messi est le GOAT";
    
    public static void displayFr() {
        String out = SIConstants.GREETING_FR;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_FR + studentNo + '.';
	out += SIConstants.DESCRIPTION_FR + desc + '.';
        out += SIConstants.DESCRIPTION_FR + description + '.';
        out += SIConstants.EOL;
        
        System.out.println(out);
    }

    
    public static void displayEn() {
        String out = SIConstants.GREETING_EN;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_EN + studentNo + '.';
	out += SIConstants.DESCRIPTION_EN + desc + '.';
        out += SIConstants.DESCRIPTION_EN + description + '.';
        out += SIConstants.EOL;
        
        System.out.println(out);
    }
}
