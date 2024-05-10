package com.chinhdev.lab2_kot104.ui.theme

class Student(
    var name: String,
    var MSSV: String,
    var mediumScore: Float,
    var age: Int?,
    var graduated: Boolean?
) {
    constructor(
        name: String,
        MSSV: String,
        age: Int,
        mediumScore: Float,
        graduated: Boolean?
    ) : this(name, MSSV, mediumScore, age, graduated)

    override fun toString(): String {
        return "Student(name='$name', MSSV='$MSSV', mediumScore=$mediumScore, age=$age, graduated=$graduated)"
    }
}