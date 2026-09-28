public class ActionStack {
    private String[] stack;
    private int top;
    private int capacity;

    public ActionStack(int capacity) {
        this.capacity = capacity;
        this.stack = new String[capacity];
        this.top = -1;
    }

    // Push - add a new action
    public void push(String action) {
        if (top == capacity - 1) {
            // Stack full - remove oldest by shifting (simple fixed-size handling)
            for (int i = 1; i < capacity; i++) {
                stack[i - 1] = stack[i];
            }
            stack[capacity - 1] = action;
        } else {
            top++;
            stack[top] = action;
        }
    }

    // Pop - undo last action
    public String pop() {
        if (isEmpty()) {
            System.out.println("No recent actions to undo.");
            return null;
        }
        String action = stack[top];
        stack[top] = null;
        top--;
        return action;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Display all recent actions (most recent first)
    public void displayActions() {
        if (isEmpty()) {
            System.out.println("No recent actions.");
            return;
        }
        System.out.println("--- Recent Actions (most recent first) ---");
        for (int i = top; i >= 0; i--) {
            System.out.println((top - i + 1) + ". " + stack[i]);
        }
    }
}
