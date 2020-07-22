package com.comcop.abogados.ui;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.comcop.abogados.R;
import com.comcop.abogados.models.ExperienciaVo;

import java.util.ArrayList;

public class AdaptadorExperiencia extends RecyclerView.Adapter<AdaptadorExperiencia.viewHolderExperiencia> {

    ArrayList<ExperienciaVo> listaExperiencias;

    public AdaptadorExperiencia(ArrayList<ExperienciaVo> listaExperiencias) {
        this.listaExperiencias = listaExperiencias;
    }

    @NonNull
    @Override
    public viewHolderExperiencia onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_experiencia,null,false);

        return new viewHolderExperiencia(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderExperiencia holder, int position) {
        holder.textCargo.setText(listaExperiencias.get(position).getCargo());
        holder.textEmpresa.setText(listaExperiencias.get(position).getEmpresa());
        holder.textFunciones.setText(listaExperiencias.get(position).getFunciones());
        holder.textFecha.setText(listaExperiencias.get(position).getFecha());
    }

    @Override
    public int getItemCount() {
        return listaExperiencias.size();
    }

    public class viewHolderExperiencia extends RecyclerView.ViewHolder {
        TextView textEmpresa,textCargo,textFunciones,textFecha;
        public viewHolderExperiencia(@NonNull View itemView) {
            super(itemView);
            textEmpresa = (TextView) itemView.findViewById(R.id.textEmpresa);
            textCargo = (TextView) itemView.findViewById(R.id.textCargo);
            textFunciones = (TextView) itemView.findViewById(R.id.textFunciones);
            textFecha = (TextView) itemView.findViewById(R.id.textFecha);

        }
    }
}
