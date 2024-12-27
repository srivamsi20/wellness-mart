import java.util.*;
class Cart
{
	static Scanner sc=new Scanner(System.in);
	
	static String black = "\u001B[30m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String magenta = "\u001B[35m";
    static String cyan = "\u001B[36m";
    static String white = "\u001B[37m";
    static String reset = "\u001B[0m";
	
	static String brightBlack = "\u001B[90m";
    static String brightRed = "\u001B[91m";
    static String brightGreen = "\u001B[92m";
    static String brightYellow = "\u001B[93m";
    static String brightBlue = "\u001B[94m";
    static String brightMagenta = "\u001B[95m";
    static String brightCyan = "\u001B[96m";
    static String brightWhite = "\u001B[97m";
	
    static String bold = "\033[1m";
    static String underlined = "\033[4m";
    static String blink="\u001B[5m";
	
	static String a[]=new String[20];
	static double b[]=new double[20];
	static int q[]=new int[20];
	static int k=0;
	boolean b11=true;
	static String od[]= {"hi"};
	static int getMaxLength(String[] array) {
        	int maxLength = 0;
        	for (int i=0;i<a.length;i++) {
            		if (array[i]!=null && array[i].length() > maxLength) {
                		maxLength = array[i].length();
            		}
        	}
        	return maxLength;
    	}
	static boolean ord=false;
	static void remove()
	{
		while(true)
		{
			System.out.print(bold+"Select Valid Id to Remove Item : "+reset);
			int n=sc.nextInt();
			if(n<=k)
			{
				for(int i=n-1;i<19;i++)
				{
					a[i]=a[i+1];
					b[i]=b[i+1];
					q[i]=q[i+1];
				}
				k--;
				break;

			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
			}
		}
	}
	static int otpGenerator()
    	{
        	int otp = (int) (Math.random() * 9000) + 1000;
        	return otp;
    	}
    	static void phnpay()
	{
        	while(true)
		{
            		System.out.println("Press 1 to "+bold+"Enter Phone Number"+reset+"\n      2 to "+bold+"Enter UPI ID"+reset);
            		int n=sc.nextInt();
            		if(n==1)
			{
                
                		while(true)
		        	{
		            		System.out.print(brightCyan+"Enter your number : "+reset);
                    			long phn=sc.nextLong();
                    			int c1=0;
			        	while(phn!=0)
			        	{
				        	phn/=10;
				        	c1++;
			        	}
			        	if(c1==10)
			        	{
			            		break;
			        	}
			        	else
			        	{
			        			System.out.println(bold+brightRed+"--------------------Note---------------------------"+reset);
			            		System.out.println("\nPhone Number Must be 10 Digits Only");
			        	}
		        	}
                		while(true)
                		{
                    			int geOtp=otpGenerator();
                			System.out.println(brightYellow+"OTP : "+geOtp);
                			System.out.print(brightCyan+"Enter OTP to confirm payment : "+reset);
                			String s=sc.next();
                			if(s.equals(Integer.toString(geOtp)))
					{
                	    			System.out.println(brightGreen+"\nPayment Successfull..."+reset);
                	    			System.out.println(bold+"\nYour Order is Placed"+reset);
                	    			ord=true;
                	    			break;
                			}
                			else
					{
                        			System.out.println(brightRed+"\nOTP verification failed. Please try again..."+reset);
                			}
                		}
                		break;
            		}
            		else if(n==2)
			{
                		System.out.print(brightCyan+"Enter your UPI Id : "+reset);
                		String upi=sc.next();
                		System.out.println(brightGreen+"\nPayment Successfull..."+reset);
                		System.out.println(bold+"\nYour Order is Placed"+reset);
                		ord=true;
                		break;
            		}
        	}
    	}
	static void Gpay()
	{
        	while(true)
		{
        			System.out.println("Press 1 to "+bold+"Enter Phone Number"+reset+"\n      2 to "+bold+"Enter UPI ID"+reset);
            		int n=sc.nextInt();
            		if(n==1)
			{
                
                		while(true)
		        	{
		            		System.out.print(brightCyan+"Enter your number : "+reset);
                    			long phn=sc.nextLong();
                    			int c1=0;
			        	while(phn!=0)
			        	{
				        	phn/=10;
				        	c1++;
			        	}
			        	if(c1==10)
			        	{
			            		break;
			        	}
			        	else
			        	{
			        			System.out.println(bold+brightRed+"--------------------Note---------------------------"+reset);
			            		System.out.println("Phone Number Must be 10 Digits Only");
			        	}
		        	}
                		while(true)
                		{
                    			int geOtp=otpGenerator();
                			System.out.println(brightYellow+"OTP : "+geOtp);
                			System.out.print(brightCyan+"Enter OTP to confirm payment : "+reset);
                			String s=sc.next();
                			if(s.equals(Integer.toString(geOtp)))
					{
                	    			System.out.println(brightGreen+"\nPayment Successfull..."+reset);
                	    			System.out.println(bold+"\nYour Order is Placed");
                	    			ord=true;
                	    			break;
                			}
                			else
					{
                        			System.out.println(brightRed+"\nOTP verification failed. Please try again..."+reset);
                			}
                		}
                		break;
            		}
            		else if(n==2)
			{
                		System.out.print(brightCyan+"Enter your UPI Id : "+reset);
                		String upi=sc.next();
                		System.out.println(brightGreen+"\nPayment Successfull..."+reset);
                		System.out.println(bold+"\nYour Order is Placed");
                		ord=true;
                		break;
            		}
        	}
    	}
	static void billing()
	{
		while(true)
	    	{
					System.out.println(bold+brightBlue+"-----------------Payment Method-----------------"+reset);
    	    		System.out.println(bold+"\n1 for Cash On Delivery\n2 for Phone Pay\n3 for Google Pay"+reset);
    	    		System.out.print("\nChoose your choice : ");
    	    		int n=sc.nextInt();
    	    		if(n==1)
			{
    	        		System.out.println(bold+"\nYour Order is Placed...."+reset);
    	        		ord=true;
				k=0;
    	        		break;
    	    		}
    	    		else if(n==2)
			{
    	        		phnpay();
    	        		break;
    	    		}
    	    		else if(n==3)
			{
    	        		Gpay();
    	        		break;
    	    		}
    	    		else
    	        		System.out.println(brightRed+"Invalid"+reset);
	    	}
		od=Arrays.copyOf(a,a.length);
		Arrays.fill(a,null);
		Arrays.fill(b,0);
		Arrays.fill(q,0);
		System.out.println("\nPress 0 to go Home\n      Any key to exit");
		String c1=sc.next();
		if(c1.equals("0"))
		{
			new Home().HomeSelection();
		}
		else
		{
			System.out.println("Have a Nice Day");
		}
	}
	static void showOrders()
	{
		
		System.out.println(bold+brightBlue+"-------------------My Orders-------------------"+reset);
		if(od.length==1)
		{
			System.out.println("  Looks like you haven't placed an order....");
			
		}
		else
		{
			if(ord) {
				System.out.print(bold);
				int k1=1;
				for(int i=0;i<od.length;i++)
				{
					if(od[i]!=null)
						System.out.println(k1+"."+od[i]);
						k1++;
				}
				System.out.print(brightMagenta+"\nYour order is arriving next friday....."+reset);
				System.out.print(reset);
			}
			else {
				System.out.println(bold+"  Looks like you haven't placed an order...."+reset);
			}
		}
		System.out.println("\nPress 0 to go Home\n      Any key to exit");
		String c1=sc.next();
		if(c1.equals("0"))
		{
			new Home().HomeSelection();
		}
		else
		{
			System.out.println("Have a Nice Day");
		}
	}
	static void showCart()
	{
		if((Arrays.stream(q).sum())==0)
		{
			System.out.println(bold+brightBlue+"-------------------My Cart-------------------"+reset);
			System.out.println("              Your Cart is Empty           ");
			System.out.println("\nPress 0 to go Home\n      Any key to exit");
			String c1=sc.next();
			if(c1.equals("0"))
			{
				new Home().HomeSelection();
			}
			else
			{
				System.out.println("Have a Nice Day");
			}
			
		}
		else
		{
			int maxWidth=getMaxLength(a)+6;
			String format = "%-" + maxWidth + "s%10s%10.2f%n";
			String form = "%-" + maxWidth + "s%12s%9s%n";
			int dash=maxWidth+23;
			System.out.println(bold+brightBlue);
			for(int i=0;i<dash;i++)
			{
				System.out.print("-");
			}
			System.out.println(reset+bold);
			System.out.printf(form,"Name","Quantity","Cost");
			for(int i=0;i<dash;i++)
			{
				System.out.print(brightBlue+"-");
			}
			System.out.println(reset);
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=null)
				{
					String concatenated=q[i]+"*"+b[i];
					double res=q[i]*b[i];
					System.out.print((i+1)+".");
					System.out.printf(format,a[i],concatenated,res);
				}
			}
			for(int i=0;i<dash;i++)
			{
				System.out.print(bold+brightMagenta+"-");
			}
			System.out.print(reset);
			double sum=0;
			for(int i=0;i<b.length;i++)
			{
				sum+=(b[i]*q[i]);
				
			}
			System.out.println();
			String form1="%-"+maxWidth+"s%22.2f%n";
			System.out.printf(form1,"Total",sum);
			
			double del=49;
			double dis=0;
			if(sum>0)
			{
				if(sum>1000)
					dis=sum*0.1;
				else
					dis=0;
			}
			dis=-dis;
			System.out.printf(form1,"Discount",dis);
			if(sum>500)
			{
				del=0;
			}
			System.out.printf(form1,"Delivery Charges",del);
			double amt=sum-(-dis)+del;
			for(int i=0;i<dash;i++)
			{
				System.out.print(bold+brightMagenta+"-");
			}
			System.out.println(reset+bold);
			System.out.printf(form1,"Total Amount",amt);
			for(int i=0;i<dash;i++)
			{
				System.out.print(brightMagenta+"-");
			}
			System.out.print(reset);
			if(sum<500)
			{
				System.out.println(brightGreen+"\nAdd "+(500-sum)+" more to get Free Delivery"+reset);
			}
			System.out.println("\nPress 1 to Payment\n      2 to Remove Item\n      3 to Home");
			while(true)
			{
				int m=sc.nextInt();
				if(m>=1 && m<=3)
				{
					if(m==2)
					{
						remove();
						showCart();
						break;
					}
					else if(m==1)
					{
						billing();
						break;
					}
					else if(m==3)
					{
						new Home().HomeSelection();
						break;
					}
					
				}
				else
				{
					System.out.println("Invalid");
				}
			}
			
			
		}
			
		
	}
}
//-------------------------------------------------------------Personal Care1------------------------------------------------------
class PersonalCare extends Cart
{
	void Bath()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"---------------------------------------------"+reset);
		System.out.println(bold+" Id"+"  Name  "+"                              Cost");
		System.out.println(brightMagenta+"---------------------------------------------"+reset);
		System.out.println(" 1.Kz Soap 75gm                     ------198");
		System.out.println(" 2.Sebamed Cleanser                 ------125");
		System.out.println(" 3.Keto Soap                        ------250");
		System.out.println(" 4.Shower to shower                 ------116");
		System.out.println(" 5.Mysore Sandal                    -------42");
		System.out.println(bold+brightMagenta+"---------------------------------------------"+reset);
		String c[]={"Kz Soap 75gm","Sebamed Cleanser","Keto Soap","Shower to shower","Mysore Sandal"};
		int d[]={198,125,250,116,42};
		while(true)
		{
			
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				SkinSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Bath();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void Face()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"-------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"   Name  "+"                                       Cost");
		System.out.println(brightMagenta+"-------------------------------------------------------"+reset);
		System.out.println(" 1.Cetaphil Gentle Skin Cleanser,125ml        ------343");
		System.out.println(" 2.Ahaglow Skin Face Wash Gel,200gm           ------656");
		System.out.println(" 3.Cipla Saslic DS Foaming Face Wash,60ml     ------450");
		System.out.println(" 4.Sebamed Clear Face Care Gel,50ml           ------470");
		System.out.println(" 5.Nivea Soft Light Moisturising Cream,300ml  ------440");
		System.out.println(bold+brightMagenta+"-------------------------------------------------------"+reset);
		String c[]={"Cetaphil Gentle Skin Cleanser,125ml","Ahaglow Skin Face Wash Gel,200gm","Cipla Saslic DS Foaming Face Wash,60ml","Sebamed Clear Face Care Gel,50ml","Nivea Soft Light Moisturising Cream,300ml"};
		int d[]={343,656,450,470,440};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				SkinSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Face();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
			
	}
	void Beauty()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"----------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"  Name  "+"                                     Cost");
		System.out.println(brightMagenta+"----------------------------------------------------"+reset);
		System.out.println(" 1.Caffeine Face Scrub,100 ml              ------349");
		System.out.println(" 2.Organic Facial Kit                      ------275");
		System.out.println(" 3.Magnet Eyes Black Kajal, 0.35 gm        ------189");
		System.out.println(" 4.VLCC Kajal, 2.5 gm(Buy 1 Get 1 Free)    ------155");
		System.out.println(" 5.VLCC Pearl Facial Kit, 1 Count          ------252");
		System.out.println(bold+brightMagenta+"----------------------------------------------------"+reset);
		String c[]={"Caffeine Face Scrub,100 ml","Organic Facial Kit","Magnet Eyes Black Kajal, 0.35 gm","VLCC Kajal, 2.5 gm(Buy 1 Get 1 Free)","VLCC Pearl Facial Kit, 1 Count"};
		int d[]={349,275,189,155,252};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				SkinSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Beauty();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void Lip()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"----------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name  "+"                                            Cost");
		System.out.println(brightMagenta+"----------------------------------------------------------------"+reset);
		System.out.println(" 1.Nykaa Serial Kisser Peach Flavour Lip Balm, 4.5 gm   -----134");
		System.out.println(" 2.Nivea Lip Balm, 10 gm                                ------60");
		System.out.println(" 3.Biotique Fruit Brightening Lip Balm, 12 gm           -----210");
		System.out.println(" 4.Namyaa Organic Lip Scrub, 15 gm                      -----180");
		System.out.println(" 5.Dr.Organic Tea Tree Blemish Stick, 8 ml              -----439");
		System.out.println(bold+brightMagenta+"----------------------------------------------------------------"+reset);
		String c[]={"Nykaa Serial Kisser Peach Flavour Lip Balm, 4.5 gm","Nivea Lip Balm, 10 gm","Biotique Fruit Brightening Lip Balm, 12 gm","Namyaa Organic Lip Scrub, 15 gm","Dr.Organic Tea Tree Blemish Stick, 8 ml"};
		int d[]={134,60,210,180,439};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				SkinSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Lip();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void Foot()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"----------------------------------------------"+reset);
		System.out.println(bold+" Id"+"     Name  "+"                            Cost");
		System.out.println(brightMagenta+"----------------------------------------------"+reset);
		System.out.println(" 1.Krack Heel Repair Cream, 25 gm      -----95");
		System.out.println(" 2.Apollo Life Hand Sanitizer, 5 lit   ----900");
		System.out.println(" 3.Lakme Nail Color Remover, 27 ml     -----99");
		System.out.println(" 4.Himalaya Footcare Cream, 20 gm      -----65");
		System.out.println(" 5.Sanfe 5 in 1 Detan Wax, 600 gm      ----274");
		System.out.println(bold+brightMagenta+"----------------------------------------------"+reset);
		String c[]={"Krack Heel Repair Cream, 25 gm","Apollo Life Hand Sanitizer, 5 lit","Lakme Nail Color Remover, 27 ml","Himalaya Footcare Cream, 20 gm","Sanfe 5 in 1 Detan Wax, 600 gm"};
		int d[]={95,900,99,65,274};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				SkinSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Foot();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void SkinSelection()
	{
		System.out.println(bold+brightGreen+"---------------------------------------------"+reset);
		System.out.println(bold+" Id "+"  Name ");
		System.out.println(brightGreen+"---------------------------------------------"+reset);
		System.out.println(" 1.Bath & Body");
		System.out.println(" 2.Face Care");
		System.out.println(" 3.Beauty");
		System.out.println(" 4.Lip Care");
		System.out.println(" 5.Foot & Hand Care");
		System.out.println(bold+brightGreen+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse..");
			int id=sc.nextInt();
			if(id==0)
			{
				selection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				if(id==1)
				{
					Bath();
					break;
				}
				else if(id==2)
				{
					Face();
					break;
				}
				else if(id==3)
				{
					Beauty();
					break;
				}
				else if(id==4)
				{
					Lip();
					break;
				}
				else if(id==5)
				{
					Foot();
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
			}
		}
		
	}	
	void Oils()
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"-------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"      Name  "+"                                          Cost");
		System.out.println(brightCyan+"-------------------------------------------------------------"+reset);
		System.out.println(" 1.Navratna Gold Almond Cool Ayurvedic Oil, 100 ml   ------63");
		System.out.println(" 2.Parachute Pure Coconut Hair Oil, 100 ml           ------40");
		System.out.println(" 3.Indulekha Bringha Hair Oil, 100 ml                -----388");
		System.out.println(" 4.Baidyanath Goodcare Castor Oil, 100 ml            -----150");
		System.out.println(" 5.Hamdard Rogan Badam Shirin Almond Oil, 50 ml      -----220");
		System.out.println(bold+brightCyan+"-------------------------------------------------------------"+reset);
		String c[]={"Navratna Gold Almond Cool Ayurvedic Oil, 100 ml","Parachute Pure Coconut Hair Oil, 100 ml","Indulekha Bringha Hair Oil, 100 ml","Baidyanath Goodcare Castor Oil, 100 ml","Hamdard Rogan Badam Shirin Almond Oil, 50 ml"};
		int d[]={63,40,388,150,220};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				HairSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Oils();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void Shampoos()
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"--------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"   Name  "+"                                              Cost");
		System.out.println(brightCyan+"--------------------------------------------------------------"+reset);
		System.out.println(" 1.Head & Shoulders Anti-Dandruff Shampoo, 200 ml    ------184");
		System.out.println(" 2.Dove Hair Fall Rescue Shampoo, 180 ml             ------157");
		System.out.println(" 3.Indulekha Bringha Hair Cleanser, 200 ml           ------206");
		System.out.println(" 4.L'Oreal Paris Total Repair 5 Shampoo, 192 ml      ------209");
		System.out.println(" 5.Mamaearth Onion Shampoo with Onion, 180 ml        ------349");
		System.out.println(bold+brightCyan+"--------------------------------------------------------------"+reset);
		String c[]={"Head & Shoulders Anti-Dandruff Shampoo, 200 ml","Dove Hair Fall Rescue Shampoo, 180 ml","Indulekha Bringha Hair Cleanser, 200 ml","L'Oreal Paris Total Repair 5 Shampoo, 192 ml","Mamaearth Onion Shampoo with Onion, 180 ml"};
		int d[]={184,157,206,209,349};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				HairSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Shampoos();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
			
	}
	void Conditioners()
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"----------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"    Name  "+"                                   Cost");
		System.out.println(brightCyan+"----------------------------------------------------"+reset);
		System.out.println(" 1.L'Oreal Paris Hyaluron 72H Moisturizer   -----207");
		System.out.println(" 2.Dove Daily Shine Conditioner, 80 ml      -----104");
		System.out.println(" 3.Tresemme Keratin Smooth Conditioner      -----110");
		System.out.println(" 4.Triflow Hair Conditioner, 100 gm         -----599");
		System.out.println(" 5.La-Matisse Conditioner, 100 gm           -----625");
		System.out.println(bold+brightCyan+"----------------------------------------------------"+reset);
		String c[]={"L'Oreal Paris Hyaluron 72H Moisturizer","Dove Daily Shine Conditioner, 80 ml","Tresemme Keratin Smooth Conditioner","Triflow Hair Conditioner, 100 gm","La-Matisse Conditioner, 100 gm"};
		int d[]={207,104,110,599,625};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				HairSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Conditioners();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void Gels()
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"-------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"     Name  "+"                                                 Cost");
		System.out.println(brightCyan+"-------------------------------------------------------------------"+reset);
		System.out.println(" 1.Livon Anti-Frizz Serum For Rough & Dry Hair, 50 ml      -----153");
		System.out.println(" 2.Beardo Strong Hold Crystal Gel Wax, 50 g                -----175");
		System.out.println(" 3.Set Wet Cool Hold Hair Styling Gel, 50 ml               ------40");
		System.out.println(" 4.Mamaearth Onion & Biotin Hair Serum, 100 ml             -----299");
		System.out.println(" 5.Tressemme Keratin Smooth Hair Serum, 60 ml              -----297");
		System.out.println(bold+brightCyan+"-------------------------------------------------------------------"+reset);
		String c[]={"Livon Anti-Frizz Serum For Rough & Dry Hair, 50 ml","Beardo Strong Hold Crystal Gel Wax, 50 g","Set Wet Cool Hold Hair Styling Gel, 50 ml","Mamaearth Onion & Biotin Hair Serum, 100 ml","Tressemme Keratin Smooth Hair Serum, 60 ml"};
		int d[]={153,175,40,299,297};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				HairSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Gels();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void Creams()
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"-------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"  Name  "+"                                  Cost");
		System.out.println(brightCyan+"-------------------------------------------------"+reset);
		System.out.println(" 1.Vcare Henna Natural Powder, 200 gm    -----115");
		System.out.println(" 2.Tririse Hair Serum, 60 ml             -----972");
		System.out.println(" 3.Foligain Hair Lotion, 100 ml          -----570");
		System.out.println(" 4.Himalaya Protein Hair Cream, 100 ml   -----100");
		System.out.println(" 5.Racine Hair Re-Growth Lotion, 60 ml   ----1332");
		System.out.println(bold+brightCyan+"-------------------------------------------------"+reset);
		String c[]={"Vcare Henna Natural Powder, 200 gm","Tririse Hair Serum, 60 ml","Foligain Hair Lotion, 100 ml","Himalaya Protein Hair Cream, 100 ml","Racine Hair Re-Growth Lotion, 60 ml"};
		int d[]={115,972,570,100,1332};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				HairSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Creams();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void HairSelection()
	{
		System.out.println(bold+brightBlue+"---------------------------------------------"+reset);
		System.out.println(bold+" Id "+"  Name");
		System.out.println(brightBlue+"---------------------------------------------"+reset);
		System.out.println(" 1.Hair Oils");
		System.out.println(" 2.Shampoos");
		System.out.println(" 3.Conditioners");
		System.out.println(" 4.Gels & Serums");
		System.out.println(" 5.Hair Creams & Packs");
		System.out.println(bold+brightBlue+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse..");
			int id=sc.nextInt();
			if(id==0)
			{
				selection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				if(id==1)
				{
					Oils();
					break;
				}
				else if(id==2)
				{
					Shampoos();
					break;
				}
				else if(id==3)
				{
					Conditioners();
					break;
				}
				else if(id==4)
				{
					Gels();
					break;
				}
				else if(id==5)
				{
					Creams();
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
			}
		}
		
	}	
	void ToothPaste()
	{
		boolean b11=true;
		System.out.println(bold+brightBlue+"------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"    Name  "+"                                                 Cost");
		System.out.println(brightBlue+"------------------------------------------------------------------"+reset);
		System.out.println(" 1.Sensodyne Sensitivity & Gum Toothpaste, 70 gm         ------194");
		System.out.println(" 2.Colgate Sensitive Plus Anticavity Toothpaste, 70 gm   -------94");
		System.out.println(" 3.Apollo Pharmacy Ayurvedic Toothpaste, 100 gm          -------60");
		System.out.println(" 4.Vantej Toothpaste, 50 gm                              ------214");
		System.out.println(" 5.Colgate MaxFresh Red Toothpaste, 150 gm               ------240");
		System.out.println(bold+brightBlue+"------------------------------------------------------------------"+reset);
		String c[]={"Sensodyne Sensitivity & Gum Toothpaste, 70 gm","Colgate Sensitive Plus Anticavity Toothpaste, 70 gm","Apollo Pharmacy Ayurvedic Toothpaste, 100 gm","Vantej Toothpaste, 50 gm","Colgate MaxFresh Red Toothpaste, 150 gm"};
		int d[]={194,94,60,214,240};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				OralSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				ToothPaste();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void ToothBrush()
	{
		boolean b11=true;
		System.out.println(bold+brightBlue+"--------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"   Name  "+"                                              Cost");
		System.out.println(brightBlue+"--------------------------------------------------------------"+reset);
		System.out.println(" 1.Oral-B Kids Chhota Bheem Toothbrush, 3 count       ------60");
		System.out.println(" 2.Sensodyne Sensitive Soft Toothbrush, 4 count       -----160");
		System.out.println(" 3.Colgate Gentle Sensitive Teeth Toothbrush          -----135");
		System.out.println(" 4.Apollo Pharmacy Popular Toothbrush, 1 count        ------22");
		System.out.println(" 5.Senolin Orthodontic Toothbrush, 1 count            ------95");
		System.out.println(bold+brightBlue+"--------------------------------------------------------------"+reset);
		String c[]={"Oral-B Kids Chhota Bheem Toothbrush, 3 count","Sensodyne Sensitive Soft Toothbrush, 4 count","Colgate Gentle Sensitive Teeth Toothbrush","Apollo Pharmacy Popular Toothbrush, 1 count","Senolin Orthodontic Toothbrush, 1 count"};
		int d[]={60,160,135,22,95};
		while(true)
		{
			System.out.println(bold+"Select : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				OralSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				ToothBrush();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
			
	}
	void MouthWash()
	{
		boolean b11=true;
		System.out.println(bold+brightBlue+"------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"  Name  "+"                                       Cost");
		System.out.println(brightBlue+"------------------------------------------------------"+reset);
		System.out.println(" 1.Listerine Cool Mint Mouthwash, 80 ml        -----60");
		System.out.println(" 2.Colgate Plax Freshmint Mouthwash, 250 ml    ----115");
		System.out.println(" 3.Himalaya Hiora-K Mouthwash, 150 ml          ----110");
		System.out.println(" 4.Proflo Anticavity Mouth Rinse, 180 ml       ----130");
		System.out.println(" 5.Kidident Mouthwash, 100 ml                  ----125");
		System.out.println(bold+brightBlue+"------------------------------------------------------"+reset);
		String c[]={"Listerine Cool Mint Mouthwash, 80 ml","Colgate Plax Freshmint Mouthwash, 250 ml","Himalaya Hiora-K Mouthwash, 150 ml","Proflo Anticavity Mouth Rinse, 180 ml","Kidident Mouthwash, 100 ml"};
		int d[]={60,115,110,130,125};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				OralSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				MouthWash();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void MouthFreshners()
	{
		boolean b11=true;
		System.out.println(bold+brightBlue+"-------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"  Name  "+"                                                    Cost");
		System.out.println(brightBlue+"-------------------------------------------------------------------"+reset);
		System.out.println(" 1.Colgate Vedshakti Mouth Protect Spray, 10 gm            ------99");
		System.out.println(" 2.Spraymint Mint 15 gm                                    -----594");
		System.out.println(" 3.Spraymintt Orange Flavour Mouth Freshner, 15 gm         ------99");
		System.out.println(" 4.Midascare Icymint Spraymintt Mouth Freshner, 50 gm      ------89");
		System.out.println(" 5.Virosaktee S/F Mouth Spray 30 ML                        -----200");
		System.out.println(bold+brightBlue+"-------------------------------------------------------------------"+reset);
		String c[]={"Colgate Vedshakti Mouth Protect Spray, 10 gm","Spraymint Mint 15 gm","Spraymintt Orange Flavour Mouth Freshner, 15 gm","Midascare Icymint Spraymintt Mouth Freshner, 50 gm","Virosaktee S/F Mouth Spray 30 ML"};
		int d[]={99,594,99,89,200};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				OralSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				MouthFreshners();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void MouthRelief()
	{
		boolean b11=true;
		System.out.println(bold+brightBlue+"---------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"  Name  "+"                                    Cost");
		System.out.println(brightBlue+"---------------------------------------------------"+reset);
		System.out.println(" 1.Colgate Pain Out Dental Gel, 10 gm       -----75");
		System.out.println(" 2.Quik Kool Mouth Ulcer Gel, 10 gm         -----90");
		System.out.println(" 3.Thermoseal Floss, 1 Count                ----135");
		System.out.println(" 4.Colgate Total Waxed Dental Floss, 25 m   ----175");
		System.out.println(" 5.Himalaya Hiora-GA Gel, 15 ml             -----85");
		System.out.println(bold+brightBlue+"---------------------------------------------------"+reset);
		String c[]={"Colgate Pain Out Dental Gel, 10 gm","Quik Kool Mouth Ulcer Gel, 10 gm","Thermoseal Floss, 1 Count","Colgate Total Waxed Dental Floss, 25 m","Himalaya Hiora-GA Gel, 15 ml"};
		int d[]={75,90,135,175,85};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				OralSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				MouthRelief();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void OralSelection()
	{
		System.out.println(bold+brightMagenta+"---------------------------------------------"+reset);
		System.out.println(bold+" Id "+" Name ");
		System.out.println(brightMagenta+"---------------------------------------------"+reset);
		System.out.println(" 1.Toothpaste");
		System.out.println(" 2.Tooth Brush & Tongue Cleaner");
		System.out.println(" 3.Mouth Wash");
		System.out.println(" 4.Mouth Freshners");
		System.out.println(" 5.Mouth & Teeth Relief");
		System.out.println(bold+brightMagenta+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse..");
			int id=sc.nextInt();
			if(id==0)
			{
				selection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				if(id==1)
				{
					ToothPaste();
					break;
				}
				else if(id==2)
				{
					ToothBrush();
					break;
				}
				else if(id==3)
				{
					MouthWash();
					break;
				}
				else if(id==4)
				{
					MouthFreshners();
					break;
				}
				else if(id==5)
				{
					MouthRelief();
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
			}
		}
		
	}	
	void Razors()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"-------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"    Name  "+"                                            Cost");
		System.out.println(brightYellow+"-------------------------------------------------------------"+reset);
		System.out.println(" 1.Gillette Guard Razor With 2 Cartridges, 1 Kit     ------85");
		System.out.println(" 2.Dorco Eve Fit 3 Razor, 3 Count                    ------90");
		System.out.println(" 3.Philips Aqua Touch Wet & Dry Electric Shaver      ----2695");
		System.out.println(" 4.Gillette Vector 3 Razor, 1 Count                  -----130");
		System.out.println(" 5.Gillette Fusion 5 Power Razor, 1 Count            -----549");
		System.out.println(bold+brightYellow+"-------------------------------------------------------------"+reset);
		String c[]={"Gillette Guard Razor With 2 Cartridges, 1 Kit","Dorco Eve Fit 3 Razor, 3 Count","Philips Aqua Touch Wet & Dry Electric Shaver","Gillette Vector 3 Razor, 1 Count","Gillette Fusion 5 Power Razor, 1 Count"};
		int d[]={85,90,2695,130,549};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				MensSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Razors();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void Shaving()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"---------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"   Name  "+"                                         Cost");
		System.out.println(brightYellow+"---------------------------------------------------------"+reset);
		System.out.println(" 1.Dettol Fresh Lather Shaving Cream, 70 gm      ------93");
		System.out.println(" 2.Gillette Lime Shaving Cream, 70 gm            ------75");
		System.out.println(" 3.Axe Signature Denim Shaving Cream, 78 gm      ------89");
		System.out.println(" 4.Apollo Pharmacy After Shave Balm, 100 ml      -----180");
		System.out.println(" 5.Park Avenue Classic Shaving Cream 70G         -----100");
		System.out.println(bold+brightYellow+"---------------------------------------------------------"+reset);
		String c[]={"Dettol Fresh Lather Shaving Cream, 70 gm","Gillette Lime Shaving Cream, 70 gm","Axe Signature Denim Shaving Cream, 78 gm","Apollo Pharmacy After Shave Balm, 100 ml","Park Avenue Classic Shaving Cream 70G"};
		int d[]={93,75,89,180,100};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				MensSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Shaving();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
			
	}
	void Cartridges()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"--------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"      Name  "+"                                     Cost");
		System.out.println(brightYellow+"--------------------------------------------------------"+reset);
		System.out.println(" 1.Gillette Mach 3 Cartridge, 2 Count            ----299");
		System.out.println(" 2.Dorco Eve 6 Cartridges, 2 Count               ----300");
		System.out.println(" 3.Gillette Fusion 5 Power Cartridge, 4 Count    ---1199");
		System.out.println(" 4.Dorco Pace 4 Pro Cartridges, 2 Count          ----240");
		System.out.println(" 5.Gillette Vector Cartridge, 2 Count            -----75");
		System.out.println(bold+brightYellow+"--------------------------------------------------------"+reset);
		String c[]={"Gillette Mach 3 Cartridge, 2 Count","Dorco Eve 6 Cartridges, 2 Count","Gillette Fusion 5 Power Cartridge, 4 Count","Dorco Pace 4 Pro Cartridges, 2 Count","Gillette Vector Cartridge, 2 Count"};
		int d[]={299,300,1199,240,75};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				MensSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				Cartridges();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void ShaveLotion()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"--------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name  "+"                                                Cost");
		System.out.println(brightYellow+"--------------------------------------------------------------------"+reset);
		System.out.println(" 1.Old Spice Original After Shave Lotion, 50 ml            ------130");
		System.out.println(" 2.Axe Signature Denim After Shave Lotion, 100 ml          ------249");
		System.out.println(" 3.Gillette Series Moisturising Pre Shave Gel, 60 gm       -------99");
		System.out.println(" 4.Nivea Men Fresh Face Moisturiser Non-Sticky Gel, 75 gm  ------190");
		System.out.println(" 5.Matzo Messy Look Matte Wax, 100 gm                      ------349");
		System.out.println(bold+brightYellow+"--------------------------------------------------------------------"+reset);
		String c[]={"Old Spice Original After Shave Lotion, 50 ml","Axe Signature Denim After Shave Lotion, 100 ml","Nivea Men Fresh Face Moisturiser Non-Sticky Gel, 75 gm","Matzo Messy Look Matte Wax, 100 gm"};
		int d[]={130,249,99,190,349};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				MensSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				ShaveLotion();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void MensSelection()
	{
		System.out.println(bold+brightGreen+"---------------------------------------------"+reset);
		System.out.println(bold+" Id "+"    Name ");
		System.out.println(brightGreen+"---------------------------------------------"+reset);
		System.out.println(" 1.Razors & Shaving Brush");
		System.out.println(" 2.Shaving Creams & Foams");
		System.out.println(" 3.Catridges");
		System.out.println(" 4.Gels & After Shave Lotions");
		System.out.println(bold+brightGreen+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse..");
			int id=sc.nextInt();
			if(id==0)
			{
				selection();
				break;
			}
			else if(id>=1 && id<=4)
			{
				if(id==1)
				{
					Razors();
					break;
				}
				else if(id==2)
				{
					Shaving();
					break;
				}
				else if(id==3)
				{
					Cartridges();
					break;
				}
				else if(id==4)
				{
					ShaveLotion();
					break;
				}
				
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
			}
		}
		
	}	
	void FragSelection()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"--------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"          Name  "+"                                                               Cost");
		System.out.println(brightMagenta+"--------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Nivea Fresh Natural Deodorant Spray, 150 ml                               ------142");
		System.out.println(" 2.Fogg Fresh Fougere Fragrance Body Spray, 120 ml                           ------275");
		System.out.println(" 3.Axe Signature Mysterious No Gas Body Deodorant for Men, 154 ml            ------310");
		System.out.println(" 4.Kamasutra Spark Deodorant Body Spray For Men, 220 ml                      ------185");
		System.out.println(" 5.Nivea Natural Glow Roll On Deodorant for Women, 50 ml                     ------199");
		System.out.println(" 6.Engage On Cool Marine Pocket Perfume for Men, 18 ml                       -------70");
		System.out.println(" 7.Kamasutra Urge Men Deodorant Spray, 150 ml                                ------200");
		System.out.println(" 8.Engage Nudge Deodorant Body Spray For Men, 220 ml                         ------160");
		System.out.println(" 9.Set Wet Charm Avatar Deodorant Body Spray, 150 ml                         ------125");
		System.out.println(" 10.Nivea Men Fresh Active Roll On Deodorant, 50 ml                          ------172");
		System.out.println(" 11.Beardo Maverick Long Lasting Perfume Deo Spray, 150 ml                   ------349");
		System.out.println(" 12.Axe Dark Temptation Long Lasting Bodyspray Deodorant for Men, 150 ml     ------245");
		System.out.println(" 13.Engage Tickle Deodorant Body Spray for Men, 220 ml                       ------160");
		System.out.println(" 14.Premium Eau De Cologne, 100 ml                                           ------150");
		System.out.println(" 15.Nivea Pearl & Beauty Roll On Deodorant, 25 ml                            ------115");
		System.out.println(" 16.Nivea Pearl & Beauty Deodorant Spray, 150 ml                             ------285");
		System.out.println(bold+brightMagenta+"--------------------------------------------------------------------------------------"+reset);
		String c[]={"Nivea Fresh Natural Deodorant Spray, 150 ml","Fogg Fresh Fougere Fragrance Body Spray, 120 ml","Axe Signature Mysterious No Gas Body Deodorant for Men, 154 ml","Kamasutra Spark Deodorant Body Spray For Men, 220 ml","Nivea Natural Glow Roll On Deodorant for Women, 50 ml","Engage On Cool Marine Pocket Perfume for Men, 18 ml","Kamasutra Urge Men Deodorant Spray, 150 ml","Engage Nudge Deodorant Body Spray For Men, 220 ml","Set Wet Charm Avatar Deodorant Body Spray, 150 ml","Nivea Men Fresh Active Roll On Deodorant, 50 ml","Beardo Maverick Long Lasting Perfume Deo Spray, 150 ml","Axe Dark Temptation Long Lasting Bodyspray Deodorant for Men, 150 ml","Engage Tickle Deodorant Body Spray for Men, 220 ml","Premium Eau De Cologne, 100 ml","Nivea Pearl & Beauty Roll On Deodorant, 25 ml","Nivea Pearl & Beauty Deodorant Spray, 150 ml"};
		int d[]={142,275,310,185,199,70,200,160,125,172,349,245,160,150,115,285};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				selection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=16)
			{
				System.out.println(bold+"Enter Quantity"+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==6)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==7)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==8)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==9)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==10)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==11)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==12)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==13)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==14)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==15)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==16)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				FragSelection();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}

	void selection()
	{
		System.out.println(bold+brightYellow+"---------------------------------------------"+reset);
		System.out.println(bold+" Id"+"   Name");
		System.out.println(brightYellow+"---------------------------------------------"+reset);
		System.out.println(" 1.Skin Care");
		System.out.println(" 2.Hair Care");
		System.out.println(" 3.Oral Care");
		System.out.println(" 4.Mens Grooming");
		System.out.println(" 5.Fragrances");
		System.out.println(bold+brightYellow+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse");
			int id=sc.nextInt();
			if(id==0)
			{
				new Home().Explore();
				break;
			}
			else if(id>=1 && id<=5)
			{
				if(id==1)
				{
					SkinSelection();
					break;
				}
				else if(id==2)
				{
					HairSelection();
					break;
				}
				else if(id==3)
				{
					OralSelection();
					break;
				}
				else if(id==4)
				{
					MensSelection();
					break;
				}
				else if(id==5)
				{
					FragSelection();
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
				
			}
		}
		
	}
}
//-----------------------------------------------Nutritional-------------------------------------------
class NutriDrinks extends Cart
{
	void AdultNutrition()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"-----------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"          Name  "+"                                                                        Cost");
		System.out.println(brightYellow+"-----------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Horlicks Diabetes Plus Vanilla Flavour Nutrition Powder, 400 gm                   -------710");
		System.out.println(" 2.Ensure Complete, Balanced Nutrition Vanilla Flavour Powder for Adults, 400 gm     -------800");
		System.out.println(" 3.Ensure Complete, Balanced Nutrition Vanilla Flavour Powder for Adults, 1 kg       ------1505");
		System.out.println(" 4.Ensure Diabetes Care Vanilla Delight Flavour Powder for Adults, 1 kg (2x500 gm)   ----1920.1");
		System.out.println(" 5.Protinex Diabetes Care Creamy Vanilla Flavour Nutrition Powder for Indian         -----644.2");
		System.out.println(brightYellow+"-----------------------------------------------------------------------------------------------"+reset);
		String c[]={"Horlicks Diabetes Plus Vanilla Flavour Nutrition Powder, 400 gm","Ensure Complete, Balanced Nutrition Vanilla Flavour Powder for Adults, 400 gm","Ensure Complete, Balanced Nutrition Vanilla Flavour Powder for Adults, 1 kg","Ensure Diabetes Care Vanilla Delight Flavour Powder for Adults, 1 kg (2x500 gm)","Protinex Diabetes Care Creamy Vanilla Flavour Nutrition Powder for Indian"};
		double d[]={710,800,1505,1920.1,644.2};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				NutriSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				AdultNutrition();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void KidsNutrition()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"----------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"         Name  "+"                                                                        Cost");
		System.out.println(brightYellow+"----------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Horlicks Classic Malt Flavour Nutrition Powder, 500 gm Jar                        ------264");
		System.out.println(" 2.Nestle Nangrow Creamy Vanilla Flavour Nutrition Powder, 400 gm Refill Pack        ------610");
		System.out.println(" 3.Pediasure Vanilla Flavour Nutrition Powder for Kids Growth, 1 kg                  ---1514.9");
		System.out.println(" 4.Horlicks Classic Malt Flavour Nutrition Powder, 750 gm Refill Pack                ------369");
		System.out.println(" 5.Pediasure Advance+ Vanilla Delight Flavour Nutrition Powder, 400 gm Refill Pack   ------915");
		System.out.println(bold+brightYellow+"----------------------------------------------------------------------------------------------"+reset);
		String c[]={"Horlicks Classic Malt Flavour Nutrition Powder, 500 gm Jar","Nestle Nangrow Creamy Vanilla Flavour Nutrition Powder, 400 gm Refill Pack","Pediasure Vanilla Flavour Nutrition Powder for Kids Growth, 1 kg","Horlicks Classic Malt Flavour Nutrition Powder, 750 gm Refill Pack","Pediasure Advance+ Vanilla Delight Flavour Nutrition Powder, 400 gm Refill Pack"};
		double d[]={264,610,1514.9,369,915};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				NutriSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				KidsNutrition();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
			
	}
	void SpecialtyNutrition()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"----------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name  "+"                                                                          Cost");
		System.out.println(brightYellow+"----------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Horlicks Diabetes Plus Vanilla Flavour Nutrition Powder, 400 gm                   ------710");
		System.out.println(" 2.Apollo Pharmacy Diabetic Vanilla Flavour Protein Powder, 400 gm                   ------595");
		System.out.println(" 3.Ensure Diabetes Care Vanilla Delight Flavour Powder for Adults, 1 kg (2x500 gm)   ---1920.1");
		System.out.println(" 4.Ensure Diabetes Care Vanilla Delight Flavour Powder for Adults, 400 gm            ------925");
		System.out.println(" 5.Protinex Diabetes Care Creamy Vanilla Flavour Nutrition Powder for Indian         ----644.2");
		System.out.println(bold+brightYellow+"----------------------------------------------------------------------------------------------"+reset);
		String c[]={"Horlicks Diabetes Plus Vanilla Flavour Nutrition Powder, 400 gm","Apollo Pharmacy Diabetic Vanilla Flavour Protein Powder, 400 gm","Ensure Diabetes Care Vanilla Delight Flavour Powder for Adults, 1 kg (2x500 gm)","Ensure Diabetes Care Vanilla Delight Flavour Powder for Adults, 400 gm","Protinex Diabetes Care Creamy Vanilla Flavour Nutrition Powder for Indian"};
		double d[]={710,595,1920.1,925,644.2};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				NutriSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				SpecialtyNutrition();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			
			}
		}
		
		
	}
	void RehydrationDrinks()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"---------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"         Name  "+"                                                           Cost");
		System.out.println(brightYellow+"---------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Prolyte Apple Flavour Energy Drink, 200 ml                          --------35");
		System.out.println(" 2.Prolyte ORS Lemon Flavour Energy Drink, 200 ml                      ------31.5");
		System.out.println(" 3.Prolyte Orange Flavour Energy Drink, 200 ml                         --------35");
		System.out.println(" 4.ORS Orange Flavour Powder, 21 gm                                    --------25");
		System.out.println(" 5.Prolyte ORS Mixed Fruit Flavour Energy Drink, 200 ml                ------31.5");
		System.out.println(bold+brightYellow+"---------------------------------------------------------------------------------"+reset);
		String c[]={"Prolyte Apple Flavour Energy Drink, 200 ml","Prolyte ORS Lemon Flavour Energy Drink, 200 ml","Prolyte Orange Flavour Energy Drink, 200 ml","ORS Orange Flavour Powder, 21 gm ","Prolyte ORS Mixed Fruit Flavour Energy Drink, 200 ml"};
		double d[]={35,31.5,35,25,31.5};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				NutriSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				RehydrationDrinks();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
		
		
	}
	void GreenTea()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"---------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"         Name  "+"                                                     Cost");
		System.out.println(brightYellow+"---------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Apollo Life Lemon Green Tea Infusion Bags, 25 Count             -----108");
		System.out.println(" 2.Apollo Life Pure Natural Green Tea Bags, 25 Count               ------90");
		System.out.println(" 3.Lipton Honey Lemon Green Tea Bags, 25 Count                     -----170");
		System.out.println(" 4.Apollo Life Tulsi Green Tea Infusion Bags, 25 Count             -----170");
		System.out.println(" 5.Lipton Pure & Light Green Tea Bags, 25 Count                    -----170");
		System.out.println(bold+brightYellow+"---------------------------------------------------------------------------"+reset);
		String c[]={"Apollo Life Lemon Green Tea Infusion Bags, 25 Count","Apollo Life Pure Natural Green Tea Bags, 25 Count","Lipton Honey Lemon Green Tea Bags, 25 Count","Apollo Life Tulsi Green Tea Infusion Bags, 25 Count","Lipton Pure & Light Green Tea Bags, 25 Count"};
		int d[]={108,90,170,170,170};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				NutriSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				GreenTea();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
		
		
	}
	void NutriSelection()
	{
		System.out.println(bold+brightMagenta+"---------------------------------------------"+reset);
		System.out.println(bold+" Id "+"  Name ");
		System.out.println(brightMagenta+"---------------------------------------------"+reset);
		System.out.println(" 1.Adult Nutrition");
		System.out.println(" 2.Kids Nutrition");
		System.out.println(" 3.Specialty Nutrition");
		System.out.println(" 4.Rehydration Drinks");
		System.out.println(" 5.Green Tea");
		System.out.println(bold+brightMagenta+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse..");
			int id=sc.nextInt();
			if(id==0)
			{
				NutritionalSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				if(id==1)
				{
					AdultNutrition();
					break;
				}
				else if(id==2)
				{
					KidsNutrition();
					break;
				}
				else if(id==3)
				{
					SpecialtyNutrition();
					break;
				}
				else if(id==4)
				{
					RehydrationDrinks();
					break;
				}
				else if(id==5)
				{
					GreenTea();
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
			}
		}
		
	}	

	void ProteinPowders()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"----------------------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"         Name  "+"                                                                                    Cost");
		System.out.println(brightMagenta+"----------------------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Optimum Nutrition (ON) Gold Standard 100% Whey Protein Double Rich Chocolate 0.5 lb       -------2885.3");
		System.out.println(" 2.Optimum Nutrition (ON) Gold Standard 100% Whey Protein Double Rich Chocolate 2 lb         -------6479.2");
		System.out.println(" 3.Optimum Nutrition (ON) Gold Standard 100% Whey Protein Double Rich Chocolate 1 lb         -------1639.2");
		System.out.println(" 4.Optimum Nutrition (ON) Gold Standard 100% Whey Protein Vanilla Ice Cream Flavour          -------1639.2");
		System.out.println(" 5.Apollo Life Whey Protein Chocolate Flavour Powder, 1 Kg                                   -------1999.5");
		System.out.println(bold+brightMagenta+"----------------------------------------------------------------------------------------------------------"+reset);
		String c[]={"Optimum Nutrition (ON) Gold Standard 100% Whey Protein Double Rich Chocolate 0.5 lb","Optimum Nutrition (ON) Gold Standard 100% Whey Protein Double Rich Chocolate 2 lb","Optimum Nutrition (ON) Gold Standard 100% Whey Protein Double Rich Chocolate 1 lb","Optimum Nutrition (ON) Gold Standard 100% Whey Protein Vanilla Ice Cream Flavour","Apollo Life Whey Protein Chocolate Flavour Powder, 1 Kg"};
		double d[]={2885.3,6479.2,1639.2,1639.2,1999.5};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				SportSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				ProteinPowders();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
		
		
	}
	void WheyProtein()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"------------------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"           Name  "+"                                                                              Cost");
		System.out.println(brightMagenta+"------------------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Optimum Nutrition (ON) Gold Standard 100% Whey Protein Double Rich Chocolate 5 lb     -------6479.2");
		System.out.println(" 2.GNC AMP Pure Isolate Whey Protein Chocolate Frosting Flavour Powder, 1.81 kg          -------7199.4");
		System.out.println(" 3.Isopure Low Carb 100% Whey Protein Isolate Dutch Chocolate Flavour Powder             -------4334.2");
		System.out.println(" 4.QNT Metapure Zero Carb 100% Pure Whey Isolate Belgian Chocolate Flavour               -------7699.3");
		System.out.println(" 5.Muscletech Nitrotech Ripped Low Fat Whey Protein Chocolate Fudge Brownie              -------6599.3");
		System.out.println(bold+brightMagenta+"------------------------------------------------------------------------------------------------------"+reset);
		String c[]={"Optimum Nutrition (ON) Gold Standard 100% Whey Protein Double Rich Chocolate 5 lb","GNC AMP Pure Isolate Whey Protein Chocolate Frosting Flavour Powder, 1.81 kg","Isopure Low Carb 100% Whey Protein Isolate Dutch Chocolate Flavour Powder","QNT Metapure Zero Carb 100% Pure Whey Isolate Belgian Chocolate Flavour","Muscletech Nitrotech Ripped Low Fat Whey Protein Chocolate Fudge Brownie"};
		double d[]={6479.2,7199.4,4334.2,7699.3,6599.3};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				SportSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				WheyProtein();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
			
	}
	void PeanutButter()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"--------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name  "+"                                                                  Cost");
		System.out.println(brightMagenta+"--------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Pintola All Natural Crunchy Peanut Butter, 1 kg                        -------404.1");
		System.out.println(" 2.Pintola High Protein Dark Chocolate Crunchy Peanut Butter, 510 gm      -------359.1");
		System.out.println(" 3.Pintola All Natural Creamy Peanut Butter, 1 kg                         -------404.1");
		System.out.println(" 4.Myfitness Chocolate Peanut Butter Smooth, 1.25 kg                      ---------549");
		System.out.println(" 5.Fitspire Peanut Butter Choco Cookie Crunch, 340 gm                     ---------399");
		System.out.println(bold+brightMagenta+"--------------------------------------------------------------------------------------"+reset);
		String c[]={"Pintola All Natural Crunchy Peanut Butter, 1 kg","Pintola High Protein Dark Chocolate Crunchy Peanut Butter, 510 gm","Pintola All Natural Creamy Peanut Butter, 1 kg","Myfitness Chocolate Peanut Butter Smooth, 1.25 kg","Fitspire Peanut Butter Choco Cookie Crunch, 340 gm"};
		double d[]={404.1,359.1,404.1,549,399};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				SportSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				PeanutButter();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
		
		
	}
	void MuscleMassBuilders()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"----------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"      Name  "+"                                                                           Cost");
		System.out.println(brightMagenta+"----------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Endura Mass Vanilla Flavour Powder, 500 gm                                      ------562.5");
		System.out.println(" 2.Healthvit Fitness Tribulus Terrestris 1000 mg Maximum Strength 40% Saponins     --------800");
		System.out.println(" 3.Himalayan Organics ZMA (Zinc, Magnesium Aspartate), 120 Tablets                 -----679.15");
		System.out.println(" 4.Muscletech Platinum 100% Whey Isolate Milk Chocolate Powder, 1.81 kg            -----8999.3");
		System.out.println(" 5.Celevida Maxx Orange Flavour Sachet, 14x33 gm                                   -------2240");
		System.out.println(bold+brightMagenta+"----------------------------------------------------------------------------------------------"+reset);
		String c[]={"Endura Mass Vanilla Flavour Powder, 500 gm","Healthvit Fitness Tribulus Terrestris 1000 mg Maximum Strength 40% Saponins","Himalayan Organics ZMA (Zinc, Magnesium Aspartate), 120 Tablets","Muscletech Platinum 100% Whey Isolate Milk Chocolate Powder, 1.81 kg","Celevida Maxx Orange Flavour Sachet, 14x33 gm"};
		double d[]={562.5,800,679.15,8999.3,2240};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				SportSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				MuscleMassBuilders();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
		
		
	}
	void PreWorkout()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"----------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"          Name  "+"                                                                       Cost");
		System.out.println(brightMagenta+"----------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.MuscleTech Nitrotech Whey Protein Milk Chocolate Flavour Powder, 2 kg          ------5849.3");
		System.out.println(" 2.Muscletech Nitrotech Whey Protein Cookies & Cream Flavour Powder, 2 kg         ------5849.3");
		System.out.println(" 3.QNT Protein Joy Caramel Cookie Dough Flavour Bar, 70 gm                        ---------110");
		System.out.println(" 4.Isopure Less Than 1.5 gm Carbs 100% Whey Protein Isolate Cookies & Cream       ------4345.2");
		System.out.println(" 5.MuscleBlaze Choco Almond Protein Bar, 50 gm                                    ----------75");
		System.out.println(bold+brightMagenta+"----------------------------------------------------------------------------------------------"+reset);
		String c[]={"MuscleTech Nitrotech Whey Protein Milk Chocolate Flavour Powder, 2 kg","Muscletech Nitrotech Whey Protein Cookies & Cream Flavour Powder, 2 kg","QNT Protein Joy Caramel Cookie Dough Flavour Bar, 70 gm","Isopure Less Than 1.5 gm Carbs 100% Whey Protein Isolate Cookies & Cream","MuscleBlaze Choco Almond Protein Bar, 50 gm"};
		double d[]={5849.3,5849.3,110,4345.2,75};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				SportSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				PreWorkout();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
		
		
	}
	void SportSelection()
	{
		System.out.println(bold+brightGreen+"---------------------------------------------"+reset);
		System.out.println(bold+" Id "+" Name ");
		System.out.println(brightGreen+"---------------------------------------------"+reset);
		System.out.println(" 1.Protein Powders");
		System.out.println(" 2.Whey Protein");
		System.out.println(" 3.Peanut Butter");
		System.out.println(" 4.Muscle Mass Builders");
		System.out.println(" 5.Pre-Workout");
		System.out.println(bold+brightGreen+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse..");
			int id=sc.nextInt();
			if(id==0)
			{
				NutritionalSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				if(id==1)
				{
					ProteinPowders();
					break;
				}
				else if(id==2)
				{
					WheyProtein();
					break;
				}
				else if(id==3)
				{
					PeanutButter();
					break;
				}
				else if(id==4)
				{
					MuscleMassBuilders();
					break;
				}
				else if(id==5)
				{
					PreWorkout();
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
			}
		}
		
	}	

	void VitaminC()
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"---------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"          Name  "+"                                                    Cost");
		System.out.println(brightCyan+"---------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Apollo Pharmacy Vitamin C Effervescent, 20 Tablets           --------180");
		System.out.println(" 2.Himalayan Organics Vitamin C 1000 mg, 120 Tablets            ----1168.75");
		System.out.println(" 3.Healthvit C-Vitan Orange Flavour Effervescent, 20 Tablets    --------350");
		System.out.println(" 4.Healthvit C-Vitan-Z Orange Flavour Effervescent, 20 Tablets  --------599");
		System.out.println(" 5.The Vitamin Company Vitamin-C, 60 Capsules                   --------719");
		System.out.println(bold+brightCyan+"---------------------------------------------------------------------------"+reset);
		String c[]={"Apollo Pharmacy Vitamin C Effervescent, 20 Tablets","Himalayan Organics Vitamin C 1000 mg, 120 Tablets","Healthvit C-Vitan Orange Flavour Effervescent, 20 Tablets","Healthvit C-Vitan-Z Orange Flavour Effervescent, 20 Tablets","The Vitamin Company Vitamin-C, 60 Capsules"};
		double d[]={180,1168.75,350,599,719};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				VitaminSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				VitaminC();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
		
		
	}
	void VitaminD()
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"---------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"   Name  "+"                                                           Cost");
		System.out.println(brightCyan+"---------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Ultra D3 Drops 15 ml                                           -------60");
		System.out.println(" 2.Ultra D3 Nano Oral Drop 15 ml                                  -------38");
		System.out.println(" 3.Ultra D3 Forte Tablet 30's                                     ------135");
		System.out.println(" 4.Diabetone D3 Tablet 15's                                       -------22");
		System.out.println(" 5.Himalayan Organics Vitamin D3 2000IU + Vitamin K2, 60 Tablets  -------95");
		System.out.println(bold+brightCyan+"---------------------------------------------------------------------------"+reset);
		String c[]={"Ultra D3 Drops 15 ml","Ultra D3 Nano Oral Drop 15 ml","CUltra D3 Forte Tablet 30's","Diabetone D3 Tablet 15's","Himalayan Organics Vitamin D3 2000IU + Vitamin K2, 60 Tablets"};
		int d[]={60,38,135,22,95};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				VitaminSelection();
				b11=false;
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				VitaminD();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
			
	}
	void VitaminB()
	{
		System.out.println(bold+brightCyan+"-----------------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"        Name  "+"                                                                                Cost");
		System.out.println(brightCyan+"-----------------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Apollo Life Vitamin B-12, 30 Tablets                                                  ---------135");
		System.out.println(" 2.Wellbeing Nutrition Melts Into Vegan Vitamin B12 + Folate Orange Mint Flavour         -------551.7");
		System.out.println(" 3.PureFoods B-Complex, 60 Capsules                                                      ---------110");
		System.out.println(" 4.Himalayan Organics Plant Based Vitamin B3 14mg, 120 Capsules                          ---------130");
		System.out.println(" 5.Himalayan Organics Vitamin B Complex for Energy & Cognitive Health, 120 Tablets       ------891.65");
		System.out.println(bold+brightCyan+"-----------------------------------------------------------------------------------------------------"+reset);
		String c[]={"Apollo Life Vitamin B-12, 30 Tablets","Wellbeing Nutrition Melts Into Vegan Vitamin B12 + Folate Orange Mint Flavour","PureFoods B-Complex, 60 Capsules","Himalayan Organics Plant Based Vitamin B3 14mg, 120 Capsules","Himalayan Organics Vitamin B Complex for Energy & Cognitive Health, 120 Tablets"};
		double d[]={135,551.7,110,130,891.65};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				VitaminSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
		String c1=sc.next();
		if(c1.equals("1"))
		{
			VitaminB();
		}
		else if(c1.equals("2"))
		{
			showCart();
		}
		else
		{
			new Home().HomeSelection();
			
		}
		
		
	}
	void VitaminA()
	{
		System.out.println(bold+brightCyan+"-------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"           Name  "+"                                                                   Cost");
		System.out.println(brightCyan+"-------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Vitamin A Chewable Tablet 10's                                                ---------7");
		System.out.println(" 2.Power Gummies Junior Multivitamins & Immunity Booster Health Supplement       -----174.5");
		System.out.println(" 3.Himalayan Organics Plant Based Vitamin A 840mcg, 120 Capsules                 ----679.15");
		System.out.println(" 4.Power Gummies Junior Multivitamins & Immunity Booster Health Supplement       --------89");
		System.out.println(" 5.HealthKart HK Vitals Multivitamin and Fish Oil 1000mg Combo                   -----698.6");
		System.out.println(bold+brightCyan+"-------------------------------------------------------------------------------------------"+reset);
		String c[]={"Vitamin A Chewable Tablet 10's","Power Gummies Junior Multivitamins & Immunity Booster Health Supplement","Himalayan Organics Plant Based Vitamin A 840mcg, 120 Capsules","Power Gummies Junior Multivitamins & Immunity Booster Health Supplement","HealthKart HK Vitals Multivitamin and Fish Oil 1000mg Combo"};
		double d[]={7,174.5,679.15,89,698.6};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				VitaminSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
		String c1=sc.next();
		if(c1.equals("1"))
		{
			VitaminA();
		}
		else if(c1.equals("2"))
		{
			showCart();
		}
		else
		{
			new Home().HomeSelection();
			
		}
		
		
	}
	void VitaminE()
	{
		System.out.println(bold+brightCyan+"-------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"         Name  "+"                                                                     Cost");
		System.out.println(brightCyan+"-------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Ourdaily Vitamin E 400 mg, 10 Soft Gelatin Capsules                              --836.1");
		System.out.println(" 2.OZiva Hair Vitamins with Biotin, Vitamin E & Iron for Hair Re-growth & Hairfall  -----90");
		System.out.println(" 3.Nutraswiss Folic Acid Plus Chewable Tablets, 60 Capsules                         ----135");
		System.out.println(" 4.Himalayan Organics Plant Based Iron Supplement with Folate, 60 Capsules          ----175");
		System.out.println(" 5.Himalayan Organics Plant Based Vitamin E, 60 Capsules                            -----85");
		System.out.println(bold+brightCyan+"-------------------------------------------------------------------------------------------"+reset);
		String c[]={"Ourdaily Vitamin E 400 mg, 10 Soft Gelatin Capsules","OZiva Hair Vitamins with Biotin, Vitamin E & Iron for Hair Re-growth & Hairfall","Nutraswiss Folic Acid Plus Chewable Tablets, 60 Capsules","Himalayan Organics Plant Based Iron Supplement with Folate, 60 Capsules","Himalayan Organics Plant Based Vitamin E, 60 Capsules"};
		double d[]={836.1,90,135,175,85};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				VitaminSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
		String c1=sc.next();
		if(c1.equals("1"))
		{
			VitaminE();
		}
		else if(c1.equals("2"))
		{
			showCart();
		}
		else
		{
			new Home().HomeSelection();
			
		}
		
		
	}
	void VitaminSelection()
	{
		System.out.println(bold+brightBlue+"---------------------------------------------"+reset);
		System.out.println(bold+" Id "+" Name ");
		System.out.println(brightBlue+"---------------------------------------------"+reset);
		System.out.println(" 1.Vitamin-C");
		System.out.println(" 2.Vitamin-D");
		System.out.println(" 3.Vitamin-B");
		System.out.println(" 4.Vitamin-A");
		System.out.println(" 5.Vitamin-E");
		System.out.println(bold+brightBlue+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse..");
			int id=sc.nextInt();
			if(id==0)
			{
				NutritionalSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				if(id==1)
				{
					VitaminC();
					break;
				}
				else if(id==2)
				{
					VitaminD();
					break;
				}
				else if(id==3)
				{
					VitaminB();
					break;
				}
				else if(id==4)
				{
					VitaminA();
					break;
				}
				else if(id==5)
				{
					VitaminE();
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
			}
		}
		
	}
	
	void Calcium()
	{
		System.out.println(bold+brightGreen+"-------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"         Name  "+"                                                                     Cost");
		System.out.println(brightGreen+"-------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Active Women Daily Calcium Sugar Free Lemon Flavour Efferevescent Tablet 20's  -------85");
		System.out.println(" 2.Calcimax-P Suspension 200 ml                                                   -------90");
		System.out.println(" 3.Calcimax-P Suspension 1600 ml                                                   -----595");
		System.out.println(" 4.Ostocalcium B12 Banana Flavour Suspension, 200 ml                              ------130");
		System.out.println(" 5.Ultra-Ca Plus Tablet 30's                                                      ------549");
		System.out.println(bold+brightGreen+"-------------------------------------------------------------------------------------------"+reset);
		String c[]={"Active Women Daily Calcium Sugar Free Lemon Flavour Efferevescent Tablet 20's","Calcimax-P Suspension 200 ml","Calcimax-P Suspension 1600 ml","Ostocalcium B12 Banana Flavour Suspension, 200 ml","Ultra-Ca Plus Tablet 30's"};
		int d[]={85,90,595,130,549};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				MineralSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
		String c1=sc.next();
		if(c1.equals("1"))
		{
			Calcium();
		}
		else if(c1.equals("2"))
		{
			showCart();
		}
		else
		{
			new Home().HomeSelection();
			
		}
		
		
	}
	void Iron()
	{
		System.out.println(bold+brightGreen+"-----------------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"             Name  "+"                                                                           Cost");
		System.out.println(brightGreen+"-----------------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Pure Nutrition Iron with Folic Acid 350 mg, 60 Tablets                                  --------93");
		System.out.println(" 2.Himalayan Organics Plant Based Iron Supplement with Folate, 60 Capsules                 --------75");
		System.out.println(" 3.Himalayan Organics Plant Based Iron Supplement with Folate, 90 Capsules                 ----636.65");
		System.out.println(" 4.Wellbeing Nutrition Melts Into Nano Iron Exotic Elderberry Flavour, 30 Oral Strips      -------180");
		System.out.println(" 5.Super Gummy Iron+ Vitamins Gummies, 102 gm                                              -------100");
		System.out.println(bold+brightGreen+"-----------------------------------------------------------------------------------------------------"+reset);
		String c[]={"Pure Nutrition Iron with Folic Acid 350 mg, 60 Tablets","Himalayan Organics Plant Based Iron Supplement with Folate, 60 Capsules","Himalayan Organics Plant Based Iron Supplement with Folate, 90 Capsules","Wellbeing Nutrition Melts Into Nano Iron Exotic Elderberry Flavour, 30 Oral Strips","Super Gummy Iron+ Vitamins Gummies, 102 gm"};
		double d[]={93,75,636.65,180,100};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				MineralSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
		String c1=sc.next();
		if(c1.equals("1"))
		{
			Iron();
		}
		else if(c1.equals("2"))
		{
			showCart();
		}
		else
		{
			new Home().HomeSelection();
			
		}
			
	}
	void Magnesium()
	{
		System.out.println(bold+brightGreen+"-------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"         Name  "+"                                                                     Cost");
		System.out.println(brightGreen+"-------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Pure Nutrition Magnesium Glycinate with Zinc 350 mg, 60 Tablets               -----551.7");
		System.out.println(" 2.Himalayan Organics Magnesium Citrtate+Glycinate                               ----636.65");
		System.out.println(" 3.Healthvit Magneed-Z Sugar Free Orange Flavour Effervescent, 20 Tablets        -------400");
		System.out.println(" 4.Neuherbs True Magnesium for Men & Women, 60 Tablets                           -------552");
		System.out.println(" 5.Himalayan Organics Plant Based Magnesium 220mg, 120 Capsules                  ----888.25");
		System.out.println(bold+brightGreen+"-------------------------------------------------------------------------------------------"+reset);
		String c[]={"Pure Nutrition Magnesium Glycinate with Zinc 350 mg, 60 Tablets","Himalayan Organics Magnesium Citrtate+Glycinate","Healthvit Magneed-Z Sugar Free Orange Flavour Effervescent, 20 Tablets","Neuherbs True Magnesium for Men & Women, 60 Tablets","Himalayan Organics Plant Based Magnesium 220mg, 120 Capsules"};
		double d[]={551.7,636.65,400,552,888.25};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				MineralSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
		String c1=sc.next();
		if(c1.equals("1"))
		{
			Magnesium();
		}
		else if(c1.equals("2"))
		{
			showCart();
		}
		else
		{
			new Home().HomeSelection();
			
		}
		
		
	}
	void Zinc()
	{
		System.out.println(bold+brightGreen+"-----------------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"        Name  "+"                                                                          Cost");
		System.out.println(brightGreen+"-----------------------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Pure Nutrition Zinc ZMA, 60 Tablets                                               -----499.5");
		System.out.println(" 2.Zia-20 Tablet 10                                                                  --------30");
		System.out.println(" 3.The Vitamin Company Zinc & Magnesium, 60 Capsules                                 -----959.2");
		System.out.println(" 4.Centrum Kids Immune Fuel Strawberry Flavour with Betaglucan, Vitamin C & Zinc     -------972");
		System.out.println(" 5.Himalayan Organics Zinc with Vitamins C, 120 Tablets                              ----896.75");
		System.out.println(bold+brightGreen+"-----------------------------------------------------------------------------------------------"+reset);
		String c[]={"Pure Nutrition Zinc ZMA, 60 Tablets","Zia-20 Tablet 10","The Vitamin Company Zinc & Magnesium, 60 Capsules","Centrum Kids Immune Fuel Strawberry Flavour with Betaglucan, Vitamin C & Zinc","Himalayan Organics Zinc with Vitamins C, 120 Tablets"};
		double d[]={499.5,30,959.2,972,896.75};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				MineralSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
		String c1=sc.next();
		if(c1.equals("1"))
		{
			Zinc();
		}
		else if(c1.equals("2"))
		{
			showCart();
		}
		else
		{
			new Home().HomeSelection();
			
		}
		
		
	}
	void MineralSelection()
	{
		System.out.println(bold+brightBlue+"---------------------------------------------"+reset);
		System.out.println(bold+" Id "+" Name ");
		System.out.println(brightBlue+"---------------------------------------------"+reset);
		System.out.println(" 1.Calcium");
		System.out.println(" 2.Iron");
		System.out.println(" 3.Magnesium");
		System.out.println(" 4.Zinc");
		System.out.println(bold+brightBlue+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse..");
			int id=sc.nextInt();
			if(id==0)
			{
				NutritionalSelection();
				break;
			}
			else if(id>=1 && id<=4)
			{
				if(id==1)
				{
					Calcium();
					break;
				}
				else if(id==2)
				{
					Iron();
					break;
				}
				else if(id==3)
				{
					Magnesium();
					break;
				}
				else if(id==4)
				{
					Zinc();
					break;
				}
				
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
			}
		}
		
	}
	
	void FishOil()
	{
		System.out.println(bold+brightYellow+"-------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"    Name  "+"                                                              Cost");
		System.out.println(brightYellow+"-------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Apollo Life Omega-3 Fish Oil 1000mg, 30 Capsules                   ------200");
		System.out.println(" 2.Apollo Life Flaxseed Oil Omega 3-6-9 1000 mg, 30 Capsules          ------299");
		System.out.println(" 3.GNC Triple Strength Fish Oil, 60 Capsules                          ---959.40");
		System.out.println(" 4.Apollo Life Roasted Flaxseed Whole Grain, 150 gm                   ------100");
		System.out.println(" 5.Ultra Omega-3 Capsule 10's                                         ---237.60");
		System.out.println(bold+brightYellow+"-------------------------------------------------------------------------------"+reset);
		String c[]={"Pure Nutrition Iron with Folic Acid 350 mg, 60 Tablets","Himalayan Organics Plant Based Iron Supplement with Folate, 60 Capsules","Himalayan Organics Plant Based Iron Supplement with Folate, 90 Capsules","Wellbeing Nutrition Melts Into Nano Iron Exotic Elderberry Flavour, 30 Oral Strips","Super Gummy Iron+ Vitamins Gummies, 102 gm"};
		double d[]={200,299,959.40,100,237.60};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				OmegaSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==5)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
		String c1=sc.next();
		if(c1.equals("1"))
		{
			FishOil();
		}
		else if(c1.equals("2"))
		{
			showCart();
		}
		else
		{
			new Home().HomeSelection();
			
		}
			
	}
	void CodOil()
	{
		System.out.println(bold+brightYellow+"----------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"         Name  "+"                                                            Cost");
		System.out.println(brightYellow+"----------------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Sevenseas Original Cod-Liver Oil, 100 Capsules                       ----339.70");
		System.out.println(" 2.Apollo Life Cod Liver Oil 300mg, 100 Capsules                        -----202.5");
		System.out.println(" 3.Holland & Barrett High Strength Cod Liver Oil 1000mg, 60 Capsules    -------949");
		System.out.println(" 4.Seacod Cod Liver Oil, 60 ml                                          -------225");
		System.out.println(bold+brightYellow+"----------------------------------------------------------------------------------"+reset);
		String c[]={"Sevenseas Original Cod-Liver Oil, 100 Capsules","Apollo Life Cod Liver Oil 300mg, 100 Capsules","Holland & Barrett High Strength Cod Liver Oil 1000mg, 60 Capsules","Seacod Cod Liver Oil, 60 ml"};
		double d[]={339.70,202.5,949,225};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				OmegaSelection();
				break;
			}
			else if(id>=1 && id<=4)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==3)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==4)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
		String c1=sc.next();
		if(c1.equals("1"))
		{
			CodOil();
		}
		else if(c1.equals("2"))
		{
			showCart();
		}
		else
		{
			new Home().HomeSelection();
			
		}
		
		
	}
	void FlaxOil()
	{
		System.out.println(bold+brightYellow+"------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"        Name  "+"                                                   Cost");
		System.out.println(brightYellow+"------------------------------------------------------------------------"+reset);
		System.out.println(" 1.Apollo Life Flaxseed Oil Omega 3-6-9 1000 mg, 30 Capsules    -----299");
		System.out.println(" 2.Healthvit Flaxseed Oil 1000 mg, 60 Softgels                  -----600");
		System.out.println(bold+brightYellow+"------------------------------------------------------------------------"+reset);
		String c[]={"Apollo Life Flaxseed Oil Omega 3-6-9 1000 mg, 30 Capsules","Healthvit Flaxseed Oil 1000 mg, 60 Softgels"};
		int d[]={299,600};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int id=sc.nextInt();
			if(id==0)
			{
				OmegaSelection();
				break;
			}
			else if(id>=1 && id<=2)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int n=sc.nextInt();
				if(id==1)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
				else if(id==2)
				{
					a[k]=c[id-1];
					b[k]=d[id-1];
					q[k]=n;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		System.out.println("Press 1 to go back\n      2 to Cart\n      Any key to Home");
		String c1=sc.next();
		if(c1.equals("1"))
		{
			FlaxOil();
		}
		else if(c1.equals("2"))
		{
			showCart();
		}
		else
		{
			new Home().HomeSelection();
			
		}
		
		
	}
	void OmegaSelection()
	{
		System.out.println(bold+brightBlue+"---------------------------------------------"+reset);
		System.out.println(bold+" Id "+" Name ");
		System.out.println(brightBlue+"---------------------------------------------"+reset);
		System.out.println(" 1.Fish Oil");
		System.out.println(" 2.Cod Liver Oil");
		System.out.println(" 3.Flaxseed Oil");
		System.out.println(bold+brightBlue+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse..");
			int id=sc.nextInt();
			if(id==0)
			{
				NutritionalSelection();
				break;
			}
			else if(id>=1 && id<=3)
			{
				if(id==1)
				{
					FishOil();
					break;
				}
				else if(id==2)
				{
					CodOil();
					break;
				}
				else if(id==3)
				{
					FlaxOil();
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
			}
		}
		
	}	

//----------------------------------------------------------------------------------------------
	
	void NutritionalSelection()
	{
		System.out.println(bold+brightCyan+"---------------------------------------------"+reset);
		System.out.println(bold+" Id"+"  Name");
		System.out.println(brightCyan+"---------------------------------------------"+reset);
		System.out.println(" 1.Nutritional Drinks");
		System.out.println(" 2.Sports Nutrition");
		System.out.println(" 3.Vitamins & Supplements");
		System.out.println(" 4.Minerals");
		System.out.println(" 5.Omega & Fish Oil");
		System.out.println(bold+brightCyan+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse");
			int id=sc.nextInt();
			if(id==0)
			{
				new Home().Explore();
				break;
			}
			else if(id>=1 && id<=5)
			{
				if(id==1)
				{
					NutriSelection();
					break;
				}
				else if(id==2)
				{
					SportSelection();
					break;
				}
				else if(id==3)
				{
					VitaminSelection();
					break;
				}
				else if(id==4)
				{
					MineralSelection();
					break;
				}
				else if(id==5)
				{
					OmegaSelection();
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
				
			}
		}
		
	}
}

//----------------------------------------------------Baby Care1-----------------------------------------------------
class BabyCare extends Cart
{
	
	void displayMenu()
	{
		System.out.println(bold+brightGreen+"---------------------------------------------"+reset);
		System.out.println(bold+" Id"+"     Name");
		System.out.println(brightGreen+"---------------------------------------------"+reset);
        System.out.println(" 1.Diapers");
		System.out.println(" 2.Wipes");
		System.out.println(" 3.Cerelas");
		System.out.println(" 4.Creams");
		System.out.println(" 5.Massage Oils");
		System.out.println(" 6.Baby Powders");
		System.out.println(" 7.Baby Shampoos");
		System.out.println(" 8.Baby Hair Oils");
		System.out.println(" 9.Soaps");
		System.out.println(bold+brightGreen+"---------------------------------------------"+reset);
		System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse");
		int n =sc.nextInt();
        switch (n)
		{
        			case 0:
        				new Home().Explore();
        				break;
            		case 1:
            			displayDiapers();
                		break;
            		case 2:
                		displayWipes();
               			break;
            		case 3:
                		displayCereals();
                		break;
            		case 4:
                		displayCreams();
               			break;
            		case 5:
               			displayMassageOils();
               			break;
            		case 6:
                		displayBabyPowders();
                		break;
            		case 7:
               			displayBabyShampoos();
               			break;
            		case 8:
                		displayBabyHairOils();
               			break;
            		case 9:
               			displaySoaps();
               			break;
           		default:
                		System.out.println(brightRed+"Invalid Id"+reset);
				displayMenu();
				
        		}
	}
	void displayDiapers() 
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"----------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"     Name"+"                                                            Cost");
		System.out.println(brightCyan+"----------------------------------------------------------------------------"+reset);
        	System.out.println(" 1.Pampers All-Round Protection Diaper Pants-42 Count              ------951");
		System.out.println(" 2.MamyPoko Extra Absorb Diaper Pants Large-54 Count               ------799");
		System.out.println(" 3.Huggies Complete Comfort Wonder Baby Diaper Pants XL-56 Count   ------783");
		System.out.println(bold+brightCyan+"----------------------------------------------------------------------------"+reset);
		String c[]={"Pampers All-Round Protection Diaper Pants-42 Count","MamyPoko Extra Absorb Diaper Pants Large-54 Count","Huggies Complete Comfort Wonder Baby Diaper Pants XL-56 Count"};
		int d[]={951,799,783};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=3)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayDiapers();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
	}
    	void displayWipes()
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"----------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"     Name"+"                                          Cost");
		System.out.println(brightCyan+"----------------------------------------------------------"+reset);
        	System.out.println(" 1.Little's Soft Cleansing Baby Wipes-80 Units    ------79");
		System.out.println(" 2.Himalaya Gentle Baby Wipes-144 Count           -----350");
		System.out.println(" 3.Johnson's Baby Skincare Wipes-72 Count         -----280");
		System.out.println(bold+brightCyan+"----------------------------------------------------------"+reset);
		String c[]={"Little's Soft Cleansing Baby Wipes-80 Units","Himalaya Gentle Baby Wipes-144 Count","Johnson's Baby Skincare Wipes-72 Count"};
		int d[]={79,350,280};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=3)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayWipes();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
	}
    	void displayCereals()
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"------------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"           Name"+"                                                              Cost");
		System.out.println(brightCyan+"------------------------------------------------------------------------------------"+reset);
        	System.out.println(" 1.Nestle Cerelac Baby Cereal with Milk Wheat Multigrain & Fruits-300 gm    -----322");
		System.out.println(" 2.Easum Rice & Moong Dal Baby Cereal,6 to 24 Months-400 gm                 -----360");
		System.out.println(" 3.Mum's Care Organic Baby Cereal with Ragi and Moong Dal-300 gm            -----249");
		System.out.println(bold+brightCyan+"------------------------------------------------------------------------------------"+reset);
		String c[]={"Nestle Cerelac Baby Cereal with Milk Wheat Multigrain & Fruits-300 gm","Easum Rice & Moong Dal Baby Cereal,6 to 24 Months-400 gm","Mum's Care Organic Baby Cereal with Ragi and Moong Dal-300 gm"};
		int d[]={322,360,249};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=3)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayCereals();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
    	}
    	void displayCreams()
	{
		boolean b11=true;
		System.out.println(bold+brightCyan+"----------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name"+"                                  Cost");
		System.out.println(brightCyan+"----------------------------------------------------"+reset);
        	System.out.println(" 1.Himalaya Baby Cream-100 ml               -----175");
		System.out.println(" 2.Johnson's Baby Cream-100 gm              -----175");
		System.out.println(" 3.Chicco Baby Moments Baby Cream-100 gm    -----199");
		System.out.println(bold+brightCyan+"----------------------------------------------------"+reset);
		String c[]={"Himalaya Baby Cream-100 ml","Johnson's Baby Cream-100 gm","Chicco Baby Moments Baby Cream-100 gm"};
		int d[]={175,175,199};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=3)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayCreams();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
 
    	}
    	void displayMassageOils()
	{
  		boolean b11=true;
		System.out.println(bold+brightCyan+"----------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name"+"                                                    Cost");
		System.out.println(brightCyan+"----------------------------------------------------------------------"+reset);
        	System.out.println(" 1.Cetaphil Baby Massage oil-200 ml                           -----602");
		System.out.println(" 2.Johnson's Baby Oil-500 ml                                  -----520");
		System.out.println(" 3.Parachute Advansed Baby Massage Oil for New Born-100 ml    -----117");
		System.out.println(bold+brightCyan+"----------------------------------------------------------------------"+reset);
		String c[]={"Cetaphil Baby Massage oil-200 ml","Johnson's Baby Oil-500 ml","Parachute Advansed Baby Massage Oil for New Born-100 ml"};
		int d[]={602,520,117};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=3)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayMassageOils();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
    	}
    	void displayBabyPowders()
	{
       		boolean b11=true;
		System.out.println(bold+brightCyan+"---------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name"+"                                             Cost");
		System.out.println(brightCyan+"---------------------------------------------------------------"+reset);
        	System.out.println(" 1.Johnson's Baby Natural Plant Based Powder-400 gm    -----300");
		System.out.println(" 2.Little's Organix Gentle Baby Powder-400 gm          -----235");
		System.out.println(" 3.Mothercare All We Know Baby Powder-150 gm           -----199");
		System.out.println(bold+brightCyan+"---------------------------------------------------------------"+reset);
		String c[]={"Johnson's Baby Natural Plant Based Powder-400 gm","Little's Organix Gentle Baby Powder-400 gm","Mothercare All We Know Baby Powder-150 gm"};
		int d[]={300,235,199};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=3)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayBabyPowders();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
    	}
    	void displayBabyShampoos()
	{
     		boolean b11=true;
		System.out.println(bold+brightCyan+"---------------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name"+"                                                               Cost");
		System.out.println(brightCyan+"---------------------------------------------------------------------------------"+reset);
        	System.out.println(" 1.Mamaearth Gentle Cleansing Shampoo for Babies 0 to 5 Years-200 ml     -----199");
		System.out.println(" 2.Baby Dove Rich Moisture Shampoo-200 ml                                -----220");
		System.out.println(" 3.Johnson's Baby Shampoo-200 ml                                         -----220");
		System.out.println(brightCyan+"---------------------------------------------------------------------------------"+reset);
		String c[]={"Mamaearth Gentle Cleansing Shampoo for Babies 0 to 5 Years-200 ml","Baby Dove Rich Moisture Shampoo-200 ml","Johnson's Baby Shampoo-200 ml"};
		int d[]={199,220,220};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=3)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayBabyShampoos();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
    	}
    	void displayBabyHairOils()
	{
        	boolean b11=true;
		System.out.println(bold+brightCyan+"---------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name"+"                                 Cost");
		System.out.println(brightCyan+"---------------------------------------------------"+reset);
        	System.out.println(" 1.Himalaya Baby Hair Oil-100 ml           -----140");
		System.out.println(" 2.Johnson's Baby Hair Oil-200 ml          -----260");
		System.out.println(" 3.Little's Birdy Baby Hair Oil-90 ml      -----225");
		System.out.println(bold+brightCyan+"---------------------------------------------------"+reset);
		String c[]={"Himalaya Baby Hair Oil-100 ml","Johnson's Baby Hair Oil-200 ml","Little's Birdy Baby Hair Oil-90 ml"};
		int d[]={140,260,225};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=3)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayBabyHairOils();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
    	}
    	void displaySoaps()
	{
 		boolean b11=true;
		System.out.println(bold+brightCyan+"--------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name"+"                                      Cost");
		System.out.println(brightCyan+"--------------------------------------------------------"+reset);
        System.out.println(" 1.Tedibar Bathing Bar-75 gm                    -----199");
		System.out.println(" 2.Baby Dove Rich Moisture Bathing Bar-50 gm    ------39");
		System.out.println(" 3.Johnson's Baby Soap-50 gm                    ------47");
		System.out.println(bold+brightCyan+"--------------------------------------------------------"+reset);
		String c[]={"Tedibar Bathing Bar-75 gm","Baby Dove Rich Moisture Bathing Bar-50 gm","Johnson's Baby Soap-50 gm"};
		int d[]={199,39,47};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=3)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displaySoaps();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
    	}
	
}
//------------------------------------------------health devices------------------------------------------------
class HealthAccessories extends Cart
{
	
