#include <stdio.h>

void main() {
	int a = 100, b = 200;

	printf("a = %d, b = %d \n",a ,b);

	printf("%d == %d is %d \n",a ,b ,a==b);
	printf("%d != %d is %d \n",a ,b ,a!=b);
	
	printf("%d > %d is %d \n",a ,b ,a>b);
	printf("%d < %d is %d \n",a ,b ,a<b);

	printf("%d >= %d is %d \n",a ,b ,a>=b);
	printf("%d <= %d is %d \n",a ,b ,a<=b);
	
	printf("%d = %d is %d \n",a ,b ,a=b);
}

