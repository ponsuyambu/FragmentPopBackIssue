package in.ponshere.supportlibraryfragmentissue;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import in.ponshere.supportlibraryfragmentissue.databinding.BindingFragmentC;

/**
 * @author Ponsuyambu
 * @since 6/4/17.
 */

public class FragmentC extends BaseFragment<BindingFragmentC> {
    @Override
    public int getLayoutResourceId() {
        return R.layout.fragment_c;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