    	void displayMenu()
	{
		System.out.println(bold+brightCyan+"---------------------------------------------"+reset);
		System.out.println(bold+" Id"+"     Name");
		System.out.println(brightCyan+"---------------------------------------------"+reset);
        System.out.println(" 1.Abdomial Supports");
		System.out.println(" 2.Arm & Wrist Supports");
		System.out.println(" 3.Knee & Leg Supports");
		System.out.println(" 4.Neck Supports");
		System.out.println(" 5.Clavicle Supports");
		System.out.println(bold+brightCyan+"---------------------------------------------"+reset);
		System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse");
		int n = sc.nextInt();
        switch (n)
		{
					case 0:
						new Home().Explore();
						break;
            		case 1:
            			displayAbdomialSupports();
                		break;
            		case 2:
                		displayArm();
               			break;
            		case 3:
                		displayKnee();
                		break;
            		case 4:
                		displayNeck();
               			break;
            		case 5:
               			displayClavicle();
               			break;
           		default:
                		System.out.println(brightRed+"Invalid Id"+reset);
                		displayMenu();
				
        	}
	}
	void displayAbdomialSupports() 
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"-------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"  Name  "+"                                                    Cost");
		System.out.println(brightMagenta+"-------------------------------------------------------------------"+reset);
		System.out.println(" 1.Tynor Lumbo Sacral Belt XL, 1 Count MediumSize         ------100");
		System.out.println(" 2.LP Sacro Lumber Support 903 Large, 1 Count             ------200");
		System.out.println(" 3.Renewa Ortho Back Support Pillow Puff, 1 Count         ------300");
		System.out.println(" 4.Tynor Chest Binder Belt Large, 1 Count                 ------400");
		System.out.println(" 5.Back Support, 1 Count                                  ------500");
		System.out.println(bold+brightMagenta+"-------------------------------------------------------------------"+reset);
		String c[]={"Tynor Lumbo Sacral Belt XL, 1 Count MediumSize","LP Sacro Lumber Support 903 Large, 1 Count","Renewa Ortho Back Support Pillow Puff, 1 Count","Tynor Chest Binder Belt Large, 1 Count","Back Support, 1 Count"};
		int d[]={100,200,300,400,500};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==4)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==5)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayAbdomialSupports();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
	}
    	void displayArm()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"-------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"   Name  "+"                                                   Cost");
		System.out.println(brightMagenta+"-------------------------------------------------------------------"+reset);
		System.out.println(" 1.Tynor Wrist Brace with Thumb Universal, 1 Count        ------185");
		System.out.println(" 2.Tynor Elbow Support Large, 1 Count                     ------240");
		System.out.println(" 3.Tynor Pouch Arm Sling Tropical Medium, 1 Count         ------284");
		System.out.println(" 4.Tynor Wrist Splint with Thumb Medium, 1 Count          ------548");
		System.out.println(" 5.Tynor Tennis Elbow Support Large, 1 Count              ------325");
		System.out.println(bold+brightMagenta+"-------------------------------------------------------------------"+reset);
		String c[]={"Tynor Wrist Brace with Thumb Universal, 1 Count" , "Tynor Elbow Support Large, 1 Count" , "Tynor Pouch Arm Sling Tropical Medium, 1 Count" , "Tynor Wrist Splint with Thumb Medium, 1 Count" , "Tynor Tennis Elbow Support Large, 1 Count"};
		int d[]={185,240,284,548,325};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==4)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==5)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayArm();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
	}
    	void displayKnee()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"--------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"     Name  "+"                                            Cost");
		System.out.println(brightMagenta+"--------------------------------------------------------------"+reset);
		System.out.println(" 1.Tynor Ankle Binder Single Large, 1 Count         -------305");
		System.out.println(" 2.Tynor Knee Cap XL, 1 Pair                        -------320");
		System.out.println(" 3.Tynor Ankle Support Neoprene Universal, 1 Count  -------995");
		System.out.println(" 4.Tynor Anklet Large, 1 Pair                       -------237");
		System.out.println(" 5.Tynor Elastic Knee Support Large, 1 Count        -------687");
		System.out.println(bold+brightMagenta+"--------------------------------------------------------------"+reset);
		String c[]={"Tynor Ankle Binder Single Large, 1 Count","Tynor Knee Cap XL, 1 Pair","Tynor Ankle Support Neoprene Universal, 1 Count","Tynor Anklet Large, 1 Pair","Tynor Elastic Knee Support Large, 1 Count"};
		int d[]={305,320,995,237,687};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=5)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==4)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==5)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayKnee();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
    	}
    	void displayNeck()
	{
		boolean b11=true;
		System.out.println(bold+brightMagenta+"--------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"  Name  "+"                                               Cost");
		System.out.println(brightMagenta+"--------------------------------------------------------------"+reset);
		System.out.println(" 1.Tynor Cervical Collar Soft Medium, 1 Count         -----320");
		System.out.println(" 2.Vissco Cervical Collar Soft Medium, 1 Count        -----325");
		System.out.println(" 3.Tynor Cervical Orthosis Medium, 1 Count            -----210");
		System.out.println(bold+brightMagenta+"--------------------------------------------------------------"+reset);
		String c[]={"Tynor Cervical Collar Soft Medium, 1 Count","Vissco Cervical Collar Soft Medium, 1 Count","Tynor Cervical Orthosis Medium, 1 Count"};
		int d[]={320,325,955};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=3)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayNeck();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
 
    	}
    	void displayClavicle()
	{
  		boolean b11=true;
		System.out.println(bold+brightMagenta+"--------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"         Name  "+"                                                    Cost");
		System.out.println(brightMagenta+"--------------------------------------------------------------------------"+reset);
		System.out.println(" 1.MGRM 0205 Clavicle Support Medium, 1 Count                     -----410");
		System.out.println(" 2.Tynor Elite Pregnancy Memory Pillow Blue Universal, 1 Count    ----1143");
		System.out.println(" 3.Vissco Cervical Collar Soft XL, 1 Count                        -----320");
		System.out.println(" 4.Hansaplast Active Cervical Neck Support                        -----370");
		System.out.println(bold+brightMagenta+"--------------------------------------------------------------------------"+reset);
		String c[]={"MGRM 0205 Clavicle Support Medium, 1 Count","Tynor Elite Pregnancy Memory Pillow Blue Universal, 1 Count","Vissco Cervical Collar Soft XL, 1 Count","Himalaya Footcare Cream, 20 gm","Sanfe 5 in 1 Detan Wax, 600 gm"};
		int d[]={410,1143,320,370};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=4)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==4)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayClavicle();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
    	}
}
//--------------------------------------------home essentials---------------------------------------------------
class HomeEssentials extends Cart
{
    	public void displayMenu()
	{
		System.out.println(bold+brightGreen+"---------------------------------------------"+reset);
		System.out.println(bold+" Id"+"     Name");
		System.out.println(brightGreen+"---------------------------------------------"+reset);
        System.out.println(" 1.Insect Repellents");
		System.out.println(" 2.Antiseptic Liquids");
		System.out.println(" 3.Room Freshners");
		System.out.println(" 4.Cleaning Essentials");
		System.out.println(bold+brightGreen+"---------------------------------------------"+reset);
		System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse");
		int n =sc.nextInt();
        switch(n)
		{
					case 0:
						new Home().Explore();
						break;
            		case 1:
            			displayInsect();
                		break;
            		case 2:
                		displayAntiseptic();
               			break;
            		case 3:
                		displayRoom();
                		break;
            		case 4:
                		displayCleaning();
               			break;
            		
           		default:
                		System.out.println(brightRed+"Invalid Id"+reset);
                		displayMenu();
				
        		}
	}
	void displayInsect() 
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"--------------------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"     Name"+"                                                          Cost");
		System.out.println(brightYellow+"--------------------------------------------------------------------------"+reset);
        	System.out.println(" 1.Tiger balm Mosquito Repellent patch                          -------599");
		System.out.println(" 2.Omo Fast Attack Mosquito Reepellent refill, 45ml             -------259");
		System.out.println(" 3.Odomos Naurals Mosquito repellent Cream, 100gm               ----104.65");
		System.out.println(" 4.Good night fabric roll-on Mosquito Repellent, 8ml            ------77.4");
		System.out.println(bold+brightYellow+"--------------------------------------------------------------------------"+reset);
		String c[]={"Tiger balm Mosquito Repellent patch","Omo Fast Attack Mosquito Reepellent refill45ml","Odomos Naurals Mosquito repellent Cream, 100gm","Good night fabric roll-on Mosquito Repellent, 8ml"};
		double d[]={599,259,104.65,77.4};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=4)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==4)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayInsect();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
	}
    	void displayAntiseptic()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"     Name"+"                                      Cost");
		System.out.println(brightYellow+"------------------------------------------------------"+reset);
        	System.out.println(" 1.Dettol Antiseptic Liquid, 125 ml          -------80");
		System.out.println(" 2.Ethanol Antiseptic Liquid, 125 ml         ------100");
		System.out.println(" 3.Savlon Antiseptic Liquid, 750 ml          ------331");
		System.out.println(" 4.Prestrol Antiseptic Liquid 500 ml         ------249");
		System.out.println(bold+brightYellow+"------------------------------------------------------"+reset);
		String c[]={"Dettol liquid 125 ml","Ethanol Liquid 125 ml","Savlon Liquid 750 ml,","Prestrol Liquid 500 ml"};
		int d[]={80,100,331,249};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=4)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==4)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayAntiseptic();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
	}
    	void displayRoom()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"--------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"           Name"+"                            Cost");
		System.out.println(brightYellow+"--------------------------------------------------"+reset);
        System.out.println(" 1.Odonil Room Fresher Spray, 220 ml    --------99");
		System.out.println(" 2.Godrej aer Spray, 220 ml             -------100");
		System.out.println(" 3.Air Wick Spray , 250 ml              -------557");
		System.out.println(" 4.Oscar Air Fresher , 250 ml           -------195");
		System.out.println(bold+brightYellow+"--------------------------------------------------"+reset);
		String c[]={"Odonil Room Fresher Spray, 220 ml","Godrej aer Spray, 220 ml","Air Wick Spray, 250 ml","Oscar Air Fresher, 250 ml"};
		int d[]={99,100,557,195};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=4)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==4)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayRoom();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
    	}
    	void displayCleaning()
	{
		boolean b11=true;
		System.out.println(bold+brightYellow+"------------------------------------------------------------"+reset);
		System.out.println(bold+" Id"+"       Name"+"                                          Cost");
		System.out.println(brightYellow+"------------------------------------------------------------"+reset);
        System.out.println(" 1.Harpic Disinfecant toilet cleaner 1 Litre      -------205");
		System.out.println(" 2.Domex Freshgurad toilet cleaner 1 Litre        -------185");
		System.out.println(" 3.Lizol Disinfeact Floor Cleaner 5 Litre         -------779");
		System.out.println(" 4.Harpic bathroom cleaner 1 Litre                -------195");
		System.out.println(bold+brightYellow+"-------------------------------------------------------------"+reset);
		String c[]={"Harpic Disinfecant toilet cleaner 1 Litre","Domex Freshgurad toilet cleaner 1 Litre","Lizol Disinfeact Floor Cleaner 5 Litre","Harpic bathroom cleaner 1 Litre"};
		int d[]={205,185,779,195};
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Add to Cart");
			int n=sc.nextInt();
			if(n==0)
			{
				displayMenu();
				b11=false;
				break;
			}
			else if(n>=1 && n<=4)
			{
				System.out.print(bold+"Enter Quantity : "+reset);
				int p=sc.nextInt();
				if(n==1)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==2)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==3)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
				else if(n==4)
				{
					a[k]=c[n-1];
					b[k]=d[n-1];
					q[k]=p;
					k++;
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Selection"+reset);
				break;
			}
		}
		if(b11)
		{
			System.out.println("Press 1 to go Back\n      2 to Cart\n      Any key to Home");
			String c1=sc.next();
			if(c1.equals("1"))
			{
				displayCleaning();
			}
			else if(c1.equals("2"))
			{
				showCart();
			}
			else
			{
				new Home().HomeSelection();
			}
		}
 
    	}
    	
}

