fun main (){
    //library function array yaitu arrayOf
    val array = arrayOf(1, 3, 5, 7)
    //bisa beberapa tipe data dalam 1 array
    val mixArray = arrayOf(1, 5, 7, "Fallujah", true)
    //function array bisa dipakai untuk tipe data primitif
    val intArray = intArrayOf(2, 4, 6, 8)
    intArray [1] = 10 //indexing bisa buat ganti nilai
    print (intArray[1]) //bisa indexing juga

    //nullable types NullPointerException ( NPE )
    //adalah variable yang tidak boleh kosong, karena kalau kosong akan terjadi error
    // val text : String = null tidak akan bisa jika seperti ini
    val text : String? = null // harus ditambah ? setelah menentukan tipe data

    //untuk mengakses nullable tidak bisa secara langsung
    //cara tradisional dengan if else untuk menggunakan nullable
    if (text != null){
        val textLength = text.length
    }


    //cara yang lebih mudah untuk nullable
    //safe calls operator ( ?. ) akan menjamin kode yang kita tulis aman dari NPE
    //elvis operator memungkinkan kita untuk menetapkan default value jika nullable
    val teks : String? = null
    teks?.length
    val teksLength = teks?.length ?: 7
    //mirip seperti if else
    val textLength = if (text != null) text.length else 7
    //lalu ada non-null assertion ( !! )
    val textlength = text!!.length //tidak disarankan karena akan tetap kena NPE

}