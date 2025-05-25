package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.a;
import u.d;
import u.e;

/* compiled from: CustomTabActivityHelper.java */
/* loaded from: classes.dex */
public class ac implements cJ {
    public static void Qhi(Context context, String str, e eVar, Uri uri) {
        eVar.f30089a.setPackage(str);
        Intent intent = eVar.f30089a;
        intent.setData(uri);
        a.startActivity(context, intent, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.act.cJ
    public void Qhi(d dVar) {
        throw null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.act.cJ
    public void Qhi() {
        throw null;
    }
}
