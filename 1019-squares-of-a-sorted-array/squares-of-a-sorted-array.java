class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> list1= new ArrayList<>(); // for negative numbers
        ArrayList<Integer> list2= new ArrayList<>(); // for positive  ,,

        for(int i=0;i<nums.length; i++)
        {
            if(nums[i]<0)
            {
                list1.add(nums[i]);
            }
            else
            {
                list2.add(nums[i]);
            }
        }

        int listSize= list1.size()+list2.size();
        int squareArray[]= new int[listSize];
        int size1=list1.size();
        int size2=list2.size();

        if(list1.size()==0)
        {
            for(int i=0; i<list2.size(); i++)
            {
                int square= list2.get(i);
                int square1= square* square;
                list2.set(i, square1);
            }
            
            for(int j=0; j<list2.size(); j++)
            {
                squareArray[j]= list2.get(j);
            }
            return squareArray;
        }

        else if(list2.size()==0)
        {
            for(int i=0; i<list1.size(); i++)
            {
                int square= list1.get(i);
                int square2= square * square;
                list1.set(i, square2);
            }
            Collections.reverse(list1);
            for(int j=0; j<list1.size(); j++)
            {
                squareArray[j]= list1.get(j);
            }            
            return squareArray;     
        }

        else
        {
            ArrayList<Integer> list3= new ArrayList<>();

            for(int i=0; i<list1.size(); i++)
            {
                int square= list1.get(i);
                int square2= square * square;
                list1.set(i, square2);
            }

            for(int i=0; i<list2.size(); i++)
            {
                int square= list2.get(i);
                int square1= square* square;
                list2.set(i, square1);
            }
            
            Collections.reverse(list1);
            int m=0, n=0;
            while(m<size1 && n<size2)
            {
                if(list1.get(m)<=list2.get(n))
                {
                    list3.add(list1.get(m));
                    m++;
                }
                else
                {
                    list3.add(list2.get(n));
                    n++;
                }
            }
            while(n<size2)
            {
                list3.add(list2.get(n));
                n++;

            }
            while(m<size1)
            {
                list3.add(list1.get(m));
                m++;

            }
            for(int j=0; j<list3.size(); j++)
            {
                squareArray[j]= list3.get(j);
            }            
            return squareArray;  
        }
    }
}