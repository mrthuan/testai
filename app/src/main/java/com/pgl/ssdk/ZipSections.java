package com.pgl.ssdk;

import java.nio.ByteBuffer;

/* renamed from: com.pgl.ssdk.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ZipSections {

    /* renamed from: a  reason: collision with root package name */
    private final long f15833a;

    /* renamed from: b  reason: collision with root package name */
    private final long f15834b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15835d;

    /* renamed from: e  reason: collision with root package name */
    private final ByteBuffer f15836e;

    public ZipSections(long j10, long j11, int i10, long j12, ByteBuffer byteBuffer) {
        this.f15833a = j10;
        this.f15834b = j11;
        this.c = i10;
        this.f15835d = j12;
        this.f15836e = byteBuffer;
    }

    public long a() {
        return this.f15833a;
    }

    public int b() {
        return this.c;
    }

    public long c() {
        return this.f15834b;
    }

    public ByteBuffer d() {
        return this.f15836e;
    }

    public long e() {
        return this.f15835d;
    }
}
