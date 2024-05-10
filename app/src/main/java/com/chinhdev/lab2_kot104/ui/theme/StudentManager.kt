package com.chinhdev.lab2_kot104.ui.theme

class StudentManager {
    private var list : MutableList<Student> = mutableListOf()
    fun addStudent(student: Student){
        this.list.add(student)
    }
    fun delStudent(MSSV: String): Boolean{
        var student = this.list.stream().filter { s-> s.MSSV.equals(MSSV) }.findFirst().orElse(null)
        if (student == null){
            return false
        }else{
            list.remove(student)
            return true
        }
    }
    fun updateStudent(MSSV: String,studentNew: Student): Boolean{
        var student = this.list.stream().filter { s-> s.MSSV.equals(MSSV) }.findFirst().orElse(null)
        if (student == null){
            return false
        }else{
            student.name = studentNew.name
            student.MSSV = studentNew.MSSV
            student.age = studentNew.age
            student.graduated = studentNew.graduated
            student.mediumScore = studentNew.mediumScore
            return true
        }
    }
    fun showDetails(){
        this.list.stream().forEach { s-> println(s.toString()) }
    }
}