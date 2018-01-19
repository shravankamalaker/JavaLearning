public class SumOfSquares{
    public static void main(String[] args) {
        int number = 1234;
        int rem = 0;
        int result = 0;
        while( number > 0 ){
            rem = number%10;
            System.out.println("SumOfSquares rem = "+rem);
            result = result + (rem* rem);
            number = number/10;
        }
    }

    /*public void testOriginalDataPopulation(){
        //Map<String,Object> dataMap = originalFilingService.getOriginalDataFromOldEIN(289096L, 996L, MTDateUtil.convertStringToDate("6/30/2016","MM/dd/yyyy"));
        //originalFilingService.populateDataForOriginalFilingForNewEIN(289096L,996L, MTDateUtil.convertStringToDate("6/30/2016","MM/dd/yyyy"),false,dataMap);
        int number = 1234;
        int rem = 0;
        int result = 0;
        while( number > 0 ){
            rem = number%10;
            System.out.println("SumOfSquares rem = "+rem);
            result = result + (rem* rem);
            number = number/10;
        }
    }*/
}