package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public class zzgyn extends IOException {
    private boolean zza;

    public zzgyn(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzgym zza() {
        return new zzgym("Protocol message tag had invalid wire type.");
    }

    public static zzgyn zzb() {
        return new zzgyn("Protocol message end-group tag did not match expected tag.");
    }

    public static zzgyn zzc() {
        return new zzgyn("Protocol message contained an invalid tag (zero).");
    }

    public static zzgyn zzd() {
        return new zzgyn("Protocol message had invalid UTF-8.");
    }

    public static zzgyn zze() {
        return new zzgyn("CodedInputStream encountered a malformed varint.");
    }

    public static zzgyn zzf() {
        return new zzgyn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzgyn zzg() {
        return new zzgyn("Failed to parse the message.");
    }

    public static zzgyn zzh() {
        return new zzgyn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzgyn zzi() {
        return new zzgyn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void zzj() {
        this.zza = true;
    }

    public final boolean zzk() {
        return this.zza;
    }

    public zzgyn(String str) {
        super(str);
    }
}
