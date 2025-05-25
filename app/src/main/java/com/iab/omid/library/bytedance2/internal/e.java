package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f13858a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13859b;
    private final FriendlyObstructionPurpose c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13860d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f13858a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f13859b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.f13860d = str;
    }

    public String a() {
        return this.f13860d;
    }

    public FriendlyObstructionPurpose b() {
        return this.c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f13858a;
    }

    public String d() {
        return this.f13859b;
    }
}
