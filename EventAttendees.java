public class EventAttendees {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        String longestName = names[0];
        String shortestName = names[0];

        for (String name : names) {
            if (name.length() > longestName.length()) longestName = name;
            if (name.length() < shortestName.length()) shortestName = name;
        }

        System.out.println("Longest Name: " + longestName);
        System.out.println("Shortest Name: " + shortestName);

        System.out.println("Names in Reverse Order:");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
