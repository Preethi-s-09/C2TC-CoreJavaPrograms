package day2.input;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		URL resource =FileReaderDemo.class.getResource("MVIT_c67.txt");
		if(resource==null) {
			System.err.println("File not found");
			return;
		}
		File file=new File(resource.getFile());
		FileReader fileReader =new FileReader(file);
		BufferedReader reader=new BufferedReader(fileReader);
		String Line;
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();

	}

}

