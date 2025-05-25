package com.inmobi.media;

import java.io.BufferedOutputStream;
import java.io.File;
import java.net.HttpURLConnection;

/* renamed from: com.inmobi.media.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1716m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f15295b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final R0 f15296a;

    public C1716m(R0 mResultListener) {
        kotlin.jvm.internal.g.e(mResultListener, "mResultListener");
        this.f15296a = mResultListener;
    }

    public static void a(File file, HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) {
        try {
            if (file.exists()) {
                file.delete();
            }
            httpURLConnection.disconnect();
            K8.a(bufferedOutputStream);
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }
}
