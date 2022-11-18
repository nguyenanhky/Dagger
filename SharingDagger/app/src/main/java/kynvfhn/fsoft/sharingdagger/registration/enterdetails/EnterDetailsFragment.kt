package kynvfhn.fsoft.sharingdagger.registration.enterdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kynvfhn.fsoft.sharingdagger.databinding.FragmentEnterDetailsBinding
import kynvfhn.fsoft.sharingdagger.registration.RegistrationActivity
import kynvfhn.fsoft.sharingdagger.registration.RegistrationViewModel

class EnterDetailsFragment : Fragment() {
    private var _binding: FragmentEnterDetailsBinding?=null
    private lateinit var registrationViewModel: RegistrationViewModel
    private lateinit var enterDetailsViewModel: EnterDetailsViewModel

    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentEnterDetailsBinding.inflate(inflater,container,false)
        registrationViewModel = (activity as RegistrationActivity).registrationViewModel
        enterDetailsViewModel = EnterDetailsViewModel()

        enterDetailsViewModel.enterDetailsState.observe(
            viewLifecycleOwner,
            { state ->
                when (state) {
                    is EnterDetailsSuccess -> {

                        val username = binding.username.text.toString()
                        val password = binding.password.text.toString()
                        registrationViewModel.updateUserData(username, password)

                        (activity as RegistrationActivity).onDetailsEntered()
                    }
                    is EnterDetailsError -> {
                        binding.error.text = state.error
                        binding.error.visibility = View.VISIBLE
                    }
                }
            }
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.next.setOnClickListener {
            val username = binding.username.text.toString();
            val password = binding.password.text.toString()
            enterDetailsViewModel.validateInput(username,password)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
sealed class EnterDetailsViewState
object EnterDetailsSuccess : EnterDetailsViewState()
data class EnterDetailsError(val error: String) : EnterDetailsViewState()