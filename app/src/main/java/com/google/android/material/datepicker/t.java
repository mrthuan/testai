package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes2.dex */
public final class t<S> extends z<S> {
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public d<S> f12462a0;

    /* renamed from: b0  reason: collision with root package name */
    public com.google.android.material.datepicker.a f12463b0;

    /* compiled from: MaterialTextInputPicker.java */
    /* loaded from: classes2.dex */
    public class a extends y<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s4) {
            Iterator<y<S>> it = t.this.Y.iterator();
            while (it.hasNext()) {
                it.next().a(s4);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (bundle == null) {
            bundle = this.f3674g;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        this.f12462a0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f12463b0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View N(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(r(), this.Z));
        d<S> dVar = this.f12462a0;
        new a();
        return dVar.c0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void X(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f12462a0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12463b0);
    }
}
