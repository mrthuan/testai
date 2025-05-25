package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;

/* loaded from: classes2.dex */
public final class G6 extends AbstractRunnableC1690k1 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ M6 f14273d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ M6 f14274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6(M6 m62, M6 m63) {
        super(m62);
        this.f14273d = m62;
        this.f14274e = m63;
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        M6 m62 = this.f14273d;
        if (m62.B == null) {
            m62.m();
        }
        M6 m63 = this.f14273d.B;
        if (m63 != null) {
            SparseArray sparseArray = InMobiAdActivity.f14092j;
            int hashCode = m63.hashCode();
            InMobiAdActivity.f14092j.put(hashCode, m63);
            Intent intent = new Intent((Context) this.f14273d.f14481w.get(), InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", hashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 201);
            Context context = (Context) this.f14273d.f14481w.get();
            M6 m64 = this.f14273d;
            if (m64.C) {
                m64.F = intent;
            } else if (context != null) {
                Ha.f14324a.a(context, intent);
            }
        }
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void c() {
        super.c();
        C1820u0 c1820u0 = this.f14274e.f14480v;
        if (c1820u0 != null) {
            c1820u0.c();
        }
    }
}
