public class Solution {
    Stack stack = new Stack();
    Queue<Character> queue = new LinkedList<Character>();
    
    void pushCharacter(char ch){
        stack.push(ch);
    }
    
    char popCharacter(){
        char ch = (Character) stack.pop();
        return ch;
    }
    
    void enqueueCharacter(char ch){
        queue.add(ch);
    }
    
    char dequeueCharacter(){
        return queue.poll();
    }