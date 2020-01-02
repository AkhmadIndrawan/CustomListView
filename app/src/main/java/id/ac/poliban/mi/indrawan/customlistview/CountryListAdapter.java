package id.ac.poliban.mi.indrawan.customlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class CountryListAdapter extends BaseAdapter {
    private List<Country> countries;

    public CountryListAdapter(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_negara, parent, false);

        //mengenali view ke object
        ImageView imgCountryListFlag = convertView.findViewById(R.id.img_country_flag_list);
        TextView tvCountryName = convertView.findViewById(R.id.tv_country_name);
        TextView tvCountryDetail = convertView.findViewById(R.id.tv_country_detail);

        //isi data
        Glide.with(parent.getContext())
                .load(countries.get(position).getFlag())
                .apply(new RequestOptions().override(90,55))
                .into(imgCountryListFlag);
        tvCountryName.setText(countries.get(position).getCountryName());
        tvCountryDetail.setText(countries.get(position).getCountryDetail());

        return convertView;
    }
}
