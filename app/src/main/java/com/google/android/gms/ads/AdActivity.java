package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsn;
import k7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public zzbsn f10004a;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzh(i10, i11, intent);
            }
        } catch (Exception e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                if (!zzbsnVar.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            zzbsn zzbsnVar2 = this.f10004a;
            if (zzbsnVar2 != null) {
                zzbsnVar2.zzi();
            }
        } catch (RemoteException e11) {
            zzm.f("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzk(new ObjectWrapper(configuration));
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzaw zzawVar = zzay.f10107f.f10109b;
        zzawVar.getClass();
        a aVar = new a(zzawVar, this);
        Intent intent = getIntent();
        boolean z10 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzm.c("useClientJar flag not found in activity intent extras.");
        } else {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        zzbsn zzbsnVar = (zzbsn) aVar.d(this, z10);
        this.f10004a = zzbsnVar;
        if (zzbsnVar != null) {
            try {
                zzbsnVar.zzl(bundle);
                return;
            } catch (RemoteException e10) {
                zzm.f("#007 Could not call remote method.", e10);
                finish();
                return;
            }
        }
        zzm.f("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzm();
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzo();
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzp(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzq();
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzr();
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzs(bundle);
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzt();
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzu();
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbsn zzbsnVar = this.f10004a;
            if (zzbsnVar != null) {
                zzbsnVar.zzv();
            }
        } catch (RemoteException e10) {
            zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        zzbsn zzbsnVar = this.f10004a;
        if (zzbsnVar != null) {
            try {
                zzbsnVar.zzx();
            } catch (RemoteException e10) {
                zzm.f("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zzbsn zzbsnVar = this.f10004a;
        if (zzbsnVar != null) {
            try {
                zzbsnVar.zzx();
            } catch (RemoteException e10) {
                zzm.f("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzbsn zzbsnVar = this.f10004a;
        if (zzbsnVar != null) {
            try {
                zzbsnVar.zzx();
            } catch (RemoteException e10) {
                zzm.f("#007 Could not call remote method.", e10);
            }
        }
    }
}
