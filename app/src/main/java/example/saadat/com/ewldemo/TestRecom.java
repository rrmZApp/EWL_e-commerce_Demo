package example.saadat.com.ewldemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Tarana on 8/25/2016.
 */
public class TestRecom extends Fragment {

    public TestRecom(){}

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] Title1;
    String[] Title2;
    int[] img = {R.drawable.im1,R.drawable.im3,R.drawable.im6,R.drawable.im7,R.drawable.im8,R.drawable.im10,R.drawable.im12};
    ArrayList<Data> arrayList = new ArrayList<Data>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.recommended, container, false);
        //recyclerView = (RecyclerView) v.findViewById(R.id.view);
        //recyclerView.setHasFixedSize(true);

        adapter = new RecyclerAdapter(arrayList);
        //adapter = new RecyclerAdapter(new String[] );
        recyclerView.setAdapter(adapter);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(llm);
        return v;
    }
}
