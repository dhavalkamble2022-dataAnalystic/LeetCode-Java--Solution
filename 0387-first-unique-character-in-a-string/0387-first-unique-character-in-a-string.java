class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        HashMap<Character, Integer> h=new HashMap<>();
        for(int i=0; i<n ; i++)
        {
            char ch=s.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
            for(int i=0 ; i<n ; i++)
            {
                char ch=s.charAt(i);
                if(h.get(ch)==1)
                {
                    return i;
                }

            }
            return -1;
        }
    }
