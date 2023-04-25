package phungphuc2105.mobile.doanQLKS.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import phungphuc2105.mobile.doanQLKS.Fragment.FragmentLoaiPhong;
import phungphuc2105.mobile.doanQLKS.Fragment.FragmentPhong;

public class TabPhongViewPagerAdapter extends FragmentStateAdapter {
    public TabPhongViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                return new FragmentPhong();
            case 1:
                return new FragmentLoaiPhong();

        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
