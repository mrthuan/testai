package com.google.android.material.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import java.util.ArrayList;
import x0.s0;
import x0.u;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes2.dex */
public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f12169a;

    public a(b bVar) {
        this.f12169a = bVar;
    }

    @Override // x0.u
    public final s0 m(View view, s0 s0Var) {
        b bVar = this.f12169a;
        b.C0163b c0163b = bVar.f12177m;
        if (c0163b != null) {
            bVar.f12170f.X.remove(c0163b);
        }
        b.C0163b c0163b2 = new b.C0163b(bVar.f12173i, s0Var);
        bVar.f12177m = c0163b2;
        c0163b2.e(bVar.getWindow());
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = bVar.f12170f;
        b.C0163b c0163b3 = bVar.f12177m;
        ArrayList<BottomSheetBehavior.c> arrayList = bottomSheetBehavior.X;
        if (!arrayList.contains(c0163b3)) {
            arrayList.add(c0163b3);
        }
        return s0Var;
    }
}
