package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;
import r7.d;
import r7.e;
import r7.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class GmsSignatureVerifier {
    static {
        zzag.zzl();
        zzag.zzl();
        e eVar = j.f29475d;
        zzag zzn = zzag.zzn(eVar.L0(), j.f29474b.L0());
        Preconditions.j(zzn);
        zzag zzk = zzag.zzk(zzn);
        d dVar = j.c;
        zzag zzn2 = zzag.zzn(dVar.L0(), j.f29473a.L0());
        Preconditions.j(zzn2);
        zzag zzk2 = zzag.zzk(zzn2);
        if (204200000 >= 0) {
            if (zzk.isEmpty() && zzk2.isEmpty()) {
                throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
            }
            zzag.zzl();
            zzag.zzl();
            zzag zzm = zzag.zzm(eVar.L0());
            Preconditions.j(zzm);
            zzag zzk3 = zzag.zzk(zzm);
            zzag zzm2 = zzag.zzm(dVar.L0());
            Preconditions.j(zzm2);
            zzag zzk4 = zzag.zzk(zzm2);
            if (82240000 >= 0) {
                if (zzk3.isEmpty() && zzk4.isEmpty()) {
                    throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                }
                new HashMap();
                return;
            }
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
    }
}
