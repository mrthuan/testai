package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.b;
import d8.o;
import ia.d;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;
import ma.g;
import ma.h;
import ma.p;
import ma.q;
import ma.w;
import na.i;
import z9.e;

/* loaded from: classes2.dex */
public class FirebaseCrashlytics {

    /* renamed from: a  reason: collision with root package name */
    public final w f13508a;

    public FirebaseCrashlytics(w wVar) {
        this.f13508a = wVar;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) e.c().b(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public Task<Boolean> checkForUnsentReports() {
        b bVar = this.f13508a.f21945h;
        if (!bVar.f13532q.compareAndSet(false, true)) {
            return Tasks.e(Boolean.FALSE);
        }
        return bVar.f13529n.f11978a;
    }

    public void deleteUnsentReports() {
        b bVar = this.f13508a.f21945h;
        bVar.f13530o.d(Boolean.FALSE);
        o oVar = bVar.f13531p.f11978a;
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f13508a.f21944g;
    }

    public void log(String str) {
        w wVar = this.f13508a;
        wVar.getClass();
        b bVar = wVar.f21945h;
        bVar.getClass();
        bVar.f13520e.a(new p(bVar, System.currentTimeMillis() - wVar.f21941d, str));
    }

    public void recordException(Throwable th2) {
        if (th2 == null) {
            return;
        }
        b bVar = this.f13508a.f21945h;
        Thread currentThread = Thread.currentThread();
        bVar.getClass();
        q qVar = new q(bVar, System.currentTimeMillis(), th2, currentThread);
        g gVar = bVar.f13520e;
        gVar.getClass();
        gVar.a(new h(qVar));
    }

    public void sendUnsentReports() {
        b bVar = this.f13508a.f21945h;
        bVar.f13530o.d(Boolean.TRUE);
        o oVar = bVar.f13531p.f11978a;
    }

    public void setCrashlyticsCollectionEnabled(boolean z10) {
        this.f13508a.c(Boolean.valueOf(z10));
    }

    public void setCustomKey(String str, boolean z10) {
        this.f13508a.d(str, Boolean.toString(z10));
    }

    public void setCustomKeys(d dVar) {
        throw null;
    }

    public void setUserId(String str) {
        boolean equals;
        final i iVar = this.f13508a.f21945h.f13519d;
        iVar.getClass();
        String b10 = na.b.b(1024, str);
        synchronized (iVar.f22397f) {
            String reference = iVar.f22397f.getReference();
            if (b10 == null) {
                if (reference == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = b10.equals(reference);
            }
            if (!equals) {
                iVar.f22397f.set(b10, true);
                iVar.f22394b.a(new Callable() { // from class: na.h
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        BufferedWriter bufferedWriter;
                        boolean z10;
                        String str2;
                        BufferedWriter bufferedWriter2;
                        i iVar2 = i.this;
                        synchronized (iVar2.f22397f) {
                            bufferedWriter = null;
                            z10 = false;
                            if (iVar2.f22397f.isMarked()) {
                                str2 = iVar2.f22397f.getReference();
                                iVar2.f22397f.set(str2, false);
                                z10 = true;
                            } else {
                                str2 = null;
                            }
                        }
                        if (z10) {
                            File c = iVar2.f22393a.f22376a.c(iVar2.c, "user-data");
                            try {
                                String obj = new d(str2).toString();
                                bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), e.f22375b));
                                try {
                                    bufferedWriter2.write(obj);
                                    bufferedWriter2.flush();
                                } catch (Exception unused) {
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedWriter = bufferedWriter2;
                                    CommonUtils.a(bufferedWriter);
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                bufferedWriter2 = null;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            CommonUtils.a(bufferedWriter2);
                        }
                        return null;
                    }
                });
            }
        }
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f13508a.c(bool);
    }

    public void setCustomKey(String str, double d10) {
        this.f13508a.d(str, Double.toString(d10));
    }

    public void setCustomKey(String str, float f10) {
        this.f13508a.d(str, Float.toString(f10));
    }

    public void setCustomKey(String str, int i10) {
        this.f13508a.d(str, Integer.toString(i10));
    }

    public void setCustomKey(String str, long j10) {
        this.f13508a.d(str, Long.toString(j10));
    }

    public void setCustomKey(String str, String str2) {
        this.f13508a.d(str, str2);
    }
}
