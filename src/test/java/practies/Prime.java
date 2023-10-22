package practies;

public class Prime {
	public static void main(String[] args) {
		/*
		 * int num=71; int count=0; for(int i=1; i<=num;i++) { for(int j=1; j<=i; j++) {
		 * if(i%j==0) { count++; } } }if(count==2) { System.out.println("prime"); }
		 */
		
		int num=71; 
		int flag=0;
		int div;
		
		if(num==0 || num==1) {
			System.out.println("not a primu number");
		}else {
			for(int i=2;i<num;i++) {
				
				div=num%i;
				
				if(div==0) {
					System.out.println("not a primu number");
					flag=1;
					break;
				}
				
			}
			if(flag==0) 
				System.out.println("primu number ");
			
		}
		
		
	}

}
