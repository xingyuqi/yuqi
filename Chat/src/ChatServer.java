import java.io.IOException;
import java.net.* ;


public class ChatServer {
	public static void main(String[] args) {
		
        try {
			ServerSocket ss = new ServerSocket(8888);
			while (true){
				Socket s = ss.accept();
System.out.println("client1");
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
