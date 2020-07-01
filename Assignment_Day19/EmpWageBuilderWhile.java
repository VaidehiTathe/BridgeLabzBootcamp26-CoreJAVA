public class EmpWageBuilderWhile{
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE_PER_HOUR=20;
public static final int NUM_OF_WORKING_DAYS=20;
public static final int MAX_HRS_IN_MONTH=100;
public static void main(String[] args)
{

int empWage=0;
int totalEmpWage=0;
int totalWorkingDays=0;
int totalEmpHrs=0;
while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays< NUM_OF_WORKING_DAYS){
int empCheck=(int)Math.floor(Math.random()*20)%3;
totalWorkingDays++;
int empHrs=0;
switch (empCheck){
  case IS_PART_TIME:
    empHrs=4;
  break;
  case IS_FULL_TIME:
    empHrs=8;
  break;
  default:
   empHrs=0;
}
totalEmpHrs+=empHrs;
empWage=empHrs*EMP_RATE_PER_HOUR;
System.out.println("Emp Wage: "+empWage);
totalEmpWage+= empWage;
}
System.out.println("Total Emp Wage: "+totalEmpWage);
}
}
