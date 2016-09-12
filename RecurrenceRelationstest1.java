import java.io.*;
public class RecurrenceRelationstest1{
static class rabbit{//所以这里要static
	int generation=0;
	int offspring=0;
	long fibi(int gener,int off){
	generation=gener;
	offspring=off;
	if(generation==1){
	return 1;}
	else if(generation==2){
	return 1;}
	else {return fibi(gener-1,off-1)+4*fibi(gener-2,off-2);}}}

static rabbit r1=new rabbit();//static关键字的作用方便在没有创建对象的情况下来进行调用
public static void main(String args[]){
System.out.print(r1.fibi(32,4));}}
