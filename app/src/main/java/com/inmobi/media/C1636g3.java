package com.inmobi.media;

import java.io.File;

/* renamed from: com.inmobi.media.g3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1636g3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15088a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f15089b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public C1622f3 f15090d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1664i3 f15091e;

    public C1636g3(C1664i3 c1664i3, String str) {
        this.f15091e = c1664i3;
        this.f15088a = str;
        this.f15089b = new long[c1664i3.f15174h];
    }

    public final File a(int i10) {
        File file = this.f15091e.f15168a;
        return new File(file, this.f15088a + "." + i10);
    }

    public final File b(int i10) {
        File file = this.f15091e.f15168a;
        return new File(file, this.f15088a + "." + i10 + ".tmp");
    }
}
