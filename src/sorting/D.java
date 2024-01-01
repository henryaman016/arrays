package sorting;

public class D {
public static void main(String[] args) {
	int []x= {1,1,2,3,3,4,4,5,6,6};
	int []y=new int[x.length];
	int j=0;
	for(int i=0;i<x.length-1;i++) {
		if(x[i]!=x[i+1]) {
			y[j]=x[i];
			j++;
		}
	}y[j]=x[x.length-1];
	for(int arr:y) {
		System.out.println(arr);
	}
}
}
