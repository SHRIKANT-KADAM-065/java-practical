class parformanceEvaluater {

static public void main(String[] args) {
float noOfTimes=20;
long s1tt=0;
long s2tt=0;
long s1st;
long s1et;
long s2st;
long s2et;
for(int i=0;i<noOfTimes;i++) {
s1st=System.currentTimeMillis();
s1(noOfTimes);
s1et=System.currentTimeMillis();
s1tt+=s1et-s1st;
 }
System.out.println(s1tt/noOfTimes);

for(int i=0;i<noOfTimes;i++) {
s2st=System.currentTimeMillis();
s2();
s2et=System.currentTimeMillis();
s2tt+=s2et-s2st;
 }
System.out.println(s2tt/noOfTimes);

}


static void s1( float noOfTimes) {

for(int i=0;i<noOfTimes;i++) {
System.out.print("1oooooo");
}


}

static void s2() {

System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");
System.out.print("1oooooo");


}

}
