package com.example.exampleanimationprojject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class DimensionsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dimensions, container, false)

        val fragment_4x4 = EditMatrixFragment()
        val fragmentMain = MainFragment()

        val btn_2x2 = view?.findViewById<Button>(R.id.button_2x2)
        val btn_3x3 = view.findViewById<Button>(R.id.button_3x3)
        val btn_4x4 = view.findViewById<Button>(R.id.button4x4)
        val back_btn = view.findViewById<Button>(R.id.back_button)



        btn_4x4?.setOnClickListener{
            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView, fragment_4x4)
            fragmentTransaction?.commit()
        }

        back_btn?.setOnClickListener{
            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView, fragmentMain)
            fragmentTransaction?.commit()
        }

        return view
    }
}