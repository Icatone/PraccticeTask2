package com.example.praccticetask2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Fragment4 : Fragment(R.layout.fragment_4) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getView()?.findViewById<Button>(R.id.btn_fr4)?.setOnClickListener() {
            findNavController().navigate(
                R.id.action_fragment2_to_fragmentAnother,
                FragmentAnother.createBundle("Fragment4"))
        }
    }
}