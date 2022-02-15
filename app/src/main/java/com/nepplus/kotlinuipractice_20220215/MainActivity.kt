package com.nepplus.kotlinuipractice_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        버튼이 눌릴 때 -> 입력된 메세지가 어떤건지 추출. -> 토스트로 띄워주기 + 텍스트뷰의 문구로 반영하기

        btnOk.setOnClickListener {

//            버튼이 눌릴때마다 실행 => 입력메시지 변수에 담자

            val inputMessage = edtMessage.text.toString() // 입력된 메시지의 문구(text)를 추출 -> String으로 변환까지.

            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

//            담겨있는 입력 문구를 -> 텍스트뷰의 text 속성의 값으로 대입.

            txtMessage.text = inputMessage  // TextView 문구(text)를 변경 : set

        }

        btnCalculate.setOnClickListener {
//            입력한 숫자 추출

            val inputBirthYear = edtNumber.text.toString().toInt()

//            2022년 나이 계산
            val age = 2022 - inputBirthYear + 1

//            get기능, 계산식, String 가공 ${ }
            Toast.makeText(this, "이 사람은 올해 ${age} 세 입니다.", Toast.LENGTH_SHORT).show()



        }



    }
}