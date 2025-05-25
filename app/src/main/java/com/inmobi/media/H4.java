package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class H4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JSONObject f14313a;

    public H4(JSONObject jSONObject) {
        this.f14313a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Boolean c = Hb.f14332a.c();
        if (c != null) {
            z10 = c.booleanValue();
        } else {
            z10 = true;
        }
        if (z10) {
            InMobiUnifiedIdService.reset();
        }
        if (z10) {
            return;
        }
        N4.a(this.f14313a);
    }
}
