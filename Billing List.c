#include <stdio.h>
#include <stdlib.h>

int main()
{
    int itemno, quantity;
    float iprice, total;
    char desc[20];
    printf("Enter the Item No: ");
    scanf("%d", &itemno);
    printf("Description: ");
    scanf("%s", &desc);
    printf("No of Items: ");
    scanf("%d", &quantity);
    printf("Item price: ");
    scanf("%f", &iprice);
    total=(float)quantity*iprice;
    printf("\nItem No is %d \nDescription: %s \nThe Total Amount is: %.2f \n", itemno, desc, total);
    return 0;
}
