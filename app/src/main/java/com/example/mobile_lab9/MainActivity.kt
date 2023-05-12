package com.example.mobile_lab9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var ForgotPassword:TextView
    private lateinit var login:EditText
    private lateinit var password:EditText
    private lateinit var signin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ForgotPassword=findViewById(R.id.textView3)
        ForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPass::class.java)
            startActivity(intent)
        }
        signin=findViewById(R.id.button)
        login=findViewById(R.id.emailText)
        password=findViewById(R.id.passwordText)
        signin.setOnClickListener {
            if(login.text.toString()==getString(R.string.true_login)&&password.text.toString()==getString(R.string.true_pass)){
                Toast.makeText(this,"Sign in completed",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Incorrect email or password",Toast.LENGTH_LONG).show()
            }
        }
    }
}