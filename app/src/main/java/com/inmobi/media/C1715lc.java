package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.inmobi.media.lc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1715lc extends AbstractC1701kc {

    /* renamed from: e  reason: collision with root package name */
    public final S9 f15294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715lc(S9 mRenderView) {
        super(mRenderView);
        kotlin.jvm.internal.g.e(mRenderView, "mRenderView");
        this.f15294e = mRenderView;
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(byte b10) {
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View d() {
        this.c = new WeakReference(this.f15294e);
        return this.f15294e;
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(HashMap hashMap) {
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.g.e(childView, "childView");
        kotlin.jvm.internal.g.e(obstructionCode, "obstructionCode");
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.g.e(context, "context");
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView) {
        kotlin.jvm.internal.g.e(childView, "childView");
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        return d();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void e() {
    }
}
