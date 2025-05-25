package com.bytedance.sdk.openadsdk.iMK.Qhi;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.fl;
import java.util.List;
import java.util.Map;

/* compiled from: GifRequestResult.java */
/* loaded from: classes.dex */
public class cJ {
    private Bitmap CJ;
    int Qhi;
    private Map<String, String> Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private Bitmap f9332ac;
    private byte[] cJ;

    /* renamed from: fl  reason: collision with root package name */
    private List<Object> f9333fl;

    public cJ(byte[] bArr, int i10) {
        this.f9332ac = null;
        this.CJ = null;
        this.f9333fl = null;
        this.Tgh = null;
        this.cJ = bArr;
        this.Qhi = i10;
    }

    public boolean CJ() {
        if (this.f9332ac != null) {
            return true;
        }
        byte[] bArr = this.cJ;
        if (bArr != null && bArr.length > 0) {
            return true;
        }
        return false;
    }

    public Bitmap Qhi() {
        return this.f9332ac;
    }

    public byte[] ac() {
        try {
            if (this.cJ == null) {
                this.cJ = fl.Qhi(this.f9332ac);
            }
        } catch (OutOfMemoryError e10) {
            ABk.Qhi("GifRequestResult", e10.getMessage());
        }
        return this.cJ;
    }

    public Bitmap cJ() {
        return this.CJ;
    }

    public cJ(Bitmap bitmap, Bitmap bitmap2, int i10) {
        this.cJ = null;
        this.f9333fl = null;
        this.Tgh = null;
        this.CJ = bitmap2;
        this.f9332ac = bitmap;
        this.Qhi = i10;
    }
}
