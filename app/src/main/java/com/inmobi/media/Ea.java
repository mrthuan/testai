package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;

/* loaded from: classes2.dex */
public final class Ea extends F7 {

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f14236b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ea(Context context) {
        super(context, (byte) 1);
        kotlin.jvm.internal.g.e(context, "context");
    }

    @Override // com.inmobi.media.F7
    public final void a(C1570b7 scrollableContainerAsset, G7 dataSource, int i10, int i11, E7 e72) {
        NativeRecyclerViewAdapter nativeRecyclerViewAdapter;
        kotlin.jvm.internal.g.e(scrollableContainerAsset, "scrollableContainerAsset");
        kotlin.jvm.internal.g.e(dataSource, "dataSource");
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f14236b = recyclerView;
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        if (dataSource instanceof NativeRecyclerViewAdapter) {
            nativeRecyclerViewAdapter = (NativeRecyclerViewAdapter) dataSource;
        } else {
            nativeRecyclerViewAdapter = null;
        }
        recyclerView.setAdapter(nativeRecyclerViewAdapter);
        addView(this.f14236b);
    }
}
