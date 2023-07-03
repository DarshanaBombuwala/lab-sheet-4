import scala.io.StdIn
  
object Question{
      
        def calinterest(depamount : Int): Float = depamount match{
            case n if 0<n && n<20000 => depamount.toFloat * 0.02f
            case n if n>20000 && n <200000 => depamount.toFloat * 0.04f
            case n if n>200000 && n<2000000 => depamount.toFloat * 0.035f
            case n if n>2000000 => depamount.toFloat * 0.065f  
            case _ => -1.0f  
        }
        
        def main(args:Array[String]): Unit={  
          println("Enter your deposit amount: ")
          val amount = StdIn.readInt()
          
          var inter:Float= calinterest(amount)
          println(if (inter == -1.0f) then "Wrong Input!!!" else inter)
        }  
 
  }