//---------------------------------------------------------Home1-----------------------------------------------------
class Home extends User
{
	void Explore()
	{
		System.out.println(bold+brightBlue+"-------------------Explore-------------------"+reset);
		System.out.println(" 1.Personal Care");
		System.out.println(" 2.Nutritional Drinks & Supplements");
		System.out.println(" 3.Baby Care");
		System.out.println(" 4.Health Devices");
		System.out.println(" 5.Home Essentials");
		System.out.println(bold+brightBlue+"---------------------------------------------"+reset);
		while(true)
		{
			System.out.println(bold+"Select"+reset+" : 0 to go Back\n        Id to Browse");
			int id=sc.nextInt();
			if(id==0)
			{
				HomeSelection();
				break;
			}
			else if(id>=1 && id<=5)
			{
				if(id==1)
				{
					new PersonalCare().selection();
					break;
				}
				else if(id==2)
				{
					new NutriDrinks().NutritionalSelection();
					break;
				}
				else if(id==3)
				{
					new BabyCare().displayMenu();
					break;
				}
				else if(id==4)
				{
					new HealthAccessories().displayMenu();
					break;
				}
				else if(id==5)
				{
					new HomeEssentials().displayMenu();
					break;
				}
			}
			else
			{
				System.out.println(brightRed+"Invalid Id"+reset);
				
			}
		}
	}
	void MyAccount()
	{
		System.out.println(bold+brightBlue+"-------------------My Account-------------------"+reset);
		System.out.println();
		System.out.println("Name         : "+x.getName());
		System.out.println("Password     : "+x.getPass());
		System.out.println("Phone Number : "+x.getPh());
		System.out.println(bold+brightBlue+"------------------------------------------------"+reset);
		System.out.println("\nPress 0 to go Home\n      Any key to exit");
		String c1=Cart.sc.next();
		if(c1.equals("0"))
		{
			HomeSelection();
		}
		else
		{
			System.out.println("Have a Nice Day");
		}
	}
	void HomeSelection()
	{
		System.out.println(bold+brightWhite+"\n---------------------------------------------------");
		System.out.println(brightMagenta+"    -------------------  Home  -----------------"+reset);
		System.out.println(bold+brightWhite+"---------------------------------------------------"+reset);
		System.out.println(bold+"\nHello! "+brightCyan+x.getName()+reset);
		System.out.println();
		System.out.println(" 1.Explore");
		System.out.println(" 2.My Account");
		System.out.println(" 3.Cart");
		System.out.println(" 4.My Orders");
		System.out.println("\nChoose your choice or Any Key to Exit ");
        char ch=Cart.sc.next().charAt(0);
        if(ch=='1')
            	{
                	Explore();
            	}
		else if(ch=='2')
            	{
                	MyAccount();
            	}
		else if(ch=='3')
            	{
                	showCart();
            	}
		else if(ch=='4')
    			{
        			showOrders();
    			}
        else
            System.out.println("Have a Nice Day");
	}
}

