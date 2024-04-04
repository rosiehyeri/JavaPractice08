package com.javaex.ex05;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int result;
        
        while (true) {

            System.out.print(">> ");
            String strLine = sc.nextLine();

            if (strLine.equals("/q")) {
                System.out.println("종료합니다.");
                break;
            }

            String data[] = parseExpression(strLine);
            if (data == null) {
            	System.out.println("알 수 없는 연산입니다.");
            	continue;
            }
            
            int operand1 = Integer.parseInt(data[0]);
            String operator = data[1];
            int operand2 = Integer.parseInt(data[2]);
            
            switch (operator) {
            case "+":
                Add add = new Add();
                add.setValue(operand1, operand2);
                result = add.calculate();
                System.out.println( ">> " + result );
                break;
                
            case "-":
                Sub sub = new Sub();
                sub.setValue(operand1, operand2);
                result = sub.calculate();
                System.out.println( ">> " + result );
                break;
                
            case "*":
                Mul mul = new Mul();
                mul.setValue(operand1, operand2);
                result = mul.calculate();
                System.out.println( ">> " + result );
                break;
            
            case "/":
                Div div = new Div();
                div.setValue(operand1, operand2);
                result = div.calculate();
                System.out.println( ">> " + result );
                break;
                
            default :
                System.out.println("알 수 없는 연산입니다.");
                break;
            }
        }

        sc.close();
    }
    
    public static String[] parseExpression(String expression) {
        String pattern = "\\s*(\\d+)\\s*([+\\-*\\/])\\s*(\\d+)\\s*";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(expression);
        if (matcher.matches()) {
            String operand1 = matcher.group(1);
            String operator = matcher.group(2);
            String operand2 = matcher.group(3);
            return new String[]{operand1, operator, operand2};
        } else {
            return null;
        }
    }
}
