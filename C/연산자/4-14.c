#include <stdio.h>

void main() {
	int year;
	printf("년도를 입력하세요. : ");
	scanf(" %d* \n", &year);

	if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		printf("%d 년은 윤년입니다.", year);
	} else {
		printf("%d 년은 유년이 아닙니다.", year);
	}
}
