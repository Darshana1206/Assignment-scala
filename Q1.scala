package Assignment

object Q1 {
  def main(args:Array[String])
  {
    var celcius=faren(35)
    println(celcius+"F")
  }
  def faren(c:Double)={
    
    val x=1.8000
    val y=32.00
     (c*x)+y
  }
    
    
}