package ru.banki.ui.insurance

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.banki.R
import ru.banki.databinding.CatalogFragmentBinding
import ru.banki.databinding.InsuranceFragmentBinding

@AndroidEntryPoint
class Insurance : Fragment(R.layout.insurance_fragment) {
    companion object {
        val TAG: String = Insurance::class.java.simpleName
    }

    private val viewModel: InsuranceViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = InsuranceFragmentBinding.bind(view)

        viewModel.feedback().observe(viewLifecycleOwner, {

        })


    }

}