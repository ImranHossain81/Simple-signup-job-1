package com.example.imran_47129083_job1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var confopassword: EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.et_email)
        password = findViewById(R.id.et_password)
        confopassword = findViewById(R.id.conf_password)
        button = findViewById(R.id.SignupBtn)


        button.setOnClickListener {


            if (email.text.toString().isEmpty()) {
                email.error = "Invalid email !"
                Toast.makeText(this@MainActivity, "Email can't be empty", Toast.LENGTH_SHORT).show()

            }  else if (password.text.toString().isEmpty()) {
                password.error = "Invalid password !"
                Toast.makeText(this@MainActivity, "Password can't be empty", Toast.LENGTH_SHORT).show()

            }else if (confopassword.text.toString().isEmpty()) {
                confopassword.error = "Invalid password !"
                Toast.makeText(this@MainActivity, "conform Password can't be empty", Toast.LENGTH_SHORT).show()

            }


            val email = email.text.toString()
            val password = password.text.toString()
            val confpassword = confopassword.text.toString()

            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            intent.putExtra("email", email)
            intent.putExtra("password", password)
            intent.putExtra("password", confpassword)
            startActivity(intent)



        }
        signUp()


    }
    private fun signUp(){
        val email = email.text.toString()
        val password = password.text.toString()
        val confpassword = confopassword.text.toString()


        if (password!=confpassword){
            Toast.makeText(this, "Password and Confirm Password should be same.", Toast.LENGTH_SHORT).show()
        }
        if (email.isNotEmpty() && password.isNotEmpty() && confpassword.isNotEmpty()){

        }
        else{
            Toast.makeText(this, "Signup gone.", Toast.LENGTH_SHORT).show()
        }

    }
}