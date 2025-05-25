package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcab;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzck {

    /* renamed from: a  reason: collision with root package name */
    public final View f10456a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f10457b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10458d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10459e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f10460f;

    public zzck(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f10457b = activity;
        this.f10456a = view;
        this.f10460f = onGlobalLayoutListener;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        if (!this.c) {
            Activity activity = this.f10457b;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f10460f;
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    viewTreeObserver = decorView.getViewTreeObserver();
                } else {
                    viewTreeObserver = null;
                }
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            zzcab zzcabVar = com.google.android.gms.ads.internal.zzu.B.A;
            zzcab.zza(this.f10456a, onGlobalLayoutListener);
            this.c = true;
        }
    }
}
