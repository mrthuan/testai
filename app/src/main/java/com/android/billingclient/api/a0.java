package com.android.billingclient.api;

import a8.f2;
import a8.j2;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzak;
import com.google.android.gms.ads.nonagon.signalgeneration.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzq;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzfpk;
import com.google.android.gms.internal.ads.zzgcf;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzes;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzfv;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzlg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements androidx.activity.result.b, t3.a, zzfpk, zzgcf, zzr, zzeo, j2, lib.zj.office.system.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6178a;

    /* renamed from: b  reason: collision with root package name */
    public Object f6179b;

    public a0(zzge zzgeVar) {
        this.f6178a = 5;
        this.f6179b = zzgeVar;
    }

    @Override // a8.j2
    public final void b(Bundle bundle, String str) {
        if (TextUtils.isEmpty(str)) {
            zzge zzgeVar = ((zzlg) this.f6179b).f11893l;
            if (zzgeVar != null) {
                zzeu zzeuVar = zzgeVar.f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.b("_err", "AppId not known when logging event");
                return;
            }
            return;
        }
        ((zzlg) this.f6179b).zzaB().u(new f2(this, str, bundle));
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f6179b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f1829b;
        int i10 = zzb.zze(intent, "ProxyBillingActivityV2").f6231a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.c;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f1828a;
        if (i11 != -1 || i10 != 0) {
            zzb.zzk("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // t3.a
    public final boolean d(Object obj, File file, t3.e eVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) ((w3.b) this.f6179b).c(65536, byte[].class);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException unused) {
                        fileOutputStream2 = fileOutputStream;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        ((w3.b) this.f6179b).put(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        ((w3.b) this.f6179b).put(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
                ((w3.b) this.f6179b).put(bArr);
                return true;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException unused5) {
        }
    }

    public final void e() {
        switch (this.f6178a) {
            case 9:
                for (Object obj : ((Map) this.f6179b).values()) {
                    if (obj instanceof ih.a) {
                        ((ih.a) obj).getClass();
                    } else if (obj instanceof ai.h) {
                        ((ai.h) obj).dispose();
                    }
                }
                return;
            default:
                return;
        }
    }

    public final void f(short s4, Object obj) {
        ((Map) this.f6179b).put(Short.valueOf(s4), obj);
    }

    public final String toString() {
        switch (this.f6178a) {
            case 8:
                return androidx.activity.r.f(new StringBuilder("<"), (String) this.f6179b, '>');
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpk
    public final void zza(int i10, long j10) {
        ((zzj) this.f6179b).f10528h.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfpk
    public final void zzb(int i10, long j10, String str) {
        ((zzj) this.f6179b).f10528h.zze(i10, System.currentTimeMillis() - j10, str);
    }

    public /* synthetic */ a0(Object obj, int i10) {
        this.f6178a = i10;
        this.f6179b = obj;
    }

    public a0() {
        this.f6178a = 9;
        this.f6179b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzu.B.f10557g.zzw(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzq.d(((zzak) this.f6179b).f10654k, "sgf", new Pair("sgf_reason", th2.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(((zzak) this.f6179b).C.get())));
        zzm.g(6);
        zzbbn zzbbnVar = zzbbw.zziO;
        zzba zzbaVar = zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() || ((zzak) this.f6179b).B.get() || ((zzak) this.f6179b).C.getAndIncrement() >= ((Integer) zzbaVar.c.zza(zzbbw.zziP)).intValue()) {
            return;
        }
        ((zzak) this.f6179b).M0();
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        zzay zzayVar = (zzay) obj;
        zzm.b("Initialized webview successfully for SDKCore.");
        if (((Boolean) zzba.f10115d.c.zza(zzbbw.zziO)).booleanValue()) {
            zzq.d(((zzak) this.f6179b).f10654k, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(((zzak) this.f6179b).C.get())));
            ((zzak) this.f6179b).B.set(true);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final boolean zza() {
        if (TextUtils.isEmpty(((zzge) this.f6179b).f11774b)) {
            zzeu zzeuVar = ((zzge) this.f6179b).f11780i;
            zzge.f(zzeuVar);
            return Log.isLoggable(zzeuVar.z(), 3);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        zzes zzesVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            zzeu zzeuVar = ((zzge) ((zzfv) this.f6179b).f3529a).f11780i;
            zzge.f(zzeuVar);
            zzesVar = zzeuVar.f11719m;
        } else if (i11 != 1) {
            if (i11 == 3) {
                zzeu zzeuVar2 = ((zzge) ((zzfv) this.f6179b).f3529a).f11780i;
                zzge.f(zzeuVar2);
                zzesVar = zzeuVar2.f11720n;
            } else if (i11 != 4) {
                zzeu zzeuVar3 = ((zzge) ((zzfv) this.f6179b).f3529a).f11780i;
                zzge.f(zzeuVar3);
                zzesVar = zzeuVar3.f11718l;
            } else if (z10) {
                zzeu zzeuVar4 = ((zzge) ((zzfv) this.f6179b).f3529a).f11780i;
                zzge.f(zzeuVar4);
                zzesVar = zzeuVar4.f11716j;
            } else if (!z11) {
                zzeu zzeuVar5 = ((zzge) ((zzfv) this.f6179b).f3529a).f11780i;
                zzge.f(zzeuVar5);
                zzesVar = zzeuVar5.f11717k;
            } else {
                zzeu zzeuVar6 = ((zzge) ((zzfv) this.f6179b).f3529a).f11780i;
                zzge.f(zzeuVar6);
                zzesVar = zzeuVar6.f11715i;
            }
        } else if (z10) {
            zzeu zzeuVar7 = ((zzge) ((zzfv) this.f6179b).f3529a).f11780i;
            zzge.f(zzeuVar7);
            zzesVar = zzeuVar7.f11713g;
        } else if (!z11) {
            zzeu zzeuVar8 = ((zzge) ((zzfv) this.f6179b).f3529a).f11780i;
            zzge.f(zzeuVar8);
            zzesVar = zzeuVar8.f11714h;
        } else {
            zzeu zzeuVar9 = ((zzge) ((zzfv) this.f6179b).f3529a).f11780i;
            zzge.f(zzeuVar9);
            zzesVar = zzeuVar9.f11712f;
        }
        int size = list.size();
        if (size == 1) {
            zzesVar.b(list.get(0), str);
        } else if (size == 2) {
            zzesVar.c(list.get(0), str, list.get(1));
        } else if (size != 3) {
            zzesVar.a(str);
        } else {
            zzesVar.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // lib.zj.office.system.g
    public final void doAction(int i10, Vector vector) {
    }
}
