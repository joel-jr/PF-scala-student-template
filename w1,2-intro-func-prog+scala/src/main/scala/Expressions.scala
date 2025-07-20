package expressions

def arithmeticExpressions() =
    val x = 10
    val y = 5
    println(s"$x + $y = ${x +y}")
    println(s"$x - $y = ${x -y}")
    println(s"$x * $y = ${x *y}")
    println(s"$x / $y = ${x /y}")
    println(s"$x % $y = ${x %y}")

def logicalExpressions() =
    val a = true
    val b = false
    println(s"$a && $b: ${a && b}")
    println(s"$a || $b: ${a || b}")
    println(s"!$a: ${!a}")

def relationExpressions() =
    val x = 10
    val y = 20
    println(s"$x < $y: ${x < y}")
    println(s"$x > $y: ${x > y}")
    println(s"$x <= $y: ${x <= y}")
    println(s"$x >= $y: ${x >= y}")
    println(s"$x == $y: ${x == y}")
    println(s"$x != $y: ${x != y}")

def blockExpressions() =
    val result =
        val x = 10
        val y = 20
        x + y
    println(s"Block expression result: $result")

def conditionalExpressions() =
    val x = 10
    val y = 20
    
    val max = if (x > y) x else y
    println(s"Max of $x and $y is: $max")
    val isEven = if (x % 2 == 0) "even" else "odd"
    println(s"$x is $isEven")
    
    val totalItems = 12
    val price = if (totalItems > 10)
        val pricePerItem = 100
        val tax = 0.1
        totalItems * pricePerItem * (1 + tax)
    else
        val pricePerItem = 150
        val comission = 0.2
        totalItems * pricePerItem * (1 + comission)
    println(s"Total price for $totalItems items is: $price")

@main def main() =
    println("• Arithmetic Expressions:")
    arithmeticExpressions()
    println()
    println("• Logical Expressions:")
    logicalExpressions()
    println()
    println("• Relation Expressions:")
    relationExpressions()
    println()
    println("• Block Expressions:")
    blockExpressions()
    println()
    println("• Conditional Expressions:")
    conditionalExpressions()