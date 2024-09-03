package ru.banki.ui.reviewinapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import ru.banki.R
import ru.banki.databinding.ReviewInAppFinishFragmentBinding

class ReviewInAppFinish : BottomSheetDialogFragment() {

    private val viewModel: ReviewInAppViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.review_in_app_finish_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = ReviewInAppFinishFragmentBinding.bind(view)



        binding.btnOk.setOnClickListener {
            findNavController().popBackStack()
        }

    }
}