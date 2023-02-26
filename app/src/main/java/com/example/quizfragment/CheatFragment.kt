package com.example.quizfragment

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.scollingfragment.R
import com.example.scollingfragment.databinding.FragmentCheatBinding

class CheatFragment : Fragment(R.layout.fragment_cheat) {
    private val args by navArgs<CheatFragmentArgs>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = DataBindingUtil.bind<FragmentCheatBinding>(view)
        val answer = args.answer
        var cheatStatus = Cheater
        binding?.btnShow?.setOnClickListener {
            binding.txtCheat.text = answer.toString()
            cheatStatus.cheats = true
        }
    }

}