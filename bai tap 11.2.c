#include <stdio.h>
//int coffee(){
int main() {
    int count = 0;
    float total;
    char choice;
    char douong[100];
    float giatien;
    do {
        printf("Nhap ten do uong: ");
        scanf("%s", douong);
        printf("Nhap gia tien: ");
        scanf("%f", &giatien);
        total += giatien;
        count++;
        printf("Ban co muon tiep tuc hay khong? (y/n): ");
        scanf(" %c", &choice);

    }while (choice == 'y' || choice == 'Y');
    if (count > 0) {
        printf("Tong tien cua ban la: %.2lf\n", total);
}else {
    printf("Khong co mon nao duoc goi.\n");
    }
    return 0;
}
