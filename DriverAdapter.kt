package com.example.widget
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView



class DriverAdapter(private val driverList: List<Driver>) :
    RecyclerView.Adapter<DriverAdapter.DriverViewHolder>() {

    class DriverViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvDriverName)
        val imgPhoto: ImageView = itemView.findViewById(R.id.imgDriverPhoto)
        val imgTeam: ImageView = itemView.findViewById(R.id.imgTeamLogo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_driver, parent, false)
        return DriverViewHolder(view)
    }

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {
        val driver = driverList[position]
        holder.tvName.text = driver.name
        holder.imgPhoto.setImageResource(driver.photoResId)
        holder.imgTeam.setImageResource(driver.teamLogoResId)
    }

    override fun getItemCount(): Int = driverList.size
}

