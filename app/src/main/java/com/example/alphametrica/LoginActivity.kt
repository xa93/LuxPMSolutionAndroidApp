package com.example.alphametrica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.alphametrica.data.User

class LoginActivity : AppCompatActivity() {

    private val userTest =
        User("test@luxpmsoft.com", "test1234!")

    private var emailView: EditText? = null
    private var passwordView: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.login)

        emailView = findViewById(R.id.login_username);
        passwordView = findViewById(R.id.login_password_result);

        val textView: TextView = findViewById(R.id.login_new_account_subscribe)
        textView.setOnClickListener {
            startActivity(Intent(applicationContext, SubscribeActivity::class.java))
        }

        val subscribeButton: Button = findViewById(R.id.login_button)
        subscribeButton.setOnClickListener {

            if (userExist(
                    User(
                        emailView?.text.toString(),
                        passwordView?.text.toString()
                    )
                )) {
                startActivity(Intent(applicationContext, HomeActivity::class.java))
            } else {
                showErrorMessage()
            }
        }

    }

    private fun userExist(user: User) = userTest == user

    private fun showErrorMessage() {

        Toast.makeText(
            applicationContext,
            "Login data is not correct, please try again",
            Toast.LENGTH_SHORT
        ).show()

    }
}