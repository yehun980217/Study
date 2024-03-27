#include <stdio.h>

void main() {
	int a = 10,b;

	printf("a´Â %d \n",a);

	b = a++;
	printf(" %d \n",b);

	b=++a;
	printf(" %d \n",b);
}
