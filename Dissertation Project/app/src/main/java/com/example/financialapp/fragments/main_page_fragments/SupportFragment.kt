package com.example.financialapp.fragments.main_page_fragments

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.financialapp.databinding.FragmentSupportBinding

class SupportFragment : Fragment(com.example.financialapp.R.layout.fragment_support) {


    private var _binding: FragmentSupportBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSupportBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // Gambling Charities

        // 1st Charity
        val char1Name = "GamCare"
        val char1Phone = "tel:0808 8020 133"
        val char1PhoneDisplay = "0808 8020 133"
        val char1Web = "gamcare.org.uk"
        binding.tvCharityOne.text = char1Name

        binding.tvCharityOnePhone.text = char1PhoneDisplay
        binding.tvCharityOnePhone.setOnClickListener {
            phoneIntent(char1Phone)
        }
        binding.imPhoneOne.setOnClickListener {
            phoneIntent(char1Phone)
        }
        binding.tvCharityOneWebsite.text = char1Web
        binding.tvCharityOneWebsite.setOnClickListener {
            webIntent(char1Web)
        }
        binding.imEmailOne.setOnClickListener {
            webIntent(char1Web)
        }

        // 2nd charity was removed

        // Debt Charities
        // 3rd Charity

        val char3Name = "Debt Advice Foundation"
        val char3Phone = "tel:0800 043 40 50"
        val char3PhoneDisplay = "0800 0434 050"
        val char3Web = "debtadvicefoundation.org"

        binding.tvCharityThree.text = char3Name

        binding.tvCharityThreePhone.text = char3PhoneDisplay
        binding.tvCharityThreePhone.setOnClickListener {
            phoneIntent(char3Phone)
        }
        binding.imPhoneThree.setOnClickListener {
            phoneIntent(char3Phone)
        }
        binding.tvCharityThreeWebsite.text = char3Web
        binding.tvCharityThreeWebsite.setOnClickListener {
            webIntent(char3Web)
        }
        binding.imEmailThree.setOnClickListener {
            webIntent(char3Web)
        }

        // 4th Charity

        val char4Name = "National Debt Helpline"
        val char4Phone = "tel:0808 8084 000"
        val char4PhoneDisplay = "0808 8084 000"
        val char4Web = "nationaldebtline.org"

        binding.tvCharityFour.text = char4Name

        binding.tvCharityFourPhone.text = char4PhoneDisplay
        binding.tvCharityFourPhone.setOnClickListener {
            phoneIntent(char4Phone)
        }
        binding.imPhoneFour.setOnClickListener {
            phoneIntent(char4Phone)
        }
        binding.tvCharityFourWebsite.text = char4Web
        binding.tvCharityFourWebsite.setOnClickListener {
            webIntent(char4Web)
        }
        binding.imEmailFour.setOnClickListener {
            webIntent(char4Web)
        }

        // Mental Health Charities

        // 5th Charity

        val char5Name = "CALM"
        val char5PhoneOne = "tel:0800 58 58 58"
        val char5PhoneOneDisplay = "0800 585 858"
        val char5PhoneTwo = "tel:0808 8025 858"
        val char5PhoneTwoDisplay = "(London) 0808 8025 858"
        val char5Web = "thecalmzone.net"

        binding.tvCharityFive.text = char5Name

        binding.tvCharityFivePhone.text = char5PhoneOneDisplay
        binding.tvCharityFivePhone.setOnClickListener {
            phoneIntent(char5PhoneOne)
        }
        binding.imPhoneFive.setOnClickListener {
            phoneIntent(char5PhoneOne)
        }
        binding.tvCharityPhoneFiveTwo.text = "(London) 0808 8025 858"

        binding.tvCharityPhoneFiveTwo.setOnClickListener {
            phoneIntent(char5PhoneTwo)
        }
        binding.imPhoneFiveTwo.setOnClickListener {
            phoneIntent(char5PhoneTwo)
        }



        binding.tvCharityFiveWebsite.text = char5Web
        binding.tvCharityFiveWebsite.setOnClickListener {
            webIntent(char5Web)
        }
        binding.imEmailFive.setOnClickListener {
            webIntent(char5Web)
        }



        val char6Name = "Samaritans"
        val char6Phone = "tel:116 123"
        val char6PhoneDisplay = "116 123"
        val char6Web = "samaritans.org/"

        binding.tvCharitySix.text = char6Name
        binding.tvCharitySixPhone.text = char6PhoneDisplay
        binding.tvCharitySixPhone.setOnClickListener {
            phoneIntent(char6Phone)
        }
        binding.imPhoneSix.setOnClickListener {
            phoneIntent(char6Phone)
        }
        binding.tvCharitySixWebsite.text = char6Web
        binding.tvCharitySixWebsite.setOnClickListener {
            webIntent(char6Web)
        }
        binding.imEmailSix.setOnClickListener {
            webIntent(char6Web)
        }
    }

    private fun phoneIntent(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse(phoneNumber)
        startActivity(intent)
    }

    private fun webIntent(website: String) {
        val intent = Intent(Intent.ACTION_WEB_SEARCH)
        intent.putExtra(SearchManager.QUERY, website)
        startActivity(intent)
    }
}