package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public final class p extends d0 {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.g f2644j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f2645k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.g gVar) {
        super(view);
        this.f2645k = appCompatSpinner;
        this.f2644j = gVar;
    }

    @Override // androidx.appcompat.widget.d0
    public final androidx.appcompat.view.menu.q b() {
        return this.f2644j;
    }

    @Override // androidx.appcompat.widget.d0
    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.f2645k;
        if (!appCompatSpinner.getInternalPopup().a()) {
            appCompatSpinner.f2266f.l(AppCompatSpinner.c.b(appCompatSpinner), AppCompatSpinner.c.a(appCompatSpinner));
            return true;
        }
        return true;
    }
}
