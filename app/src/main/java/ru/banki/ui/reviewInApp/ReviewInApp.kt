package ru.banki.ui.reviewInApp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import ru.banki.R
import ru.banki.databinding.ReviewInAppFragmentBinding

class ReviewInApp : BottomSheetDialogFragment() {

    private val viewModel: ReviewInAppViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.review_in_app_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = ReviewInAppFragmentBinding.bind(view)

        binding.ratingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { _, rating, _ ->
                when (rating.toInt()) {
                    1, 2, 3 -> Toast.makeText(requireContext(), "1", Toast.LENGTH_SHORT).show()
                    4, 5 -> Toast.makeText(requireContext(), "2", Toast.LENGTH_SHORT).show()
                }
            }
    }
}