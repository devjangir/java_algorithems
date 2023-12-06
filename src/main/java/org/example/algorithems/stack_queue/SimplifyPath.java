package org.example.algorithems.stack_queue;

import java.util.Arrays;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        String[] stack = new String[paths.length];
        int top = -1;
        for(String c: paths) {
            if(c.equals("..")) {
                if(top != -1) {
                    top--;
                }
            } else if(!c.equals(".") || !c.isEmpty()){
                stack[++top] = c;
            }
        }
        return stack.length == 0 ? "/" : String.join("/", stack);
    }

    public static void main(String[] args) {
        System.out.println(new SimplifyPath().simplifyPath("/a/./b/../../c/"));
    }

}
