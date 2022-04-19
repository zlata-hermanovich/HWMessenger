package com.example.messenger.ui.authorizatoin

import com.example.messenger.databinding.FragmentRegistrationBinding

fun validation(binding:FragmentRegistrationBinding){

    val x = (binding.editTextPassword.text.toString()
        .isNotEmpty() && binding.editTextRepeatPassword.text.toString().isNotEmpty())
    val y = (binding.editTextTextPersonName.text.toString()
        .isNotEmpty() && binding.editTextEmailAddress.text.toString().isNotEmpty())
    val z =
        (binding.editTextPassword.text.toString() == binding.editTextRepeatPassword.text.toString())

    binding.buttonRegistration.isEnabled = (x && y && z && binding.checkBoxAgree.isChecked)
}
