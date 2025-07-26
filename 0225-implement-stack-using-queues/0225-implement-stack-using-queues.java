class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x); //Add the new element to the back of the queue

        // Rotate all elements except the newly added one to the back, ensures the new element moves to the front of the queue,
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll()); // Remove the front element and add it to the back
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */