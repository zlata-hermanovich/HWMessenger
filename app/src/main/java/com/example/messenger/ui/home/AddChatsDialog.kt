package com.example.messenger.ui.home

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.messenger.databinding.DialogBinding
import com.example.messenger.repository.ChatsSingleton

class AddChatsDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = DialogBinding.inflate(layoutInflater)
        return AlertDialog.Builder(requireContext())
            .setView(view.root)
            .setTitle("Add chat")
            .setCancelable(true)
            .setPositiveButton(
                "Add"
            ) { _, _ ->
                ChatsSingleton.mapOfChats.add(view.editTextNameChats.text.toString())
            }

            .setNegativeButton("Cancel") { _, _ ->
                dismiss()
            }
            .create()
    }
}