package com.inmobi.media;

import android.media.MediaMetadataRetriever;

/* loaded from: classes2.dex */
public final class J7 {

    /* renamed from: a  reason: collision with root package name */
    public final long f14379a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14380b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final C1682j7 f14381d;

    public J7(long j10, long j11, String referencedAssetId, C1682j7 nativeDataModel) {
        kotlin.jvm.internal.g.e(referencedAssetId, "referencedAssetId");
        kotlin.jvm.internal.g.e(nativeDataModel, "nativeDataModel");
        this.f14379a = j10;
        this.f14380b = j11;
        this.c = referencedAssetId;
        this.f14381d = nativeDataModel;
    }

    public final long a() {
        String str;
        long j10;
        long j11 = this.f14379a;
        W6 m10 = this.f14381d.m(this.c);
        try {
            if (m10 instanceof W7) {
                InterfaceC1673ic b10 = ((W7) m10).b();
                if (b10 != null) {
                    str = ((C1659hc) b10).b();
                } else {
                    str = null;
                }
                if (str != null) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (extractMetadata != null) {
                        j10 = Long.parseLong(extractMetadata);
                    } else {
                        j10 = 0;
                    }
                    j11 += (long) ((this.f14380b / 100.0d) * (j10 / 1000));
                    mediaMetadataRetriever.release();
                }
            }
        } catch (Exception unused) {
        }
        return Math.max(j11, 0L);
    }
}
