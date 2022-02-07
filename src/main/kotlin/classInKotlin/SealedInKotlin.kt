package classInKotlin

sealed class Expr

data class Const(val number: Double): Expr()
data class Sum(val e1: Expr, val e2: Expr): Expr()
object NotaNumber: Expr()

fun eval(expr: Expr): Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotaNumber -> Double.NaN
    // the 'else' clause is not required because we've covered all the cases
}

fun exampleSealedClass() {
    val eval = eval(Sum(Const(10.0), Const(5.0)))
    println("eval : $eval")
}