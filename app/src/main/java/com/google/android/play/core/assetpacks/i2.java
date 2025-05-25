package com.google.android.play.core.assetpacks;

import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public abstract class i2 {
    public abstract int a();

    public abstract long b();

    public abstract String c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract byte[] f();

    public final boolean g() {
        if (c() == null) {
            return false;
        }
        return c().endsWith(PackagingURIHelper.FORWARD_SLASH_STRING);
    }
}
