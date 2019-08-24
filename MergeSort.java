public class MergeSort
{
  public static void main(String []args)
  {
    int a[]=new int []{40,20,10,30,80,90,60,50,70,25};
    mergeSort(a,0, a.length-1);
    for(int e:a)
      System.out.print(" "+e);
  }

  public static void mergeSort(int []arr, int p,int r)
  {
    if(p<r)
    {
      int q = (p+r)/2;
      System.out.print("P:" + p +"r:" + r + "[");  
      for(int i=p;i<=r;i++){
        System.out.print(arr[i]+",");
      }
      System.out.println("]");  
      mergeSort(arr, p,q);
      mergeSort(arr, q+1, r);
      merge(arr, p,q,r);    
    }
  }

  public static void merge(int ar[], int beg, int mid, int end)
  {
    int l_len = mid-beg+1;
    int r_len = end-mid;
    int [] l_arr = new int[l_len];
    int [] r_arr = new int[r_len];
    for(int i=0;i<l_len;i++)
      l_arr[i]= ar[beg+i];
    for(int j=0;j<r_len;j++)
      r_arr[j]= ar[mid+1+j];
    int i = 0, j=0;
    for(int e:l_arr)
      System.out.print(e);
    for(int k=0;k<=end;k++)
    {
      if(l_arr[i]<r_arr[j])
      {
        ar[k]=l_arr[i];
        i++;
      }
      else{
        ar[k]=r_arr[j];
        j++;
      }
    }

  }
}