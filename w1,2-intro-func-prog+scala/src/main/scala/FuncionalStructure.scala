package functionalstructure

def sayName = "Joel Junior"

def getAge(yearOfBirth: Int) =
    java.time.Year.now.getValue - yearOfBirth

// Programa adaptado à estrutura funcional em Scala:
@main def main() =
    println("Name: " + sayName)
    println("Age: " + getAge(1950))