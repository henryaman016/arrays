package sorting;

public class C {
public static void main(String[] args) {
	int []x= {3800,3200,4000,7000,5280};
	for(int j=0;j<x.length-1;j++) {
		for(int i=0;i<x.length-1;i++) {
			if(x[i]>x[i+1]) {
				int temp=x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
			}
		}
	}System.out.println(x[x.length-1]);
	System.out.println(x[0]);
}
}
