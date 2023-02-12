package com.brywal07.trafficlight

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.brywal07.trafficlight.databinding.ActivityMainBinding
import android.content.Context as Context1

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fun isStop():Boolean{
            print(count)
            return binding.btn.text.equals("STOP")
        }
        fun isGo():Boolean{
            print(count)
            return binding.btn.text.equals("GO")
        }
        fun isWait():Boolean{
            print(count)
            return binding.btn.text.equals("WAIT")
        }
        binding.btn.setOnClickListener{
            if(isStop()){

                binding.btn.setBackgroundTintList(this.getResources().getColorStateList(R.color.green));
                binding.btn.setText("GO")
                binding.greenLightImg.visibility= View.VISIBLE
                binding.yellowLightImg.visibility=View.INVISIBLE
                binding.redLightImg.visibility=View.INVISIBLE
                isStop()
            }
            else if(isGo()){
                binding.btn.setBackgroundTintList(this.getResources().getColorStateList(R.color.yellow));
                binding.btn.setText("WAIT")
                binding.greenLightImg.visibility= View.INVISIBLE
                binding.yellowLightImg.visibility=View.VISIBLE
                binding.redLightImg.visibility=View.INVISIBLE
                isGo()
            }
            else{
                binding.btn.setBackgroundTintList(this.getResources().getColorStateList(R.color.red));
                binding.btn.setText("STOP")
                binding.greenLightImg.visibility= View.INVISIBLE
                binding.yellowLightImg.visibility=View.INVISIBLE
                binding.redLightImg.visibility=View.VISIBLE
                isWait()

            }
        }
    }
}