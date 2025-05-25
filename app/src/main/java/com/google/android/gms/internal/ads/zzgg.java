package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgg extends zzfl implements zzgp {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgo zze;
    private final zzgo zzf;
    private zzfy zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    public /* synthetic */ zzgg(String str, int i10, int i11, boolean z10, boolean z11, zzgo zzgoVar, zzfuv zzfuvVar, boolean z12, zzgf zzgfVar) {
        super(true);
        this.zzd = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zza = z10;
        this.zze = zzgoVar;
        this.zzf = new zzgo();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection zzk(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.zzb
            r3.setConnectTimeout(r4)
            int r4 = r2.zzc
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.zzgo r5 = r2.zze
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.zzgo r5 = r2.zzf
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L72
        L5c:
            r6 = r4
        L5d:
            java.lang.String r4 = "bytes="
            java.lang.String r5 = "-"
            java.lang.StringBuilder r4 = androidx.activity.r.h(r4, r6, r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L6e
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L6e:
            java.lang.String r4 = r4.toString()
        L72:
            if (r4 == 0) goto L79
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L79:
            java.lang.String r4 = r2.zzd
            if (r4 == 0) goto L82
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L82:
            r4 = 1
            if (r4 == r10) goto L88
            java.lang.String r4 = "identity"
            goto L8a
        L88:
            java.lang.String r4 = "gzip"
        L8a:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.zzfy.zzh
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgg.zzk(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL zzl(URL url, String str, zzfy zzfyVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new zzgl("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzfyVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
                }
                if (!this.zza && !protocol.equals(url.getProtocol())) {
                    throw new zzgl(a0.d.d("Disallowed cross-protocol redirect (", url.getProtocol(), " to ", protocol, ")"), zzfyVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
                }
                return url2;
            } catch (MalformedURLException e10) {
                throw new zzgl(e10, zzfyVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        }
        throw new zzgl("Null location redirect", zzfyVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzea.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzl;
            if (j10 != -1) {
                long j11 = j10 - this.zzm;
                if (j11 != 0) {
                    i11 = (int) Math.min(i11, j11);
                }
                return -1;
            }
            InputStream inputStream = this.zzi;
            int i12 = zzet.zza;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzg(read);
            return read;
        } catch (IOException e10) {
            zzfy zzfyVar = this.zzg;
            int i13 = zzet.zza;
            throw zzgl.zza(e10, zzfyVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cd, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ef, code lost:
        throw new com.google.android.gms.internal.ads.zzgl(new java.net.NoRouteToHostException("Too many redirects: " + r6), r25, (int) com.facebook.ads.AdError.INTERNAL_ERROR_CODE, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
        if (r8 == 0) goto L66;
     */
    @Override // com.google.android.gms.internal.ads.zzfs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzfy r25) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgg.zzb(com.google.android.gms.internal.ads.zzfy):long");
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                if (this.zzh != null) {
                    int i10 = zzet.zza;
                }
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    zzfy zzfyVar = this.zzg;
                    int i11 = zzet.zza;
                    throw new zzgl(e10, zzfyVar, (int) AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfl, com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return zzfxu.zzd();
        }
        return new zzge(httpURLConnection.getHeaderFields());
    }
}
