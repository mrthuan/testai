package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.b7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1570b7 extends W6 implements Iterable, dg.a {
    public final ArrayList A;
    public int B;
    public final boolean C;
    public final boolean D;

    /* renamed from: x  reason: collision with root package name */
    public final int f14965x;

    /* renamed from: y  reason: collision with root package name */
    public long f14966y;

    /* renamed from: z  reason: collision with root package name */
    public final byte f14967z;

    public /* synthetic */ C1570b7(String str, String str2, X6 x62, String str3, JSONObject jSONObject, byte b10) {
        this(str, str2, x62, new ArrayList(), str3, jSONObject, b10);
    }

    public final void a(W6 child) {
        kotlin.jvm.internal.g.e(child, "child");
        int i10 = this.B;
        if (i10 < this.f14965x) {
            this.B = i10 + 1;
            this.A.add(child);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1556a7(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570b7(String assetId, String assetName, X6 assetStyle, List trackers, String interactionMode, JSONObject rawAssetJson, byte b10) {
        super(assetId, assetName, "CONTAINER", assetStyle, trackers);
        kotlin.jvm.internal.g.e(assetId, "assetId");
        kotlin.jvm.internal.g.e(assetName, "assetName");
        kotlin.jvm.internal.g.e(assetStyle, "assetStyle");
        kotlin.jvm.internal.g.e(trackers, "trackers");
        kotlin.jvm.internal.g.e(interactionMode, "interactionMode");
        kotlin.jvm.internal.g.e(rawAssetJson, "rawAssetJson");
        this.f14965x = 16;
        this.f14967z = b10;
        this.A = new ArrayList();
        this.f14791g = interactionMode;
        this.C = kotlin.text.j.G("root", assetName, true);
        this.D = kotlin.text.j.G("card_scrollable", assetName, true);
    }
}
