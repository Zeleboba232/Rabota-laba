fun calculateFrames(minutes: Int, fps: Int): Int {
    val totalSeconds = minutes * 60
    return totalSeconds * fps
}

fun main() {
    val minutes = 5
    val fps = 30
    val totalFrames = calculateFrames(minutes, fps)
    println("За $minutes минут(ы) при $fps FPS компьютер покажет $totalFrames кадров.")
}