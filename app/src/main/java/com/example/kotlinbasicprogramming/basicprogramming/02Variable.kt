fun main() {
    valInitialized()
    valTypeInference()
    valDeclaration()
    varTypeInference()
}

fun valInitialized() {
    val nama: String = "Ari Dwi Prayogo"
    println("Halo nama saya $nama")
}

fun valTypeInference(){
    val nama = "Ari Dwi Prayogo"
    println("Halo nama saya $nama")
}

fun valDeclaration(){
    val nama: String
    nama = "Ari Dwi Prayogo"
    println("Halo nama saya $nama")
}

fun varTypeInference(){
    var x = 5 // `Int` type is inferred
    x+=1
    println(x)
}

