package com.epicodus.www.myrestaurants.adapters;

import android.content.Context;
<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> 8e0d3a2681102eec2bffd78d11b5042ba7d24b62
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.www.myrestaurants.R;
import com.epicodus.www.myrestaurants.models.Restaurant;
<<<<<<< HEAD
import com.epicodus.www.myrestaurants.ui.RestaurantDetailActivity;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

=======
import com.squareup.picasso.Picasso;

>>>>>>> 8e0d3a2681102eec2bffd78d11b5042ba7d24b62
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by reviveit on 4/24/16.
 */
    public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.RestaurantViewHolder> {
        private ArrayList<Restaurant> mRestaurants = new ArrayList<>();
        private Context mContext;

        public RestaurantListAdapter(Context context, ArrayList<Restaurant> restaurants) {
            mContext = context;
            mRestaurants = restaurants;
        }

        @Override
        public RestaurantListAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item, parent, false);
            RestaurantViewHolder viewHolder = new RestaurantViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(RestaurantListAdapter.RestaurantViewHolder holder, int position) {
            holder.bindRestaurant(mRestaurants.get(position));
        }

        @Override
        public int getItemCount() {
            return mRestaurants.size();
        }

        public class RestaurantViewHolder extends RecyclerView.ViewHolder {
            @Bind(R.id.restaurantImageView) ImageView mRestaurantImageView;
            @Bind(R.id.restaurantNameTextView) TextView mNameTextView;
            @Bind(R.id.categoryTextView) TextView mCategoryTextView;
            @Bind(R.id.ratingTextView) TextView mRatingTextView;
            private Context mContext;


            public RestaurantViewHolder(View itemView) {
                super(itemView);
<<<<<<< HEAD
                mContext = itemView.getContext();
                ButterKnife.bind(this, itemView);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int itemPosition = getLayoutPosition();
                        Intent intent = new Intent(mContext, RestaurantDetailActivity.class);
                        intent.putExtra("position", itemPosition + "");
                        intent.putExtra("restaurants", Parcels.wrap(mRestaurants));
                        mContext.startActivity(intent);
                    }
                });

=======
                ButterKnife.bind(this, itemView);
                mContext = itemView.getContext();
>>>>>>> 8e0d3a2681102eec2bffd78d11b5042ba7d24b62
            }

            public void bindRestaurant(Restaurant restaurant) {
                Picasso.with(mContext).load(restaurant.getImageUrl()).into(mRestaurantImageView);
                mNameTextView.setText(restaurant.getName());
                mCategoryTextView.setText(restaurant.getCategories().get(0));
                mRatingTextView.setText("Rating: " + restaurant.getRating() + "/5");
            }
        }
    }
