class pattern1 {

public static void main(String[] args) {
//4=size
 for (int l=1 ; l <=4 ; l++) {

 if(l != 4) {
  for (int i=1 ; i <=l ; i++) {
  System.out.print("*");} }
  else {
for(int i=1 ; i <= l+l-1 ; i++) {
System.out.print("*");} }

for(int i=1 ; i <=2*(4-l)-1 ; i++) {
System.out.print(" "); }

if(l != 4) {
  for (int i=1 ; i <=l ; i++) {
  System.out.print("*");} }

System.out.print("\n");
}

} }

class pattern2 {

public static void main(String[] args) {
//4=size
 for (int l=1 ; l <=4 ; l++) {
 
  for(int i=1 ; i <=l-1 ; i++) {
  System.out.print(" "); }


  for (int i=1 ; i <=4 ; i++) {
  System.out.print("*");} 

System.out.print("\n");
}

} }

class pattern3 {

public static void main(String[] args) {
//4=size
 for (int l=1 ; l <=4 ; l++) {
 
  for(int i=1 ; i <=4-l ; i++) {
  System.out.print(" "); }


  for (int i=1 ; i <=l ; i++) {
  System.out.print("*");

  if(i<l) {
System.out.print(" ");}
} 

System.out.print("\n");
}

for (int l=4-1 ; l >=1 ; l--) {
 
  for(int i=1 ; i <=4-l ; i++) {
  System.out.print(" "); }


  for (int i=1 ; i <=l ; i++) {
  System.out.print("*");

  if(i<l) {
System.out.print(" ");}
} 

System.out.print("\n");
}

} }

class pattern4 {

public static void main(String[] args) {
//4=size
 for (int l=1 ; l <=4 ; l++) {

  for (int i=1 ; i <=l ; i++) {
  System.out.print(i);} 

System.out.print("\n");
}

} }

class pattern5 {

public static void main(String[] args) {
//4=size
 for (int l=1 ; l <=4 ; l++) {
 
  for(int i=1 ; i <=4-l ; i++) {
  System.out.print(" "); }


  for (int i=l ; i <=2*l-1 ; i++) {
  System.out.print(i);

  if(i<2*l-1) {
System.out.print(" ");}
} 

System.out.print("\n");
}

for (int l=4-1 ; l >=1 ; l--) {
 
  for(int i=1 ; i <=4-l ; i++) {
  System.out.print(" "); }


  for (int i=l ; i <=2*l-1 ; i++) {
  System.out.print(i);

  if(i<2*l-1) {
System.out.print(" ");}
} 

System.out.print("\n");
}

} }



