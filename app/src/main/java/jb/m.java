package jb;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzs;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: GmsRpc.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final z9.e f19139a;

    /* renamed from: b  reason: collision with root package name */
    public final p f19140b;
    public final Rpc c;

    /* renamed from: d  reason: collision with root package name */
    public final db.b<lb.g> f19141d;

    /* renamed from: e  reason: collision with root package name */
    public final db.b<HeartBeatInfo> f19142e;

    /* renamed from: f  reason: collision with root package name */
    public final eb.e f19143f;

    public m(z9.e eVar, p pVar, db.b<lb.g> bVar, db.b<HeartBeatInfo> bVar2, eb.e eVar2) {
        eVar.a();
        Rpc rpc = new Rpc(eVar.f32308a);
        this.f19139a = eVar;
        this.f19140b = pVar;
        this.c = rpc;
        this.f19141d = bVar;
        this.f19142e = bVar2;
        this.f19143f = eVar2;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.g(new androidx.privacysandbox.ads.adservices.topics.o(2), new androidx.appcompat.libconvert.a(this, 9));
    }

    public final void b(Bundle bundle, String str, String str2) {
        int i10;
        String str3;
        HeartBeatInfo.HeartBeat b10;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        z9.e eVar = this.f19139a;
        eVar.a();
        bundle.putString("gmp_app_id", eVar.c.f32320b);
        p pVar = this.f19140b;
        synchronized (pVar) {
            if (pVar.f19148d == 0) {
                try {
                    packageInfo = pVar.f19146a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e10) {
                    e10.toString();
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    pVar.f19148d = packageInfo.versionCode;
                }
            }
            i10 = pVar.f19148d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f19140b.a());
        bundle.putString("app_ver_name", this.f19140b.b());
        z9.e eVar2 = this.f19139a;
        eVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(eVar2.f32309b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String a10 = ((eb.h) Tasks.a(this.f19143f.a())).a();
            if (!TextUtils.isEmpty(a10)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a10);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString(PangleConstants.APP_ID, (String) Tasks.a(this.f19143f.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        HeartBeatInfo heartBeatInfo = this.f19142e.get();
        lb.g gVar = this.f19141d.get();
        if (heartBeatInfo != null && gVar != null && (b10 = heartBeatInfo.b()) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.getCode()));
            bundle.putString("Firebase-Client", gVar.a());
        }
    }

    public final Task c(final Bundle bundle, String str, String str2) {
        int i10;
        PackageInfo packageInfo;
        try {
            b(bundle, str, str2);
            final Rpc rpc = this.c;
            zzt zztVar = rpc.c;
            synchronized (zztVar) {
                if (zztVar.f10863b == 0) {
                    try {
                        packageInfo = Wrappers.a(zztVar.f10862a).c(0, "com.google.android.gms");
                    } catch (PackageManager.NameNotFoundException e10) {
                        new StringBuilder(String.valueOf(e10).length() + 23);
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        zztVar.f10863b = packageInfo.versionCode;
                    }
                }
                i10 = zztVar.f10863b;
            }
            if (i10 < 12000000) {
                if (rpc.c.a() != 0) {
                    return rpc.a(bundle).i(Rpc.f10837j, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzu
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) {
                            boolean z10;
                            Rpc rpc2 = Rpc.this;
                            rpc2.getClass();
                            if (task.o()) {
                                Bundle bundle2 = (Bundle) task.k();
                                if (bundle2 != null && bundle2.containsKey("google.messenger")) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    return rpc2.a(bundle).p(Rpc.f10837j, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
                                        @Override // com.google.android.gms.tasks.SuccessContinuation
                                        public final Task j(Object obj) {
                                            boolean z11;
                                            Bundle bundle3 = (Bundle) obj;
                                            int i11 = Rpc.f10835h;
                                            if (bundle3 != null && bundle3.containsKey("google.messenger")) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                return Tasks.e(null);
                                            }
                                            return Tasks.e(bundle3);
                                        }
                                    });
                                }
                                return task;
                            }
                            return task;
                        }
                    });
                }
                return Tasks.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            zzs a10 = zzs.a(rpc.f10840b);
            return a10.c(new q7.f(a10.b(), bundle)).g(Rpc.f10837j, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzv
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    if (task.o()) {
                        return (Bundle) task.k();
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        new StringBuilder(String.valueOf(task.j()).length() + 22);
                    }
                    throw new IOException("SERVICE_NOT_AVAILABLE", task.j());
                }
            });
        } catch (InterruptedException | ExecutionException e11) {
            return Tasks.d(e11);
        }
    }
}
