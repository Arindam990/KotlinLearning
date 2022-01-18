package com.android.kotlinlearning.Notepad

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import com.android.kotlinlearning.R
import kotlinx.android.synthetic.main.ticket.*

class Notepad_home : AppCompatActivity() {
    var listnote=ArrayList<Note>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notepad_home)
        listnote.add(Note("1","Meet doctor","Android is a mobile operating system based on a modified version of the Linux kernel and other open source software, designed primarily for touchscreen mobile devices such as smartphones and tablets"))
        listnote.add(Note("2","Meet HR","Human resources is the set of people who make up the workforce of an organization, business sector, industry, or economy. A narrower concept is human capital, the knowledge and skills which the individuals command. Similar terms include manpower, labor, personnel, associates or simply: people"))
        listnote.add(Note("3","Meet software engineer","A computer programmer, sometimes called a software developer, a programmer or more recently a coder, is a person who creates computer software. The term computer programmer can refer to a specialist in one area of computers or to a generalist who writes code for many kinds of software"))

    }
    inner class MyNotesAdapter:BaseAdapter{
        var listnoteAdapter=ArrayList<Note>()
        constructor(listnoteAdapter: ArrayList<Note>):super(){
            this.listnoteAdapter=listnoteAdapter
        }

        override fun getCount(): Int {
            return listnoteAdapter.size
        }

        override fun getItem(position: Int): Any {
             return listnoteAdapter(position)
        }

        private fun listnoteAdapter(position: Int): Any {
         return listnoteAdapter(position)
        }

        override fun getItemId(position: Int): Long {
           return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
             var myview=layoutInflater.inflate(R.layout.ticket,null)
            var mynote=listnoteAdapter(position = 0)
            return title_textView
        }
    }
}