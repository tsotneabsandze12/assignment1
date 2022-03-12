fun main() {
    val avg = getEvenAvg(arrayOf(1, 2, 3));
    println(avg);

    println(checkPalindrome("hannah"));
    println(checkPalindrome("Wow"));
    println(checkPalindrome("palindrome"));
}


fun getEvenAvg(arr: Array<Int>)  = arr
    .filterIndexed { index, _ -> index % 2 == 0 }
    .average();

fun checkPalindrome(word: String) = word.lowercase() == word.reversed().lowercase();
