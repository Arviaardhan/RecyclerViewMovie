package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder> {

    private Context context;
    private List<ContactModel> contactList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvname, tvphone;

        public MyViewHolder(View view) {
            super(view);
            tvname = view.findViewById(R.id.tvname);
            tvphone = view.findViewById(R.id.tvphone);
        }
    }

    public ContactsAdapter(Context context, List<ContactModel> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsAdapter.MyViewHolder holder, int position) {
        final ContactModel contact = this.contactList.get(position);
        holder.tvname.setText(contact.getName());
        holder.tvphone.setText(contact.getPhone());

    }

    @Override
    public int getItemCount() {
        return this.contactList.size();
    }

}
