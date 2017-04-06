package in.ponshere.supportlibraryfragmentissue;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Ponsuyambu
 * @since 6/4/17.
 */

public abstract class BaseFragment<T extends ViewDataBinding> extends Fragment {

    protected T binding;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        binding = DataBindingUtil.inflate(inflater,getLayoutResourceId(),container,false);
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LifeCycle","onCreate - "+this);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume - "+this);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause - "+this);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart - "+this);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop- "+this);
    }

    public abstract @LayoutRes int getLayoutResourceId();
}
