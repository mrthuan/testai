package com.google.android.play.core.assetpacks;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class ck extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    final int f13204a;

    public ck(String str) {
        super(str);
        this.f13204a = -1;
    }

    public ck(String str, int i10) {
        super(str);
        this.f13204a = i10;
    }

    public ck(String str, Exception exc) {
        super(str, exc);
        this.f13204a = -1;
    }

    public ck(String str, Exception exc, int i10) {
        super(str, exc);
        this.f13204a = i10;
    }
}
