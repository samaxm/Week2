/**
  * Created by Administrator on 2017/1/11.
  */
class Week2 {

  def pascal(row:Int,col:Int):Int={
    if(col>row){
      throw new IllegalArgumentException
    }
    if(row==col||col==1){
      return 1
    }else{
      return pascal(row-1,col-1)+pascal(row-1,col)
    }
  }


  def balance(chars:List[Char]):Boolean={
      return doBalance(chars,0)
  }

  def doBalance(chars:List[Char],count:Int):Boolean={
      if(count<0){
        return false
      }
      chars match {
        case Nil=>{
          if(count==0){
            return true
          }else{
            return false
          }
        }
        case '('::t=>{
          doBalance(t,count+1)
        }
        case ')'::t=>{
          doBalance(t,count-1)
        }
        case c::t=>{
          doBalance(t,count)
        }
      }
  }

  def afunc(): Unit ={

  }


}


object Week2{


  def main(args: Array[String]): Unit = {
    val Week2=new Week2
    println(Week2.pascal(5,3))
    println(Week2.balance("(if (zero? x) max (/ 1 x))".toList));
    println(Week2.balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList));
    println(Week2.balance("(()))".toList));

  }
}
