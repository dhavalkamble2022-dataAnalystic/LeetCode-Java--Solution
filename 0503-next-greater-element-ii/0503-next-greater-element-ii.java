// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         ArrayList<Integer> a=new ArrayList<>();
//         a[0]=-1;
//         Stack<Integer> s=new Stack<>();
//         s.push(a[0]);
//         for(int i=1; i<nums.length(); i++)
//         {
//             while(!s.isEmpty() && s.top<=a[i])
//             {
//                 s.pop();
//                 if(s.isEmpty())
//                 {
//                     a[i]=-1;
//                 }else{
//                     a[i]=s.top();
//                 }
//                 s.push(a[i]);
//             }

//         }
//         return res;
//     }
// }

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        Stack<Integer> s = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!s.isEmpty() && s.peek() <= nums[i % n]) {
                s.pop();
            }

            if (i < n) {
                if (s.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = s.peek();
                }
            }

            s.push(nums[i % n]);
        }

        return res;
    }
}