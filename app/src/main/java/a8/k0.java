package a8;

import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zzlg;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class k0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f209a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f210b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f211d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f212e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f213f;

    public /* synthetic */ k0(Object obj, String str, String str2, Object obj2, long j10, int i10) {
        this.f209a = i10;
        this.f213f = obj;
        this.f210b = str;
        this.c = str2;
        this.f212e = obj2;
        this.f211d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f209a;
        Object obj = this.f213f;
        switch (i10) {
            case 0:
                String str = this.c;
                String str2 = this.f210b;
                if (str2 == null) {
                    zzlg zzlgVar = ((zzgw) obj).f11800a;
                    zzlgVar.zzaB().m();
                    String str3 = zzlgVar.D;
                    if (str3 == null || str3.equals(str)) {
                        zzlgVar.D = str;
                        zzlgVar.C = null;
                        return;
                    }
                    return;
                }
                zziq zziqVar = new zziq((String) this.f212e, str2, this.f211d);
                zzlg zzlgVar2 = ((zzgw) obj).f11800a;
                zzlgVar2.zzaB().m();
                String str4 = zzlgVar2.D;
                if (str4 != null) {
                    str4.equals(str);
                }
                zzlgVar2.D = str;
                zzlgVar2.C = zziqVar;
                return;
            default:
                String str5 = this.f210b;
                String str6 = this.c;
                ((zzij) obj).C(this.f211d, this.f212e, str5, str6);
                return;
        }
    }
}
