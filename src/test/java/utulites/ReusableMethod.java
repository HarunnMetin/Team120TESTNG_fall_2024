package utulites;

public class ReusableMethod {

    public static void bekle(int saniye) throws InterruptedException {

        try {

            Thread.sleep(saniye*1000);

        }catch (NullPointerException e){

            throw e;
        }

    }
}
