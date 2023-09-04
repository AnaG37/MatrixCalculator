package com.example.exampleanimationprojject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.GridLayout
import androidx.fragment.app.FragmentTransaction

class EditMatrixFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_edit_matrix, container, false)

        val fragmentDimension = DimensionsFragment()

        val back_btn = view.findViewById<Button>(R.id.back_button)

        back_btn?.setOnClickListener{
            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView, fragmentDimension)
            fragmentTransaction?.commit()
        }

        val gridLayout = view.findViewById<GridLayout>(R.id.gridLayout)

        val numRows = 4 // Set the number of rows
        val numCols = 4 // Set the number of columns

        val editTextWidth = (40 * resources.displayMetrics.density).toInt()

        val gridLayoutWidth = numCols * editTextWidth

        gridLayout.layoutParams.width = gridLayoutWidth

        val editTextMatrix = Array(numRows) { row ->
            Array(numCols) { col ->
                val editText = EditText(requireContext())
                editText.setBackgroundResource(R.drawable.matrix_element_shape)
                editText.height = (40 * resources.displayMetrics.density).toInt()
                editText.width = editTextWidth

                val layoutParams = GridLayout.LayoutParams()
                layoutParams.rowSpec = GridLayout.spec(row, 0f)
                layoutParams.columnSpec = GridLayout.spec(col, 0f)

                editText.layoutParams = layoutParams
                gridLayout.addView(editText)
                editText
            }
        }

        return view
    }
}