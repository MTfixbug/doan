package phungphuc2105.mobile.doanQLKS.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import phungphuc2105.mobile.doanQLKS.Fragment.FragmentHoaDon;
import phungphuc2105.mobile.doanQLKS.Fragment.FragmentTabDichVu;
import phungphuc2105.mobile.doanQLKS.Fragment.FragmentTabPhong;
import phungphuc2105.mobile.doanQLKS.Fragment.FragmentThongKe;
import phungphuc2105.mobile.doanQLKS.Fragment.Fragment_khachhang;

public class viewpagerAdapter extends FragmentStatePagerAdapter {
    public viewpagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                return new FragmentHoaDon();
            case 1:
                return new FragmentTabDichVu();
            case 2:
                return new FragmentTabPhong();
            case 3:
                return new Fragment_khachhang();
            case 4:
                return new FragmentThongKe();
        }
        return fragment;
    }
    @Override
    public int getCount() {
        return 5;
    }
}
