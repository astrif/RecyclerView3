package id.sch.smktelkom_mlg.learn.recyclerview3.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.recyclerview3.R;
import id.sch.smktelkom_mlg.learn.recyclerview3.model.Hotel;


/**
 * Created by Astri Fadilah on 16/11/2016.
 */
public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder>

{
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Hotel hotel = hotelList.get(position);
        holder.tvJudul.setText(hotel.judul);
        holder.tvDeskripsi.setText(hotel.deskripsi);
        holder.ivFoto.setImageURI(Uri.parse(hotel.foto));
    }

    @Override
    public int getItemCount() {
        if (hotelList!=null)
            return hotelList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    mIHotelAdapter.doClick(getAdapterPosition());
                }
            });
        }
    }


    ArrayList<Hotel> hotelList;

    public HotelAdapter(Context context, ArrayList<Hotel> hotelList)
    {
        mIHotelAdapter = (IHotelAdapter) context;
        this.hotelList = hotelList;
    }

    public interface IHotelAdapter
    {
        void doClick(int pos);
    }

    IHotelAdapter mIHotelAdapter;

}
