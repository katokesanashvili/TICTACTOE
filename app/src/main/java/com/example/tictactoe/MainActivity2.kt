import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.view.View
import com.example.myapplication.MainActivity2
import com.example.tictactoe.R

class MainActivity : AppCompatActivity() {
    private lateinit var player1: EditText
    private lateinit var player2: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        player1 = findViewById(R.id.editTextTextPersonName3)
        player2 = findViewById(R.id.editTextTextPersonName4)
        button = findViewById(R.id.button10)
    }
        fun sheikvane(view: View){
            if (player1.text.toString().length==0){
                player1.setText("player1")
            }
            if (player2.text.toString().length==0){
                player2.setText("player2")
            }
            val motamashe1 = player1.text.toString()
            val motamashe2 = player2.text.toString()
            val intent= Intent(this@MainActivity,MainActivity2 :: class.java)
            intent.putExtra("motamashe1",motamashe1)
            intent.putExtra("motamashe2",motamashe2)
            startActivity(intent)
        }

    class MainActivity2 {

    }


}


