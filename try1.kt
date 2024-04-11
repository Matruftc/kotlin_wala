fun main (){
    val str = getNumber("67.9")
    print(str)
  }
  
  fun getNumber(str:String):Int {
    return try {
      Integer.parseInt(str)
    }
    
    catch ( e: NumberFormatException)
    {
      0
    }
  }