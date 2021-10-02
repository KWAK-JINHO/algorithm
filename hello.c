#include<time.h>
#include<stdlib.h>
#include<stdio.h>

void p(int num);
int function_with_return();
void function_with_params();

int main(void)
{
   //int ret = function_with_return();
   //p(ret);
   function_with_params();

   return 0;
}

void p(int num)
{
	printf("num 은 %d 입니다\n\n", num);
}

int function_with_return()
{
	printf("반환값이 있는 함수 입니다\n");
	return 10;
}

void function_with_params()
{
	printf("전달값이 없는 함수입니다.\n");
}

