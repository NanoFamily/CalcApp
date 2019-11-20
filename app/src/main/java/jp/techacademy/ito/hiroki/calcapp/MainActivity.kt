package jp.techacademy.ito.hiroki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar


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
            var str1 = editText1.text.toString()/*.toFloat()*/
            if (str1 == "" || str1 == "." || str1 == "-") {
                // nullでない場合のみ処理が行われるのでエラーにならない
                Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
                return
            }

            var str2 = editText2.text.toString()/*.toFloat()*/
            if (str2 == "" || str2 == "." || str2 == "-") {
                // nullでない場合のみ処理が行われるのでエラーにならない
                Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
                return
            }
            var num1 = str1.toFloat()
            var num2 = str2.toFloat()
            var plus = num1 + num2

            /*val intent = Intent(this, SecondActivity::class.java)*/

            intent.putExtra("VALUE1", plus)
            startActivity(intent)
        }
        //★マイナス
        if (v.id == R.id.button2) {
            var str3 = editText1.text.toString()
            if (str3 == "" || str3 == "." || str3 == "-") {
                // nullでない場合のみ処理が行われるのでエラーにならない
                Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
                return
            }

            var str4 = editText2.text.toString()
            if (str4 == "" || str4 == "." || str4 == "-") {
                // nullでない場合のみ処理が行われるのでエラーにならない
                Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
                return
            }
            var num3 = str3.toFloat()
            var num4 = str4.toFloat()
            var minus = num3 - num4

            /*val intent = Intent(this, SecondActivity::class.java)*/
            intent.putExtra("VALUE1", minus)
            startActivity(intent)
        }

        //★カケル
        if (v.id == R.id.button3) {
            var str5 = editText1.text.toString()
            if (str5 == "" || str5 == "." || str5 == "-") {
                // nullでない場合のみ処理が行われるのでエラーにならない
                Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
                return
            }

            var str6 = editText2.text.toString()
            if (str6 == "" || str6 == "." || str6 == "-") {
                // nullでない場合のみ処理が行われるのでエラーにならない
                Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
                return
            }
            var num5 = str5.toFloat()
            var num6 = str6.toFloat()
            var multi = num5 * num6

            /*val intent = Intent(this, SecondActivity::class.java)*/
            intent.putExtra("VALUE1", multi)
            startActivity(intent)
        }


        //★ワル
        if (v.id == R.id.button4) {
            var str7 = editText1.text.toString()
            if (str7 == "" || str7 == "." || str7 == "-") {
                // nullでない場合のみ処理が行われるのでエラーにならない
                Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
                return
            }

            var str8 = editText2.text.toString()
            if (str8 == "" || str8 == "." || str8 == "-") {
                // nullでない場合のみ処理が行われるのでエラーにならない
                Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
                return
            }
            var num7 = str7.toFloat()
            var num8 = str8.toFloat()
            var divide = num7 / num8

            /*val intent = Intent(this, SecondActivity::class.java)*/
            intent.putExtra("VALUE1", divide)
            startActivity(intent)
        }
    }
}
