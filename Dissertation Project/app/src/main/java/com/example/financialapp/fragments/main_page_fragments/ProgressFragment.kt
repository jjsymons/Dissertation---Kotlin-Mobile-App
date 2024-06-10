package com.example.financialapp.fragments.main_page_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.financialapp.R
import com.example.financialapp.adapter.ResultsAdapter
import com.example.financialapp.databinding.FragmentProgressBinding
import com.example.financialapp.db.QuizDao
import com.example.financialapp.db.QuizDb


class ProgressFragment : Fragment(R.layout.fragment_progress) {
    private lateinit var dao: QuizDao
    lateinit var binding: FragmentProgressBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProgressBinding.inflate(inflater, container, false)
        dao = QuizDb.invoke(requireContext()).getDao()

        if (dao.getAllResults().isEmpty()) {
            binding.tvWarning.visibility = View.VISIBLE
            binding.recyclerView.visibility = View.GONE
        } else {
            binding.tvWarning.visibility = View.GONE
            binding.recyclerView.visibility = View.VISIBLE
        }

        val resultsAdapter = ResultsAdapter(dao.getAllResults().sortedByDescending { it.checkTime })

        binding.recyclerView.adapter = resultsAdapter

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}