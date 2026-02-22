class pattern {
static int size= 7;
static public void main(String[] args) {
pattern1(size);
 pattern2(size);
pattern3(size);
}

static void pattern1(int size) {
if ( (size%2)==0) {
System.out.println("only odd number accepted"); }
else {
int mid= (size+1)/2;
for(int i=1;i<=size;i++) {
for(int j=1;j<=size;j++) {

if( Math.abs(i-mid) + Math.abs(j-mid) == (mid-1)  ) {
System.out.print("x");
}
else {
System.out.print(" "); }
}
System.out.print("\n");
} } }



static void pattern2(int size) {
       
 // Upper Half
for (int i = 1; i <= size; i++) {
 for (int j = size; j > i; j--) System.out.print(" ");
  for (int k = 1; k <= (2 * i - 1); k++) {
  if (k == 1 || k == (2 * i - 1)) System.out.print("x");
 else System.out.print(" ");
  }
 System.out.println();
 }
 // Lower Half
 for (int i = size - 1; i >= 1; i--) {
  for (int j = size; j > i; j--) System.out.print(" ");
 for (int k = 1; k <= (2 * i - 1); k++) {
  if (k == 1 || k == (2 * i - 1)) System.out.print("x");
  else System.out.print(" ");
  }
 System.out.println();
 }
 }

    
static void pattern3(int size) {
        
int n = size - 1;
for (int i = -n; i <= n; i++) {
for (int j = -n; j <= n; j++) {
                
if (Math.abs(i) + Math.abs(j) == n) {
System.out.print("x");
 } else {
 System.out.print(" ");
 }
 }System.out.println();
 }
 }


}