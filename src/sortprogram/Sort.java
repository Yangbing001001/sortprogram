package sortprogram;

public class Sort {
	

    public static void main(String[] args) {  
        int a[] = {3,1,5,7,2,4,9,6,10,8};    
        Sort obj=new Sort();  
        System.out.println("初始值：");  
        obj.print(a);  
        System.out.println("");
        
        obj.enhanceBubble(a);
        //obj.insertSort(a);  
        System.out.println("\n排序后：");  
        obj.print(a);  
  
    }  
  
    public void print(int a[]){  
        for(int i=0;i<a.length;i++){  
            System.out.print(a[i]+" ");  
        }  
    }  
    public void insertSort(int[] a) {  
    	  Sort obj=new Sort();  
        for(int i=1;i<a.length;i++){//从头部第一个当做已经排好序的，把后面的一个一个的插到已经排好的列表中去。  
            if(a[i]<a[i-1]){  
                int j;  
                int x=a[i];//x为待插入元素  
                a[i]=a[i-1];  
                for(j=i-1;  j>=0 && x<a[j];j--){//通过循环，逐个后移一位找到要插入的位置。  
                    a[j+1]=a[j];  
                }  
                a[j+1]=x;//插入  
                System.out.println("x="+x+" j= "+j);
            }  
            obj.print(a);  
            System.out.println("");//oo
                  
        }  
          
    }
   public void dubbleSort(int[] a, int n){
	   
	   for(int i=0;i<n-1;++i){
		   
		   for(int j=0; j<n-i-1;++j){
			   				   
			   if(a[j]>a[j+1]){
				   
				   int tmp=a[j];					 
				   a[j]=a[j+1];
				   a[j+1]=tmp;
				   					 			   					   
			   }
			   	   			   			   			   			   			   
		   }
		   	   			   
	   }		   	   
	   
   } 	 
   public void enhanceBubble(int[] a){
	   int left = 0;
	   int right = a.length-1;
	   System.out.println(right);
	   while(left<right){
		   for(int i=left;i<right;i++){
			   if(a[i+1]<a[i]){
				   int tmp;
				   tmp = a[i];
				   a[i] = a[i+1];
				   a[i+1] =tmp;
				   					   					   
			   }				 	
		   }
		   right--;									  				   			   
			   
			  for(int i = right;i>left;i--){
				  
                   if(a[i-1]>a[i]){					  
					  int tmp;
					   tmp = a[i];
					   a[i] = a[i-1];
					   a[i-1] =tmp; 
					  						  
				  }			
			  }
			  left++;	  				   
		
		   
		   
	   }
	   
	   
	   
	   
   }
	
	

}
