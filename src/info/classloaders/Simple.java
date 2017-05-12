package info.classloaders;

public class Simple {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		ClassLoader classloader = Simple.class.getClassLoader();
		try {
			Class reference = classloader.loadClass("info.classloaders.Myclass");
			Object obj=reference.newInstance();
			((Myclass)obj).dynamic();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
