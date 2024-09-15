public class StudentScores {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 88, 95};
        int total = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int score : scores) {
            total += score;
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }

        double average = total / (double) scores.length;

        System.out.println("Scores: ");
        for (int score : scores) {
            System.out.println(score);
        }
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
