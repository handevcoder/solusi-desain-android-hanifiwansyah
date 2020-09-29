package com.example.solusidesainandroid


fun StringManipulation(origins: String, randomWord: List<String>): String {

    var theWord = String()

    for (i in randomWord) {
        if (i.toLowerCase() in origins) {
            theWord += "$i "
        }
    }

    return theWord;
}

fun main() {
    var words: String = "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"
    var wordList: List<String> = listOf("Burger","Fries","Chicken", "Pizza","Sandwich","Onionrings", "Milkshake","Coke")
    var result = StringManipulation(words, wordList)

    println(result)

}