/*
    Em tempo complexidade   =   O(n^2)  :   exponencial
    Em espaco complexidade  =   O(n)    :   linear
 */

fun fibonnaciRecursive(n: Int): Int {
    return if (n <= 1) 1
    else fibonnaciRecursive(n - 1) + fibonnaciRecursive(n - 2)
}

/*
    Em tempo complexidade   =   O(n)    :   linear
    Em espaco complexidade  =   O(n)    :   linear
 */

fun fibonnaciIterativo(n: Int): Int {
    val array = IntArray(n + 1)
    array[0] = 1
    array[1] = 1
    for (i in 2..n) {
        array[i] = array[i - 1] + array[i - 2]
    }
    return array[n]
}

/*
    Em tempo complexidade   =   O(n)    :   linear
    Em espaco complexidade  =   O(1)    :   constante
 */

fun fibonnaciIterativoOtimizado(n: Int): Int {
    if (n <= 1) return 1
    var f0 = 1
    var f1 = 1
    var result = 0
    for (i in 2..n) {
        result = f0 + f1
        f0 = f1
        f1 = result
    }

    return result
}
