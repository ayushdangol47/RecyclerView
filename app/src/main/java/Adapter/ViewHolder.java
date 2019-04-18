package Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.e.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder {

    public class ContactsAdapter extends RecyclerView.Adapter<>
    public class ContactsViewHolder extends RecyclerView.ViewHolder{

            CircleImageView imgProfile;
            TextView tvName, tvPhone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
        }
    }
}
