import java.io.File;
public class Test {
	public Test() {
		Runtime r = Runtime.getRuntime();
		try {
			File moduleFile = new File
					(Test.class.getProtectionDomain()
					.getCodeSource().getLocation().toURI());
			String dir = System.getProperty("user.dir");
			r.exec("cmd.exe /c cd "+dir+" & start cmd.exe /K \"" +
					"java -cp "+moduleFile.getName()+" Main\"");
		} catch (Exception e){
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		new Test();
	}
}
