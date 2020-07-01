public class EmpWageBuilderObjectMethod{

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;

        private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;

            public EmpWageBuilderObjectMethod(String company, int empRatePerHour,int numOfWorkingDays,int maxHourPerMonth){
                       this.company=company;
                       this.empRatePerHour=empRatePerHour;
                       this.numOfWorkingDays=numOfWorkingDays;
                       this.maxHoursPerMonth=maxHourPerMonth;
                     }

                        private int computeEmpWage(){
                                //Variables
                                int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;
                                while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays< numOfWorkingDays){
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
                                                                return totalEmpHrs * empRatePerHour;
                        }

                public static void main(String []args)
                {
                        EmpWageBuilderObjectMethod dMart= new EmpWageBuilderObjectMethod("DMart",20,2,10);
                        EmpWageBuilderObjectMethod bigBasket= new EmpWageBuilderObjectMethod("bigBasket",10,2,7);
                        System.out.println("Total Emp wage for Company "+dMart.company +" is : "+ dMart.computeEmpWage());
			System.out.println("Total Emp wage for Company "+bigBasket.company +" is : "+bigBasket.computeEmpWage());
                }

}

