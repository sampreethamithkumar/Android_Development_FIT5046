package com.sampreethamithkumar.eventlistenerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sampreethamithkumar.eventlistenerkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //lateinit is used to initialize a variable later instead of doing it here
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(getLayoutInflater())
        //constant variables declared using val (its value is not supposed to change) like final in java
        val view = binding.root
        setContentView(view)

        binding.reverseBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                //Local variables are typically declared and initialized at the same time, in which case the type of the variable is inferred to be the
//                type of the expression you initialize it with, and you do not need to provide it
                var builder = StringBuilder(binding.editMessage.getText()).reverse().toString()
                binding.editMessage.setText(builder)
            }
        })
        binding.clearBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                binding.editMessage.setText("")
            }
        })
    }
}
}