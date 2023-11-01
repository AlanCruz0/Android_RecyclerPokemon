package com.example.recyclerview.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.models.Pikachu;

import java.util.List;

public class PikachuAdapter extends RecyclerView.Adapter<PikachuAdapter.ViewHolder>{

    private List<Pikachu> pikachus;

    public PikachuAdapter(List<Pikachu> pikachus) {
        this.pikachus = pikachus;
    }

    @NonNull
    @Override
    public PikachuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.pokemon_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PikachuAdapter.ViewHolder holder, int position) {
        Pikachu pikachu = pikachus.get(position);
        holder.setData(pikachu);
    }

    @Override
    public int getItemCount() {
        return pikachus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtChapeteIzquierdo;
        TextView txtChapeteDerecho;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtChapeteIzquierdo = itemView.findViewById(R.id.chapeteizquierdo);
            txtChapeteDerecho = itemView.findViewById(R.id.chapetederecho);
            txtChapeteDerecho.setOnClickListener(this);
        }

        public void setData(Pikachu pikachu) {
            txtChapeteIzquierdo.setText(pikachu.getChapeteIzquierdo().getColor());
            txtChapeteDerecho.setText(pikachu.getChapeteDerecho().getColor());
        }

        @Override
        public void onClick(View v) {
            Log.i("Click", "Click en el chapete derecho");
        }
    }
}
