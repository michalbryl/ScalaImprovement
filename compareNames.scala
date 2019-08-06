object compareNames {
   def main(args: Array[String]) {
      val name = "Snow John"
      val secondName = "John Snow W."
      println(parseMiddleName(name, secondName))
   }
   
   def parseMiddleName(name :String, secondName :String): Boolean={
       if (name.equals("") || name.equals(null) || secondName.equals("") || secondName.equals(null)) return false;
       if(parseShortCutName(name)==parseShortCutName(secondName)){return true;}
       else{
           if(stringSort(parseShortCutName(name)).equals(stringSort(parseShortCutName(secondName)))){return true;}
           return false;
        }
   }
   
   def parseShortCutName(name :String): String={
       if(name.equals("") || name.equals(null)) return ""
       return name.replaceAll("(.[.])", "").replaceAll("\\s\\s"," ").trim()
   }
   
   def stringSort(name: String): String ={
       return name.split(" ").sorted.mkString(" ");
   }
}