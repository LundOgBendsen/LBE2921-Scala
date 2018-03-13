package traits

object traits {

	def error(msg:String) = throw new Error(msg)
                                                  //> error: (msg: String)Nothing

	//error("Nothing - really?")
	
	val x = null                              //> x  : Null = null
	
	//int is not a nullable type
	//val z:Int = null
	
	if(true)1 else false                      //> res0: AnyVal = 1
	
}