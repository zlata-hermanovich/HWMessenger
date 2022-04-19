package com.example.messenger.ui.authorizatoin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.messenger.R
import com.example.messenger.databinding.FragmentAuthorizationBinding
import com.example.messenger.ui.home.HomeActivity
import android.content.Intent as Intent

class AuthorizationFragment : Fragment() {

    lateinit var binding: FragmentAuthorizationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAuthorizationBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonResetPasOnLog.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.login, ResetPasswordUserFragment())
                .commit()
        }
        binding.buttonRegistration.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.login, RegistrationFragment())
                .commit()
        }
        binding.buttonSignIn.setOnClickListener {
            activity?.startActivity(Intent(context, HomeActivity::class.java))
            activity?.finish()
        }
        binding.editTextPassword.addTextChangedListener(textWatcher)
        binding.editTextEmail.addTextChangedListener(textWatcher)
    }

    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            //do nothing
        }
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            //do nothing
        }
        override fun afterTextChanged(p0: Editable?) {
            binding.buttonSignIn.isEnabled =
                (binding.editTextPassword.text.toString()
                    .isNotEmpty() && binding.editTextEmail.toString().isNotEmpty())
        }
    }
}

