package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;

/* compiled from: FacebookSignatureValidator.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f9758a = ea.a.u("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean a(Context context, String str) {
        boolean z10;
        kotlin.jvm.internal.g.e(context, "context");
        String brand = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        kotlin.jvm.internal.g.d(brand, "brand");
        if (kotlin.text.j.M(brand, "generic", false) && (i10 & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr == null) {
                return false;
            }
            if (signatureArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            kotlin.jvm.internal.g.d(signatureArr, "packageInfo.signatures");
            for (Signature signature : signatureArr) {
                HashSet<String> hashSet = f9758a;
                byte[] byteArray = signature.toByteArray();
                kotlin.jvm.internal.g.d(byteArray, "it.toByteArray()");
                p.f9815a.getClass();
                if (!kotlin.collections.m.o0(hashSet, p.q("SHA-1", byteArray))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
