package ru.banki.ui.catalog

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.banki.R
import ru.banki.databinding.CatalogFragmentBinding

@AndroidEntryPoint
class Catalog : Fragment(R.layout.catalog_fragment) {
    companion object {
        val TAG: String = Catalog::class.java.simpleName
    }

    private val viewModel: CatalogViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = CatalogFragmentBinding.bind(view)

        viewModel.feedback().observe(viewLifecycleOwner, {

        })


    }

}