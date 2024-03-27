#include <stdio.h>

void main() {
	int a = 100, b = -200, c = 0;

	printf("a 100 b -200 c 0\n\n");

	printf("상수의 AND 연산 : %d \n", a && b);
	printf("상수의 OR 연산 : %d \n", a || b);
	printf("상수의 NOT 연산 : %d \n", !a);
	printf("!b %d \n", !b);
	printf("!c %d \n", !c);
	printf(" a && c : %d \n", a && c);
	printf(" b && c : %d \n", b && c);
	printf(" a || c : %d \n", a || c);
	printf(" b || c : %d \n", b || c);

}