//----------------------------------------Login-----------------------------------

class HealthOne{
    	private String username="varun";
    	private String password="123";
    	private long phno=1234567899l;
    	void setName(String username)
    	{
        	this.username=username;
    	}
    	void setPass(String password)
    	{
        	this.password=password;
    	}
	void setPh(long ph)
    	{
        	this.phno=ph;
    	}
    	String getName()
    	{
        	return username;
    	}
    	String getPass()
    	{
        	return password;
    	}
    	long getPh()
    	{
        	return phno;
    	}
    	HealthOne(String name, String pass, long num){
        	this.username=name;
        	this.password=pass;
        	this.phno=num;
    	}
    	HealthOne(){}

}
//--------------------------------User-----------------------------------------------
class User extends Cart
{
	static Scanner sc=new Scanner(System.in);
    static HealthOne x=new HealthOne();
    static int c=0;
    void signUp()
	{
		System.out.println(bold+brightWhite+"---------------------------------------------------");
        	System.out.println(brightMagenta+"                 Create An Account                 ");
		System.out.println(brightWhite+"---------------------------------------------------"+reset);
        	System.out.print(brightCyan+"Enter Your Username      : "+reset);
        	String username=sc.next();
        	String password;
		while(true)
		{
			System.out.print(brightCyan+"Enter Your Password      : "+reset);
        		password=sc.next();
			int p=0,q=0,r=0,s=0;
			for(int i=0;i<=password.length()-1;i++)
			{
				if(password.charAt(i)>='A' && password.charAt(i)<='Z')
				{
					p++;
				}
				else if(password.charAt(i)>='0' && password.charAt(i)<='9')
				{
					q++;
				}
				else if(password.charAt(i)>='a' && password.charAt(i)<='z')
				{
					r++;
				}
				else
				{
					s++;
				}
			}
			if(((p+q+r+s)>=8) && p!=0 && q!=0 && r!=0 && s!=0)
			{
				break;
			}
			else
			{
				System.out.println(bold+brightRed+"--------------------Note---------------------------"+reset);
				System.out.print(brightWhite+"Password must contain 1.Minimum 8 Characters\n                      2.Atleast 1 Capital Letter\n                      3.Atleast 1 Number\n                      4.Atleast 1 Special Character\n");
			}
		}
        	System.out.print(brightCyan+"Enter Your Phone Number  : "+reset);
		while(true)
		{
        		long num=sc.nextLong();
			long temp=num;
			int c1=0,st=0;
			while(num!=0)
			{
				num/=10;
				c1++;
			
			}
			String numbe=Long.toString(temp);
			if(numbe.charAt(0)=='0') {
				c1++;
			}
			if(numbe.charAt(0)=='0' || numbe.charAt(0)=='1')
			{
				st++;
			}
			if(c1==10 && st==0)
			{
				x=new HealthOne(username,password,temp);
        			System.out.println(bold+brightWhite+"---------------------------------------------------");
        			System.out.println(brightGreen+"              Your Account is Created              ");
				System.out.println(brightWhite+"---------------------------------------------------"+reset);
        			System.out.println("\nPress 1 to Login\n      Any key to exit"+reset);
						
        			int n=sc.nextInt();
        			if(n==1){
					System.out.println(bold+brightWhite+"---------------------------------------------------");
        			System.out.println("                       Login                       ");
					System.out.println(brightWhite+"---------------------------------------------------"+reset);
					login();
					break;
        			}
        			else{
            				System.out.println(yellow+"Have a good day");
					break;
        			}
			}
			else if(c1!=10 && st==0)
			{
				System.out.println(bold+brightRed+"--------------------Note---------------------------"+reset);
				System.out.print(brightWhite+"Phone Number Must be 10 Digits Only\n");
				System.out.print(brightCyan+"\nEnter Your Phone Number Again : "+reset);
			}
			else if(st!=0 && c1==10)
			{
				System.out.println(bold+brightRed+"--------------------Note---------------------------"+reset);
				System.out.print(brightWhite+"Phone Number Shouldn't Start with 0 & 1\n");
				System.out.print(brightCyan+"\nEnter Your Phone Number Again : "+reset);
			}
			else
			{
				System.out.println(bold+brightRed+"--------------------Note---------------------------"+reset);
				System.out.println(brightWhite+"Phone Number \n      1.Must be 10 digits only...\n      2.It Shouldn't Start with 0 & 1\n");
				System.out.print(brightCyan+"\nEnter Your Phone Number Again : "+reset);
			}
			
                
			
		}
   
        }
    	void login()
    	{
		c=0;
        	System.out.print(brightCyan+"Enter your Username : "+reset);
        	String username=sc.next();
        	System.out.print(brightCyan+"Enter your Password : "+reset);
        	String password=sc.next();
        	if(username.equals(x.getName()) && password.equals(x.getPass()))
        	{
//        		System.out.println();
//         		System.out.println(brightWhite+"---------------------------------------------------");
//        		System.out.println(brightGreen+"***************  Login Successfull  ***************");
//        		System.out.println(brightWhite+"---------------------------------------------------"+reset);
			
			new Home().HomeSelection();
		
        	}
        	else if(!username.equals(x.getName()) && !password.equals(x.getPass()))
        	{
			System.out.println(brightRed+"\nInvalid Credentials"+brightWhite+"\nPress 1 to Know Your Username\n      Any Key to Exit"+reset);
            		int n=sc.nextInt();
            		if(n==1)
            		{
				while(true)
				{
                    			c++;
                			System.out.print(brightCyan+"Please Enter Your Phone Number : "+reset);
                			long phno=sc.nextLong();
                			if(phno==x.getPh())
                			{
                    				System.out.println(brightMagenta+"Your Username : "+reset+x.getName());
                    				login();
                    				break;
                			}
                			else
                			{
                    				if(c==3)
						{
                        				System.out.println(bold+brightRed+"\nYou are out of Chances Sorry......"+reset);
                        				break;
                    				}
                    				System.out.print(bold+brightGreen+"User Not Found!\n"+reset);
  
  	                  			if(c==2){
        	            				System.out.print(bold+brightRed+"--------------Only one Chance left---------------\n"+reset);
						}
                			}
            			}
            		}
            		else
            			System.out.println(brightYellow+"Have a Good Day"+reset);
            
        	}
        	else if(!username.equals(x.getName()))
        	{
			
            		System.out.println(brightRed+"\nInvalid Username"+brightWhite+"\nPress 1 to Enter Details Again\n      2 to Reset\n      Any Key to Exit"+reset);
            		char ch=sc.next().charAt(0);
			if(ch=='1')
			{
				login();
			}
            		else if(ch=='2')
            		{
               			System.out.print(brightCyan+"Enter New Username : "+reset);
                		x.setName(sc.next());
                		System.out.print(brightMagenta+"New Username : "+reset+x.getName());
                		System.out.println();
                		login();
            		}
            		else
            			System.out.println(brightGreen+"Have a Nice Day");
        	}
        	else
		{
			System.out.println(brightRed+"\nInvalid Password"+brightWhite+"\nPress 1 to Enter Details Again\n      2 to Reset\n      Any Key to Exit"+reset);
            		char ch=sc.next().charAt(0);
			if(ch=='1')
			{
				login();
			}
            		else if(ch=='2')
            		{
                		String passw;
                		while(true)
                		{
                			System.out.print(brightCyan+"Enter New Password      : "+reset);
                        	passw=sc.next();
                			int p=0,q=0,r=0,s=0;
                			for(int i=0;i<=passw.length()-1;i++)
                			{
                				if(passw.charAt(i)>='A' && passw.charAt(i)<='Z')
                				{
                					p++;
                				}
                				else if(passw.charAt(i)>='0' && passw.charAt(i)<='9')
                				{
                					q++;
                				}
                				else if(passw.charAt(i)>='a' && passw.charAt(i)<='z')
                				{
                					r++;
                				}
                				else
                				{
                					s++;
                				}
                			}
                			if(((p+q+r+s)>=8) && p!=0 && q!=0 && r!=0 && s!=0)
                			{
                				break;
                			}
                			else
                			{
                				System.out.println(bold+brightRed+"--------------------Note---------------------------"+reset);
                				System.out.print(brightWhite+"Password must contain 1.Minimum 8 Characters\n                      2.Atleast 1 Capital Letter\n                      3.Atleast 1 Number\n                      4.Atleast 1 Special Character\n");
                			}
                		}
                		
               			x.setPass(passw);
                		System.out.print(brightMagenta+"New password : "+reset+x.getPass());
                		System.out.println();
                		login();
            		}
            		else
            			System.out.println(brightGreen+"Have a Nice Day");
        	}
    	}
	public static void main(String[] args) {
	    
		User x=new User();
		art();
		//System.out.println(bold+blue+"\n---------------------------------------------------");
        //System.out.println(brightWhite+"         Welcome to WellnessMart                    ");
		//System.out.println(blue+"---------------------------------------------------"+reset);
		System.out.println(brightWhite+"\nPress 1 for "+bold+"Sign Up"+reset+"\n      2 for "+bold+"Login"+reset+"\n      Any Key to Exit"+reset);
		char a=sc.next().charAt(0);
		if(a=='1')
		{
			x.signUp();
		}
		else if(a=='2')
		{
			System.out.println(bold+green+"---------------------------------------------------"+reset);
        	System.out.println(bold+"                       Login                       ");
			System.out.println(green+"---------------------------------------------------"+reset);
		    	x.login();
		}
		else{
		    System.out.println(brightMagenta+"Have a good day....");
		}
	}
	
	
	
	
	
