package zz;
class Calculator {
    int value;
    
    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    void minus(int val) {
        this.value -= val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int val) {
        boolean chkOdd;

        if (val%2 == 0) {
            chkOdd = false;
        } else {
            chkOdd = true;
        }

        return chkOdd;
    }

    int avg(int[] dataArr) {

        int sum = 0;
        int average = 0;
        
        for(int i = 0; i < dataArr.length; i++) {
            sum += dataArr[i];
        }
        
        average = sum / dataArr.length;

        return average;
    }
}

class MaxLimitCalculator extends Calculator {
    void add(int val) {
        this.value += val;

        if (this.value > 100) {
            this.value = 100;
        }
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        
        int[] data = {1, 3, 5, 7, 9};
        
        Calculator cal = new Calculator();
        // MaxLimitCalculator cal = new MaxLimitCalculator();

        cal.add(10);
        cal.minus(2);

        System.out.println(cal.avg(data));
        System.out.println(cal.isOdd(3));
        System.out.println(cal.isOdd(4));
        System.out.println(cal.getValue());
    }
}   
