package uz.itschool.gallary

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import uz.itschool.myapplication.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var list= mutableListOf<Int>()
    lateinit private var imageView_1:ImageView
    lateinit private var imageView_2:ImageView
    lateinit private var imageView_3:ImageView
    lateinit private var imageView_4:ImageView
    lateinit private var imageView_5:ImageView
    lateinit private var imageView_6:ImageView
    lateinit private var image_full:ImageView
    lateinit private var rel_layout:RelativeLayout
    lateinit private var linear_layout:LinearLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView_1=findViewById(R.id.imageView_1)
        imageView_2=findViewById(R.id.imageView_2)
        imageView_3=findViewById(R.id.imageView_3)
        imageView_4=findViewById(R.id.imageView_4)
        imageView_5=findViewById(R.id.imageView_5)
        imageView_6=findViewById(R.id.imageView_6)
        image_full=findViewById(R.id.image_full)
        rel_layout=findViewById(R.id.relative_layout)
        linear_layout=findViewById(R.id.linear_layout)



        imageView_1.setOnClickListener(this)
        imageView_2.setOnClickListener(this)
        imageView_3.setOnClickListener(this)
        imageView_4.setOnClickListener(this)
        imageView_5.setOnClickListener(this)
        imageView_6.setOnClickListener(this)


        list.add(R.drawable.img_1)
        list.add(R.drawable.img_2)
        list.add(R.drawable.img_3)
        list.add(R.drawable.img_4)
        list.add(R.drawable.img_5)
        list.add(R.drawable.img_6)
    }

    override fun onClick(p0: View?) {
        val img = findViewById<ImageView>(p0!!.id)
        image_full.setImageResource(list[img.tag.toString().toInt()])
        image_full.visibility=View.VISIBLE
        linear_layout.visibility=View.GONE

        /*prev_button.setOnClickListener {
            image_full.setImageResource(list[img.tag.toString().toInt()-1])
        }

        next_button.setOnClickListener {
            image_full.setImageResource(list[img.tag.toString().toInt()+1])
        }*/

    }
}