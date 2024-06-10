package Strings.easy;
//https://leetcode.com/problems/goal-parser-interpretation/submissions/1265033731/
public class GoalParser {
    public static void main(String[] args) {
        String g = "G()()()(al)(al)";
        System.out.println(interpret(g));
    }

    public static String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
}
