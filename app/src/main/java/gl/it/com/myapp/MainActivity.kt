package gl.it.com.myapp

import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

class MainActivity : AppCompatActivity() {
    private val str: StringBuilder = StringBuilder()
    val SUCCESS: Int = 1
    val ERROR: Int = 1
    private val handler = object : Handler() {
        override fun handleMessage(msg: Message?) {
            when (msg?.what) {
                SUCCESS -> {
                    text.text = str.append("world!").toString()
                }
                else -> {
                    toast("error")
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {



//        tv.setOnClickListener {
        //            text.text = ""
//            //调用方法执行线程
//            launch {
//                //协程
//                delay(1000L)
//                handler.sendEmptyMessage(SUCCESS)
//
//            }
//            text.text = str.append("hello,").toString()

        //使用协程然后写一个东西
//            val job = launch {
//                doWorld()
//            }
//            launch {
//                println("Hello,")
//                job.join()
//            }

//            val jobs by lazy {
//                List(100_000) {
//                    launch {
//                        delay(1000L)
//                        print(".")
//                    }
//                }
//            }
//
//            launch { jobs.forEach { it.join() } }
//
//        }


    }


    suspend private fun doWorld() {
        delay(1000L)
        println("World!")
    }

    private fun toast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }


}
