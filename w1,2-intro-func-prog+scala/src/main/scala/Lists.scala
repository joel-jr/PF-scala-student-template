package lists

def createLists() =
    val emptyList = Nil
    val numbers = List(1, 2, 3, 4, 5)
    val names = List("Alice", "Bob", "Charlie")
    val mixed = List(1, "two", 3.0)

    println(s"Empty list: $emptyList")
    println(s"Number list: $numbers")
    println(s"Name list: $names")
    println(s"Mixed list: $mixed")

def emptyList() =
    val emptyList1 = List()
    val emptyList2 = Nil

    println(s"Empty list1: $emptyList1")
    println(s"Empty list2: $emptyList2")

def consOperator() =
    val numbers = List(2, 3, 4)
    println(s"Original number list: $numbers")

    val newList = 1 :: numbers
    println(s"After prepending 1: $newList")
    
    val anotherList = 0 :: 1 :: numbers
    println(s"After prepending 0 and 1: $anotherList")
    println(s"Original number list isn't changed: $numbers")

def buildList(n: Int): List[Int] =
    if (n <= 0) then
        List()
    else
        n :: buildList(n - 1)

def decomposeList(): Unit =
    val aList = List(1, 2, 3, 4, 5)
    println(s"Full list: $aList")
    println(s"-Head: ${aList.head} | -Tail: ${aList.tail}")

@main def main = 
    println("• Creating Lists:")
    createLists()
    
    println("\n• Empty Lists:")
    emptyList()
    
    println("\n• Using Cons Operator:")
    consOperator()
    
    println("\n• Building List Recursively:")
    val n = 10
    val builtList = buildList(n)
    println(s"List build from $n: $builtList")
    
    println(s"\n• Decomposing List:")
    decomposeList()