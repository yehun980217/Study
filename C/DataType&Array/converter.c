#include<stdio.h>

void main() {
	int num, val;

	while(1) {
		printf("���Ḧ ���Ͻø� ����  0�� �Է����ּ���.\n");
		printf("�Է����� ���� <1>10���� <2>16���� <3>8���� ==> ");
		scanf("%d", &num);

		if (num == 0) {
			printf("���� ��ȯ�� �����մϴ�.");
			break;
		}
		printf("\n");
		printf("��ȯ�� �� ==> ");
		if (num == 1) scanf(" %d", &val);
		else if (num == 2) scanf(" %x", &val);
		else if (num == 3) scanf(" %o", &val);
		printf("\n");

		switch(num) {
			case 1 :
				printf("10������ ��ȯ�մϴ�.\n");
				printf("=====================\n");
				printf("10���� : %d \n",val);
				printf("16���� : %x \n",val);
				printf("8���� : %o \n",val);
				printf("=====================\n");
				break;
			case 2 :
				printf("16������ ��ȯ�մϴ�.\n");
				printf("=====================\n");
				printf("10���� : %d \n",val);
				printf("16���� : %x \n",val);
				printf("8���� : %o \n",val);
				printf("=====================\n");
				break;
			case 3 :
				printf("8������ ��ȯ�մϴ�.\n");
				printf("=====================\n");
				printf("10���� : %d \n",val);
				printf("16���� : %x \n",val);
				printf("8���� : %o \n",val);
				printf("=====================\n");
				break;
			defult :
				printf("1 2 3 ���� �߿��� ����ּ���\n");
				break;
		}
	}
}
