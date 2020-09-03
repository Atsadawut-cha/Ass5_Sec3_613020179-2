package com.example.ass5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("empData")
        nameText.text = "Employee Name : ${newEmployee?.name}"
        genderText.text = "Employee Gender : ${newEmployee?.gender}"
        emailText.text = "Employee Email : ${newEmployee?.email}"
        salaryText.text = "Employee Gender : ${newEmployee?.salary}"
    }
    fun onClickClose(view:View){
        finish()
    }
}