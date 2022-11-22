package com.example.myapplication

import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.tictactoe.R

abstract class MainActivity : AppCompatActivity(), android.view.View.OnClickListener {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var button0: Button
    private  var x1 = 0
    private  var y2 = 0
    private  var player1= ""
    private  var player2= ""
    private lateinit var xx1:TextView
    private lateinit var yy2:TextView
    private var activeplayer = 1
    private var pirveli= ArrayList<Int>()
    private var meore= ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var intent= getIntent()
        var pl1 = intent.getStringExtra("saxeli1")
        var pl2 = intent.getStringExtra("saxeli2")
        var motamashe1 = findViewById<TextView>(R.id.plr1)
        var motamashe2 =findViewById<TextView>(R.id.plr2)
        motamashe1.text="$pl1"
        motamashe2.text="$pl2"
        player1=pl1.toString()
        player2=pl2.toString()

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        button10 = findViewById(R.id.button10)
        angarishi1=findViewById(R.id.angarishi1)
        angarishi2=findViewById(R.id.angarishi2)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)

        button0.setOnClickListener{
            button1.text=""
            button2.text=""
            button3.text=""
            button4.text=""
            button5.text=""
            button6.text=""
            button7.text=""
            button8.text=""
            button9.text=""

            button1.setBackgroundColor(Color.parseColor("#7D0E97"))
            button2.setBackgroundColor(Color.parseColor("#7D0E97"))
            button3.setBackgroundColor(Color.parseColor("#7D0E97"))
            button4.setBackgroundColor(Color.parseColor("#7D0E97"))
            button5.setBackgroundColor(Color.parseColor("#7D0E97"))
            button6.setBackgroundColor(Color.parseColor("#7D0E97"))
            button7.setBackgroundColor(Color.parseColor("#7D0E97"))
            button8.setBackgroundColor(Color.parseColor("#7D0E97"))
            button9.setBackgroundColor(Color.parseColor("#7D0E97"))
            button1.isEnabled=true
            button2.isEnabled=true
            button3.isEnabled=true
            button4.isEnabled=true
            button5.isEnabled=true
            button6.isEnabled=true
            button7.isEnabled=true
            button8.isEnabled=true
            button9.isEnabled=true
            pirveli.clear()
            meore.clear()

        }
        }

    override fun onClick(clikedView: View?) {
        if (clikedView is Button){
            var buttonNumber=0
            when (clikedView.id){
                R.id.button1->buttonNumber=1
                R.id.button2->buttonNumber=2
                R.id.button3->buttonNumber=3
                R.id.button4->buttonNumber=4
                R.id.button5->buttonNumber=5
                R.id.button6->buttonNumber=6
                R.id.button7->buttonNumber=7
                R.id.button8->buttonNumber=8
                R.id.button9->buttonNumber=9
            }
            playGame(buttonNumber,clikedView)
        }

    }
    private fun playGame(buttonNumber: Int,clikedView: Button){
        if (activeplayer==1){
            clikedView.text="x"
            activeplayer=2
            pirveliv.add(buttonNumber)
            clikedView.setBackgroundColor(Color.GREEN)
        }else if (activeplayer==2){
            clikedView.text="O"
            activeplayer=1
            meore.add(buttonNumber)
            clikedView.setBackgroundColor(Color.RED)

        }
        clikedView.isEnabled=false
        check()
    }

    private  fun check(){

        var winner =0
        if (pirveli.contains(1)&&pirveli.contains(2)&&pirveli.contains(3)){
            winner=1
        }
        if (pirveli.contains(4)&&pirveli.contains(5)&&pirveli.contains(6)){
            winner=1
        }
        if (pirveli.contains(7)&&pirveli.contains(8)&&pirveli.contains(9)){
            winner=1
        }
        if (pirveli.contains(1)&&pirveli.contains(5)&&pirveli.contains(9)){
            winner=1
        }
        if (pirveli.contains(3)&&pirveli.contains(5)&&pirveli.contains(7)){
            winner=1
        }
        if (pirveli.contains(2)&&pirveli.contains(5)&&pirveli.contains(8)){
            winner=1
        }
        if (pirveli.contains(1)&&pirveli.contains(4)&&pirveli.contains(7)){
            winner=1
        }
        if (pirveli.contains(3)&&pirveli.contains(6)&&pirveli.contains(9)){
            winner=1
        }
        if (meore.contains(1)&&meore.contains(2)&&meore.contains(3)){
            winner=2
        }
        if (meore.contains(4)&&meore.contains(5)&&meore.contains(6)){
            winner=2
        }
        if (meore.contains(7)&&meore.contains(8)&&meore.contains(9)){
            winner=2
        }
        if (meore.contains(1)&&meore.contains(5)&&meore.contains(9)){
            winner=2
        }
        if (meore.contains(3)&&meore.contains(5)&&meore.contains(7)){
            winner=2
        }
        if (meore.contains(2)&&meore.contains(5)&&meore.contains(8)){
            winner=2
        }
        if (meore.contains(1)&&meore.contains(4)&&meore.contains(7)){
            winner=2
        }
        if (meore.contains(3)&&meore.contains(6)&&meore.contains(9)){
            winner=2
        }
        if (winner==1){
            Toast.makeText(this, "moigo $player1", Toast.LENGTH_SHORT).show()
            boloangarishi1+=1
            activeplayer=1
        }else if (winner==2){
            Toast.makeText(this, "moigo $player2", Toast.LENGTH_SHORT).show()
            boloangarishi2+=1
            activeplayer=2
        }else if(pirveli.size+meore.size==9){
            Toast.makeText(this, "frea", Toast.LENGTH_LONG).show()
            pirveli.clear()
            meore.clear()
        }
        if (winner>0){
            button1.isEnabled=false
            button2.isEnabled=false
            button3.isEnabled=false
            button4.isEnabled=false
            button5.isEnabled=false
            button6.isEnabled=false
            button7.isEnabled=false
            button8.isEnabled=false
            button9.isEnabled=false
            angarshi1.text=boloangarishi1.toString()
            angarishi2.text=boloangarishi2.toString()
            pirveli.clear()
            meore.clear()

        }

    }
}

}
