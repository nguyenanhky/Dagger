package kynvfhn.fsoft.sharingdagger.registration.termsandconditions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kynvfhn.fsoft.sharingdagger.R
import kynvfhn.fsoft.sharingdagger.databinding.FragmentTermsAndConditionsBinding
import kynvfhn.fsoft.sharingdagger.registration.RegistrationActivity
import kynvfhn.fsoft.sharingdagger.registration.RegistrationViewModel

class TermsAndConditionsFragment : Fragment() {
    private var _binding: FragmentTermsAndConditionsBinding? = null
    private lateinit var registrationViewModel: RegistrationViewModel


    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTermsAndConditionsBinding.inflate(inflater, container, false)
        registrationViewModel = (activity as RegistrationActivity).registrationViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.next.setOnClickListener {
            registrationViewModel.acceptTCs()
            (activity as RegistrationActivity).onTermsAndConditionsAccepted()
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}