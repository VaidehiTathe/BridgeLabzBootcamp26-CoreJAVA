public class EmpWageBuilderObject{

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;

        private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;

            public EmpWageBuilderObject(String company, int empRatePerHour,int numOfWorkingDays,int maxHourPerMonth){
                       this.company=company;
                       this.empRatePerHour=empRatePerHour;
                       this.numOfWorkingDays=numOfWorkingDays;
                       this.maxHoursPerMonth=maxHourPerMonth;
                     }

                public static void main(String []args)
                {
                        EmpWageBuilderObject dMart= new EmpWageBuilderObject("DMart",20,20,100);

                        int empHrs=0, totalEmpHrs=0, totalWorkingDays=0,totalEmpWage=0,empWage=0;
                        while(totalEmpHrs <= dMart.maxHoursPerMonth && totalWorkingDays< dMart.numOfWorkingDays){
                        int empCheck=(int)Math.floor(Math.random()*20)%3;
                        totalWorkingDays++;

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
                        System.out.println("Days: "+totalWorkingDays+" Emp Hr: "+empHrs);
                }
                        totalEmpWage= totalEmpHrs*dMart.empRatePerHour;
                        System.out.println("Total Emp wage for Company "+dMart.company +" is : "+ totalEmpWage);
                }

}

