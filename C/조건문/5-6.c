#include <stdio.h>

void main() {
	int a;
	printf("정수를 입력하세요 : ");
	scanf("%d*", &a);

	if (a % 2 == 0) printf("짝수입력\n");
	else printf("홀수입력\n");
}
