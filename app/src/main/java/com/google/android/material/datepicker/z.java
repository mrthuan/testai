package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.p;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* loaded from: classes2.dex */
public abstract class z<S> extends Fragment {
    public final LinkedHashSet<y<S>> Y = new LinkedHashSet<>();

    public boolean p0(p.d dVar) {
        return this.Y.add(dVar);
    }
}
