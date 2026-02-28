public class Calculator {
 public int add(int a, int b){
 return a+b;
 }
 public int divide(int a, int b){
 return a/b;
 }
 public void printNumbers(){
 for(int i=0;i<10;i++){
 System.out.println(i);
 }
 }
 public boolean isPositive(int n){
 if(n>0){
 return true;
 } else {
 return false;
 }
 }
}