public class piggyBankTest
{
    public static void main(String[] args)
    {
        piggyBank bank = new piggyBank();
        bank.addQuarter();
        bank.addDime();
        bank.addDime();
        bank.addNickel();
        
        System.out.println("My total is " + bank.getTotal());
        bank.addNickel()
        System.out.println("My total is " + bank.getTotal());
    }
        
}