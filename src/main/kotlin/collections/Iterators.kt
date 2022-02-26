package collections

data class Player(val name: String)
class Team(val name:String, val players: MutableList<Player> = mutableListOf()) : Iterable<Player> {
    fun addPlayers(vararg people: Player) = players.addAll(people)

    // 사용자 정의 iterator 구현
    override fun iterator(): Iterator<Player> = players.iterator()
}

// 사용자 정의 iterator 작성
operator fun Team.iterator() : Iterator<Player> = players.iterator()

fun exampleOfIterators() {
    val team = Team("Warriors")
    team.addPlayers(
        Player("Curry"),
        Player("Thompson"),
        Player("Durant"),
        Player("Green"),
        Player("Cousins")
    )

    for (player in team.players) {
        println(player)
    }

    for (player in team) {
        println(player)
    }
}