package lab01;

class QueueX {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    int nItems;

    public QueueX(int s) {
        maxSize = s + 1;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int j) {
        if (nItems == maxSize)
            System.out.println("Queue is full");
        else {
            if (rear == maxSize - 1)
                rear = -1;
            queArray[++rear] = j;
            nItems++;
        }
    }

    public int remove() {
        if (nItems == 0)
            System.out.println("Queue is empty");
        else {
            int temp = queArray[front++];
            if (front == maxSize)
                front = 0;
            nItems--;
            return temp;
        }
        return -1;
    }

}
