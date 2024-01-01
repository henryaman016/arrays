package sorting;

public class B {
	public static void main(String[] args) {
		int []x= {38,4,6,97,15,15};
		for(int j=0;j<x.length-1;j++) {
			for(int i=0;i<x.length-1;i++) {
				if(x[i]>x[i+1]) {
					int temp=x[i];
					x[i]=x[i+1];
					x[i+1]=temp;
				}
			}
		}for(int arr:x) {
			System.out.println(arr);
		}
	}

}
