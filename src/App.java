import java.io.FileWriter;
import java.io.IOException;


public class App {
    public static void main(String[] args) throws Exception {
        
        //only used for texting, change to own vars
        String campaignid = "test";
        String oggettoMail = "oggettoTest";
        String nome = "testnome";
        String telefono = "testtelefono";
        String email = "testemail";
        String provincia = "testprovincia";
        String messaggio = "test";
        String data = "test";
        String marker = "test";
        String extSrc = "test";
        String leadId = "test";
        String canale = "test";
        String gdpr = "test";
        String piva = "test";
         

        json(campaignid, oggettoMail, nome, telefono, email, provincia, messaggio, data, marker, extSrc, leadId, canale, gdpr, piva);
    }

    public static String json(String campaignid, String oggettoMail, String nome, String telefono, String email, String provincia, String messaggio, String data, String marker, String extSrc, String leadId, String canale, String gdpr, String piva) {
        String str =    
            "{\n"   
            + "    \"campaign.id\":\"" + campaignid + "\",\n"
            + "    \"OBJECT MAIL\":\"" + oggettoMail + "\",\n"
            + "    \"NOME\":\"" + nome + "\",\n"
            + "    \"TELEFONO\":\"" + telefono + "\",\n"
            + "    \"EMAIL\":\"" + email + "\",\n"
            + "    \"PROVINCIA\":\"" + provincia + "\",\n"
            + "    \"MESSAGGIO\":\"" + messaggio + "\",\n"
            + "    \"DATA\":\"" + data + "\",\n"
            + "    \"MARKER\":\"" + marker + "\",\n"
            + "    \"EXTERNAL SOURCE\":\"" + extSrc + "\",\n"
            + "    \"LEAD ID\":\"" + leadId + "\",\n"
            + "    \"CANALE\":\"" + canale + "\",\n"
            + "    \"REGISTRATION CONSENSO GDPR\":\"" + gdpr + "\",\n"
            + "    \"PARTITA IVA\":\"" + piva + "\"\n"
    +   "}";

    try (FileWriter myObj = new FileWriter("output.json")) {
        myObj.write(str);
        myObj.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    return str;
    }
}