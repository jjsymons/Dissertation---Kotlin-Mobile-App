package com.example.financialapp.fragments.main_page_fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.financialapp.databinding.FragmentModuleBinding
import com.example.financialapp.view.ChoicePage

class ModuleFragment : Fragment(com.example.financialapp.R.layout.fragment_module) {
    private var _binding: FragmentModuleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentModuleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // For navigating to quizzes
        val benefits = binding.tvBenefits
        benefits.setOnClickListener { sendIntent(0) }

        val everydayMoney = binding.tvEverydayMoney
        everydayMoney.setOnClickListener { sendIntent(1) }

        val familyCare = binding.tvFamilyAndCare
        familyCare.setOnClickListener { sendIntent(2) }

        val homes = binding.tvHomes
        homes.setOnClickListener { sendIntent(3) }

        val moneyProblems = binding.tvMoneyProblems
        moneyProblems.setOnClickListener { sendIntent(4) }

        val pensions = binding.tvPensionsAndRetirement
        pensions.setOnClickListener { sendIntent(5) }

        val savings = binding.tvSavings
        savings.setOnClickListener { sendIntent(6) }

        val work = binding.tvWork
        work.setOnClickListener { sendIntent(7) }
    }

    private fun sendIntent(passedVariable: Int) {
        val intent = Intent(requireContext(), ChoicePage::class.java)
        intent.putExtra("information", passedVariable)
        when (passedVariable) {
            0 -> {
                intent.putExtra("subjectName", "Benefits")
            }
            1 -> {
                intent.putExtra("subjectName", "Everyday Money")
            }
            2 -> {
                intent.putExtra("subjectName", "Family & Care")
            }
            3 -> {
                intent.putExtra("subjectName", "Homes")
            }
            4 -> {
                intent.putExtra("subjectName", "Money Troubles")
            }
            5 -> {
                intent.putExtra("subjectName", "Pensions & Retirement")
            }
            6 -> {
                intent.putExtra("subjectName", "Savings")
            }
            7 -> {
                intent.putExtra("subjectName", "Work")
            }
        }
        startActivity(intent)
        requireActivity()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}