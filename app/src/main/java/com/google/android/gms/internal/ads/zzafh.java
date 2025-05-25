package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzafh {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzafh() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzafg zzafgVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzafgVar.zza);
            String str = zzafgVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzafgVar.zzc);
            this.zzb.writeLong(zzafgVar.zzd);
            this.zzb.write(zzafgVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
