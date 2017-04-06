package in.ponshere.supportlibraryfragmentissue;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import in.ponshere.supportlibraryfragmentissue.databinding.BindingFragmentB;

/**
 * @author Ponsuyambu
 * @since 6/4/17.
 */

public class FragmentB extends BaseFragment<BindingFragmentB> {
    @Override
    public int getLayoutResourceId() {
        return R.layout.fragment_b;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                final Fragment frg = new Fragment();

                    ft.setTransition(FragmentTransaction.TRANSIT_NONE);

                ft.replace(R.id.llCotainer, frg);
//                ft.addToBackStack(null);
                ft.commit();
                getActivity().getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.llCotainer,new FragmentC())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
