// Auto-fixed: added missing class declaration
public class Tgh {
package com.bytedance.adsdk.lottie.CJ;

import com.bytedance.component.sdk.annotation.RestrictTo;

/* compiled from: FileExtension.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public enum Tgh {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: ac  reason: collision with root package name */
    public final String f7689ac;

    Tgh(String str) {
        this.f7689ac = str;
    }

    public String Qhi() {
        return ".temp" + this.f7689ac;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f7689ac;
    }
}

}
