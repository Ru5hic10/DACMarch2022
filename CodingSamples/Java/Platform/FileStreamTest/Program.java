import java.io.*;

class Program {

	private static final int BUF_SIZE = 80;

	public static void main(String[] args) throws Exception {
		try(var input = new FileInputStream(args[0])){
			try(var output = new FileOutputStream(args[1])){
				byte[] buffer = new byte[BUF_SIZE];
				while(input.available() > 0){
					int n = input.read(buffer, 0, BUF_SIZE);
					Transformer.transform(buffer, n);
					output.write(buffer, 0, n);
				}
			}
		}
	}
}

