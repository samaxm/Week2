/**
  * Created by Administrator on 2017/1/18.
  */

abstract class Set

object Set{
  type Set =Int =>Boolean

  def Empty:Set={x=>false}

  def contains(s: Set, elem: Int): Boolean = s(elem)

  def singletonSet(ele:Int) : Set= { x:Int=> if (x==ele) true else false}

  def union(s:Set,t:Set):Set={
    x:Int=> if(s(x) || t(x)) true else false
  }

  def intersect(s:Set,t:Set):Set={x:Int=> if(s(x)&&t(x)) true else false}

  def diff(s:Set,t:Set):Set={x:Int=> if(s(x)==true&&t(x)==false||s(x)==false&&t(x)==true) true else false}

  def forall(s:Set,p:Int=>Boolean):Boolean={
    def iterate(x:Int): Boolean ={
        if(x>1000)
          true
        else if(s(x)==true&&p(x)==false)
          false
        else
          iterate(x+1)

    }
      iterate(-1000)
  }


  def exists(s:Set,p:Int=>Boolean):Boolean={
    def iterate(x:Int): Boolean ={
      if(x>1000)
        false
      else if(s(x)==true&&p(x)==true)
        true
      else
        iterate(x+1)

    }
    iterate(-1000)
  }

  def map(s:Set ,f:Int=>Int):Set= {
    def iterate(x: Int,set:Set): Set = {
      if(x>1000)
        return set
      else if (s(x)) {
        val newSet=Set.union(set,singletonSet(f(x)))
        iterate(x+1,newSet)
      }else iterate(x + 1,set)
    }
    iterate(-1000,Empty)
  }

  def apply(int: Int):Set = singletonSet(int)

  def testFunSet()={
    val set=Set.union(Set(1),Set(2))
    val set2=Set.union(Set(3),Set(4))
    val set3=Set.map(set,x=>x*x)
    val set4=Set.diff(set2,set3)
    val set5=Set.intersect(set,set4)
    println(Set.exists(set4,x=>x%2==0))
    println(Set.forall(set4,x=>x%2!=0))
    println(Set.contains(set3,3))
    for(x<-1 to 4){
      if(set(x)){
        println(x)
      }
    }
    println("=========")
    for(x<-1 to 4){
      if(set2(x)){
        println(x)
      }
    }
    println("=========")
    for(x<-1 to 4){
      if(set3(x)){
        println(x)
      }
    }
    println("=========")
    for(x<-1 to 4){
      if(set4(x)){
        println(x)
      }
    }
    println("=========")
    for(x<-1 to 4){
      if(set5(x)){
        println(x)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    print("a">"Ab")
  }
}
