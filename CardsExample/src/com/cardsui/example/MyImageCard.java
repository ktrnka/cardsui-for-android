package com.cardsui.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.fima.cardsui.objects.Card;

public class MyImageCard extends Card {

	public MyImageCard(String title, int image){
		super(title, image);
	}

	@Override
	public View getCardContent(Context context) {
		View view = LayoutInflater.from(context).inflate(getCardContentId(), null);

		((TextView) view.findViewById(R.id.title)).setText(title);
		((ImageView) view.findViewById(R.id.imageView1)).setImageResource(image);
		
		return view;
	}

	@Override
	public int getCardContentId() {
		return R.layout.card_picture;
	}

	@Override
	public boolean convert(View convertCardView) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
