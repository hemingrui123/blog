package com.example.demo.component;

public class JavaScriptCheck {

    public static String javaScriptCheck(String comment){
        int begin,end,theEnd;
        String newStr = "";
        begin = comment.indexOf("<script");
        end = comment.indexOf("</script>");
        if (begin == -1){
            return comment;
        }
        while (begin != -1){
            theEnd = comment.indexOf(">");
            newStr += comment.substring(0, begin);
            newStr += "[removed]" + comment.substring(theEnd+1,end) + "[removed]";

            comment = comment.substring(end+9);

            begin = comment.indexOf("<script");
            end = comment.indexOf("</script>");
        }
        return newStr;
    }
}
