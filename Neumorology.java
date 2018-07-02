import java.util.*;
class Neumorology
{
    public static void main(String args[])
    {
        System.out.println("WELCOME TO OUR NEUMOROLOGY PROGRAM");
        Scanner in = new Scanner(System.in);
        int year,x=0,m=0,date,len,i,j,nluck=0,s,l,a=0,b=0,t=0;
        char ch;
        String dobluck="",month,name,y="";
        System.out.print("Enter your FULL NAME : ");
        name =in.nextLine();
        System.out.println();
        do
        {
            System.out.print("Enter your year of birth: ");
            year=in.nextInt();
            if(year<=2018)
            x=1;
            else
            System.out.println("Wrong input!! Your age cannot be in negetive");
        }while(x==0);
        System.out.println();
        do
        {
            System.out.print("Enter your month of birth(in words): ");
            month=in.next();
            if(month.equalsIgnoreCase("january")==true){
            m=1;x=1;}
            else if(month.equalsIgnoreCase("february")==true){
            m=2;x=1;}
            else if(month.equalsIgnoreCase("march")==true){
            m=3;x=1;}
            else if(month.equalsIgnoreCase("april")==true){
            m=4;x=1;}
            else if(month.equalsIgnoreCase("may")==true){
            m=5;x=1;}
            else if(month.equalsIgnoreCase("june")==true){
            m=6;x=1;}
            else if(month.equalsIgnoreCase("july")==true){
            m=7;x=1;}
            else if(month.equalsIgnoreCase("august")==true){
            m=8;x=1;}
            else if(month.equalsIgnoreCase("september")==true){
            m=9;x=1;}
            else if(month.equalsIgnoreCase("october")==true){
            m=10;x=1;}
            else if(month.equalsIgnoreCase("november")==true){
            m=11;x=1;}
            else if(month.equalsIgnoreCase("december")==true){
            m=12;x=1;}
            else{
            System.out.println("Wrong input!! This month does not exist.....");
            x=0;}
        }while(x==0);
        System.out.println();
        do
        {
            System.out.print("Enter your date of birth: ");
            date=in.nextInt();
            if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12))
            {
                if((date<=31)&&(date!=0))
                x=1;
                else{
                    if(date==0)
                    System.out.println("Date cannot be \"0\"");
                    else
                    System.out.println("The above month does not contains more than 31 days");
                    x=0;}
            }
            else if((m==4)||(m==6)||(m==9)||(m==11))
            {    
                if((date<=30)&&(date!=0))
                x=1;
                else{
                    if(date==0)
                    System.out.println("Date cannot be \"0\"");
                    else
                    System.out.println("The above month does not contains more than 30 days");
                    x=0;}
            }
            else if(m==2)
            {
                if((year%4==0)||(year%400==0)&&(year!=0))
                {
                    if((date<=29)&&(date!=0))
                    x=1;
                    else{
                        if(date==0)
                        System.out.println("Date cannot be \"0\"");
                        else
                        System.out.println("The above month does not contains more than 29 days");
                        x=0;}
                }
                else
                {
                    if((date<=28)&&(date!=0))
                    x=1;
                    else{
                        if(date==0)
                        System.out.println("Date cannot be \"0\"");
                        else
                        System.out.println("The above month does not contains more than 28 days");
                        x=0;}
                }
            }
        }while(x==0);
        System.out.println();
        System.out.println("*********************************************************************");
        name=name.toUpperCase();
        len=name.length();
        for(i=0;i<len;i++)
        {
            ch=name.charAt(i);
            if(Character.isLetter(ch)==true)
            {
                nluck=nluck+((int)ch-64);
            }
        }
        while(a!=1)
        {
            s=0;
            while(nluck!=0)
            {
                l=nluck%10;
                s=s+l;
                nluck=nluck/10;
            }
            nluck=s;
            if(((s>0)&&(s<=9))||(s==11))
            a=1;
            else
            a=0;
        }
        System.out.println();
        System.out.println("YOUR LUCKY NUMBER ACCORDING TO YOUR NAME IS : "+nluck);
        System.out.println();
        System.out.println("*********************************************************************");
        dobluck=Integer.toString(date)+Integer.toString(m)+Integer.toString(year);
        len=dobluck.length();
        for(j=0;j<len;j++)
        {
            ch=dobluck.charAt(j);
            if(Character.isDigit(ch)==true)
            {
                y=Character.toString(ch);
                t=t+Integer.parseInt(y);
            }
        }
        while(b!=1)
        {
            s=0;
            while(t!=0)
            {
                l=t%10;
                s=s+l;
                t=t/10;
            }
            t=s;
            if(((t>0)&&(t<=9))||(t==11))
            b=1;
            else
            b=0;
        }
        System.out.println();
        System.out.println("YOUR LUCKY NUMBER ACCORDING TO YOUR DATE OF BIRTH IS : "+t);
        System.out.println();
        System.out.println("*********************************************************************");
        System.out.println("THANK YOU !!!");
    }
}