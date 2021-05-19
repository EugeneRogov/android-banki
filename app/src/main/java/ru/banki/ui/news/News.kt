package ru.banki.ui.news

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.banki.R
import ru.banki.databinding.NewsFragmentBinding

@AndroidEntryPoint
class News : Fragment(R.layout.news_fragment) {
    companion object {
        val TAG: String = News::class.java.simpleName
    }

    private val viewModel: NewsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = NewsFragmentBinding.bind(view)

        viewModel.feedback().observe(viewLifecycleOwner, {

        })


    }

}