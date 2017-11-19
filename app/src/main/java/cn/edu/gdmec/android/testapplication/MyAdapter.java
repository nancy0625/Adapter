package cn.edu.gdmec.android.testapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2017/11/19.
 */

public class MyAdapter extends BaseAdapter {
    List<ItemBean> mlist = new ArrayList<>();
    private LayoutInflater mInflater;

    public MyAdapter(Context context,List<ItemBean> mlist) {
        this.mlist = mlist;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item,null);
            viewHolder.imageView = convertView.findViewById(R.id.img_icon);
            viewHolder.title = convertView.findViewById(R.id.tv_title);
            viewHolder.content = convertView.findViewById(R.id.tv_content);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ItemBean bean = mlist.get(position);
        viewHolder.imageView.setImageResource(bean.ItemImage);
        viewHolder.title.setText(bean.ItemTitle);
        viewHolder.content.setText(bean.ItemContent);
        return convertView;
    }
    class ViewHolder{
        public ImageView imageView;
        public TextView title;
        public TextView content;
    }
}
