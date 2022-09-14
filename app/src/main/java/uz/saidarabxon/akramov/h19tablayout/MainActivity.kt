package uz.saidarabxon.akramov.h19tablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import uz.adapters.MyFragmentPagerAdapter
import uz.saidarabxon.akramov.h19tablayout.databinding.ActivityMainBinding
import uz.utils.User

class MainActivity : AppCompatActivity() {
    lateinit var myFragmentPagerAdapter: MyFragmentPagerAdapter
    private lateinit var list: ArrayList<User>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadDate()

        myFragmentPagerAdapter = MyFragmentPagerAdapter(supportFragmentManager, list)
        binding.viewPager.adapter = myFragmentPagerAdapter
//        binding.tabLayout.setupWithViewPager(binding.viewPager)
        binding.cador.attachTo(binding.viewPager)


    }

    private fun loadDate() {


        list = ArrayList()


        list.add(
            User(
                R.drawable.rectangle,
                "O'tkazib yuborish",
                "Xush kelibsiz",
                "Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, \n" +
                        "Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘"
            )
        )
        list.add(
            User(
                R.drawable.ikki,
                "O'tkazib yuborish",
                "Hikoyalar dunyosi",
                "Gar zamonni nayf qilsam ayb qilma, ey rafiq, \n" +
                        "Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ ! "
            )
        )
        list.add(
            User(
                R.drawable.uch,
                "O'tkazib yuborish",
                "Kitob ortidan..",
                "Dilrabolardin yomonliq keldi mahzun ko‘ngluma,\n" +
                        " Kelmadi jonimg'a hech oromi jondin yaxshilig'."
            )
        )

        list.add(
            User(
                R.drawable.tort,
                "O'tkazib yuborish",
                "Bizga qo`shiling",
                "Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p,\n" +
                        " Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?"
            )
        )

    }
//    val dotsIndicator = findViewById<DotsIndicator>(R.id.dots_indicator)
//    val viewPager = findViewById<ViewPager>(R.id.view_pager)
//    val adapter = myFragmentPagerAdapter
//    viewPager.adapter = adapter
//    dotsIndicator.attachTo(viewPager)



}