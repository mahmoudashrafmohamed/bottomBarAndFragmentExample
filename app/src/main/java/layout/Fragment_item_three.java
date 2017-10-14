package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mahmoud_ashraf.bottomnavigationbarexample.AdapterNews;
import com.mahmoud_ashraf.bottomnavigationbarexample.MainActivity;
import com.mahmoud_ashraf.bottomnavigationbarexample.R;

import java.util.ArrayList;

public class Fragment_item_three extends Fragment {


    private RecyclerView recyclerView;
    private AdapterNews adapter;

    public Fragment_item_three() {
        // Required empty public constructor
    }

    public static Fragment_item_three newInstance() {
        Fragment_item_three fragment = new Fragment_item_three();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_fragment_item_three, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView)getView().findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<String> a = new ArrayList<>();
        a.add("Pol, accola!Cum resistentia nocere, omnes imberes resuscitabo raptus, germanus uriaes.");
        a.add("Navis, glos, et gemna.");
        a.add("Pol, brevis mineralis!Urbs ridetiss, tanquam fatalis nomen.");
        a.add("Nunquam imperium pes.");
        adapter = new AdapterNews(a, getActivity(), (MainActivity) getActivity());
        recyclerView.setAdapter(adapter);
        // recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        adapter.notifyDataSetChanged();

    }

}
