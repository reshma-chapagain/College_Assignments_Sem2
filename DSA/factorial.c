#include<stdio.h>
int factorial(int num){
    if(num == 1 || num ==0){
        return 1;
    }
    else {
        return num * factorial(num - 1);
    }
}

int main(){
    int num;
    printf("Enter a number"); 
    scanf("%d", &num);
    int result;
    printf("Result is : %d", factorial(num));
}