package com.chinhdev.lab2_kot104.ui.theme

fun main() {
    var thang =0
    do {
        println("Moi nhap 1 thang bat ki trong nam: ")
        var s = readLine()
        if (s != null) thang = s.toInt()
        when (thang) {
            1, 2, 3 -> println("Thang ${s} thuoc quy 1 trong nam")
            4, 5, 6 -> println("Thang ${s} thuoc quy 2 trong nam")
            7, 8, 9 -> println("Thang ${s} thuoc quy 3 trong nam")
            10, 11, 12 -> println("Thang ${s} thuoc quy 4 trong nam")
            else -> println("Thang ${s} khong hop le")
        }
    }while (thang>12 || thang <=0)
}