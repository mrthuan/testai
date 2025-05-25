package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzayz {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        String str;
        try {
            this.zzb.close();
        } catch (IOException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
        try {
            try {
                this.zza.close();
                str = this.zza.toString();
            } finally {
                this.zza = null;
                this.zzb = null;
            }
        } catch (IOException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            str = "";
        }
        return str;
    }
}