	static void art()
	{

		System.out.println(bold+blink+brightYellow+"                                                        .:                                   :.                                                                                                                                 ");                                                                    
        System.out.println("                                                         .-.                               .=                                                                                                                                    ");                                                                  
        System.out.println("                                                           -:                             :=                                                                                                                                     ");                                                                
        System.out.println("                                                            :-             .            .=-                                                                                                                                      ");                                                             
        System.out.println("                                                             :=.         =***=         .*:                                                                                                                                       ");                                                          
        System.out.println("                                                              .=:       -*****-       -+.                                                                                                                                       ");                                                       
        System.out.println("                                                               .==.     +*****+     .+*.                                                                                                                                        ");                                                    
        System.out.println("                                                                 =+.    +*****+    :*+                                                                                                                                                             ");                                                 
        System.out.println("                                                                  =+-   :*****:   =*+                                                                                                                                                                 ");                                              
        System.out.println("                                                                   =+=.  .---.  .+*=                                                                                                                                                     ");                                                           
        System.out.println("                                                                    =*+-       -**=                                                                                                                                                   ");                                                              
        System.out.println("                                                                     =**+:. .-+**+                                                                                                                                                          ");                                                        
        System.out.println("                                                                     .+**********.                                                                                                                                                             ");                                                     
        System.out.println("                                                                      :*********:                                                                                                                                                                 ");                                                  
        System.out.println("                                                                       =*******=                                                                                                                                                                     ");                                               
        System.out.println("                                                                       :*******.              "+reset+bold+brightYellow+blink);                                                                                                                                                                                                      
        System.out.println("                                                                       .*******.              "+reset+brightGreen+"                                                    =%@@:   *%@@                                                                                   "+brightYellow+blink);                                         
        System.out.println("                                                                       :*******:              "+reset+bold+brightGreen+"                                                   :@@@@:  =@@@@                                                                                  "+brightYellow+blink);                                   
        System.out.println("                                                                       +*******+              "+reset+bold+brightGreen+"                                         .::.      :@@@@:  =@@@@         ..:::           .::.          .::..         ....                          "+brightYellow+blink);                            
        System.out.println("                                                                      :*********:             "+reset+bold+brightGreen+"             *%@%:    #@@@-    *@@@.  :*@@@@@@@+   :@@@@:  =@@@@     :*@@@@@@@@%=     =%@@@@@@#-   .*%@@@@@@@#:  :#@@@@@@@%*.                          "+brightYellow+blink);                                
        System.out.println("                                                                      +**********             "+reset+bold+brightGreen+"             :%%%%   +@@@@#   +@@@+  =@@@#==+%@@@: :@@@@:  =@@@@     #@@@@*+*@@@@+  :%@@#=--+@%%+ :@@@@*--=*##+ :@@@@=--+###+                         "+brightYellow+blink);                             
        System.out.println("                                                                     :***********-            "+reset+bold+brightGreen+"              *@%%-  @@%%@@. .@@@%  =@@@=     *@@% :@@@@:  =@@@@     #@@@%   =@@@@ .@@%#     -@@@-:%@@@*-::     =@@@@+-:.                              "+brightYellow+blink);                          
        System.out.println("                                                                     =***********+            "+reset+bold+brightGreen+"              .%@@% =@@+-@@* +@@@-  %@@@%%%%%%@@@@ :@@@@:  =@@@@     #@@@%   =@@@@ -%@@@%%%%%%@@@= =#%@@@@@@@#=  +@@@@@@@@%*-                            "+brightYellow+blink);                    
        System.out.println("                                                                     +************            "+reset+bold+brightGreen+"               *@@@-#@@. %@@:@@@#   #@@@%*******+: :@@@@:  =@@@@     #@@@%   =@@@@ :@@@%*++++***-    .:-+*#@@@@#   .-=+*%@@@@=                           "+brightYellow+blink);                 
        System.out.println("                                                                    .*************.           "+reset+bold+brightGreen+"                @@@@@@*  :@@@@@@:   .@@@%-.  .:    .@@@@+  -@@@@=    #@@@%   =@@%@  #@@#=.   ..    -==-    +@@@@.-==:    #@@@*                             "+brightYellow+blink);                 
        System.out.println("                                                                    :*************:           "+reset+bold+brightGreen+"                -@@@@@.   #@@@@#     .#@@@@@@@@@+   :@@@@@#.+@@@@@*. #@@@#   =@@@#   =%#%%%%%%%%. .#@%%@%#%@@@@-.%@@@@##@@@@@.                              "+brightYellow+blink);              
        System.out.println("                                                                    :*************:           "+reset+bold+brightGreen+"                 -***=    .+***:       .=*###*+-      -+***=  -+***= +**=    :**+.     -=+**++=:    .=*#####+-    -+*#%##*+-                               "+brightYellow+blink);          
        System.out.println("                                                                    :*************.                                                                                                                                                                                      "+brightYellow+blink); 
        System.out.println("                                                                    .*************                                                                                                                                                                                        "+brightYellow+blink);
        System.out.println("                                                                     +************                                                                                                                                         ");
        System.out.println("                                                                     =***********=            "+reset+bold+brightGreen+"             ::::::::::::::::."+brightBlue+"                      ░░░    ░░░  ░░░░░  ░░░░░░  ░░░░░░░░     "+brightGreen+"                 .:::::::::::::::"+brightYellow+blink);                                                                       
        System.out.println("                                                                     :***********-                                                          "+reset+bold+brightBlue+"      ▒▒▒▒  ▒▒▒▒ ▒▒   ▒▒ ▒▒   ▒▒    ▒▒            "+brightYellow+blink);
        System.out.println("                                                                     .***********.                                                           "+reset+bold+brightBlue+"     ▒▒ ▒▒▒▒ ▒▒ ▒▒▒▒▒▒▒ ▒▒▒▒▒▒     ▒▒                     "+brightYellow+blink);
        System.out.println("                                                                      =*********=                                                            "+reset+bold+brightBlue+"     ▓▓  ▓▓  ▓▓ ▓▓   ▓▓ ▓▓   ▓▓    ▓▓                 "+brightYellow+blink);                                                                                                                   
        System.out.println("                                                                      .*********.                                                            "+reset+bold+brightBlue+"     ██      ██ ██   ██ ██   ██    ██                "+brightYellow+blink);                                                                                                                                                                                                            
        System.out.println("                                                                       =*******=                                                                                                               ");                                                                                                                                                                                                         
        System.out.println("                                                                       .*******.              ");                                                                                                                                                                                                      
        System.out.println("                                                                        =*****=                  ");                                                                                                                                                                                                   
        System.out.println("                                                                        :*****:                     ");                                                                                                                                                                                                
        System.out.println("                                                                         =***+                         ");                                                                                                                                                                                             
        System.out.println("                                                                         :***:                            ");                                                                                                                                                                                          
        System.out.println("                                                                          +*+                                ");                                                                                                                                                                                       
        System.out.println("                                                                          :*:                                   ");                                                                                                                                                                                    
        System.out.println("                                                                           +                                       ");                                                                                                                                                                                 
        System.out.println("                                                                           -                                          ");                                                                                                                                                                              
        System.out.println("                                                                                                                            ");                                                                                                                                                                        
        System.out.println("                                                              ........................                                         ");                                                                                                                                                                     
        System.out.println("                                                       .............:::::::::::::::............                                   ");                                                                                                                                                                  
        System.out.println("                                                       .................:::::................                                        ");                                                                                                                                                               
        System.out.println("                                                                      .......                                                           "+reset);
	

	}

	
	
	
	
	
}
