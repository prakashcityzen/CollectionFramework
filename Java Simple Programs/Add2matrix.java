import java.util.Scanner;
public class Add2matrix{
int m,n;

int first[][]=new int [m][n];
int second[][]=new int [m][n];

 Add2matrix(int[][]first,int [][]second,int m,int n)//parameterized constructor
{
this.first=first;  
this.second=second;
this.m=m;
this.n=n;
}

public static void main(String [] args){
int m,n,i,j;
Scanner in=new Scanner(System.in);
System.out.println("enter no of rows and columns ");

m=in.nextInt();
n=in.nextInt();
int first[][]=new int [m][n];
int second[][]=new int [m][n];

System.out.println("enter elements of 1st matrix ");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
first[i][j]=in.nextInt();

}
}
System.out.println("enter elements of 2nd matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
second[i][j]=in.nextInt();

}
}
System.out.println("elements of 1st matrix are :");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(first[i][j]+"\t");

}
System.out.println();

}
System.out.println("elements of 2nd matrix are :");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(second[i][j]+"\t");

}
System.out.println();

}
Add2matrix a=new Add2matrix(first,second,m,n);
a.addmatrix(a);//passing object
}
public void addmatrix(Add2matrix a)
{
int i,j;
int sum[][]=new int[a.m][a.n];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
sum[i][j]=a.first[i][j]+a.second[i][j];
}
}
System.out.println("sum of 2 matrices is :");

for(i=0;i<a.m;i++)
{
for(j=0;j<a.n;j++)
{
System.out.println(sum[i][j]);
}
System.out.println();
}
}
}