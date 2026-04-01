class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String [] arr = path.split("/");
        StringBuilder sb = new StringBuilder();
        for(String st: arr){
            if(st.equals(".") || st.equals("")){
                continue;
            } else if(st.equals("..")  ){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                
            }else{
                stack.push(st);
            }
        }    
        for(String dir: stack){
            sb.append("/").append(dir);
        }
        if(sb.length()==0){
            return "/";
        }
        return String.valueOf(sb);
    }
}
