#include<stdio.h>
#define MAX 5
int stack[MAX];

int top = -1;

void push (int value) {
    if(top == MAX - 1) {
        printf("Overflow");
    }

    else {
        top ++;
        stack[top] = value ; 
        printf("The inserted value in the stack is %d\n" , value);
        

    }


}

void pop() {
    if(top == -1) {
        printf("Underflow");
    }

    else {
        int value = stack[top];
        top --;
        printf("The deleted value from the stack is : %d\n", value);
    }
}
void display() {
    if(top == -1) {
        printf("Stack is empty");
    }

    else {
        printf("Elements are:");


        for(int i = 0; i >=0; i++){
            printf("%d\n", stack[i]);
        }
    }
}

int main() {
    push(10);
    push(20);
    push(30); 


    pop();
   display();

    return 0;

}


