package com.example.financialapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.financialapp.R
import com.example.financialapp.models.QuizResult
import java.math.BigDecimal
import java.math.RoundingMode

class ResultsAdapter(private val resultsList: List<QuizResult>) :
    RecyclerView.Adapter<ResultsAdapter.ResultsViewHolder>() {
    inner class ResultsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultsViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.row_item, parent, false)
        return ResultsViewHolder(itemView)
    }

    // binds each element of the recyclerview individually
    override fun onBindViewHolder(holder: ResultsViewHolder, position: Int) {

        // get current item of list
        val result = resultsList[position]

        // show subject name
        holder.itemView.findViewById<TextView>(R.id.tv_subjectName).text =
            result.subjectName

        // show correct questions number
        holder.itemView.findViewById<TextView>(R.id.tv_correctNumber).text =
            result.correctQuestionNumber.toString()

        // show type
        holder.itemView.findViewById<TextView>(R.id.tv_type).text =
            result.typeOfTest

        // show total questions number
        holder.itemView.findViewById<TextView>(R.id.tv_questionNumber).text =
            result.totalQuestionNumber.toString()

        holder.itemView.findViewById<TextView>(R.id.tv_dateTime).text =
            result.displayTime

        // Show success rate.
        val percent =
            result.correctQuestionNumber!!.toDouble() / result.totalQuestionNumber!!.toDouble() * 100

        val decimal = BigDecimal(percent).setScale(1, RoundingMode.HALF_EVEN)
        holder.itemView.findViewById<TextView>(R.id.tv_successRate).text =
            "$decimal%"

        val percentage = result.correctQuestionNumber.toDouble() / result.totalQuestionNumber.toDouble() * 100
        holder.itemView.findViewById<RatingBar>(R.id.rb_ratingBar).rating = when(percentage.toInt()){
            in 0..10 -> {
                0F
            }
            in 11..20 -> {
                0.5F
            }
            in 21..30 -> {
                1F
            }
            in 31..40 -> {
                1.5F
            }
            in 41..49 -> {
                2F
            }
            in 50..60 -> {
                2.5F
            }
            in 61..70 -> {
                3F
            }
            in 71..80 -> {
                3.5F
            }
            in 81..90 -> {
                4.0F
            }
            in 91..99 -> {
                4.5F
            }
            100 -> {
                5F
            }
            else -> 0F
        }
        holder.itemView.findViewById<RatingBar>(R.id.rb_ratingBar).setIsIndicator(true)



    }

    // total number of items
    override fun getItemCount() = resultsList.size
}