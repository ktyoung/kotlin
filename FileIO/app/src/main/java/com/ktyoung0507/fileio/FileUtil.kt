package com.ktyoung0507.fileio

import android.util.Log
import java.io.*

class FileUtil {
    fun readTextFile (fullPath: String) : String {
        val file = File(fullPath)
        if (!file.exists()) return ""

        val reader = FileReader(file)
        val buffer = BufferedReader(reader)
        var temp:String? = null
        var result = ""

        while (true) {
            temp = buffer.readLine()
            if (temp == null) break
            else result += temp + "\n"
        }
        buffer.close()
        reader.close()
        return result.toString()
    }

    fun writeTextFile (directory: String, filename: String, content: String) {
        val dir = File(directory)
        if (!dir.exists()) {
            dir.mkdirs()
        }

        val writer = FileWriter(directory + "/" + filename)
        Log.d("FileUtil","write dir=${directory + "/" + filename}")
        val buffer = BufferedWriter(writer)
        buffer.write(content)
        buffer.close()
    }
}