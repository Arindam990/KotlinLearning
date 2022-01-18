package com.android.kotlinlearning.GettingSunriseTime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.kotlinlearning.CommonMethod
import com.android.kotlinlearning.R
import com.android.kotlinlearning.databinding.FragmentWeatherBinding
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_sunrise_time_main.*
import org.json.JSONObject

class weatherFragment : Fragment(R.layout.fragment_weather) {
    private var binding: FragmentWeatherBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentWeatherBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.buSunset.setOnClickListener {
            load()
        }
    }

    fun load() {
        val queue = Volley.newRequestQueue(requireContext())
        var city = etCityName.text.toString()
        var api = "7628d4747192dbb14d3dc1ca3666b1e6"
        val url = "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$api"

// Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                val data = response.toString()
                var json = JSONObject(data)
                val sys = json.getJSONObject("sys")
                val sunrise = sys.getString("sunrise")
                val sunset=sys.getString("sunset")
                val wind=json.getJSONObject("wind")
                val windspeed=wind.getString("speed")
                val visibility=json.getString("visibility")
                val main=json.getJSONObject("main")
                val humidity=main.getString("humidity")
                binding!!.tvSunSetTime.setText("Sunrise time="+CommonMethod().getDateTime(sunrise.toLong()))
                binding!!.sunsetTextview.setText(("Sunset time="+CommonMethod().getDateTime(sunset.toLong())))
                binding!!.windSpeed.setText("wind speed ="+windspeed)
                binding!!.visibility.setText("visibility="+visibility)
                binding!!.humidityTextView.setText("humidity="+humidity)
            },
            { })

// Add the request to the RequestQueue.
        queue.add(stringRequest)

    }


}