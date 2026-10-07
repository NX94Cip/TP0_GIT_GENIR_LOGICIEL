class Navire(val nom: String, var coque: Int = 5){
    fun estCoule() = coque <= 0
}