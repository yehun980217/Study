#include <stdio.h>

void main() {
	int a=10;

	printf("a의 기존 값 ==> %d \n",a);

	a++;
	printf(" a ++ ==> %d \n",a);
	a--;
	printf(" a -- ==> %d \n",a);
	a+=5;
	printf(" a +=5 ==> %d \n",a);
	a-=5;
	printf(" a -=5 ==> %d \n",a);
	a*=5;
	printf(" a *= 5 ==> %d \n",a);
	a/=5;
	printf(" a /= 5 ==> %d \n",a);
	a%=5;
	printf(" a %= 5 ==> %d \n",a);
}
