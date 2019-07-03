package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        // TODO FIX ME +++
        val parts = fullName?.trim()?.ifEmpty { null }?.split("\\s+".toRegex())

        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)

        return firstName to lastName
    }

//    fun transliteration(transliteration: String, divider: String = " "): String {
////        TODO("FIX ME")
//        val parts = transliteration.trim().ifEmpty { null }?.split("\\s+".toRegex())
//
//
//        var firstName = parts?.getOrNull(0)?.toCharArray()
//        var lastName = parts?.getOrNull(1)?.toCharArray()
//
//        var result =""
//        if (firstName != null) {
//            for (item in firstName) result += transliterationChar(item)
//        }
////        val result = transliteration(firstName.)
//        return result
//    }

    fun transliterationChar(char: Char): String? = when (char) {
        'а' -> "a"
        'б' -> "b"
        'в' -> "v"
        'г' -> "g"
        'д' -> "d"
        'е' -> "e"
        'ё' -> "e"
        'ж' -> "zh"
        'з' -> "z"
        'и' -> "i"
        'й' -> "i"
        'к' -> "k"
        'л' -> "l"
        'м' -> "m"
        'н' -> "n"
        'о' -> "o"
        'п' -> "p"
        'р' -> "r"
        'с' -> "s"
        'т' -> "t"
        'у' -> "u"
        'ф' -> "f"
        'х' -> "h"
        'ц' -> "c"
        'ч' -> "ch"
        'ш' -> "sh"
        'щ' -> "sh'"
        'ъ' -> ""
        'ы' -> "i"
        'ь' -> ""
        'э' -> "e"
        'ю' -> "yu"
        'я' -> "ya"
        else -> null
    }

    fun transliteration(transliteration: String?, divider: String = " "): String? {

        //    var value = if(foo != null) foo else bar;
        return transliteration?.map{
            when(it){
                ' ' -> divider
                else -> transliterationChar(it) ?: transliterationChar(it.toLowerCase())?.capitalize() ?: it
            }
        }?.joinToString ("")
    }

    fun toInitials(firstName: String?, lastName: String?) =
//        TODO("FIX ME")
        "${firstName?.trim()?.firstOrNull() ?: ""}${lastName?.trim()?.firstOrNull() ?: ""}"
            .toUpperCase()
            .ifEmpty { null }
}