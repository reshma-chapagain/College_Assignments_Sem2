#include<stdio.h>
#include<stdlib.h>
#define MAX 3

int queue[MAX];
int front = -1 , rear = -1;

    

void enqueue (int value) {

    if(rear == MAX-1) {
        printf("Queue Overflow");
        return;
    }

    else {
        if(front == -1) {
        front = 0;
        }
        rear ++;
        queue[rear] = value;
    }
}

void dequeue() {
    int item;

    if(front == -1) {
        printf("Underflow");
        return;
    }

    item = queue[front];
    printf("Deleted element: %d\n", item);

    front ++;

    if(front>rear) {
        front = rear = -1;
    }
}

void display() {
    int i;
    if(front == -1) {
        printf("Empty");
        return;
    }

    printf("Queue Elements");
     for (int i = front; i <= rear; i++) {
        printf("%d ", queue[i]);
    }


}

int main() {
    enqueue(10);
    enqueue(20);
    enqueue(30);

}

//Explain the operations in queue