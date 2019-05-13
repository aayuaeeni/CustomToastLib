package com.ld.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class CustomToster
{

    private void showCustomToast(AppCompatActivity compatActivity,String imageUrl,String message)
    {
        LayoutInflater inflater = compatActivity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast_layout,
                (ViewGroup) compatActivity.findViewById(R.id.toast_layout_root));
        layout.setBackground(compatActivity.getDrawable(R.drawable.shadow));

        ImageView ivMessageIcon = layout.findViewById(R.id.ivMessageIcon);
        TextView tvMessageTitle = layout.findViewById(R.id.tvMessageTitle);
        if (imageUrl != null && !TextUtils.isEmpty(imageUrl))
        {
            Picasso.get().load(imageUrl).resize(100, 100).placeholder(R.drawable.happy).centerCrop().into(ivMessageIcon);
        }
        else
        {
            Picasso.get().load(R.drawable.happy).resize(100, 100).centerCrop().into(ivMessageIcon);
        }

        if (message != null && !TextUtils.isEmpty(message))
        {
            tvMessageTitle.setText(message);
        }
        Toast toast = new Toast(compatActivity.getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 20);
        toast.show();

    }
}
