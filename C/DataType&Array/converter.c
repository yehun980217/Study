#include<stdio.h>

void main() {
	int num, val;

	while(1) {
		printf("종료를 원하시면 숫자  0을 입력해주세요.\n");
		printf("입력진수 결정 <1>10진수 <2>16진수 <3>8진수 ==> ");
		scanf("%d", &num);

		if (num == 0) {
			printf("진법 변환을 종료합니다.");
			break;
		}
		printf("\n");
		printf("변환할 값 ==> ");
		if (num == 1) scanf(" %d", &val);
		else if (num == 2) scanf(" %x", &val);
		else if (num == 3) scanf(" %o", &val);
		printf("\n");

		switch(num) {
			case 1 :
				printf("10진수를 변환합니다.\n");
				printf("=====================\n");
				printf("10진수 : %d \n",val);
				printf("16진수 : %x \n",val);
				printf("8진수 : %o \n",val);
				printf("=====================\n");
				break;
			case 2 :
				printf("16진수를 변환합니다.\n");
				printf("=====================\n");
				printf("10진수 : %d \n",val);
				printf("16진수 : %x \n",val);
				printf("8진수 : %o \n",val);
				printf("=====================\n");
				break;
			case 3 :
				printf("8진수를 변환합니다.\n");
				printf("=====================\n");
				printf("10진수 : %d \n",val);
				printf("16진수 : %x \n",val);
				printf("8진수 : %o \n",val);
				printf("=====================\n");
				break;
			defult :
				printf("1 2 3 보기 중에서 골라주세요\n");
				break;
		}
	}
}
