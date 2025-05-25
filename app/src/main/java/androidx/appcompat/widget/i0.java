package androidx.appcompat.widget;

import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public int f2602a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2603b = 0;
    public int c = SlideAtom.USES_MASTER_SLIDE_ID;

    /* renamed from: d  reason: collision with root package name */
    public int f2604d = SlideAtom.USES_MASTER_SLIDE_ID;

    /* renamed from: e  reason: collision with root package name */
    public int f2605e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2606f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2607g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2608h = false;

    public final void a(int i10, int i11) {
        this.c = i10;
        this.f2604d = i11;
        this.f2608h = true;
        if (this.f2607g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f2602a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f2603b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f2602a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f2603b = i11;
        }
    }
}
