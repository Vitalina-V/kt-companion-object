package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(letter: String): CharArray {
        return letter.lowercase().replace("r", "!").toCharArray()
    }
}
