package gl.it.com.myapp

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import java.util.jar.Attributes

/**
 * Created by 25244 on 2017/11/16.
 */
class MyView(context: Context?) : Button(context) {
    constructor(context: Context?, attr: AttributeSet?) : this(context)

    fun setToastListener(callback: () -> Unit) {

    }



}