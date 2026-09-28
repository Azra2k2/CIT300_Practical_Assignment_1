public class ServiceQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ServiceQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new String[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Add a service request to the queue (enqueue)
    public void addRequest(String request) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add more requests.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = request;
        size++;
        System.out.println("Service request added: " + request);
    }

    // Process the next request in order of arrival (dequeue)
    public String processNextRequest() {
        if (isEmpty()) {
            System.out.println("No service requests to process.");
            return null;
        }
        String request = queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        size--;
        System.out.println("Processing request: " + request);
        return request;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("No pending service requests.");
            return;
        }
        System.out.println("--- Pending Service Requests (in order) ---");
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + queue[index]);
            index = (index + 1) % capacity;
        }
    }
}