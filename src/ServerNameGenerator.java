public class ServerNameGenerator {
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

//    Create a method that will return a random element from an array of strings.

//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

    public static String[] tenAdjectives = {"considerate", "compassionate", "curious", "determined", "empathetic", "friendly", "generous", "helpful", "honest", "kind", "loving" };

    public static String[] tenNouns = {"adventure", "ambition", "art", "athletics", "balance", "beauty", "belief", "birthday", "career", "charity", "charm", "charm" };

    public static void main(String[] args) {
        System.out.println("Your server name is ");
        System.out.println(getRandomElement(tenAdjectives) + "-" + getRandomElement(tenNouns));
    }

    public static String getRandomElement(String[] array) {
        int randomIndex = (int) (Math.random() * array.length);
        return array[randomIndex];
    }




}
