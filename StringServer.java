import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    int count = 0;
    String previous = "";
    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")){
                count += 1;
                previous = previous + count + ". " + parameters[1] + "\n";
                previous = previous.replace("+"," ");
                return String.format("%s\n", previous);
            }
        } 
            return "Use /add-message keyword!";
        }
    }
class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Ports can only be from 1024 to 49151");
            return;
        }
        int port = Integer.parseInt(args[0]);
        myServer.start(port, new Handler());
    }
}
