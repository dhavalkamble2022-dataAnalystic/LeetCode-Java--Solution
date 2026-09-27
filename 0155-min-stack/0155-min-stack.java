// class MinStack {
//           Stack<Integer> s=new Stack<>();
//     public MinStack() {

//     }
    
//     public void push(int value) {
//         s.push(value);
//     }
    
//     public void pop() {
//         s.pop();
//     }
    
//     public int top() {
//       return  s.peek();
//     }
    
//     public int getMin() {
//        int min=s.peek();
//        for(int value:s)
//        {
//         if(value<min)
//         {
//             min=value;
//         }
//        }
    
//     return min;
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

 class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
    }

    public void push(int value) {
        s.push(value);

        if (min.isEmpty() || value <= min.peek()) {
            min.push(value);
        }
    }

    public void pop() {
        if (s.peek().equals(min.peek())) {
            min.pop();
        }
        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min.peek();
    }
}