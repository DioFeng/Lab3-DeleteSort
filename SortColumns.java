import java.util.ArrayList;
import java.util.List;
public class SortColumns
{
	private String[] sample;

	ArrayList<Integer> output = new ArrayList<Integer>();

 //Fuction

	private List<Integer> minDeletionSize(String[] a)
	{
		for(int i = 0; i< a.length;i++)
		{
			
			for(int j = 0; j<a.length-1;j++)
			{
				//check if not in sorted order
				if(a[j].charAt(i)>a[j+1].charAt(i))
				{
					output.add(i);
					break;
				}
				//check if input has different length of Strings 
				if(a[i].length()!=a[j+1].length())
				{
					output.add(-1);
					return output;
				}
				//check if input is already sort in non-decreasing order and no indice can be delete
				if(a[i].charAt(i)<a[j+1].charAt(i) && (a[i].length()&a[j+1].length())==1)
				{
					return output;
				}		
				else
				{
					continue;
				}
			}
		}
		return output;
	}

	//helper method to generate the input array
	private void generateSample(String[] a)
	{	
		sample = new String[a.length];
		for(int i = 0; i<a.length; i++)
			sample[i]=a[i];
	}
	//helper method toString to visualize the array
 	public String toString()
  	{
	  	String result = "Input: A={ ";
	  	for(int i=0; i<sample.length;i++)
	  		result+=sample[i]+" ";
	  	return result+"}";
  	}

 	public static void main(String[] args)
  {
  	 String[] inputArray1 = {"cba","daf","ghi"};
	//Expected output: {1}
	 String[] inputArray2 = {"a","b"};
	//Expected output: {}
	 String[] inputArray3 = {"zyx","wvu","tsr"};
	//Expected output: {0,1,2}
	 String[] inputArray4 = {"Captain","Marvel","saved", "the", "Avengers"};
	//Expected output: {-1}

  	SortColumns s = new SortColumns();
  	s.generateSample(inputArray1);
  	System.out.println(s.toString());
  	System.out.println("Output: "+s.minDeletionSize(inputArray1));
  	System.out.println();

  	SortColumns s1 = new SortColumns();
  	s1.generateSample(inputArray2);
  	System.out.println(s1.toString());
  	System.out.println("Output: "+s1.minDeletionSize(inputArray2));
  	System.out.println();

  	SortColumns s2 = new SortColumns();
  	s2.generateSample(inputArray3);
  	System.out.println(s2.toString());
  	System.out.println("Output: "+s2.minDeletionSize(inputArray3));
  	System.out.println();

  	SortColumns s3 = new SortColumns();
  	s3.generateSample(inputArray4);
  	System.out.println(s3.toString());
  	System.out.println("Output: "+s3.minDeletionSize(inputArray4));

  }

}
