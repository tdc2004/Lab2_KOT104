package com.chinhdev.lab2_kot104.ui.theme

fun main() {
    do {
        println("Moi nhap 1 nam bat ki: ")
        var s = readLine();
        var nam: Int? = s?.toIntOrNull();
        if (nam == null || nam <=0){
            println("Vui long nhap dung nam: ")
            continue
        }
        if (nam % 4 == 0 && (nam % 100 != 0 || nam % 400 == 0)) {
            println("Năm $nam là năm nhuận.")
            break
        } else {
            println("Năm $nam không phải là năm nhuận.")
            break
        }
    } while (true)

}