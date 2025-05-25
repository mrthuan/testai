package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzboi;
import k7.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzaw zzawVar = zzay.f10107f.f10109b;
        zzboi zzboiVar = new zzboi();
        zzawVar.getClass();
        zzdj zzdjVar = (zzdj) new b(this, zzboiVar).d(this, false);
        if (zzdjVar == null) {
            finish();
            return;
        }
        setContentView(pdf.pdfreader.viewer.editor.free.R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(pdf.pdfreader.viewer.editor.free.R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            zzdjVar.zze(stringExtra, new ObjectWrapper(this), new ObjectWrapper(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
