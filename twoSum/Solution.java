package twoSum;
//time limit exceed
public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		
		if(numbers == null)return null;
		int result[] = new int[2];//用于存储编号
		//备份数组，用于后面查找位置
		int numberBackUp[] = new int[numbers.length]; 
		for(int i=0;i<numbers.length;i++)
		{
			numberBackUp[i] = numbers[i];
		}
		//快速排序，先把数组升序排列
		quickSort(numbers,0,numbers.length-1);
		int head = 0,tail = numbers.length-1;
		
		//类似二分查找，首尾相加得到中间值，分成三种情况
		while(head<tail)
		{
			if((numbers[head]+numbers[tail])==target)
			{
				System.out.println("head="+head);
				System.out.println("tail="+tail);
				for(int i=0;i<numberBackUp.length;i++)
				{
					if(numberBackUp[i] == numbers[head])
					{
						result[0]=(i+1);
						System.out.println("firstNum="+i);
					}
					
					if(numberBackUp[i] == numbers[tail])
					{
						result[1]=(i+1);
						System.out.println("secondNum="+i);
					}
					if((result[0]!=0)&&(result[1]!=0))break;
				}
				
				return result;
			}
			else if((numbers[head]+numbers[tail])>target)
			{
				tail--;
			}
			else{
				head++;
			}
		}
		
		return null;
        
    }
	
	private int partition(int[] a,int low,int high)
	{		
		//设置两个指针，初始值分别指向数组的头和尾，之后均向中间聚拢
		int i=low,j=high;
		boolean forward = true;
		//选取第一个元素作为基准，从后往前搜索，小于基准则与之交换；之后再从前往后搜索，大于基准再与之交换；重复前面步骤
		while(i<j)
		{
			//从后向前搜索
			if(forward){
				if(a[j]<a[i])
				{
					swap(a,i,j);//找到比基准小的数，互换位置
					forward = !forward;//开始从前向后搜索，此时基准位于a[j]处
				}
				else
				{
					j--;//未找到比基准小的数，继续向前遍历
				}
			}
			//从前向后搜索
			else{
				if(a[i]>a[j])
				{
					swap(a,i,j);//找到比基准大的数，互换位置
					forward = !forward;//开始从后向前搜索，此时基准位于a[i]处
				}
				else{
					i++;//未找到比基准小的数，继续向后遍历
				}
			}
		}
		return i;
	}
	//交换数组中的两个数据
	private void swap(int[] a,int i,int j)
	{
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	//快速排序主程序
	public void quickSort(int a[],int low,int high)
	{
		if(low<high){
			int middle = partition(a,low,high);
			quickSort(a,low,middle-1);
			quickSort(a,middle+1,high);
		}		
	}
}
