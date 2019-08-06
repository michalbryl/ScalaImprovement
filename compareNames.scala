object Main {
   def main(args: Array[String]) {
      val name = "Jan Wojciechowski"
      val secondName = "Wojciechowski Jan"
      println(parseMiddleName(name, secondName))
   }
   
   def parseMiddleName(name :String, secondName :String): Boolean={
       if (name == null || name.equals("") || secondName.equals("") || secondName == null) return false;
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
