package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjx;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.play.core.assetpacks.m2;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10997a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10998b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.f10997a = i10;
        this.f10998b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10997a;
        Object obj = this.f10998b;
        switch (i10) {
            case 0:
                ((zact) obj).f11136g.b(new ConnectionResult(4));
                return;
            case 1:
                zzjx zzjxVar = (zzjx) obj;
                zzjy zzjyVar = zzjxVar.c;
                Context context = ((zzge) zzjyVar.f3529a).f11773a;
                ((zzge) zzjxVar.c.f3529a).getClass();
                zzjy.A(zzjyVar, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            default:
                com.google.android.play.core.assetpacks.d0 d0Var = ((m2) obj).f13315a;
                Iterator it = d0Var.f().iterator();
                while (true) {
                    int i11 = 0;
                    if (it.hasNext()) {
                        File file = (File) it.next();
                        if (file.listFiles() != null) {
                            File[] listFiles = file.listFiles();
                            int length = listFiles.length;
                            while (i11 < length) {
                                File file2 = listFiles[i11];
                                File file3 = new File(file2, "stale.tmp");
                                if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > com.google.android.play.core.assetpacks.d0.f13206e) {
                                    com.google.android.play.core.assetpacks.d0.h(file2);
                                }
                                i11++;
                            }
                        }
                    } else {
                        Iterator it2 = d0Var.f().iterator();
                        while (it2.hasNext()) {
                            File file4 = (File) it2.next();
                            if (file4.listFiles() != null) {
                                com.google.android.play.core.assetpacks.d0.g(file4);
                                long b10 = com.google.android.play.core.assetpacks.d0.b(file4, false);
                                if (d0Var.f13208b.a() != b10) {
                                    try {
                                        new File(new File(file4, String.valueOf(b10)), "stale.tmp").createNewFile();
                                    } catch (IOException unused) {
                                        com.google.android.play.core.assetpacks.d0.c.b("Could not write staleness marker.", new Object[0]);
                                    }
                                }
                                for (File file5 : file4.listFiles()) {
                                    com.google.android.play.core.assetpacks.d0.g(file5);
                                }
                            }
                        }
                        if (new File(d0Var.e(), "_tmp").exists()) {
                            File[] listFiles2 = new File(d0Var.e(), "_tmp").listFiles();
                            int length2 = listFiles2.length;
                            while (i11 < length2) {
                                File file6 = listFiles2[i11];
                                if (System.currentTimeMillis() - file6.lastModified() > com.google.android.play.core.assetpacks.d0.f13205d) {
                                    com.google.android.play.core.assetpacks.d0.h(file6);
                                } else {
                                    com.google.android.play.core.assetpacks.d0.g(file6);
                                }
                                i11++;
                            }
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }
}
