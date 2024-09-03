package ru.banki.ui.myapplications

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.banki.R
import ru.banki.databinding.MyApplicationsFragmentBinding

@AndroidEntryPoint
class MyApplications : Fragment(R.layout.my_applications_fragment) {
    companion object {
        val TAG: String = MyApplications::class.java.simpleName
    }

    private val viewModel: MyApplicationsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = MyApplicationsFragmentBinding.bind(view)

        viewModel.feedback().observe(viewLifecycleOwner, {

        })


    }

}