package zigzagConversion;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public String convert(String s, int nRows) {
		StringBuilder result = new StringBuilder();
		
		List[] resultArrayList = new List[nRows];
		//List<List<Character>> resultList = new ArrayList<List<Character>>();
		char[] inputChars = s.toCharArray();
		int inputSize = inputChars.length;
		
		int count = 0;
		for(int i=0;i<nRows;i++)
		{
			//����һ��nRowsάList��ÿһά��Ž���е�һ��
			List<Character> list = new ArrayList<Character>();
			resultArrayList[i] = list;
		}
		
		while(count<inputSize)
		{
			//����ɨ��һ��
			
			for(int j=0;j<nRows;j++)
			{
				if(count<inputSize)
					resultArrayList[j].add(inputChars[count]);
				else break;
				count++;
			}
			//б��ɨ��һ��
			
			for(int j=nRows-2;j>0;j--)
			{
				if(count<inputSize)
					resultArrayList[j].add(inputChars[count]);
				else break;
				count++;
			}
		}
		
		for(int i=0;i<nRows;i++)
		{
			ArrayList<Character> list = new ArrayList<Character>();
			list = (ArrayList<Character>) resultArrayList[i];
			for(int j = 0;j<list.size();j++)
			{
				result.append(list.get(j).toString());
			}
		}
		return result.toString();
        
    }
}
