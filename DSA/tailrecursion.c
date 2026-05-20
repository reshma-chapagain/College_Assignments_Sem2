#include<stdio.h>
int functionhelper(int n, int result);

int functionhelper(int n, int result) {
    if(n==0) {
        return result;
    }

    else {
        return functionhelper(n-1, n*result);
    }


}
int factorial(int n) {
    return functionhelper(n,1);
}
int main() {
    int num;
    printf("Enter a number");
    scanf("%d", num);

    printf("Factorial is: %d", factorial(num));

    return 0;

}