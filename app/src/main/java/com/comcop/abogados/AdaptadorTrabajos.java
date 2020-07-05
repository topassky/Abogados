package com.comcop.abogados;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorTrabajos extends RecyclerView.Adapter<AdaptadorTrabajos.ViewHolderTrabajos>
        implements View.OnClickListener{


    ArrayList<TrabajosVo> listaTrabajos;
    private View.OnClickListener listener;


    public AdaptadorTrabajos(ArrayList<TrabajosVo> listaTrabajos) {
        this.listaTrabajos = listaTrabajos;
    }

    @NonNull
    @Override
    public ViewHolderTrabajos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layout = 0;
        if (Utilidades.visualizacion==Utilidades.SERVICIOS){
            layout=R.layout.item_profesiones;
        }else{
            layout=R.layout.item_servicios;
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(layout,null,false);
        view.setOnClickListener(this);
        return new ViewHolderTrabajos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTrabajos holder, int position) {
        holder.EdiNombre.setText(listaTrabajos.get(position).getNombre());
        holder.EditInformacion.setText(listaTrabajos.get(position).getInfo());
        holder.foto.setImageResource(listaTrabajos.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaTrabajos.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onClick(View v) {
        if (listener!=null){
            listener.onClick(v);
        }

    }

    public class ViewHolderTrabajos extends RecyclerView.ViewHolder {

        TextView EdiNombre, EditInformacion;
        ImageView foto;

        public ViewHolderTrabajos(@NonNull View itemView) {
            super(itemView);
            EdiNombre = (TextView) itemView.findViewById(R.id.idNombre);
            EditInformacion = (TextView) itemView.findViewById(R.id.idInfo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}
