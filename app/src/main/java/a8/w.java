package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.measurement.internal.zzfv;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class w extends y.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzfv f369a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(zzfv zzfvVar) {
        super(20);
        this.f369a = zzfvVar;
    }

    @Override // y.g
    public final Object create(Object obj) {
        String str = (String) obj;
        Preconditions.f(str);
        zzfv zzfvVar = this.f369a;
        zzfvVar.n();
        Preconditions.f(str);
        if (!zzfvVar.x(str)) {
            return null;
        }
        y.b bVar = zzfvVar.f11757h;
        if (bVar.containsKey(str) && bVar.getOrDefault(str, null) != 0) {
            zzfvVar.t(str, (zzff) bVar.getOrDefault(str, null));
        } else {
            zzfvVar.s(str);
        }
        return (zzc) zzfvVar.f11759j.snapshot().get(str);
    }
}
