#include <stdio.h>
#include <stdlib.h>

int main(){
	int limit;
	scanf("%d", &limit);
	int month;
	scanf("%d", &month);
	int n;
	int total = limit;
	while( month > 0 ){
		scanf("%d", &n);
		total = total - n + limit;
		month--;
	}
	printf("%d", total);
}