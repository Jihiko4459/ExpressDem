package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment


class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val l=inflater.inflate(R.layout.fragment_profile, container, false)
        var btn_hide:CheckBox=l.findViewById(R.id.radioButton)
        var notific:CardView=l.findViewById(R.id.item3)
        var statements_reports:CardView=l.findViewById(R.id.item2)
        var cardset:CardView=l.findViewById(R.id.item4)
        var logout:CardView=l.findViewById(R.id.item7)
        var txt_balance:TextView=l.findViewById(R.id.textView37)
        statements_reports.setOnClickListener {
            val intent=Intent(activity, SendPackageActivity::class.java)
            startActivity(intent)
        }
        notific.setOnClickListener {
            val intent=Intent(activity, NotificationActivity::class.java)
            startActivity(intent)
        }
        cardset.setOnClickListener {
            val intent=Intent(activity, AddPaymentMethodActivity::class.java)
            startActivity(intent)
        }
        logout.setOnClickListener {
            val intent=Intent(activity, LogInActivity::class.java)
            startActivity(intent)
        }
        btn_hide.setOnClickListener {
            if (btn_hide.isChecked){
                txt_balance.setText(" **********")
            }
            else{
                txt_balance.setText(" "+"N10,712:00")
                //достать балланс с сервера
            }
        }
        return l
    }

}