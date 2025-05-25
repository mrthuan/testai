package com.bytedance.adsdk.ugeno.viewpager;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PagerAdapter.java */
/* loaded from: classes.dex */
public abstract class cJ {
    private final DataSetObservable Qhi = new DataSetObservable();
    private DataSetObserver cJ;

    public float Qhi(int i10) {
        return 1.0f;
    }

    public abstract int Qhi();

    public abstract boolean Qhi(View view, Object obj);

    public void ac() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.cJ;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.Qhi.notifyChanged();
    }

    public Parcelable cJ() {
        return null;
    }

    public int Qhi(Object obj) {
        return -1;
    }

    public Object Qhi(ViewGroup viewGroup, int i10) {
        return Qhi((View) viewGroup, i10);
    }

    public void Qhi(ViewGroup viewGroup, int i10, Object obj) {
        Qhi((View) viewGroup, i10, obj);
    }

    @Deprecated
    public Object Qhi(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void Qhi(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void Qhi(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.cJ = dataSetObserver;
        }
    }
}
