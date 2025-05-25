package com.bytedance.sdk.component.fl.ac.Qhi.cJ;

import com.bytedance.sdk.component.fl.MQ;

/* compiled from: LruCountRawCache.java */
/* loaded from: classes.dex */
public class ac implements MQ {
    private int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.component.fl.ac.Qhi.ac<String, byte[]> f8391ac;
    private int cJ;

    public ac(int i10, int i11) {
        this.cJ = i10;
        this.Qhi = i11;
        this.f8391ac = new com.bytedance.sdk.component.fl.ac.Qhi.ac<String, byte[]>(i10) { // from class: com.bytedance.sdk.component.fl.ac.Qhi.cJ.ac.1
            @Override // com.bytedance.sdk.component.fl.ac.Qhi.ac
            /* renamed from: Qhi */
            public int cJ(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.fl.Qhi
    public boolean cJ(String str) {
        return this.f8391ac.Qhi((com.bytedance.sdk.component.fl.ac.Qhi.ac<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.fl.Qhi
    public boolean Qhi(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.f8391ac.Qhi(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.fl.Qhi
    public byte[] Qhi(String str) {
        return this.f8391ac.Qhi((com.bytedance.sdk.component.fl.ac.Qhi.ac<String, byte[]>) str);
    }
}
