package a8;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzfh;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzlo;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f234a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f235b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f236d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f237e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ zzeu f238f;

    public n(zzeu zzeuVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f238f = zzeuVar;
        this.f234a = i10;
        this.f235b = str;
        this.c = obj;
        this.f236d = obj2;
        this.f237e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        v vVar = ((zzge) this.f238f.f3529a).f11779h;
        zzge.d(vVar);
        if (vVar.f219b) {
            zzeu zzeuVar = this.f238f;
            if (zzeuVar.c == 0) {
                zzag zzagVar = ((zzge) zzeuVar.f3529a).f11778g;
                if (zzagVar.f11528d == null) {
                    synchronized (zzagVar) {
                        if (zzagVar.f11528d == null) {
                            ApplicationInfo applicationInfo = ((zzge) zzagVar.f3529a).f11773a.getApplicationInfo();
                            String a10 = ProcessUtils.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                if (str != null && str.equals(a10)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                zzagVar.f11528d = Boolean.valueOf(z10);
                            }
                            if (zzagVar.f11528d == null) {
                                zzagVar.f11528d = Boolean.TRUE;
                                zzeu zzeuVar2 = ((zzge) zzagVar.f3529a).f11780i;
                                zzge.f(zzeuVar2);
                                zzeuVar2.f11712f.a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (zzagVar.f11528d.booleanValue()) {
                    zzeu zzeuVar3 = this.f238f;
                    ((zzge) zzeuVar3.f3529a).getClass();
                    zzeuVar3.c = 'C';
                } else {
                    zzeu zzeuVar4 = this.f238f;
                    ((zzge) zzeuVar4.f3529a).getClass();
                    zzeuVar4.c = 'c';
                }
            }
            zzeu zzeuVar5 = this.f238f;
            if (zzeuVar5.f11710d < 0) {
                ((zzge) zzeuVar5.f3529a).f11778g.r();
                zzeuVar5.f11710d = 77000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f234a);
            zzeu zzeuVar6 = this.f238f;
            char c = zzeuVar6.c;
            long j10 = zzeuVar6.f11710d;
            String w7 = zzeu.w(true, this.f235b, this.c, this.f236d, this.f237e);
            StringBuilder sb2 = new StringBuilder("2");
            sb2.append(charAt);
            sb2.append(c);
            sb2.append(j10);
            String g10 = androidx.activity.r.g(sb2, ":", w7);
            if (g10.length() > 1024) {
                g10 = this.f235b.substring(0, 1024);
            }
            zzfh zzfhVar = vVar.f341d;
            if (zzfhVar != null) {
                v vVar2 = zzfhVar.f11738e;
                vVar2.m();
                if (zzfhVar.f11738e.q().getLong(zzfhVar.f11735a, 0L) == 0) {
                    zzfhVar.a();
                }
                if (g10 == null) {
                    g10 = "";
                }
                SharedPreferences q5 = vVar2.q();
                String str2 = zzfhVar.f11736b;
                long j11 = q5.getLong(str2, 0L);
                int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                String str3 = zzfhVar.c;
                if (i10 <= 0) {
                    SharedPreferences.Editor edit = vVar2.q().edit();
                    edit.putString(str3, g10);
                    edit.putLong(str2, 1L);
                    edit.apply();
                    return;
                }
                zzlo zzloVar = ((zzge) vVar2.f3529a).f11783l;
                zzge.d(zzloVar);
                long j12 = j11 + 1;
                SharedPreferences.Editor edit2 = vVar2.q().edit();
                if ((zzloVar.v().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12) {
                    edit2.putString(str3, g10);
                }
                edit2.putLong(str2, j12);
                edit2.apply();
                return;
            }
            return;
        }
        Log.println(6, this.f238f.z(), "Persisted config not initialized. Not logging error/warn");
    }
}
