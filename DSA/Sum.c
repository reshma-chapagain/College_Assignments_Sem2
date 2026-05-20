#include<stdio.h>
int sum(int num) {
    if(num == 1) {
         return 1;
    }
    else {
        return num + sum(num-1);
    }
}
int main() {
    int n;
    printf("Enter a number");
    scanf("%d", &n);

    int result;
    printf("Result = %d" , sum(n));

    
}