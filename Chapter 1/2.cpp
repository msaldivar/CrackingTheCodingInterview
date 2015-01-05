#include<iostream>

//@author Maurice Saldivar

//I'm assuming what was passed into the function was a char array like I have in my main
//if not I would need to make a temp char array to manipulate str. Since char* are considered constants in c++
//and can't be changed. If I wasn't allowed to use strlen() I could calculate the length of the c-string using a loop
//I like my answer of the books. Mine seems far more readable than doing pointer arithmetic. 
void reverse(char* str) 
{

	int length = std::strlen(str);

	char* temp = new char[length+1];	
	temp[length+1] = '\0';

	auto start = 0;
	for (int i = length-1; i >= 0; i--)
		temp[start++] = str[i]; 
		 
	for (int i = 0; i < length; i++)
		str[i] = temp[i];
}

int main()
{
	char str[5] = "four";  
	reverse(str); 

	std::cout << str << std::endl;
	return 0;
}
