package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.ump.ConsentInformation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;
import lib.zj.office.fc.hpsf.Constants;
import x9.a;
import x9.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzu {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzap zzd;
    private final zzbn zze;
    private final zzl zzf;
    private final zzx zzg;
    private final zze zzh;

    public zzu(Application application, zzab zzabVar, Handler handler, Executor executor, zzap zzapVar, zzbn zzbnVar, zzl zzlVar, zzx zzxVar, zze zzeVar) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzapVar;
        this.zze = zzbnVar;
        this.zzf = zzlVar;
        this.zzg = zzxVar;
        this.zzh = zzeVar;
    }

    private final zzck zzd(zzci zzciVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(Constants.CP_MAC_ROMAN);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                String str = zzciVar.zza;
                if (str != null) {
                    jsonWriter.name("admob_app_id");
                    jsonWriter.value(str);
                }
                zzce zzceVar = zzciVar.zzb;
                if (zzceVar != null) {
                    jsonWriter.name("device_info");
                    jsonWriter.beginObject();
                    int i10 = zzceVar.zzc;
                    if (i10 != 1) {
                        jsonWriter.name("os_type");
                        int i11 = i10 - 1;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        } else {
                            jsonWriter.value("UNKNOWN");
                        }
                    }
                    String str2 = zzceVar.zza;
                    if (str2 != null) {
                        jsonWriter.name("model");
                        jsonWriter.value(str2);
                    }
                    Integer num = zzceVar.zzb;
                    if (num != null) {
                        jsonWriter.name("android_api_level");
                        jsonWriter.value(num);
                    }
                    jsonWriter.endObject();
                }
                String str3 = zzciVar.zzc;
                if (str3 != null) {
                    jsonWriter.name("language_code");
                    jsonWriter.value(str3);
                }
                Boolean bool = zzciVar.zzd;
                if (bool != null) {
                    jsonWriter.name("tag_for_under_age_of_consent");
                    jsonWriter.value(bool.booleanValue());
                }
                Map map = zzciVar.zze;
                if (!map.isEmpty()) {
                    jsonWriter.name("stored_infos_map");
                    jsonWriter.beginObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jsonWriter.name((String) entry.getKey());
                        jsonWriter.value((String) entry.getValue());
                    }
                    jsonWriter.endObject();
                }
                zzcg zzcgVar = zzciVar.zzf;
                if (zzcgVar != null) {
                    jsonWriter.name("screen_info");
                    jsonWriter.beginObject();
                    Integer num2 = zzcgVar.zza;
                    if (num2 != null) {
                        jsonWriter.name(InMobiNetworkValues.WIDTH);
                        jsonWriter.value(num2);
                    }
                    Integer num3 = zzcgVar.zzb;
                    if (num3 != null) {
                        jsonWriter.name(InMobiNetworkValues.HEIGHT);
                        jsonWriter.value(num3);
                    }
                    Double d10 = zzcgVar.zzc;
                    if (d10 != null) {
                        jsonWriter.name("density");
                        jsonWriter.value(d10);
                    }
                    List<zzcf> list = zzcgVar.zzd;
                    if (!list.isEmpty()) {
                        jsonWriter.name("screen_insets");
                        jsonWriter.beginArray();
                        for (zzcf zzcfVar : list) {
                            jsonWriter.beginObject();
                            Integer num4 = zzcfVar.zza;
                            if (num4 != null) {
                                jsonWriter.name("top");
                                jsonWriter.value(num4);
                            }
                            Integer num5 = zzcfVar.zzb;
                            if (num5 != null) {
                                jsonWriter.name("left");
                                jsonWriter.value(num5);
                            }
                            Integer num6 = zzcfVar.zzc;
                            if (num6 != null) {
                                jsonWriter.name("right");
                                jsonWriter.value(num6);
                            }
                            Integer num7 = zzcfVar.zzd;
                            if (num7 != null) {
                                jsonWriter.name("bottom");
                                jsonWriter.value(num7);
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                zzcc zzccVar = zzciVar.zzg;
                if (zzccVar != null) {
                    jsonWriter.name("app_info");
                    jsonWriter.beginObject();
                    String str4 = zzccVar.zza;
                    if (str4 != null) {
                        jsonWriter.name(InMobiNetworkValues.PACKAGE_NAME);
                        jsonWriter.value(str4);
                    }
                    String str5 = zzccVar.zzb;
                    if (str5 != null) {
                        jsonWriter.name("publisher_display_name");
                        jsonWriter.value(str5);
                    }
                    String str6 = zzccVar.zzc;
                    if (str6 != null) {
                        jsonWriter.name("version");
                        jsonWriter.value(str6);
                    }
                    jsonWriter.endObject();
                }
                zzch zzchVar = zzciVar.zzh;
                if (zzchVar != null) {
                    jsonWriter.name("sdk_info");
                    jsonWriter.beginObject();
                    String str7 = zzchVar.zza;
                    if (str7 != null) {
                        jsonWriter.name("version");
                        jsonWriter.value(str7);
                    }
                    jsonWriter.endObject();
                }
                List<zzcd> list2 = zzciVar.zzi;
                if (!list2.isEmpty()) {
                    jsonWriter.name("debug_params");
                    jsonWriter.beginArray();
                    for (zzcd zzcdVar : list2) {
                        int ordinal = zzcdVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal == 4) {
                                            jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                        }
                                    } else {
                                        jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    }
                                } else {
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                }
                            } else {
                                jsonWriter.value("ALWAYS_SHOW");
                            }
                        } else {
                            jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
                jsonWriter.close();
                outputStreamWriter.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzck zza = zzck.zza(new JsonReader(new StringReader(headerField)));
                        zza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zza;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        zzck zza2 = zzck.zza(jsonReader);
                        jsonReader.close();
                        bufferedReader.close();
                        return zza2;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
            } catch (Throwable th4) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (SocketTimeoutException e10) {
            throw new zzg(4, "The server timed out.", e10);
        } catch (IOException e11) {
            throw new zzg(2, "Error making request.", e11);
        }
    }

    public final /* synthetic */ void zza(final ConsentInformation.b bVar, zzz zzzVar) {
        Objects.requireNonNull(bVar);
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                ConsentInformation.b.this.onConsentInfoUpdateSuccess();
            }
        });
        if (zzzVar.zzb != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            this.zze.zzc();
        }
    }

    public final void zzb(Activity activity, c cVar, final ConsentInformation.b bVar, final ConsentInformation.a aVar) {
        try {
            a aVar2 = cVar.f31630b;
            if (aVar2 == null || !aVar2.f31626a) {
                zzcl.zza(this.zza);
            }
            final zzz zza = new zzw(this.zzg, zzd(this.zzf.zzc(activity, cVar))).zza();
            this.zzd.zzg(zza.zza);
            this.zzd.zzi(zza.zzb);
            this.zze.zzd(zza.zzc);
            this.zzh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzp
                @Override // java.lang.Runnable
                public final void run() {
                    zzu.this.zza(bVar, zza);
                }
            });
        } catch (zzg e10) {
            this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentInformation.a.this.onConsentInfoUpdateFailure(e10.zza());
                }
            });
        } catch (RuntimeException e11) {
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e11))));
            this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentInformation.a.this.onConsentInfoUpdateFailure(zzgVar.zza());
                }
            });
        }
    }

    public final void zzc(final Activity activity, final c cVar, final ConsentInformation.b bVar, final ConsentInformation.a aVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzq
            @Override // java.lang.Runnable
            public final void run() {
                zzu.this.zzb(activity, cVar, bVar, aVar);
            }
        });
    }
}
