package FinalProjects

// 3 X 3 배열
var board = arrayOf(arrayOf(' ', ' ', ' '),
                    arrayOf(' ', ' ', ' '),
                    arrayOf(' ', ' ', ' '))

fun printBoard() {
    println("\t0 1 2")
    for (i in 0..2) {
        print("$i\t")
        for (j in 0..2) {
            print(board[i][j])
            if (j != 2)
                print("|")
        }
        println()
        if (i != 2)
            println("\t-+-+-")
    }
}

fun isVictory(what: Char): Boolean {
    if (board[0][0] == what && board[0][1] == what && board[0][2] == what)
        return true
    if (board[2][0] == what && board[2][1] == what && board[2][2] == what)
        return true
    if (board[0][0] == what && board[1][0] == what && board[2][0] == what)
        return true
    if (board[0][2] == what && board[1][2] == what && board[2][2] == what)
        return true
    if (board[1][1] == what) {
        if (board[1][0] == what && board[1][2] == what)
            return true
        if (board[1][0] == what && board[1][2] == what)
            return true
        if (board[0][0] == what && board[2][2] == what)
            return true
        if (board[0][2] == what && board[2][0] == what)
            return true
    }
    return false
}

fun main() {
    var raw: Int = 0
    var column: Int = 0
    var count: Int = 1
    var check: Boolean = false
    while (true) {
        print(count)
        println("번째 턴\n")
        printBoard()
        print("Player 1 입력(줄,칸): ")
        var tmp = readLine()
        var token = tmp?.split(',')
        raw = token?.get(0)?.toInt()!!
        column = token?.get(1)?.toInt()!!
        board[raw][column] = 'O'
        check = isVictory('O')
        if (check) {
            printBoard()
            println("Player 1 승리!")
            break;
        }
        count++
        print(count)
        println("번째 턴\n")
        printBoard()
        print("Player 2 입력(줄,칸): ")
        tmp = readLine()
        token = tmp?.split(',')
        raw = token?.get(0)?.toInt()!!
        column = token?.get(1)?.toInt()!!
        board[raw][column] = 'X'
        check = isVictory('X')
        if (check) {
            printBoard()
            println("Player 2 승리!")
            break;
        }
    }
}