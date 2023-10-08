// belajar tipe data Numbers
fun main () {
    //integer 32bit
    val intNumber = 100
    //long 64bit bisa secara explicit ditulis, bisa tidak
    val longNumber: Long = 100 //100L
    //short 16bit
    val shortNumber = 10
    //byte 8bit
    val byteNumber = 0b11010010
    //double 64bit pecahan 15-16 angka dibelakang koma
    val doubleNumber: Double = 1.5
    //float 32bit pecahan 6-7 angka dibelakang koma
    val floatNumber: Float = 0.1234567890f

    val maxInt = Int.MAX_VALUE //melihat nilai maksimal yg bisa disimpan
    val minInt = Int.MIN_VALUE //melihat nilai minimum yg bisa disimpan
    val overMaxInt = Int.MAX_VALUE + 1 //hasilnya akan overflow
    println (minInt)
    println (maxInt)
    println (overMaxInt)

    val angkaPertama : Int = 10
    val angkaKedua : Int = 5

    println (angkaPertama + angkaKedua) //penjumlahan
    println (angkaPertama - angkaKedua) //pengurangan
    println (angkaPertama * angkaKedua) //perkalian
    println (angkaPertama / angkaKedua) //pembagian
    println (angkaPertama + angkaKedua * angkaPertama)

    //konversi tipe data kotlin
    val angkaByte : Byte = 1
    // akan error val angkaInt : Int = angkaByte
    val angkaInt : Int = angkaByte.toInt()
    //toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
    val angkaString = "25"
    val IntAngka = 3

    println (IntAngka + angkaString.toInt())
    //nilai numerik yang readable pake underscore
    val readableNumber = 1_500_000
    println(readableNumber)
}