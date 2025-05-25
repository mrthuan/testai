package com.bykv.vk.openvk.component.video.Qhi.Qhi;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi.ac;
import com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi.cJ;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SdkMediaDataSource.java */
/* loaded from: classes.dex */
public class Qhi extends MediaDataSource {
    public static final ConcurrentHashMap<String, Qhi> Qhi = new ConcurrentHashMap<>();
    private final Context CJ;

    /* renamed from: ac  reason: collision with root package name */
    private long f7116ac = -2147483648L;
    private final ac cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bykv.vk.openvk.component.video.api.ac.ac f7117fl;

    public Qhi(Context context, com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        this.CJ = context;
        this.f7117fl = acVar;
        this.cJ = new cJ(context, acVar);
    }

    public com.bykv.vk.openvk.component.video.api.ac.ac Qhi() {
        return this.f7117fl;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7117fl.ABk();
        ac acVar = this.cJ;
        if (acVar != null) {
            acVar.cJ();
        }
        Qhi.remove(this.f7117fl.iMK());
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        if (this.f7116ac == -2147483648L) {
            if (this.CJ != null && !TextUtils.isEmpty(this.f7117fl.ABk())) {
                this.f7116ac = this.cJ.ac();
            } else {
                return -1L;
            }
        }
        return this.f7116ac;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) {
        int Qhi2 = this.cJ.Qhi(j10, bArr, i10, i11);
        int length = bArr.length;
        Objects.toString(Thread.currentThread());
        return Qhi2;
    }

    public static Qhi Qhi(Context context, com.bykv.vk.openvk.component.video.api.ac.ac acVar) {
        Qhi qhi = new Qhi(context, acVar);
        Qhi.put(acVar.iMK(), qhi);
        return qhi;
    }
}
