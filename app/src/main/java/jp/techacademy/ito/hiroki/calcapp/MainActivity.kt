package jp.techacademy.ito.hiroki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

        button2.setOnClickListener(this)

        button3.setOnClickListener(this)

        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        //★ﾌﾟﾗｽ
        if (v.id == R.id.button1) {
            var str1 = editText1.text.toString().toInt()

            var str2 = editText2.text.toString().toInt()

            /*val intent = Intent(this, SecondActivity::class.java)*/
            intent.putExtra("VALUE1", str1)
            intent.putExtra("VALUE2", str2)
            startActivity(intent)
        }
        //★マイナス
        if (v.id == R.id.button2) {
            var str3 = editText1.text.toString().toInt()

            var str4 = editText2.text.toString().toInt()

            intent.putExtra("VALUE3", str3)
            intent.putExtra("VALUE4", str4)
            startActivity(intent)
        }
        //★カケル
        if (v.id == R.id.button3) {
            var str5 = editText1.text.toString().toInt()

            var str6 = editText2.text.toString().toInt()

            intent.putExtra("VALUE5", str5)
            intent.putExtra("VALUE6", str6)
            startActivity(intent)
        }
        //★ワル
        if (v.id == R.id.button4) {
            var str7 = editText1.text.toString().toInt()

            var str8 = editText2.text.toString().toInt()

            intent.putExtra("VALUE7", str7)
            intent.putExtra("VALUE8", str8)
            startActivity(intent)
        }
    }
}
