#include<stdio.h>
#define MAX 3

int stack[MAX];
int top = -1;

void push(int n) {
    if(top == MAX -1) {
        printf("Stack overflow");

    }

    else 
    top++;
    stack[top] = n;

}

void pop () {
    if(top == -1) {
        printf("Stack Underflow");
    }

    else {
        top --;
    }
}

int peek() {
    if(top == -1) {
        printf("Underflow");
    }

    else{
        printf("Top element %d" , stack[top]);
    }
}

void display () {
    if(top == -1) {
        printf("Empty");
    }

    else {
        for(int i = top; i>=0; i--) {
            printf("%d", stack[i]);
        }
    }
}
int main() {
   push(20);
   push(30);
   push(40);

   peek();
   display();
}