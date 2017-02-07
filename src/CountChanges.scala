/**
  * Created by Administrator on 2017/1/12.
  */
class CountChanges {

  import CountChanges._

  def getCoins(money:Int):Int={

    0
  }

  def tryCharge(money:Int,coins:List[Int],collect:List[Int] ):Unit={
      if(money==0){
        count+=1
        print(collect)
        return
      }
      if(money<0||coins.length==0){
        return
      }
      tryCharge(money-coins.head,coins.tail,coins.head::collect)
      tryCharge(money,coins.tail,collect)
  }



}


object CountChanges{
    val coins=List(1,5,5,10,20,50)
  var count=0

  def main(args: Array[String]): Unit = {
      val CountChanges=new CountChanges
      CountChanges.tryCharge(20,coins,List())
      print(count)
  }

}