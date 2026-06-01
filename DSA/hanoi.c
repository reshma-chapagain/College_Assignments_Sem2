#include<stdio.h>
void Tower(int n , char Source , char Destination , char Auxulliary) {
    if(n == 1) {
        printf("Disk 1 from %c to %c\n" , Source , Destination );
    }

    else{
        Tower(n-1, Source , Auxulliary , Destination);
        printf("Move4 Disk %d  from %c to %c" , n , Source , Destination);

        Tower(n-1, Auxulliary, Destination , Source);
    }

}


int main () {
    int n;
   
    printf("Enter a number:" );
    scanf("%d" , &n);

    Tower(n,'A','C','B');
    return 0;

}

