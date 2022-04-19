package com.example.messenger.ui.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.messenger.databinding.FragmentAdditionChatsBinding
import com.example.messenger.ui.home.AddChatsDialog

class AdditionChatsFragment : Fragment() {
    lateinit var binding: FragmentAdditionChatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAdditionChatsBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonAdditionDialog.setOnClickListener {
            AddChatsDialog().show(parentFragmentManager, "")

        }
    }
}