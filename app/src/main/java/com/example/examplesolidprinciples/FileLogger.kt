package com.example.examplesolidprinciples

import java.io.File

interface FileLogger {

    fun must() {}

     fun logError(error : String) {
        val file = File("error.txt")
        file.appendText(
            text = error
        )
    }
}

//open class FileLogger() {
//
//    fun must() {}
//
//    open fun logError(error : String) {
//        val file = File("error.txt")
//        file.appendText(
//            text = error
//        )
//    }
//}

open class CustomErrorFileLogger : FileLogger {

    override fun logError(error : String) {
        val file = File("my_error.txt")
        file.appendText(
            text = error
        )
    }
}