package xk;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.fragment.app.l0;
import java.util.ArrayList;

/* compiled from: FragmentAdapter.java */
/* loaded from: classes3.dex */
public final class a extends l0 {

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<pdf.pdfreader.viewer.editor.free.base.a> f31856m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<String> f31857n;

    public a(g0 g0Var, ArrayList<pdf.pdfreader.viewer.editor.free.base.a> arrayList, ArrayList<String> arrayList2) {
        super(g0Var);
        this.f31856m = arrayList;
        this.f31857n = arrayList2;
    }

    @Override // androidx.fragment.app.l0
    public final Fragment a(int i10) {
        return this.f31856m.get(i10);
    }

    @Override // androidx.fragment.app.l0
    public final long b(int i10) {
        return this.f31856m.get(i10).hashCode();
    }

    @Override // j2.a
    public final int getCount() {
        return this.f31857n.size();
    }

    @Override // j2.a
    public final int getItemPosition(Object obj) {
        ArrayList<pdf.pdfreader.viewer.editor.free.base.a> arrayList = this.f31856m;
        if (arrayList.contains(obj)) {
            return arrayList.indexOf(obj);
        }
        return -2;
    }

    @Override // j2.a
    public final CharSequence getPageTitle(int i10) {
        return this.f31857n.get(i10);
    }
}
