package com.example.activitysample.ui.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MutilAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int TYPE_TEXT_TIME = 0;
    public static final int TYPE_ITEM = 1;


    public void setData() {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        if (viewType == TYPE_TEXT_TIME) {
//            ItemTextTimeResultBinding bindingText = ItemTextTimeResultBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
//            return new TimeViewHolder(bindingText);
//        } else {
//            ItemScannerBinding bindingItem = ItemScannerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
//            return new ItemViewHolder(bindingItem);
//        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (holder.getItemViewType() == TYPE_TEXT_TIME) {
//            TimeViewHolder timeViewHolder = (TimeViewHolder) holder;
        } else {
//            ItemViewHolder itemViewHolder = (ItemViewHolder) holder;

        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {      // distinguish type of items
//        ResultModel typeModel = list.get(position);
//        if (typeModel.getType() == 1) {
//            return TYPE_ITEM;
//        } else {
//            return TYPE_TEXT_TIME;
//        }
        return 0;
    }

    public void undoItem(int index) {
        notifyItemInserted(index);
    }

//    public static class TimeViewHolder extends RecyclerView.ViewHolder {
//        public ItemTextTimeResultBinding bindingText;
//
//        public TimeViewHolder(@NonNull ItemTextTimeResultBinding bindingText) {
//            super(bindingText.getRoot());
//            this.bindingText = bindingText;
//        }
//    }
//
//    public static class ItemViewHolder extends RecyclerView.ViewHolder {
//        public ItemScannerBinding bindingItem;
//
//        public ItemViewHolder(@NonNull ItemScannerBinding bindingItem) {
//            super(bindingItem.getRoot());
//            this.bindingItem = bindingItem;
//        }
//    }

    public interface CallBack {
        void updateFavorite(boolean isFavorite, String time, int position);
    }

    public interface MoveFragment {
        void moveToResultCreate(int position, String timeHasNotConvert);
    }
}
