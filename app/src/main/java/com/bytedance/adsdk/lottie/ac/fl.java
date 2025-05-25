package com.bytedance.adsdk.lottie.ac;

import androidx.activity.f;
import com.bytedance.adsdk.lottie.ac.cJ.HzH;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.List;

/* compiled from: FontCharacter.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class fl {
    private final double CJ;
    private final List<HzH> Qhi;
    private final String Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final double f7847ac;
    private final char cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final String f7848fl;

    public fl(List<HzH> list, char c, double d10, double d11, String str, String str2) {
        this.Qhi = list;
        this.cJ = c;
        this.f7847ac = d10;
        this.CJ = d11;
        this.f7848fl = str;
        this.Tgh = str2;
    }

    public static int Qhi(char c, String str, String str2) {
        return str2.hashCode() + f.h(str, c * 31, 31);
    }

    public double cJ() {
        return this.CJ;
    }

    public int hashCode() {
        return Qhi(this.cJ, this.Tgh, this.f7848fl);
    }

    public List<HzH> Qhi() {
        return this.Qhi;
    }
}
