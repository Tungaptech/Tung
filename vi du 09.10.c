#include <stdio.h>

void printMenu();
void kiemTraSoDu();
void rutTien(); 
void guiTien();
float soDu = 0.0;
//int amt2()

int main()
{
	char luaChon;
	do {
		printMenu();
		printf("Nhap lua chon cua ban: ");
		scanf(" %c",&luaChon);
		
		switch (luaChon){
			case 'a':
				kiemTraSoDu();
				break;
				case 'b':
					rutTien();
					break;
					case 'c':
						guiTien();
						break;
						case'd':
							printf("Cam on ban da su dung may ATM. Hen gap lai!\n");
							break;
							default:
								printf("Lua chon khong hop le. Vui long thu lai.\n");
							}
			printf("\n");
		}while (luaChon != 'd');
		return 0;
		
	}
	
	void printMenu()
	{
		printf("***********ATM*************\n");
		printf("a. Kiem tra so du\n");
		printf("b. Rut tien\n");
		printf("c. Gui tien\n");
		printf("d. Thoat\n");
	}
	
	void kiemTraSoDu()
	{
		printf("So du hien tai cua ban la: $%.2f\n", soDu);
	}
	
	void rutTien()
	{
		float soTien;
		
		printf("Nhap so tien can rut: $");
		scanf("%f", &soTien);
		
		if (soTien > 0 && soTien <= soDu)
{soDu -= soTien;
printf("Rut tien thanh cong. So du moi: $%.2f\n", soDu);

	}else{
		printf("So tien khong hop le hoac so du khong du.\n");
	}
		}
	void guiTien()
	{
		float soTien;
		
		printf("Nhap so tien can gui: $");
		scanf("%f", &soTien);
		if (soTien > 0){
			soDu += soTien;
			printf("Gui tien thanh cong. So du moi: $%.2f\n", soDu);
			
		}else {
			printf("So tien khong hop le.\n");
		}
	}
