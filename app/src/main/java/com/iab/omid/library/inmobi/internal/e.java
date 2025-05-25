package com.iab.omid.library.inmobi.internal;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final com.iab.omid.library.inmobi.weakreference.a f13965a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13966b;
    private final FriendlyObstructionPurpose c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13967d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f13965a = new com.iab.omid.library.inmobi.weakreference.a(view);
        this.f13966b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.f13967d = str;
    }

    public String a() {
        return this.f13967d;
    }

    public FriendlyObstructionPurpose b() {
        return this.c;
    }

    public com.iab.omid.library.inmobi.weakreference.a c() {
        return this.f13965a;
    }

    public String d() {
        return this.f13966b;
    }
}
