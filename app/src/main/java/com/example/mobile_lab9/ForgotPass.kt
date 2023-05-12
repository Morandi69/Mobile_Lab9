package com.example.mobile_lab9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ForgotPass : AppCompatActivity() {
    private lateinit var forgot_button: Button
    private lateinit var login:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)
        forgot_button=findViewById(R.id.button)
        login=findViewById(R.id.emailText)
        forgot_button.setOnClickListener{
            if(login.text.toString()==getString(R.string.true_login)){
                Toast.makeText(this,"Your pass 1234",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Email not found ",Toast.LENGTH_LONG).show()
            }
        }
    }
}