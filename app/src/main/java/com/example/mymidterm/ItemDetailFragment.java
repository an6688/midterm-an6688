package com.example.mymidterm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mymidterm.dummy.DummyContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */

    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        if (mItem.id.equals("1")){
            // professional about me
            rootView = inflater.inflate(R.layout.activity_about_me, container, false);

/*            Intent intent = new Intent (rootView.getContext(),AboutMe.class);
            startActivity(intent);*/
        }
            else if (mItem.id.equals("2")){
            //fav books or movies or whatev

        }
            else if (mItem.id.equals("3")) {
            //guest book
            rootView = inflater.inflate(R.layout.activity_guest_book, container, false);

            final EditText email = rootView.findViewById(R.id.guest_email);
            final EditText phone = rootView.findViewById(R.id.guest_phone);
            final EditText name = rootView.findViewById(R.id.guest_name);
            final EditText comments = rootView.findViewById(R.id.guest_comments);

            Button button = rootView.findViewById(R.id.btnSubmit);

                        button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    final GuestBookData guestBookForm = new GuestBookData(email.getText().toString(),
                            phone.getText().toString(),
                            name.getText().toString(),
                            comments.getText().toString());

                    Intent intent = new Intent (getContext(), GuestBookConfirmation.class);
                    intent.putExtra("GuestBookData", guestBookForm);

                    startActivity(intent);
                }
            });
        }
            else if (mItem.id.equals("4")) {
            // use google maps
            startActivity(new Intent(getContext(), MapsActivity2.class));
        }

        return rootView;
    }
}
