package lawrence.hua.tipcalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  window.decorView.setBackgroundColor(Color.RED)
        infoTextView.visibility = View.INVISIBLE
     //   calculateButton.setOnClickListener { infoTextView.visibility = View.INVISIBLE }

        calculateButton.setOnClickListener {

            val bill = editBillText.text.toString().toDouble()
            val tip_Percentage = editTipText.text.toString().toDouble()/100
            val tip = bill * tip_Percentage
            val total = tip + bill

            String.format("%.2f", tip )
            infoTextView.visibility = View.VISIBLE
            infoTextView.text = " Tip: ${doubleToDollar(tip)} +  Total: ${doubleToDollar(total)}"
        }
    }

    fun doubleToDollar(number: Double): String{

        return "$" + String.format("%.2f", number )

    }

}
