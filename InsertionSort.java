public class NbitAddition
{
  // reverse order
  public static void main(String args[])
  {
    int [] a = new int[] {0,1,1,1,0,0,1,0,1,1,0};
    int [] b = new int[] {1,1,0,0,0,0,1,1,1,0,0};
    int [] c = new int[a.length+1];
    int i= 1;
    int carry=0;
    for(int j=0;j<a.length;j++,i++)
    {
      c[i]=(a[j]+b[j]+carry)%2;
      carry=(a[j]+b[j]+carry)/2;
    }
    c[0]=carry;
    for(int e:c)
      System.out.print(' ' + e);
  }
}