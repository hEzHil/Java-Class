public class CommandLine {
  public static void main(String[] args){
     if(args.length > 0) {
	for(String arg :args){
		System.out.println("Arguments : " + arg);
	} 
	} else{
		System.out.println("NO arguments passed " );
	}
     }
  }
