/*Doi mot ky tu hoa thanh ky tu thuong*/
#include <stdio.h>
void main()
{
    char c;
    printf("Please enter a character: ");
    scanf ("%c", &c);

    if (c>='A' && c<='Z')
        printf("Lowercase charater = %c", c + 'a' - 'A');
    else
        printf("Character Entered is = %c",c);
}
