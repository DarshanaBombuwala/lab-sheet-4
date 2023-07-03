import scala.io.StdIn
  
  object question{
      
        def patternmatch(k : Int): String = k match{
            case n if n<0 => "Negative"
            case 0 => "Zero"
            case n if n%2==0 => "Even number is given"
            case n if n%2==1 => "Odd number is given"
            case _n => "Error"
        }
            

        def main(args:Array[String]): Unit={  
            println("Enter an Integer: ")
            val j = StdIn.readInt()
            
            var m= patternmatch(j)
            println(m)
        }  
 
  }