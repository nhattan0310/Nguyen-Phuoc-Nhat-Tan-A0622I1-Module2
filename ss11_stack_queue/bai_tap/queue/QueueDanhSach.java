package ss11_stack_queue.bai_tap.queue;

public class QueueDanhSach {
    public class Node {
        public int data;
        public Node link;

        public Node(){
        }
        public Node(int data){
            this.data = data;
            this.link = null;
        }
    }
    public class Queue {
        public Node front;
        public Node rear;

        public void enQueue(int data) {
            Node temp = new Node(data);
            if (this.front == null) {
                this.front = this.rear = temp;
            } else {
                this.rear.link = temp;
                this.rear = temp;
            }
            this.rear.link = this.front;
        }

        public Node deQueue() {
            if (this.front == null) {
                return null;
            }
            Node temp = this.front;
            this.rear = this.front.link;
            if (this.front == null) {
                this.rear = null;
            }
            return temp;
        }

        public void display() {
            Node temp = this.front;
            while (temp.link != this.front) {
                System.out.print(temp.data + " ");
                temp = temp.link;
            }
        }
    }

}

