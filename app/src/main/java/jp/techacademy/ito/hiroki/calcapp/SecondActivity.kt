package jp.techacademy.ito.hiroki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getFloatExtra("VALUE1", 0.0f)
        textView.text = value1.toString()

       /* val value2 = intent.getFloatExtra("VALUE2", 0.0f)
        textView.text = value2.toString()*/


        /*val value3 = intent.getIntExtra("VALUE3", 0)
        val value4 = intent.getIntExtra("VALUE4", 0)

        textView.text = "${value3 - value4}"*/

        /*val value5 = intent.getIntExtra("VALUE5", 0)
        val value6 = intent.getIntExtra("VALUE6", 0)

        textView.text = "${value5 * value6}"

        val value7 = intent.getIntExtra("VALUE7", 1)
        val value8 = intent.getIntExtra("VALUE8", 1)

        textView.text = "${value7 / value8}"*/

    }
}
