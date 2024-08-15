package ArayConcepts;

public class ArraySorting {

	public static void main(String[] args) {
		
		int a[]= {2,3,1,4,6,5};

		for (int i=0; i<a.length;i++)
						
		{
			
			    for (int j=i+1; j<a.length;j++)
			    {
			    	if(a[i]>a[j])   //a>b if required in ascending order//
			    		            //a<b if required in descending order//
			    	{
			    		int t;  //Declaring temporary variable t //
			    		t=a[i];
			    		a[i]=a[j];
			    		a[j]=t;
			    		
			    	}
			    }
		
			    
			    System.out.println(a[i]);
		}
		
		
	}

}
