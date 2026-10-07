class Navire(val nom: String, var coque: Int = 100){
    fun estCoule() = coque <= 0
}