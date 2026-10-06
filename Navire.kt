class Navire(val nom: String, var coque: Int = 3){
    fun estCoule() = coque <= 0
}