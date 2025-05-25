package xk;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.fragment.app.l0;
import java.util.ArrayList;

/* compiled from: NavFragmentAdapter.java */
/* loaded from: classes3.dex */
public final class e extends l0 {

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<Fragment> f31874m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<String> f31875n;

    public e(g0 g0Var, ArrayList<Fragment> arrayList, ArrayList<String> arrayList2) {
        super(g0Var);
        this.f31874m = arrayList;
        this.f31875n = arrayList2;
    }

    @Override // androidx.fragment.app.l0
    public final Fragment a(int i10) {
        return this.f31874m.get(i10);
    }

    @Override // androidx.fragment.app.l0
    public final long b(int i10) {
        return this.f31874m.get(i10).hashCode();
    }

    @Override // j2.a
    public final int getCount() {
        return this.f31875n.size();
    }

    @Override // j2.a
    public final int getItemPosition(Object obj) {
        ArrayList<Fragment> arrayList = this.f31874m;
        if (arrayList.contains(obj)) {
            return arrayList.indexOf(obj);
        }
        return -2;
    }

    @Override // j2.a
    public final CharSequence getPageTitle(int i10) {
        return this.f31875n.get(i10);
    }
}
