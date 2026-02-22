 import java.util.Scanner;
class p7 {
static int i=0;

static int count=0;
static int count1=0;
public static void main(String args[]) {
Scanner sc= new Scanner(System.in);
 System.out.println("enter two strings");
String s= sc.nextLine();
String a= sc.nextLine();
checkCopy1(s,a);
checkCopy(s,a);
System.out.println(count);
System.out.println(count1);
}

static String checkCopy1 (String s,String a) {

if(i>s.length()-a.length()) {
return " " ; }
else
{ String s1= s.substring(i,i+a.length());

if(a.equals(s1) ) {
count++; }
i++;
checkCopy1(s,a);
}
return ""; }

static String checkCopy (String s,String a) {
for(i=0;i<=s.length()-a.length();i++){
String s1=s.substring(i,i+a.length());
if(a.equals(s1) ) {
count1++; }
}
return "";}
}
