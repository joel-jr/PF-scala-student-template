package variables

// We use the 'var' modifier for mutable variables:
def mutableVariables() =
    var x = 10
    print(s"x = $x | ")
    x = 20
    println(s"x = $x")

    var y = "Hello"
    print(s"y = $y | ")
    y = "World"
    println(s"y = $y")

// We use the 'val' modifier for immutable variables:
def immutableVariables() =
    val x = 10
    print(s"x = $x | ")
    // x = 20 // compilation error: reassignment to val (val x can't reassingment)
    println(s"x = $x")

@main def main() =
    println("• Mutable Variables:")
    mutableVariables()
    println()
    println("• Immutable Variables:")
    immutableVariables()