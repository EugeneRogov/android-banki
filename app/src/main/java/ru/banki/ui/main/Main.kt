package ru.banki.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.banki.R
import ru.banki.databinding.MainFragmentBinding
import ru.banki.ui.catalog.Catalog
import ru.banki.ui.catalog.CatalogViewModel

@AndroidEntryPoint
class Main : Fragment(R.layout.main_fragment) {
    companion object {
        val TAG: String = Catalog::class.java.simpleName
    }

    private val viewModel: CatalogViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = MainFragmentBinding.bind(view)

        viewModel.feedback().observe(viewLifecycleOwner, {

        })

        findNavController().navigate(R.id.action_main_to_reviewInApp)


    }

}