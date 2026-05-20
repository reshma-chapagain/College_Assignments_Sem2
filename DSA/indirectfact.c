#include<stdio.h>

int factorialA(int n);
int factorialB(int n);

int factorialA(int n) {
    if(n == 0) {
        return 1;
    }
    else {
        return n * factorialB(n - 1);
    }
}

int factorialB(int n) {
    return factorialA(n);
}

int main() {
    int num;
    
    printf("Enter a number: ");
    scanf("%d", &num);

    int result = factorialA(num);

    printf("Factorial of the number is: %d", result);

    return 0;
}