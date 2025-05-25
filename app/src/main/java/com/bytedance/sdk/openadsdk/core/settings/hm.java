package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* compiled from: MediationConfig.java */
/* loaded from: classes.dex */
public class hm implements Comparable<hm> {
    private final int CJ;
    private final String Qhi;
    private final int ROR;
    private final String Sf;
    private final int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final int f9172ac;
    private final String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f9173fl;

    public hm(String str, String str2, int i10, int i11, String str3, int i12, int i13, String str4) {
        this.Qhi = str;
        this.cJ = str2;
        this.f9172ac = i10;
        this.CJ = i11;
        this.f9173fl = str3;
        if (TextUtils.isEmpty(str3)) {
            this.f9173fl = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        this.Tgh = i12;
        this.ROR = i13;
        this.Sf = str4;
    }

    public int Qhi() {
        return this.Tgh;
    }

    @Override // java.lang.Comparable
    /* renamed from: Qhi */
    public int compareTo(hm hmVar) {
        if (this.Tgh < hmVar.Qhi()) {
            return -1;
        }
        return this.Tgh == hmVar.Qhi() ? 0 : 1;
    }
}
