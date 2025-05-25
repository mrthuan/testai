package com.facebook.ads.redexgen.X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.3E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3E {
    public DataSetObserver A00;
    public final DataSetObservable A01 = new DataSetObservable();

    public abstract int A01();

    public abstract int A02(Object obj);

    public abstract Object A04(ViewGroup viewGroup, int i10);

    public abstract void A07(ViewGroup viewGroup, int i10, Object obj);

    public abstract boolean A08(View view, Object obj);

    public final float A00(int i10) {
        return 1.0f;
    }

    public final Parcelable A03() {
        return null;
    }

    public final void A05() {
        synchronized (this) {
            if (this.A00 != null) {
                this.A00.onChanged();
            }
        }
        this.A01.notifyChanged();
    }

    public final void A06(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.A00 = dataSetObserver;
        }
    }
}
