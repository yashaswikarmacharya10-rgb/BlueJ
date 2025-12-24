package week6;


/**
 * Write a description of class scenario_question here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenario_question
{
    public static void main(String [] args)
    {
        String [] categories={"friction","Nepal"};
        String [][] titles= {{"Asahamati-5"},{"Ghar"}};
        double[][] Price= {{750.0}, {650.0}};
        for(int i=0; i< categories.length; i++){
            String Titles= titles[i][0];
            double Prices= Price[i][0];
            if(Titles== null){
                Titles= "[No Title Available]";
            }
            System.out.println(categories[i] + " : " + Titles + " Rs " + Prices);
        }

    }
}
    
