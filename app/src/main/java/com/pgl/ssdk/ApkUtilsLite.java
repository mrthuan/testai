package com.pgl.ssdk;

/* renamed from: com.pgl.ssdk.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ApkUtilsLite {

    /* renamed from: a  reason: collision with root package name */
    private final long f15824a;

    /* renamed from: b  reason: collision with root package name */
    private final DataSource f15825b;

    public ApkUtilsLite(long j10, DataSource dataSource) {
        this.f15824a = j10;
        this.f15825b = dataSource;
    }

    public DataSource a() {
        return this.f15825b;
    }

    public long b() {
        return this.f15824a;
    }
}
