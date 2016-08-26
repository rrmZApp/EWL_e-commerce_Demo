package example.saadat.com.ewldemo;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;


/**
 * Created by Saadat on 8/13/2016.
 */
public class Recommended extends Fragment{

    RecyclerView recyclerView,recyclerView1,recyclerView2,recyclerView3;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] Title1;
    String[] Title2;
    int[] img = {R.drawable.im1,R.drawable.im3,R.drawable.im6,R.drawable.im7,R.drawable.im8,R.drawable.im10,R.drawable.im12};
    ArrayList<Data> arrayList = new ArrayList<Data>();

    //ArrayList<SectionDataModel> allSampleData;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.recommended, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.hotsell);
        recyclerView.setHasFixedSize(true);

        //return v;
        recyclerView1 = (RecyclerView) v.findViewById(R.id.offers);
        recyclerView2 = (RecyclerView) v.findViewById(R.id.choice);
        recyclerView3 = (RecyclerView) v.findViewById(R.id.mostview);
        recyclerView1.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);
        recyclerView3.setHasFixedSize(true);
        return v;


        //recyclerView = (RecyclerView) v.findViewById(R.id.my_recycler_view);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
            super.onActivityCreated(savedInstanceState);

            Title1 = getResources().getStringArray(R.array.brand_name);
            Title2 = getResources().getStringArray(R.array.item_name);

            //int i=0;
            for (int i = 0; i <= 3; i++) {
                if(i==0){
                    Data data = new Data(img[i], Title1[i] , Title2[i]);

                    arrayList.add(data);
                    adapter = new RecyclerAdapter(arrayList);

                    recyclerView.setHasFixedSize(true);

                    layoutManager = new LinearLayoutManager(getActivity());
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(adapter);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
                    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                        linearLayoutManager.setOrientation(LinearLayout.HORIZONTAL);
                    } else {
                        linearLayoutManager.setOrientation(LinearLayout.HORIZONTAL);
                    }
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    }
                if(i==1){
                    Data data = new Data(img[i], Title1[i] , Title2[i]);

                    //arrayList.add(data);
                    for(int c=0; c<=13; c++){
                        arrayList.add(data);
                    }
                    adapter = new RecyclerAdapter(arrayList);

                    recyclerView.setHasFixedSize(true);

                    layoutManager = new LinearLayoutManager(getActivity());
                    recyclerView1.setLayoutManager(layoutManager);
                    recyclerView1.setAdapter(adapter);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
                    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                        linearLayoutManager.setOrientation(LinearLayout.HORIZONTAL);
                    } else {
                        linearLayoutManager.setOrientation(LinearLayout.HORIZONTAL);
                    }
                    recyclerView1.setLayoutManager(linearLayoutManager);
                    recyclerView1.setItemAnimator(new DefaultItemAnimator());
                }
                if(i==2){
                    Data data = new Data(img[i], Title1[i] , Title2[i]);

                    for(int c=0; c<=13; c++){
                        arrayList.add(data);
                    }
                    adapter = new RecyclerAdapter(arrayList);

                    recyclerView2.setHasFixedSize(true);

                    layoutManager = new LinearLayoutManager(getActivity());
                    recyclerView2.setLayoutManager(layoutManager);
                    recyclerView2.setAdapter(adapter);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
                    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                        linearLayoutManager.setOrientation(LinearLayout.HORIZONTAL);
                    } else {
                        linearLayoutManager.setOrientation(LinearLayout.HORIZONTAL);
                    }
                    recyclerView2.setLayoutManager(linearLayoutManager);
                    recyclerView2.setItemAnimator(new DefaultItemAnimator());
                }
                if(i==3){
                    Data data = new Data(img[i], Title1[i] , Title2[i]);

                    //arrayList.add(data);
                    for(int c=0; c<=13; c++){
                        arrayList.add(data);
                    }
                    adapter = new RecyclerAdapter(arrayList);

                    recyclerView3.setHasFixedSize(true);

                    layoutManager = new LinearLayoutManager(getActivity());
                    recyclerView3.setLayoutManager(layoutManager);
                    recyclerView3.setAdapter(adapter);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
                    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                        linearLayoutManager.setOrientation(LinearLayout.HORIZONTAL);
                    } else {
                        linearLayoutManager.setOrientation(LinearLayout.HORIZONTAL);
                    }
                    recyclerView3.setLayoutManager(linearLayoutManager);
                    recyclerView3.setItemAnimator(new DefaultItemAnimator());
                }
                }
            }
        }