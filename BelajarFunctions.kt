/*
untuk menentukan nama fungsi dan parameter didalamnya
dan menggunakan return 'String'
*/
// fun user(nama: String, umur: Int) = "Nama saya adalah $nama, umur saya $umur"

fun main () {
    val user = setUser("Fallujah", 19) //declare variable user
    println(user)

    printUser("Fallujah")
}
//declare nama variable dari setUser diatas dan tipe datanya
fun setUser(nama : String, umur : Int) = "Nama saya adalah $nama dan umur saya $umur tahun"
//pemanggilan fungsi diatas
fun printUser(nama: String){
    println("Namaku adalah $nama")
}
fun stringtemplate (){
    val name = "fallujah"
    val old = 19
    println("nama saya $name saya berumur $old tahun")

    //bisa nyisipkan expression if else pake kurung kurawa ( {} ) diawali dollar ( $ )
    val jam = 8
    println("Kampus ${if (jam > 7) "sudah buka" else "masih tutup"}")
}