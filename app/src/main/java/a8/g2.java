package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzlg;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class g2 {

    /* renamed from: a  reason: collision with root package name */
    public zzgd f181a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f182b;
    public ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public long f183d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzlg f184e;

    public /* synthetic */ g2(zzlg zzlgVar) {
        this.f184e = zzlgVar;
    }

    public final boolean a(zzft zzftVar, long j10) {
        Preconditions.j(zzftVar);
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.f182b == null) {
            this.f182b = new ArrayList();
        }
        if (!this.c.isEmpty() && ((((zzft) this.c.get(0)).zzd() / 1000) / 60) / 60 != ((zzftVar.zzd() / 1000) / 60) / 60) {
            return false;
        }
        long zzbz = this.f183d + zzftVar.zzbz();
        zzlg zzlgVar = this.f184e;
        zzlgVar.E();
        if (zzbz >= Math.max(0, ((Integer) zzeh.f11657j.a(null)).intValue())) {
            return false;
        }
        this.f183d = zzbz;
        this.c.add(zzftVar);
        this.f182b.add(Long.valueOf(j10));
        int size = this.c.size();
        zzlgVar.E();
        if (size >= Math.max(1, ((Integer) zzeh.f11659k.a(null)).intValue())) {
            return false;
        }
        return true;
    }
}
