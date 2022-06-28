package com.example.loginactivity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val tag = "Main Activity"
    private var username: TextView? = null
    private var passward: TextView? = null
    private var login: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        setupListeners()
        Log.i(tag, "Create")
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "Start")

    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "Resume")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag, "Restart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "Onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "Start")
    }

    private fun setupViews() {
        username = findViewById(R.id.username)
        passward = findViewById(R.id.passward)
        login = findViewById(R.id.login)
    }

    private fun setupListeners() {
        login?.setOnClickListener {
            validateCredentials(
                username?.text.toString(),
                passward?.text.toString()
            )
        }
    }

    private fun validateCredentials(username: String, passward: String) {
        if (username == "Admin098" && passward == "python098") {
            showToast(getString(R.string.sucessful_login))
        } else {
            showToast(getString(R.string.failer_login))
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
    }


}
