#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
		char* input1;
		char* input2;

		input1 = malloc(33);
		input2 = malloc(33);

		scanf("%s", input1);
		scanf("%s", input2);

		_Bool result = strlen(input1) >= strlen(input2);
		
		if(result)
				printf("true");
		else
				printf("false");
}
