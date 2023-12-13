package fpoly.group6_pro1122.myapplication

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var name : EditText
    private lateinit var age : EditText
    private lateinit var bt_submit : Button
    private lateinit var sf : SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.ed_name)
        age = findViewById(R.id.ed_age)
        bt_submit = findViewById(R.id.bt_submit)
        sf = getSharedPreferences("info", MODE_PRIVATE)
        editor = sf.edit()
        bt_submit.setOnClickListener {
            var nameText = name.text.toString()
            var ageText = age.text.toString().toInt()
            if(nameText.equals("") || ageText.equals("")){
                Toast.makeText(this,"Please enter name",Toast.LENGTH_SHORT).show()
            }else{
                if(nameText.equals("quynhlm.dev") || ageText.equals("19")){
                    var intent = Intent(this,SecondActivity::class.java)
                    intent.putExtra("name",nameText)
                    intent.putExtra("age",ageText)
                    startActivity(intent)
                    editor.apply{
                        putString("name",nameText)
                        putInt("age",ageText)
                        commit()
                    }
                }else{
                    Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    override fun onResume() {
        super.onResume()
        val name_sf = sf.getString("name",null)
        var age_sf = sf.getInt("age",0)
        name.setText(name_sf)
        age.setText(age_sf.toString())
    }
}
