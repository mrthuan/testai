package com.inmobi.ads.viewsv2;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.C1570b7;
import com.inmobi.media.C1682j7;
import com.inmobi.media.C1866x7;
import com.inmobi.media.C7;
import com.inmobi.media.G7;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class NativeRecyclerViewAdapter extends RecyclerView.Adapter<C7> implements G7 {

    /* renamed from: a  reason: collision with root package name */
    public C1682j7 f14103a;

    /* renamed from: b  reason: collision with root package name */
    public C1866x7 f14104b;
    public final SparseArray c;

    public NativeRecyclerViewAdapter(C1682j7 nativeDataModel, C1866x7 nativeLayoutInflater) {
        g.e(nativeDataModel, "nativeDataModel");
        g.e(nativeLayoutInflater, "nativeLayoutInflater");
        this.f14103a = nativeDataModel;
        this.f14104b = nativeLayoutInflater;
        this.c = new SparseArray();
    }

    public ViewGroup buildScrollableView(int i10, ViewGroup parent, C1570b7 pageContainerAsset) {
        ViewGroup viewGroup;
        C1866x7 c1866x7;
        g.e(parent, "parent");
        g.e(pageContainerAsset, "pageContainerAsset");
        C1866x7 c1866x72 = this.f14104b;
        if (c1866x72 != null) {
            viewGroup = c1866x72.a(parent, pageContainerAsset);
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && (c1866x7 = this.f14104b) != null) {
            c1866x7.b(viewGroup, pageContainerAsset);
        }
        return viewGroup;
    }

    @Override // com.inmobi.media.G7
    public void destroy() {
        C1682j7 c1682j7 = this.f14103a;
        if (c1682j7 != null) {
            c1682j7.f15227m = null;
            c1682j7.f15222h = null;
        }
        this.f14103a = null;
        this.f14104b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        C1682j7 c1682j7 = this.f14103a;
        if (c1682j7 != null) {
            return c1682j7.d();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(C7 holder, int i10) {
        View buildScrollableView;
        g.e(holder, "holder");
        C1682j7 c1682j7 = this.f14103a;
        C1570b7 b10 = c1682j7 != null ? c1682j7.b(i10) : null;
        WeakReference weakReference = (WeakReference) this.c.get(i10);
        if (b10 != null) {
            if (weakReference == null || (buildScrollableView = (View) weakReference.get()) == null) {
                buildScrollableView = buildScrollableView(i10, holder.f14162a, b10);
            }
            if (buildScrollableView != null) {
                if (i10 != getItemCount() - 1) {
                    holder.f14162a.setPadding(0, 0, 16, 0);
                }
                holder.f14162a.addView(buildScrollableView);
                this.c.put(i10, new WeakReference(buildScrollableView));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public C7 onCreateViewHolder(ViewGroup parent, int i10) {
        g.e(parent, "parent");
        return new C7(new FrameLayout(parent.getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(C7 holder) {
        g.e(holder, "holder");
        holder.f14162a.removeAllViews();
        super.onViewRecycled((NativeRecyclerViewAdapter) holder);
    }
}
