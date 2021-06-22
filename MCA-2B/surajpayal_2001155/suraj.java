import java.io.*;
class FileMerge
{
	public static void main(String[] args) throws IOException
	{
	PrintWriter pw=new PrintWriter("three.txt");

		BufferedReader br=new BufferedReader(new FileReader("one.txt")); 
		BufferedReader br1=new BufferedReader(new FileReader("two.txt"));
		String line=br.readLine();
		String line1=br1.readLine();
		while(line!=null && line1!=null)
		{
		pw.println(line1);
		pw.println(line2);
		line=br.readLine();
		line1=br1.readLine(); 
		}
		pw.flush();
		br.close();
		pw.close();
		System.out.println("Merged ");
	FileReader pq=new FileReader("three.txt");
			int k=pq.read();
			while(k!=-1) {
				System.out.print((char)k);
				k=pq.read();
			}	
}
}