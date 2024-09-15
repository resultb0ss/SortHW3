fun main() {
    var array  = arrayOf(
        arrayOf(1,2,3,45),
        arrayOf(445,35,243,78),
        arrayOf(564,345,24,65),
    )

    var count = 0

    for (j in array.indices){
        for (i in array.indices)
            if ((array[j][i + 1] - array[j][i]) * (array[j][i + 2] - array[j] [i + 1]) >= 0) {
                println("${array[i]}Пилообразнный")
                count += 1
                break
            } else {
                println("${array[i]} не пилообразный")
            }

        println(count)
    }



}