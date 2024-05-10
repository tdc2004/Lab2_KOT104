package com.chinhdev.lab2_kot104.ui.theme

fun main() {
    var a = 0.0
    var b = 0.0
    println("Moi nhap so a: ")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Moi nhap so b: ")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phuong trinh co vo so nghiem")
    } else if (a == 0.0 && b != 0.0){
        println("Phuong trinh vo nghiem")
    }else{
        val x = -b/a
        println("Nghiem cua phuong trinh la: ${x}")
    }
}