package com.example.messenger.ui.authorizatoin

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.messenger.databinding.FragmentRegistrationBinding
import com.example.messenger.ui.home.HomeActivity

class RegistrationFragment : Fragment() {

    lateinit var binding: FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrationBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonRegistration.setOnClickListener {
            activity?.startActivity(Intent(activity, HomeActivity::class.java))
            activity?.finish()
        }

        binding.run {
            editTextSurename.addTextChangedListener(textWatcher)
            editTextEmailAddress.addTextChangedListener(textWatcher)
            editTextPassword.addTextChangedListener(textWatcher)
            editTextRepeatPassword.addTextChangedListener(textWatcher)
        }

        binding.checkBoxAgree.setOnCheckedChangeListener { _, _ ->
            validation(binding)
        }
    }

    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            //do nothing
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            //do nothing
        }

        override fun afterTextChanged(p0: Editable?) {
            validation(binding)
        }
    }
}

