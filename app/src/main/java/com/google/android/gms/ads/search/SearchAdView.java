package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzm;
import k7.o;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class SearchAdView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final zzea f10783a;

    public SearchAdView(Context context) {
        super(context);
        this.f10783a = new zzea((ViewGroup) this, (AttributeSet) null, false, zzp.f10237a);
    }

    public AdListener getAdListener() {
        return this.f10783a.f10154f;
    }

    public AdSize getAdSize() {
        return this.f10783a.b();
    }

    public String getAdUnitId() {
        zzbu zzbuVar;
        zzea zzeaVar = this.f10783a;
        if (zzeaVar.f10159k == null && (zzbuVar = zzeaVar.f10157i) != null) {
            try {
                zzeaVar.f10159k = zzbuVar.zzr();
            } catch (RemoteException e10) {
                zzm.f("#007 Could not call remote method.", e10);
            }
        }
        return zzeaVar.f10159k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = ((i12 - i10) - measuredWidth) / 2;
            int i15 = ((i13 - i11) - measuredHeight) / 2;
            childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        AdSize adSize;
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        } else {
            try {
                adSize = getAdSize();
            } catch (NullPointerException unused) {
                zzm.g(6);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int d10 = adSize.d(context);
                i12 = adSize.b(context);
                i13 = d10;
            } else {
                i12 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public void setAdListener(AdListener adListener) {
        zzea zzeaVar = this.f10783a;
        zzeaVar.f10154f = adListener;
        o oVar = zzeaVar.f10152d;
        synchronized (oVar.f10112a) {
            oVar.f10113b = adListener;
        }
    }

    public void setAdSize(AdSize adSize) {
        AdSize[] adSizeArr = {adSize};
        zzea zzeaVar = this.f10783a;
        if (zzeaVar.f10155g == null) {
            zzeaVar.d(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public void setAdUnitId(String str) {
        zzea zzeaVar = this.f10783a;
        if (zzeaVar.f10159k == null) {
            zzeaVar.f10159k = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10783a = new zzea(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10783a = new zzea(this, attributeSet, false);
    }
}
