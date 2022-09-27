package nhl69.luansapp.tltdtdd_tuan7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMonAn extends BaseAdapter {

    private Context context;
    private int layout;
    private List<MonAn> arraylist;

    public AdapterMonAn(Context context, int layout, List<MonAn> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        MonAn monAn = arraylist.get(i);

        TextView textView1 = convertView.findViewById(R.id.tenmon);
        TextView textView2 = convertView.findViewById(R.id.mota);
        TextView textView3 = convertView.findViewById(R.id.gia);
        ImageView imageView = convertView.findViewById(R.id.image);

        textView1.setText(monAn.getTenMon());
        textView2.setText(monAn.getMoTa());
        textView3.setText(monAn.getDonGia());
        imageView.setImageResource(monAn.getHinh());

        return convertView;
    }
}
