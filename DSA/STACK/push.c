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


int main() {
    push(10);
    push(20);
    push(30); 

}