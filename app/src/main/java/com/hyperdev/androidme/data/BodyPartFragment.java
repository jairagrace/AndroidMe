package com.hyperdev.androidme.data;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hyperdev.androidme.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class BodyPartFragment extends Fragment {

    private ImageView mImgHead, mImgBody, mImgLegs;
    private List<Integer> mHeadList, mBodyList, mLegList;
    String BodyParts;

    public BodyPartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_body_part, container, false);

        mImgHead = (ImageView) view.findViewById(R.id.Viewhead);
        mImgBody = (ImageView) view.findViewById(R.id.Viewbody);
        mImgLegs = (ImageView) view.findViewById(R.id.Viewleg);

        mHeadList = new ArrayList<>();
        mBodyList = new ArrayList<>();
        mLegList = new ArrayList<>();

        mHeadList = AndroidImageAssets.getHeads();
        mBodyList = AndroidImageAssets.getBodies();
        mLegList = AndroidImageAssets.getLegs();

        final Random random = new Random();



        mImgHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int numHead = random.nextInt(mHeadList.size()-1);
                Drawable headDrawable = getResources().getDrawable(mHeadList.get(numHead));
                mImgHead.setImageDrawable(headDrawable);
            }
        });

        mImgBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int numBody = random.nextInt(mBodyList.size()-1);
                Drawable bodyDrawable = getResources().getDrawable(mBodyList.get(numBody));
                mImgBody.setImageDrawable(bodyDrawable);

            }
        });

        mImgLegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int numLegs = random.nextInt(mLegList.size()-1);
                Drawable legsDrawable = getResources().getDrawable(mLegList.get(numLegs));
                mImgLegs.setImageDrawable(legsDrawable);
            }
        });

        return view;

    }

}
