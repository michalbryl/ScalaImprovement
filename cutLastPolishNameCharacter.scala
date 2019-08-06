def cutLastPolishNameCharacter(name: String): String = {
  if (name == null) return ""
  val modified: String = name.trim()
  modified.toLowerCase().takeRight(2) match {
    case "ki" | "ka" => modified.dropRight(1)
    case _ => modified
  }
}