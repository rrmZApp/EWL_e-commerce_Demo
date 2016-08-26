package example.saadat.com.ewldemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Saadat on 8/13/2016.
 */
public class ForYou extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] Title1;
    String[] Title2;
    //TextView prevPrice;
    int[] img = {R.drawable.im3,R.drawable.im7,R.drawable.im6,
            R.drawable.im12,R.drawable.im8,R.drawable.im10,
            R.drawable.im1,R.drawable.im6,R.drawable.im7,
            R.drawable.im8,R.drawable.im10,R.drawable.im12,
            R.drawable.im3,R.drawable.im7,R.drawable.im6,
            R.drawable.im12,R.drawable.im8,R.drawable.im10,
            R.drawable.im1,R.drawable.im6,R.drawable.im7,
            R.drawable.im8,R.drawable.im10,R.drawable.im12};
    ArrayList<Data> arrayList = new ArrayList<Data>();

    private enum LayoutManagerType {
        GRID_LAYOUT_MANAGER//, LINEAR_LAYOUT_MANAGER
    }

    protected LayoutManagerType mCurrentLayoutManagerType;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.for_you, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.for_you_View);

        return v;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        Title1 = getResources().getStringArray(R.array.brand_name);
        Title2 = getResources().getStringArray(R.array.item_name);

        int i = 0;
        //for(i=0; i<=2; i++) {
        for (String name : Title1) {
            Data data = new Data(img[i], name, Title2[i]);
            arrayList.add(data);
            i++;
        }

        adapter = new RecyclerAdapter(arrayList);

        //recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(getActivity(), 2);
        mCurrentLayoutManagerType = LayoutManagerType.GRID_LAYOUT_MANAGER;
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        productData();
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void productData() {
        //ArrayList<Data> arrayList = new ArrayList<Data>();

        int[] covers = new int[]{
                R.drawable.im1,
                R.drawable.im3,
                R.drawable.im6,
                R.drawable.im1,
                R.drawable.im7,
                R.drawable.im10,
                R.drawable.im3,
                R.drawable.im12,
                R.drawable.im3,
                R.drawable.im1,
                R.drawable.im8,
                R.drawable.im7,
                R.drawable.im10,
                R.drawable.im1,
                R.drawable.im3,
                R.drawable.im6,
                R.drawable.im1,
                R.drawable.im7,
                R.drawable.im10,
                R.drawable.im3,
                R.drawable.im12,
                R.drawable.im3,
                R.drawable.im1,
                R.drawable.im8,
                R.drawable.im7,
                R.drawable.im10};

        Data a = new Data(covers[0], "ASUS", "Laptops" );
        arrayList.add(a);

        a = new Data(covers[1], "ASUS", "Mobiles" );
        arrayList.add(a);

        a = new Data(covers[2], "HTC", "ONE M9+" );
        arrayList.add(a);

        a = new Data(covers[3], "Samsung", "Galaxy S7 Edge" );
        arrayList.add(a);

        a = new Data(covers[4], "Hp", "Laptops" );
        arrayList.add(a);

        a = new Data(covers[5], "Dell", "Laptops" );
        arrayList.add(a);

        a = new Data(covers[6], "Fujitsu", "Laptops" );
        arrayList.add(a);

        a = new Data(covers[7], "Mac", "Pro" );
        arrayList.add(a);

        a = new Data(covers[8], "iPhone 7", "Mobile" );
        arrayList.add(a);

        a = new Data(covers[9], "MacBook", "Air" );
        arrayList.add(a);

        a = new Data(covers[10], "ASUS", "Zenfone 2" );
        arrayList.add(a);

        a = new Data(covers[11], "Oppo", "Selfie" );
        arrayList.add(a);

        a = new Data(covers[12], "Panasonic", "AC" );
        arrayList.add(a);

        a = new Data(covers[13], "ASUS", "Mobiles" );
        arrayList.add(a);

        a = new Data(covers[14], "HTC", "ONE M9+" );
        arrayList.add(a);

        a = new Data(covers[15], "Samsung", "Galaxy S7 Edge" );
        arrayList.add(a);

        a = new Data(covers[16], "Hp", "Laptops" );
        arrayList.add(a);

        a = new Data(covers[17], "Dell", "Laptops" );
        arrayList.add(a);

        a = new Data(covers[18], "Fujitsu", "Laptops" );
        arrayList.add(a);

        a = new Data(covers[19], "Mac", "Pro" );
        arrayList.add(a);

        a = new Data(covers[20], "iPhone 7", "Mobile" );
        arrayList.add(a);

        a = new Data(covers[21], "MacBook", "Air" );
        arrayList.add(a);

        a = new Data(covers[22], "ASUS", "Zenfone 2" );
        arrayList.add(a);

        a = new Data(covers[23], "Oppo", "Selfie" );
        arrayList.add(a);

        a = new Data(covers[24], "Panasonic", "AC" );
        arrayList.add(a);

        a = new Data(covers[25], "Panasonic", "AC" );
        arrayList.add(a);

        adapter.notifyDataSetChanged();
    }
}

