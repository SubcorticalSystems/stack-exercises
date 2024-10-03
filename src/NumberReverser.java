import java.util.Stack;

public class NumberReverser {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        NumberReverser nr = new NumberReverser();
        nr.processNumbers(stack);
    }

    private void processNumbers(Stack<Integer> stack){
        int num = 987654321;
        int revNum = 0;
        int power = 0;
        int digit;

        while (num != 0) {
            digit = num % 10;
            stack.push(digit);
            num = num / 10;
        }

        while (! stack.isEmpty()) {
            digit = stack.pop();
            revNum = revNum + digit * (int) Math.pow(10, power);
            power = power + 1;
        }
        System.out.println(revNum);
    }
}

