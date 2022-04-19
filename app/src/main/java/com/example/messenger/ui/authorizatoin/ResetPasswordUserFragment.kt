package com.example.messenger.ui.authorizatoin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.messenger.R
import com.example.messenger.databinding.FragmentResetPasswordUserBinding

class ResetPasswordUserFragment : Fragment() {
    private lateinit var binding: FragmentResetPasswordUserBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResetPasswordUserBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonReset.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.login, AuthorizationFragment())
                .commit()
        }
    }
}
