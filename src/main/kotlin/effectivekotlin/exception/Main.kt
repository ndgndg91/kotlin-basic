package effectivekotlin.exception

fun main(args: Array<String>) {
    try {
        Engine.run()
    } catch (e: IllegalStateException) {
        e.printStackTrace()
    } finally {
        Engine.initialize()
        Engine.run()
    }
}