package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mahmoud_ashraf.bottomnavigationbarexample.R;

public class Fragment_item_one extends Fragment {

    public Fragment_item_one() {
        // Required empty public constructor
    }

    public static Fragment_item_one newInstance() {
        Fragment_item_one fragment = new Fragment_item_one();
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
        return inflater.inflate(R.layout.fragment_fragment_item_one, container, false);
    }


}
