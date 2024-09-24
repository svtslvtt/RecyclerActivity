package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val numbers: IntArray) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()/* TODO Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        return numbers.size
    }

    // TODO Step 3b: Complete function definitions for adapter

}