object Main {
   def main(args: Array[String]) {
      val name = "Snow John"
      val secondName = "John Snow W."
      println(parseMiddleName(name, secondName))
   }
   
   def parseMiddleName(name :String, secondName :String): Boolean={
       if (name.equals("") || name.equals(null) || secondName.equals("") || secondName.equals(null)) return false;
       val name1 = parseShortCutName(name)
       val secondName1 = parseShortCutName(secondName)
       if(name1.equals(secondName1)){return true;}
       else{
           if(stringSort(name1).equals(stringSort(secondName1))){return true;}
           return false;
        }
   }
   
   def parseShortCutName(name :String): String={
       return name.replaceAll("(.[.])", "").replaceAll("\\s\\s"," ").trim()
   }
   
   def stringSort(name: String): String ={
       return name.split(" ").sorted.mkString(" ");
   }
}
