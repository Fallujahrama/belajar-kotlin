fun main () {
    var name = "Fallujah"
    //nilai di variabel 'var' bisa mengubah nilai yg sudah di inisialisasikan
    val firstword = "Dicoding "
    val secondword = "Academy"
    var nilaiA : Int = 15
    val nilaiB = 3
    var abjad = 'A'
/*
    print("Hallo nama saya adalah ")
    println(name)
    print("Kali ini kita akan belajar kotlin di ")
    println(firstword + secondword)
    print("hasil perkalian = " + nilaiA * nilaiB)
*/
    /*
    println("huruf " + abjad++) //huruf bisa di increment atau decrement
    println("huruf " + abjad++)
    println("huruf " + abjad++)
    println("huruf " + abjad--)
    println("huruf " + abjad--)
    println("huruf " + abjad--)
    println("huruf " + abjad)
    */

    val teks = "FallUjah Ramadi"
    val hurufPertama = teks[8]
    println("huruf pertama dari $teks adalah $hurufPertama")
    //$ merupakan indexing, untuk mengakses elemen, posisi awal adalah 0

    val text = "Fallujah"
    for (char in text){
        print("$char ") //iterasi pada string dengan for-loop
    }

    val statement = "Kotlin is \t awesome" // untuk menambah tab didalam teks
    val statement1 = "Kotlin is \nawesome" // untuk menambah baris baru dalam teks
    val statement2 = "Kotlin is \'awesome!\'" // untuk menambah single quote dalam teks
    val statement3 = "Kotlin is \\ awesome" // untuk menambah backslash dalam teks
    val logo = "Unicode : \u00A9" //bisa memasukan unicode
    val line = """
        line 1
        line ke 2
        line ke 3
        dst
     """.trimIndent()//triple quote untuk membuat beberapa baris tanpa penggabungan dan karakter escaped

    println(statement)
    println(statement1)
    println(statement2)
    println(statement3)
    println(logo)
    println(line)

}
