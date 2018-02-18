package com.afifhalim.halimafifhusfi_1202151234;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

public class MenuAdapter extends
        RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

    private final LinkedList<String> mIceList;
    private final LinkedList<Integer> mPriceList;
    private final LinkedList<Integer> mPhotoList;
    private LayoutInflater mInflater;

    public MenuAdapter(Context context, LinkedList<String> iceList, LinkedList<Integer> priceList, LinkedList<Integer> photoList) {
        mInflater = LayoutInflater.from(context);
        this.mIceList = iceList;
        this.mPriceList = priceList;
        this.mPhotoList = photoList;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.listmenu_activity, parent, false);
        return new MenuViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        String mCurrentIce = mIceList.get(position);
        Integer mCurrentPrice = mPriceList.get(position);
        Integer mCurrentPhoto = mPhotoList.get(position);
        holder.iceItemView.setText(mCurrentIce);
        holder.priceItemView.setText("Rp."+mCurrentPrice.toString());
        holder.photoItemView.setImageResource(mCurrentPhoto);
    }

    @Override
    public int getItemCount() {
        return mIceList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView iceItemView;
        public final TextView priceItemView;
        public final ImageView photoItemView;

        final MenuAdapter mAdapter;
        public MenuViewHolder(final View itemView, MenuAdapter adapter) {
            super(itemView);
            iceItemView = (TextView)itemView.findViewById(R.id.tv_ice);
            priceItemView = (TextView)itemView.findViewById(R.id.tv_price);
            photoItemView = (ImageView)itemView.findViewById(R.id.iv_photo);
            photoItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Get the position of the item that was clicked.
                    int mPosition = getLayoutPosision();
                    // Use that to access the affected item in mWordList.
                    String ice = mIceList.get(mPosition);
                    Integer price = mPriceList.get(mPosition);
                    Integer photo = mPhotoList.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(),MenuDetail.class);
                    intent.putExtra("ice",ice);
                    intent.putExtra("price",price);
                    intent.putExtra("photo",photo);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }

        @Override
        public void onClick(View view) {

        }
    }

    private int getLayoutPosision() {
        return 0;
    }
}
