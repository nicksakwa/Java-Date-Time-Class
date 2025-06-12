import java.time.LocalDatetime;
import java.time.format.DateTimeFormatter;

public class main{
    public static void main(String[] args){
        LocalDatetime myDateObj=LocalDatetime.now();
        System.out.println("Before formatting:" + myDateObj);

        DateTimeFormatter myFormatOBj=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");

        String formattedDate= myDateObj.format(myFormatOBj);
        Sytem.out.println("After formatting:"+ formattedDate);
    }
}