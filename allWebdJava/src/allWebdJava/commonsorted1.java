package allWebdJava;

public class commonsorted1 {
	void common(int[] n1,int[] n2,int[] n3) {
		int a=0;
		int b=0;
		int c=0;
		while(a<n1.length && b<n2.length && c<n3.length) {
			if(n1[a]==n2[b] && n2[b]==n3[c]) {
				System.out.print(n1[a]+" ");
				a++;
				b++;
				c++;
			}
			else if(n1[a]<n2[b]) {
				a++;
			}
			else if(n2[b]<n3[c]) {
				b++;
			}else {
				c++;
			}
			
		}
		
		
	}
    public static void main(String[] args) {
    	commonsorted1 obj=new commonsorted1();
    	int[]w= {2,4,8};
    	int[]x= {2,3,4,8,10,16};
    	int[]y= {4,8,14,40};
    	obj.common(w,x,y);
    }
}
