package ca;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzik;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.2 */
/* loaded from: classes2.dex */
public final class b implements zzik {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzef f5671a;

    public b(zzef zzefVar) {
        this.f5671a = zzefVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final List a(String str, String str2) {
        return this.f5671a.zzq(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void b(Bundle bundle, String str, String str2) {
        this.f5671a.zzw(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final Map c(String str, String str2, boolean z10) {
        return this.f5671a.zzr(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void d(Bundle bundle) {
        this.f5671a.zzE(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void e(Bundle bundle, String str, String str2) {
        this.f5671a.zzz(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final int zza(String str) {
        return this.f5671a.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final long zzb() {
        return this.f5671a.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzh() {
        return this.f5671a.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzi() {
        return this.f5671a.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzj() {
        return this.f5671a.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final String zzk() {
        return this.f5671a.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzp(String str) {
        this.f5671a.zzv(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzik
    public final void zzr(String str) {
        this.f5671a.zzx(str);
    }
}
