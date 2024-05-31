import java.util.Arrays;

class Lab6_a2 {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity + 1];
        this.size = 0;
    }

    public void insert(int item) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        size++;
        heap[size] = item;
        heapifyUp(size);
    }

    public int deleteMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int min = heap[1];
        heap[1] = heap[size];
        size--;
        heapifyDown(1);
        return min;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void heapifyUp(int index) {
        while (index > 1 && heap[index] < heap[index / 2]) {
            swap(index, index / 2);
            index = index / 2;
        }
    }

    private void heapifyDown(int index) {
        while (index * 2 <= size) {
            int smallerChild = index * 2;
            if (smallerChild < size && heap[smallerChild + 1] < heap[smallerChild]) {
                smallerChild++;
            }
            if (heap[index] <= heap[smallerChild]) {
                break;
            }
            swap(index, smallerChild);
            index = smallerChild;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        Lab6_a2 priorityQueue = new Lab6_a2(10);
        priorityQueue.insert(5);
        priorityQueue.insert(3);
        priorityQueue.insert(8);
        System.out.println("Size: " + priorityQueue.size());        System.out.println("Delete Min: " + priorityQueue.deleteMin());          System.out.println("Size: " + priorityQueue.size()); 
        System.out.println("Is Empty: " + priorityQueue.isEmpty()); 
    }
}
