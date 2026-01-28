class anyNsToDec {


public static void main(String[] args) {
 String s="0X1A";
anyNsToDec(s);
}

static String anyNsToDec(String s) 
{

if(s.startsWith("0") ) {

 
if(s.charAt(1)=='b' || s.charAt(1)=='B' ) {
String s1= s.substring(2,s.length());
int base=1;
int num=0;
int digit;
int j= s1.length()-1;
for (int i=j;i>=0;i--) {
 digit= Integer.parseInt(s1.substring(i,i+1));
digit=digit*base;
num+=digit;
base=base*2;
}
String result= String.valueOf(num);
System.out.println(result);
}

if(s.charAt(1)=='x' || s.charAt(1)=='X') {
 String s1= s.substring(2,s.length());
int num= Integer.parseInt(s1,16);
String result= String.valueOf(num);
System.out.println(result);
}

String s1= s.substring(1,s.length());
int base=1;
int num=0;
int digit;
int j= s1.length()-1;
for (int i=j;i>=0;i--) {
 digit= Integer.parseInt(s1.substring(i,i+1));
digit=digit*base;
num+=digit;
base=base*8;
}
String result= String.valueOf(num);
System.out.println(result);
}

else {
System.out.println(s);
}
return "";
}
} 
