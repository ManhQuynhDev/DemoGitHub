package fpoly.group6_pro1122.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import fpoly.group6_pro1122.myapplication.Model.Car

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var name = intent.getStringExtra("name")
        var age = intent.getIntExtra("age",0)
        var tv_name = findViewById<TextView>(R.id.tv_name)
        var tv_age = findViewById<TextView>(R.id.tv_age)
        tv_name.text = name
        tv_age.text = age.toString()
        var car = Car("Totyta",10000,"White")
        val intent = Intent(this, MainActivity::class.java)
        val bundle = Bundle()
        bundle.putSerializable("key", car)
        intent.putExtras(bundle)
        startActivity(intent)
        //Quynhlm.dev đang ở đây
        //Quynhlm.dev đang ở đây
    }
}