package com.google.android.material.datepicker;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12433a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f12434b;

    public i(MaterialCalendar materialCalendar, int i10) {
        this.f12434b = materialCalendar;
        this.f12433a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12434b.f12387h0.u0(this.f12433a);
    }
}
