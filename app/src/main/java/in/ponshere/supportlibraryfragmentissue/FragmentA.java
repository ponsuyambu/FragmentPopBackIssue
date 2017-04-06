package in.ponshere.supportlibraryfragmentissue;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import in.ponshere.supportlibraryfragmentissue.databinding.BindingFragmentA;

/**
 * @author Ponsuyambu
 * @since 6/4/17.
 */

public class FragmentA extends BaseFragment<BindingFragmentA> {
    @Override
    public int getLayoutResourceId() {
        return R.layout.fragment_a;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.llCotainer,new FragmentB())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
