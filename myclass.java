import java.util.Scanner;
import java.lang.Math;
public class myclass {

	public static void main(String[] args) {
		int[] action= {100,0,90,21};
		int[] comedy= {0,100,17,80};
		int[] category= {1,0,1,0};
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] in1=new int[n];
		int[] in2=new int[n];
		for(int i=0;i<n;i++) {
			in1[i]=s.nextInt();
			in2[i]=s.nextInt();	
		}
		
		for(int i=0;i<n;i++) {
		int x1=in1[i];
		int y1=in2[i];
		double min=1000;
		int res=-1;
		for(int j=0;j<4;j++) {
		int x2=action[j];
		int y2=comedy[j];
		double p=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		if(p<min) {
			min=p;
			res=category[j];
		}
			
		}
		System.out.println(res);
		}
	s.close();
	}

}
