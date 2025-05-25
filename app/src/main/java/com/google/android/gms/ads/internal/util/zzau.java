package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.activity.r;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzdve;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.android.gms.internal.ads.zzfru;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzau {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10399a;

    /* renamed from: b  reason: collision with root package name */
    public final zzdvi f10400b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f10401d;

    /* renamed from: e  reason: collision with root package name */
    public String f10402e;

    /* renamed from: f  reason: collision with root package name */
    public String f10403f;

    /* renamed from: h  reason: collision with root package name */
    public final int f10405h;

    /* renamed from: i  reason: collision with root package name */
    public PointF f10406i;

    /* renamed from: j  reason: collision with root package name */
    public PointF f10407j;

    /* renamed from: k  reason: collision with root package name */
    public final zzfru f10408k;

    /* renamed from: g  reason: collision with root package name */
    public int f10404g = 0;

    /* renamed from: l  reason: collision with root package name */
    public final zzah f10409l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
        @Override // java.lang.Runnable
        public final void run() {
            zzau zzauVar = zzau.this;
            zzauVar.f10404g = 4;
            zzauVar.b();
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.ads.internal.util.zzah] */
    public zzau(Context context) {
        this.f10399a = context;
        this.f10405h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzuVar.f10568r.a();
        this.f10408k = zzuVar.f10568r.f10434b;
        this.f10400b = zzuVar.f10563m.f10415g;
    }

    public static final int e(String str, ArrayList arrayList, boolean z10) {
        if (!z10) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f10404g = 0;
            this.f10406i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f10404g;
        if (i10 != -1) {
            zzfru zzfruVar = this.f10408k;
            zzah zzahVar = this.f10409l;
            if (i10 == 0) {
                if (actionMasked == 5) {
                    this.f10404g = 5;
                    this.f10407j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    zzfruVar.postDelayed(zzahVar, ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeg)).longValue());
                }
            } else if (i10 == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z10 = false;
                        for (int i11 = 0; i11 < historySize; i11++) {
                            z10 |= !d(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                        }
                        if (d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f10404g = -1;
                zzfruVar.removeCallbacks(zzahVar);
            }
        }
    }

    public final void b() {
        String str;
        Context context = this.f10399a;
        try {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzm.d("Can not create dialog without Activity Context");
                return;
            }
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            zzay zzayVar = zzuVar.f10563m;
            synchronized (zzayVar.f10410a) {
                str = zzayVar.c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = "Troubleshooting (enabled)";
            if (true != zzuVar.f10563m.h()) {
                str3 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            final int e10 = e("Ad information", arrayList, true);
            final int e11 = e(str2, arrayList, true);
            final int e12 = e(str3, arrayList, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzip)).booleanValue();
            final int e13 = e("Open ad inspector", arrayList, booleanValue);
            final int e14 = e("Ad inspector settings", arrayList, booleanValue);
            AlertDialog.Builder i10 = zzt.i(context);
            i10.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
                    if (android.text.TextUtils.isEmpty(r0) != false) goto L19;
                 */
                @Override // android.content.DialogInterface.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.content.DialogInterface r6, int r7) {
                    /*
                        Method dump skipped, instructions count: 274
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzao.onClick(android.content.DialogInterface, int):void");
                }
            });
            i10.create().show();
        } catch (WindowManager.BadTokenException unused) {
            zze.i();
        }
    }

    public final void c(Context context) {
        final int i10;
        ArrayList arrayList = new ArrayList();
        int e10 = e("None", arrayList, true);
        final int e11 = e("Shake", arrayList, true);
        final int e12 = e("Flick", arrayList, true);
        int ordinal = this.f10400b.zza().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                i10 = e10;
            } else {
                i10 = e12;
            }
        } else {
            i10 = e11;
        }
        zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        AlertDialog.Builder i11 = zzt.i(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        i11.setTitle("Setup gesture");
        i11.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                atomicInteger.set(i12);
            }
        });
        i11.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                zzau.this.b();
            }
        });
        i11.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                zzau zzauVar = zzau.this;
                zzauVar.getClass();
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i10) {
                    int i13 = atomicInteger2.get();
                    int i14 = e11;
                    zzdvi zzdviVar = zzauVar.f10400b;
                    if (i13 == i14) {
                        zzdviVar.zzm(zzdve.SHAKE);
                    } else if (atomicInteger2.get() == e12) {
                        zzdviVar.zzm(zzdve.FLICK);
                    } else {
                        zzdviVar.zzm(zzdve.NONE);
                    }
                }
                zzauVar.b();
            }
        });
        i11.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzas
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzau.this.b();
            }
        });
        i11.create().show();
    }

    public final boolean d(float f10, float f11, float f12, float f13) {
        float abs = Math.abs(this.f10406i.x - f10);
        int i10 = this.f10405h;
        if (abs < i10 && Math.abs(this.f10406i.y - f11) < i10 && Math.abs(this.f10407j.x - f12) < i10 && Math.abs(this.f10407j.y - f13) < i10) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f10403f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f10402e);
        sb2.append(",Ad Unit ID: ");
        return r.g(sb2, this.f10401d, "}");
    }
}
