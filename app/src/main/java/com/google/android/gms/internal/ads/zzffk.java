package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzffk {
    private final zzauo zza;

    public zzffk(zzauo zzauoVar) {
        this.zza = zzauoVar;
    }

    private static final Uri zzb(Uri uri, String str) {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (!uri.toString().contains("dc_ms=")) {
                                String uri2 = uri.toString();
                                int indexOf = uri2.indexOf(";adurl");
                                if (indexOf != -1) {
                                    int i10 = indexOf + 1;
                                    StringBuilder sb2 = new StringBuilder(uri2.substring(0, i10));
                                    sb2.append("dc_ms=");
                                    sb2.append(str);
                                    sb2.append(";");
                                    sb2.append((CharSequence) uri2, i10, uri2.length());
                                    return Uri.parse(sb2.toString());
                                }
                                String encodedPath = uri.getEncodedPath();
                                if (encodedPath != null) {
                                    int indexOf2 = uri2.indexOf(encodedPath);
                                    StringBuilder sb3 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                                    sb3.append(";dc_ms=");
                                    sb3.append(str);
                                    sb3.append(";");
                                    sb3.append((CharSequence) uri2, indexOf2 + encodedPath.length(), uri2.length());
                                    return Uri.parse(sb3.toString());
                                }
                                throw new UnsupportedOperationException();
                            }
                            throw new zzaup("Parameter already exists: dc_ms");
                        }
                    }
                } catch (NullPointerException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                throw new zzaup("Provided Uri is not in a valid state");
            }
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i11 = indexOf3 + 1;
                StringBuilder sb4 = new StringBuilder(uri3.substring(0, i11));
                sb4.append("ms=");
                sb4.append(str);
                sb4.append("&");
                sb4.append((CharSequence) uri3, i11, uri3.length());
                return Uri.parse(sb4.toString());
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        throw new zzaup("Query parameter already exists: ms");
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) {
        try {
            return zzb(uri, this.zza.zzc().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzaup("Provided Uri is not in a valid state");
        }
    }
}
