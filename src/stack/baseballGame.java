package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class baseballGame {

    public int calPoints(String[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        int total = 0;

        for (String s : arr) {
            switch (s) {
                case "C":
                    total -= stack.pop();
                    break;
                case "D": {
                    int score = 2 * stack.peek();
                    stack.push(score);
                    total += score;
                    break;
                }
                case "+": {
                    int top = stack.pop();
                    int score = top + stack.peek();
                    stack.push(top);
                    stack.push(score);
                    total += score;
                    break;
                }
                default: {
                    int score = Integer.parseInt(s);
                    stack.push(score);
                    total += score;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        baseballGame game = new baseballGame();

        System.out.println(game.calPoints(new String[]{"5", "2", "C", "D", "+"}));                  // 30
        System.out.println(game.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));  // 27
        System.out.println(game.calPoints(new String[]{"1", "C"}));                                 // 0
    }
}