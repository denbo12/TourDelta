package com.denbofa.tourdeltaone.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.denbofa.tourdeltaone.R
import com.denbofa.tourdeltaone.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onResume() {
        super.onResume()
        val cities = resources.getStringArray(R.array.cities)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.drop_down_item, cities)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSearchBinding.inflate(inflater, container, false)

        return binding.root
    }


}