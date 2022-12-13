package com.patel.tanmay.assignment_login.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.ads.mediationtestsuite.activities.HomeActivity
import com.patel.tanmay.assignment_login.R
import com.patel.tanmay.assignment_login.VolleyRequest
import com.patel.tanmay.assignment_login.interfaces.CallBack
import org.json.JSONObject
import java.util.*

class CalenderActivity : AppCompatActivity() {
    private lateinit var submitbutton: Button
    var totalmembers: String = ""
    private lateinit var allmembers:TextView
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)

        submitbutton=findViewById(R.id.submitbtn)
        allmembers=findViewById(R.id.allMemberHeading)
        totalmembers=allmembers.text.toString()
        submitbutton.setOnClickListener()
        {
           /*Toast.makeText(this,totalmembers,Toast.LENGTH_SHORT).show()*/
            val intent=Intent(this,AllMembersActivity::class.java)
            startActivity(intent)
        }

    }
}