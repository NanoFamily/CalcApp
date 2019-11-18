package jp.techacademy.ito.hiroki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)


        textView.text = "${value1 + value2}"

        textView.text = "${value1 - value2}"

        textView.text = "${value1 * value2}"

        textView.text = "${value1 / value2}"
    }
}
