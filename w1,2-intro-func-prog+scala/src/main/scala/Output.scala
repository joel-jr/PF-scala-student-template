package outputexamples

def simplePrintln(message: String) =
    print("Message: ")
    println(message)
    println("This is a simple Scala program.")

// String interpolation with the 's' interpolator:
def stringInterpolation() =
    val name = "Scala"
    println(s"Hello, $name!")
    println(s"Random number: ${scala.util.Random.nextInt(100)}")

// String interpolation with the 'f' interpolator:
def formattedInterpolation() =
    println(f"Sine of π/2: ${math.sin(math.Pi / 2)}%.2f")
    println(f"Value of pi (π): ${math.Pi}%.4f")

@main def main() =
    println("• Simple Println:")
    simplePrintln("Hello, World! :D")
    println()
    println("• String interpolation with the 's' interpolator:")
    stringInterpolation()
    println()
    println("• String interpolation with the 'f' interpolator:")
    formattedInterpolation()