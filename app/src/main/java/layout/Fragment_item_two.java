package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mahmoud_ashraf.bottomnavigationbarexample.R;

public class Fragment_item_two extends Fragment {

    public Fragment_item_two() {
        // Required empty public constructor
    }

    public static Fragment_item_two newInstance() {
        Fragment_item_two fragment = new Fragment_item_two();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_item_two, container, false);
    }


}
