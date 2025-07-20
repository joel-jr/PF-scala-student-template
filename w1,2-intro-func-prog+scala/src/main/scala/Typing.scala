package typingvariables

// Declaração EXPLÍCITA dos tipo de vars:
def explicitTyes() =
    val x: Int = 10
    val y: String = "Hello, World!"
    val z: Boolean = true
    val pi: Double = 3.14
    val list: List[Int] = List(1, 2, 3, 4, 5)
    val map: Map[String, Int] = Map("one" -> 1, "two" -> 2, "three" -> 3)
    
    List(x, y, z, pi, list, map)
        .foreach(item => println(s"${item.getClass.getSimpleName}: $item"))

// Declaração IMPLÍCITA dos tipos de vars:
def inferredTypes() =
    val x = 10
    val y = "Hello, World!"
    val z = true
    val pi = 3.14
    val list = List(1, 2, 3, 4, 5)
    val map = Map("one" -> 1, "two" -> 2, "three" -> 3)

    List(x, y, z, pi, list, map)
        .foreach(item => println(s"${item.getClass.getSimpleName}: ${item}"))

@main def main() =
    println("• Explicit Types:")
    val returnType1 = explicitTyes()
    println()
    println("• Inferred Types:")
    val returnType2 = inferredTypes()
    println()
    // Ambas funções são do tipo Unit e retornam void:
    // Both functions are of Unit type and return void:
    println(s"• Return types from both functions: \n${returnType1.getClass.getSimpleName} and ${returnType2.getClass.getSimpleName()}")