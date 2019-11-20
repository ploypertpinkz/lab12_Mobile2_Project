package buu.informatics.s59160587.cashproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val singinBut: Button = findViewById(R.id.singinButton)
        singinBut.setOnClickListener { gotoOpenBankPage() }
    }

    private fun gotoOpenBankPage() {
        Timber.i("gotoOpenBankPage Called")

        if(inputIdText.length() != 0 && inputPassText.length() != 0) {
            if(inputIdText.text.toString() == "ploy" && inputPassText.text.toString() == "12345") {
                Toast.makeText(this, "gotoOpenBank", Toast.LENGTH_SHORT).show()
            } else if(inputIdText.text.toString() != "ploy" && inputPassText.text.toString() == "12345") {
                Toast.makeText(this, "Username ไม่ถูกต้อง", Toast.LENGTH_SHORT).show()
            } else if(inputIdText.text.toString() == "ploy" && inputPassText.text.toString() != "12345") {
                Toast.makeText(this, "Password ไม่ถูกต้อง", Toast.LENGTH_SHORT).show()
            } else if(inputIdText.text.toString() != "ploy" && inputPassText.text.toString() != "12345") {
                Toast.makeText(this, "Username เเละ Password ไม่ถูกต้อง", Toast.LENGTH_SHORT).show()
            }

        } else if(inputIdText.length() == 0 && inputPassText.length() != 0) {
            Toast.makeText(this, "กรุณากรอก Username", Toast.LENGTH_SHORT).show()
        }else if(inputIdText.length() != 0 && inputPassText.length() == 0) {
            Toast.makeText(this, "กรุณากรอก Password", Toast.LENGTH_SHORT).show()
        } else if(inputIdText.length() == 0 && inputPassText.length() == 0) {
            Toast.makeText(this, "กรุณากรอก Username เเละ Password", Toast.LENGTH_SHORT).show()
        }
    }
}
