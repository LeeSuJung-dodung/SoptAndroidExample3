package com.example.hw2_sopt

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    lateinit var instaAdapter: InstaAdapter
    val datas : MutableList<InstaData> = mutableListOf<InstaData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        instaAdapter = InstaAdapter(view.context)
        rv_home.run {
            adapter = instaAdapter
            layoutManager=LinearLayoutManager(view.context,LinearLayoutManager.VERTICAL,false)
            addItemDecoration(
              Deco(50, Color.YELLOW)
                )
        }
        loadDatas()
    }
    private fun loadDatas() {
        datas.apply {
            add(
                InstaData(
                    userName = "leesujung",
                    img_profile = "https://th.bing.com/th/id/OIP.ZxR1xJIl-oskw9SAT5B2MQHaHa?w=221&h=211&c=7&o=5&dpr=1.25&pid=1.7",
                    img_contents = "https://t1.daumcdn.net/cfile/tistory/227C7A495458348F2C"
                )

            )

            add(
                InstaData(
                    userName = "kimgeonwoo",
                    img_profile = "https://th.bing.com/th/id/OIP.PWq-LjoNYjG3mpvT1T5_UgHaHa?pid=Api&rs=1",
                    img_contents = "https://th.bing.com/th/id/OIP.UOWrRWIIDKoD4gFpEQ3_FwHaFA?pid=Api&rs=1"
                )
            )
            add(
                InstaData(
                    userName = "zoseohyun",
                    img_profile = "https://th.bing.com/th/id/OIP.qLXD_yDpTs4wg389I2Lj-QAAAA?w=122&h=163&c=7&o=5&pid=1.7",
                    img_contents = "https://th.bing.com/th/id/OIP.Tl4y5Lv5UCXa6QP1XyEuMgHaEv?pid=Api&rs=1"
                )
            )
        }
        instaAdapter.data=datas
        instaAdapter.notifyDataSetChanged()
    }
    }

