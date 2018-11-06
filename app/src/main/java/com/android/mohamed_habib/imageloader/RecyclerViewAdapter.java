package com.android.mohamed_habib.imageloader;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.mohamed_habib.imageloaderlibrary.LoaderManager;
import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final List<String> mUrls;
    Activity activity;

    RecyclerViewAdapter(List<String> urls, Activity activity) {
        mUrls = urls;
        this.activity = activity;
//            createDummyData();
    }

    private void createDummyData() {
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        mUrls.add("https://www.w3schools.com/w3css/img_lights.jpg");
        mUrls.add("https://images.pexels.com/photos/248797/pexels-photo-248797.jpeg?auto=compress&cs=tinysrgb&h=350");
        mUrls.add("https://sample-videos.com/img/Sample-jpg-image-500kb.jpg");
        mUrls.add("https://cdn.pixabay.com/photo/2016/06/18/17/42/image-1465348_960_720.jpg");
        mUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6o9gQUhGxxKKuQBleye_ibGBuV-mo1duupUN8Zn3XC34h0Ugd7A");
        mUrls.add("https://www.google.com.eg/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_list_item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        new LoaderManager.Builder()
                .setUrl(mUrls.get(i)).load(new LoaderManager.DataRetrieved() {
            @Override
            public void onSuccess(final Bitmap bitmap) {
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        viewHolder.imageView.setImageBitmap(bitmap);
                    }
                });
            }
        });
    }

    @Override
    public int getItemCount() {
        return mUrls.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
        }

    }

    public interface OnDataLoaded {
        void onDataLoaded(Bitmap bitmap);
    }
}
