#include<stdio.h>

void main(){
	int a,b,c,d;
	int result;

	printf("ù ��° ����� ���� �Է��ϼ��� ==> ");
	scanf("%d", &a);
	printf("�� ��° ����� ���� �Է��ϼ��� ==> ");
	scanf("%d", &b);
	printf("�� ��° ����� ���� �Է��ϼ��� ==> ");
	scanf("%d", &c);
	printf("�� ��° ����� ���� �Է��ϼ��� ==> ");
	scanf("%d", &d);

	result = a + b + c + d;
	printf("%d + %d + %d + %d = %d", a, b, c, d, result);
}
