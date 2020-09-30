public class Employee_obj_count
{  
	static int count=0 ;
    	Employee_obj_count() 
     		{
    		++count ; 
    	 	}
	
	public static void main(String[] args)
	{
	       Employee_obj_count e1= new Employee_obj_count() ;
               Employee_obj_count e2= new Employee_obj_count();
               Employee_obj_count e3 = new Employee_obj_count();
               
               System.out.println("NUmber of objects created:" + count);
	}
}

