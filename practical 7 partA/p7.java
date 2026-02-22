class factorial {
static long fact=1;

public static void main(String [] args) {
int num=5;
System.out.println(factorial(num));
System.out.println(factorial1(num));
}

static long factorial(int num) {
if(num<2) {
return 1; }
else
{ fact= num* factorial(num-1);
}
return fact;
}

static long factorial1(int num) {
fact=1;
for(int i=1;i<=num;i++) {
fact*=i; }
return fact; 
}
}