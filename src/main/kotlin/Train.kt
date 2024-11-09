class Train(val route: String, val wagons: MutableList<Wagon>) {
    fun send() {
        for ((index, Wagon) in wagons.withIndex()) {
            if(index < 9) println("〘Вагон ${index + 1}〙  вместимость: ${Wagon.capacity}")
            else println("〘Вагон ${index + 1}〙 вместимость: ${Wagon.capacity}")
        }
        println("➤ Поезд $route, состоящий из ${wagons.size} вагонов, отправлен!")
        println()
    }
}