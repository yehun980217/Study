#include<stdio.h>

void main() {
	int a,b;
	float c,d;

	a = 100;
	b = a;

	c = 111.1f;
	d = c;

	printf("a, bÀÇ °ª ==> %d , %d \n", a, b);
	printf("c, dÀÇ °ª ==> %5.1f , %5.1f", c, d);
}

