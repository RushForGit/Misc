import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;

public class TCPMesgClient {

	//Socket s;
	
	public static void main(String[] args)
	{
		try{
			Socket s = new Socket("127.0.0.1", 5556);
			//s.setConnectTimeout(1000);
			System.out.println("After call to socket\n\n" + String.valueOf(s) + "\n\n");
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Hello Rush...........How are You!!!");
			System.out.println("Hello Rush...........How are You!!!\n\n");
			dos.flush();
			dos.close();
			s.close();
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	
	}


}
