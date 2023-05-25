import java.lang.Math;
public class calculator {
    double num1,num2,result;
    int c, output;
    public calculator(double num1,double num2,int c)
    {
        this.num1=num1;
        this.num2=num2;
        this.c=c;
    }
    public double calculate()
    {
        double val =Math.toRadians(num1);
        switch(c){
        case 1:
           result=num1+num2;
           break;
        case 2:
        result=num1-num2;
        break;
        case 3:
        result=num1*num2;
        break;
        case 4:
        result=num1/num2;
        break;
        case 5:
        result=Math.pow(num1,num2);
        break;
        case 6:
        result=Math.log10(num1);
        break;
        case 7:
        result=Math.sin(val);
        break;
        case 8:
        if (num1==90){
        result=Math.round(Math.cos(val));}
        else 
        result=Math.cos(val);
        break;
        case 9:
        if (num1==45){
            result=Math.round(Math.tan(val));}
        else
        result=Math.tan(val);
        break;
        case 10:
        result=Math.sqrt(num1);
        break;
        case 11:
        result=Math.abs(num1);
        break;
        case 12:
        result=Math.round(Math.toDegrees(Math.asin(num1)));
        break;
        case 13:
        result=Math.round(Math.toDegrees(Math.acos(num1)));
        break;
        case 14:
        result=Math.round(Math.toDegrees(Math.atan(num1)));
        break;
        case 15:
        result=Math.log(num1);
        break;
    }
        return result;
    
}
}