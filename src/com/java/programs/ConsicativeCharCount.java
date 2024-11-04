package com.java.programs;

public class ConsicativeCharCount {
    public static void main(String[] args) {
        // input: "abccaaadcccca"
        // output: "1a1b2c3a1d4c1a"

        String input = "abccaaadcccc";
        int count = 1;
       char prev = input.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i=1; i < input.length(); i++)
        {
           char curr = input.charAt(i);
          if(curr == prev)
              count++;
          else{
              sb.append(count).append(prev);
              count = 1;
              prev = curr;
          }

          /* // WORKING
          while(i+1 < input.length() && input.charAt(i) == input.charAt(i+1))
            {
            i++;
            count++;
            }
            sb.append(count).append(input.charAt(i+1));
            count = 1;
            */
        }
        sb.append(count).append(prev);

        System.out.println(sb);
        System.out.println("..........");
        countStr(input);
    }

    static  void countStr(String input)
    {

        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i < input.length(); i++) {
        if(i==input.length()-1)
        {
            sb.append(count).append(input.charAt(i));
        }else{
           char ch = input.charAt(i);
            if( ch == input.indexOf(i+1)){
                count++;
            }else{
                sb.append(count).append(input.charAt(ch));
                count = 1;
            }
        }
        }
        System.out.println(sb);

    }
}
