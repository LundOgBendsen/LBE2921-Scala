package traits

object traits {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 

	def error(msg:String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(47); 

	//error("Nothing - really?")
	
	val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(76); val res$0 = 
	
	//int is not a nullable type
	//val z:Int = null
	
	if(true)1 else false;System.out.println("""res0: AnyVal = """ + $show(res$0))}
	
}
