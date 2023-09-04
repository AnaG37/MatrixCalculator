package com.example.exampleanimationprojject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val matrix_a_Btn = view?.findViewById<Button>(R.id.matrix_a)
        val matrix_b_Btn = view.findViewById<Button>(R.id.matrix_b)
        val matrix_c_Btn = view.findViewById<Button>(R.id.matrix_c)
        val matrix_d_Btn = view.findViewById<Button>(R.id.matrix_d)

        val fragmentDimension = DimensionsFragment()

        matrix_a_Btn?.setOnClickListener{
            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView, fragmentDimension)
            fragmentTransaction?.commit()
        }

        matrix_b_Btn?.setOnClickListener{
            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView, fragmentDimension)
            fragmentTransaction?.commit()
        }

        matrix_c_Btn?.setOnClickListener{
            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView, fragmentDimension)
            fragmentTransaction?.commit()
        }

        matrix_d_Btn?.setOnClickListener{
            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView, fragmentDimension)
            fragmentTransaction?.commit()
        }

        return view
    }
}