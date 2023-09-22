fun main() {

    println("Введите текст " + first(readln()))

}
fun first(string: String): String {
    var rez = ""
    var co = 1
    var i = 1
    var z = string[0]
    for (item in string.substring(1)) {
        i++
        if (z != item || i == string.length) {
            if (co > 1) {
                rez += "$z$co"
            } else {
                rez += z
            }
            co = 1
            z = item
        } else {
            co++
        }
    }
    return rez
}