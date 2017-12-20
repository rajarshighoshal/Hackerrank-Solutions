	public static int getHeight(Node root){
        int height = 0;
        
        if(root == null){
            return -1;
        }
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        if(left > right){
            height = left + 1;
        }
        
        else{
            height = right + 1;
        }
        
        return height;
    }
