#include <stdio.h>

void main()
{
    float com = 0, sales_amt;
    char grade;
    printf("Enter the Grade: ");
    fflush(stdin);
    scanf("%c", &grade);
    printf("\n Enter the Sales Amount:  ");
    scanf("%f", &sales_amt);
    printf("grade %c", grade);

    if (sales_amt > 10000)
        if (grade == 'A')
            com = sales_amt * 0.1;
        else
            com = sales_amt * 0.8;
    else
        com = sales_amt * 0.05;
    printf("\n Commision = %f", com);
}