/**
  * Created by Administrator on 2017/1/16.
  */
class Week3 {

  def startRobot(f:String=>String):Unit={
    val input=io.StdIn.readLine()
    if(!input.equals("bye")){
      println(f(input))
      startRobot(f)
    }else{
      println("bye~")
    }
  }

  def forCheck(text:String): String ={
      if(text.equals(for(c<-text if c=='\t'&&c==' ') yield c))
        return "Fine. Be that way."
      else if(text.equals(for(c<-text if c==c.toUpper) yield c))
        return "Whoa, chill out!"
      else if(text.last=='?')
        return "Sure"
      else
        return "Whatever."
  }

  def RecursionCheck(text:String):String={
    def checkUserRecursion(text:String,isAllBlank:Boolean=true,isAllCapital:Boolean=true,index:Int=0): String ={
      if(index==text.length){
        if(isAllBlank)
          return "Fine. Be that way."
        else if(isAllCapital)
          return "Whoa, chill out!"
        else if(text.last=='?')
          return "Sure"
        else
          return "Whatever."
      }else{
        val c=text.charAt(index)
        if(c=='\t'||c==' ')
          checkUserRecursion(text,isAllBlank,isAllCapital,index+1)
        else if(c==c.toUpper)
          checkUserRecursion(text,false,isAllCapital,index+1)
        else
          checkUserRecursion(text,false,false,index+1)
      }

    }
    return checkUserRecursion(text)
  }
}

object Week3{

  def main(args: Array[String]): Unit = {
    val week3=new Week3
    week3.startRobot(week3.forCheck)
//    week3.startRobot(week3.RecursionCheck)
  }
}
