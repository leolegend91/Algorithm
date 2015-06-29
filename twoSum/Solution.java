package twoSum;
//time limit exceed
public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		
		if(numbers == null)return null;
		int result[] = new int[2];//���ڴ洢���
		//�������飬���ں������λ��
		int numberBackUp[] = new int[numbers.length]; 
		for(int i=0;i<numbers.length;i++)
		{
			numberBackUp[i] = numbers[i];
		}
		//���������Ȱ�������������
		quickSort(numbers,0,numbers.length-1);
		int head = 0,tail = numbers.length-1;
		
		//���ƶ��ֲ��ң���β��ӵõ��м�ֵ���ֳ��������
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
		//��������ָ�룬��ʼֵ�ֱ�ָ�������ͷ��β��֮������м��£
		int i=low,j=high;
		boolean forward = true;
		//ѡȡ��һ��Ԫ����Ϊ��׼���Ӻ���ǰ������С�ڻ�׼����֮������֮���ٴ�ǰ�������������ڻ�׼����֮�������ظ�ǰ�沽��
		while(i<j)
		{
			//�Ӻ���ǰ����
			if(forward){
				if(a[j]<a[i])
				{
					swap(a,i,j);//�ҵ��Ȼ�׼С����������λ��
					forward = !forward;//��ʼ��ǰ�����������ʱ��׼λ��a[j]��
				}
				else
				{
					j--;//δ�ҵ��Ȼ�׼С������������ǰ����
				}
			}
			//��ǰ�������
			else{
				if(a[i]>a[j])
				{
					swap(a,i,j);//�ҵ��Ȼ�׼�����������λ��
					forward = !forward;//��ʼ�Ӻ���ǰ��������ʱ��׼λ��a[i]��
				}
				else{
					i++;//δ�ҵ��Ȼ�׼С����������������
				}
			}
		}
		return i;
	}
	//���������е���������
	private void swap(int[] a,int i,int j)
	{
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	//��������������
	public void quickSort(int a[],int low,int high)
	{
		if(low<high){
			int middle = partition(a,low,high);
			quickSort(a,low,middle-1);
			quickSort(a,middle+1,high);
		}		
	}
}
