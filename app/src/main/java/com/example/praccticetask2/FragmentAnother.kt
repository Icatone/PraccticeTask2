package com.example.praccticetask2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.example.praccticetask2.databinding.FragmentAnotherBinding

class FragmentAnother : Fragment(R.layout.fragment_another) {
    private var binding: FragmentAnotherBinding? = null

    override fun onViewCreated(view: View,savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentAnotherBinding.bind(view)

        Snackbar.make(binding!!.root,arguments?.getString("ARG_NAME").orEmpty(),Snackbar.LENGTH_LONG).show()
    }

    companion object {
        fun createBundle(funName: String): Bundle {
            val bundle = Bundle();
            bundle.putString("ARG_NAME",funName)
            return bundle
        }
    }
}