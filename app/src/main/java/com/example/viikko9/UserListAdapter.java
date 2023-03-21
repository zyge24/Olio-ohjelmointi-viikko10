package com.example.viikko9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<User> users){
    this.context = context;
    this.users = users;
    }


    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent,false));
    }

    public void onBindViewHolder(UserViewHolder holder, int position){
        holder.name.setText(users.get(position).getFirstName()+" " +users.get(position).getLastName());
        holder.email.setText(users.get(position).getEmail());
        holder.subject.setText(users.get(position).getDegreeProgram());
    }

    @Override
    public int getItemCount() {
        return UserStorage.getInstance().getSize();
    }
}
