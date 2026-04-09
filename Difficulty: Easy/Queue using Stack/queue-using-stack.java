import java.util.*;

class myQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue
    void enqueue(int x) {
        s1.push(x);
    }

    // Dequeue
    void dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop()); // orrect transfer
            }
        }

        if (!s2.isEmpty()) {
            s2.pop();
        }
    }

    // Front element
    int front() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (!s2.isEmpty()) {
            return s2.peek();
        }

        return -1; // if queue is empty
    }

    // Size of queue
    int size() {
        return s1.size() + s2.size();
    }
}
