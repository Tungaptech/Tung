#include <stdio.h>

int main() {
    int numbers[10];

    // Input 10 integers
    printf("Nhap 10 so:\n");
    printf("==============\n");
    for (int i = 0; i < 10; i++) {
        printf("So %d: ", i + 1);
        scanf("%d", &numbers[i]);
    }

    // Display the numbers in reverse order
    printf("Output: ");
    for (int i = 9; i >= 0; i--) {
        printf("%d", numbers[i]);
        if (i != 0) {
            printf(", ");
        }
    }
    printf("\n");

    return 0;
}
