#include <stdio.h>

void main() {
	int a = 100, b = -200, c = 0;

	printf("a 100 b -200 c 0\n\n");

	printf("����� AND ���� : %d \n", a && b);
	printf("����� OR ���� : %d \n", a || b);
	printf("����� NOT ���� : %d \n", !a);
	printf("!b %d \n", !b);
	printf("!c %d \n", !c);
	printf(" a && c : %d \n", a && c);
	printf(" b && c : %d \n", b && c);
	printf(" a || c : %d \n", a || c);
	printf(" b || c : %d \n", b || c);

}
