#include<stdio.h>
void tower(int n , char Source , char Destination, char Auxulliary) {
    if(n ==1) {
        printf("Move 1 from %c to %c", Source, Destination); 
    }

    else {
        tower(n-1 , Source , Auxulliary ,Destination); 
            printf("Move %d from %c to %c\n", n , Source , Destination);
        

        tower (n-1 , Auxulliary, Destination,Source);
    }
}
    int main() {
        int n;
        printf("Enter a number");
        scanf("%d", &n);


        tower(n, 'A' , 'B' , 'C');
        return 0;
    }
