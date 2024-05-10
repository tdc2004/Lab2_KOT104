package com.chinhdev.lab2_kot104.ui.theme

fun main () {
    var studentManager: StudentManager = StudentManager()
    while (true){
        println("<<Danh sách chức năng>>")
        println("1.Thêm sinh viên mới")
        println("2.Xóa sinh viên")
        println("3.Sửa sinh viên")
        println("4.Hiển thị danh sách sinh viên")
        println("Vui lòng chọn chức năng")
        var choice = readLine()
        when(choice){
            "1" -> {
                println("Nhập tên sinh viên:")
                val name = readLine().orEmpty()

                println("Nhập mã sinh viên:")
                val mssv = readLine().orEmpty()

                println("Nhập tuổi:")
                val ageInput = readLine().orEmpty()
                val age = ageInput.toIntOrNull()

                println("Đã tốt nghiệp(true/false):")
                val graduatedInput = readLine().orEmpty()
                val graduated = graduatedInput.toBoolean()

                println("Nhập điểm trung bình:")
                val mediumScoreInput = readLine().orEmpty()
                val mediumScore = mediumScoreInput.toFloatOrNull() ?: 0.0f

                val newStudent = Student(name, mssv, mediumScore, age, graduated)
                studentManager.addStudent(newStudent)
            }
            "2" -> {
                println("Nhập MSSV cần xóa:")
                val mssv = readLine().orEmpty()
                var check = studentManager.delStudent(mssv)
                if (check){
                    println("Xoa thanh cong")
                }else {
                    println("Xoa that bai")
                }
            }
            "3" ->{
                println("Nhâp MSSV cần cập nhật:")
                val id = readLine().orEmpty()

                println("Nhập tên sinh viên:")
                val name = readLine().orEmpty()

                println("Nhập mã sinh viên:")
                val mssv = readLine().orEmpty()

                println("Nhập tuổi:")
                val ageInput = readLine().orEmpty()
                val age = ageInput.toIntOrNull()

                println("Đã tốt nghiệp(true/false):")
                val graduatedInput = readLine().orEmpty()
                val graduated = graduatedInput.toBoolean()

                println("Nhập điểm trung bình:")
                val mediumScoreInput = readLine().orEmpty()
                val mediumScore = mediumScoreInput.toFloatOrNull() ?: 0.0f

                val newStudent = Student(name, mssv, mediumScore, age, graduated)
                var check = studentManager.updateStudent(id,newStudent)
                if (check){
                    println("Sua thanh cong")
                }else{
                    println("Sua that bai")
                }
            }
            "4" -> {
                studentManager.showDetails()
            }
            "0" -> break
            else -> continue
        }
    }
}