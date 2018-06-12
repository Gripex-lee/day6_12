package day6_12;

import java.text.DecimalFormat;  
import java.util.Scanner;  
  
public class J213 {  
    public static final String STR_UNIT[] = { "", "拾", "佰", "仟", "万", "拾",  
            "佰", "仟", "亿", "拾", "佰", "仟" };  
    public static final String STR_NUMBER[] = { "零", "壹", "贰", "叁", "肆", "伍",  
            "陆", "柒", "捌", "玖" };  
    public static final String STR_UNIT1[] = { "毛", "分", "厘" };  
  
    public static void main(String[] args) {  
        Scanner br = new Scanner(System.in);  
        String convert = convert(br.nextDouble());  
        System.out.println(convert);
    }  
  
    public static String convert(double d) {  
        DecimalFormat df = new DecimalFormat("#0.###");  
        String strNum = df.format(d);  
        if (strNum.indexOf(".") != -1) {  
            String num = strNum.substring(0, strNum.indexOf("."));    
        }  
        String point = "";  
        if(strNum.indexOf(".")!=-1){  
            point="元";  
        }else{  
            point="元整";  
        }  
        String result = getInteger(strNum) + point + getDecimal(strNum);  
        if(result.startsWith("元整")){  
             result="零元";  
         }  
         if(result.startsWith("元")){  
         result=result.substring(1,result.length());  
         }  
         return result;  
    }  
  
    public static String getInteger(String num) {  
        if (num.indexOf(".") != -1) {  
            num = num.substring(0, num.indexOf("."));  
        }  
        num = new StringBuffer(num).reverse().toString();  
        StringBuffer temp = new StringBuffer();  
        for (int i = 0; i < num.length(); i++) {  
            temp.append(STR_UNIT[i]);  
            temp.append(STR_NUMBER[num.charAt(i) - 48]);  
        }  
        num = temp.reverse().toString();  
        num = num.replaceAll("零元", "元");  
        num = num.replaceAll("零拾", "");  
        num = num.replaceAll("零佰", "");  
        num = num.replaceAll("零仟", "");  
        num = num.replaceAll("零万", "万");  
        num = num.replaceAll("零亿", "亿");  
        num = num.replaceAll("亿万", "亿");  
        if (num.lastIndexOf("零") == num.length() - 1) {  
            num = num.substring(0, num.length() - 1);  
        }  
        return num;  
    }  
  
    public static String getDecimal(String num) {  
        if (num.indexOf(".") != -1) {  
            num = num.substring(num.indexOf(".") + 1, num.length());  
        } else  
            return "";  
        StringBuffer temp = new StringBuffer();  
        for (int i = 0; i < num.length(); i++) {  
            temp.append(STR_NUMBER[num.charAt(i) - 48]);  
            temp.append(STR_UNIT1[i]);  
            }  
        num=temp.toString();  
        num = num.replaceAll("零毛", "");  
        num = num.replaceAll("零分", "");  
        num = num.replaceAll("零厘", "");  
        return num;  
    }  
} 
