//package com.example.activitysample.ui.adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.ViewGroup;
//
//import androidx.annotation.LayoutRes;
//import androidx.databinding.DataBindingUtil;
//import androidx.databinding.ViewDataBinding;
//import androidx.databinding.library.baseAdapters.BR;
//import androidx.recyclerview.widget.RecyclerView;
//
//
//import java.util.List;
//
//import io.reactivex.rxjava3.annotations.NonNull;
//
//public class BaseBindingAdapter<T> extends RecyclerView.Adapter<BaseBindingAdapter.ViewHolder> {
//   private List<T> data;
//   private final LayoutInflater inflater;
//   private @LayoutRes
//   final int resId;
//
//   public BaseBindingAdapter(Context context, @LayoutRes int resId) {
//      inflater = LayoutInflater.from(context);
//      this.resId = resId;
//   }
//
//   public void setData(List<T> data) {
//      this.data = data;
//   }
//
//   public List<T> getData() {
//      return data;
//   }
//
//   @NonNull
//   @Override
//   public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//      return new ViewHolder(DataBindingUtil.inflate(inflater, resId, viewGroup, false));
//   }
//
//   @Override
//   public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
//      T item = data.get(i);
//
//      viewHolder.binding.setVariable(BR.country, item);
//      viewHolder.binding.executePendingBindings();
//   }
//
//   @Override
//   public int getItemCount() {
//      return data == null ? 0 : data.size();
//   }
//
//   public static class ViewHolder extends RecyclerView.ViewHolder {
//      ViewDataBinding binding;
//
//      public ViewHolder(@NonNull ViewDataBinding binding) {
//         super(binding.getRoot());
//         this.binding = binding;
//      }
//   }
//}