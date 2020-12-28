package Chap06.section8

import java.io.*

fun main() {
    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("Hello")
    }
}