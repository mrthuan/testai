package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.PowerManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class K8 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14399a = 0;

    public static EnumC1849w3 a() {
        EnumC1849w3 enumC1849w3;
        Context d10 = Ha.d();
        if (d10 != null) {
            try {
                Object systemService = d10.getSystemService("connectivity");
                kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                enumC1849w3 = (networkCapabilities == null || !networkCapabilities.hasCapability(16)) ? EnumC1849w3.f15565p : null;
            } catch (Exception unused) {
                enumC1849w3 = EnumC1849w3.f15567r;
            }
            if (enumC1849w3 == null) {
                Context d11 = Ha.d();
                boolean z10 = false;
                if (d11 != null) {
                    try {
                        Object systemService2 = d11.getSystemService("power");
                        PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                        if (powerManager != null) {
                            z10 = powerManager.isDeviceIdleMode();
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (z10) {
                    return EnumC1849w3.f15564o;
                }
                return null;
            }
            return enumC1849w3;
        }
        return EnumC1849w3.f15563n;
    }

    public static String a(String delimiter, Map map) {
        String str;
        String str2;
        kotlin.jvm.internal.g.e(delimiter, "delimiter");
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (sb2.length() > 0) {
                    sb2.append(delimiter);
                }
                Locale locale = Locale.US;
                try {
                    str = URLEncoder.encode(str3, "UTF-8");
                    kotlin.jvm.internal.g.d(str, "encode(...)");
                } catch (UnsupportedEncodingException unused) {
                    str = "";
                }
                try {
                    str2 = URLEncoder.encode(str4, "UTF-8");
                    kotlin.jvm.internal.g.d(str2, "encode(...)");
                } catch (UnsupportedEncodingException unused2) {
                    str2 = "";
                }
                String format = String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{str, str2}, 2));
                kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
                sb2.append(format);
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "toString(...)");
        return sb3;
    }

    public static void a(Map map) {
        if (map != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    String str = (String) entry.getValue();
                    int length = str.length() - 1;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 <= length) {
                        boolean z11 = kotlin.jvm.internal.g.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i10++;
                        } else {
                            z10 = true;
                        }
                    }
                    if (str.subSequence(i10, length + 1).toString().length() > 0 && entry.getKey() != null) {
                        String str2 = (String) entry.getKey();
                        int length2 = str2.length() - 1;
                        int i11 = 0;
                        boolean z12 = false;
                        while (i11 <= length2) {
                            boolean z13 = kotlin.jvm.internal.g.f(str2.charAt(!z12 ? i11 : length2), 32) <= 0;
                            if (z12) {
                                if (!z13) {
                                    break;
                                }
                                length2--;
                            } else if (z13) {
                                i11++;
                            } else {
                                z12 = true;
                            }
                        }
                        if (str2.subSequence(i11, length2 + 1).toString().length() > 0) {
                            String str3 = (String) entry.getKey();
                            int length3 = str3.length() - 1;
                            int i12 = 0;
                            boolean z14 = false;
                            while (i12 <= length3) {
                                boolean z15 = kotlin.jvm.internal.g.f(str3.charAt(!z14 ? i12 : length3), 32) <= 0;
                                if (z14) {
                                    if (!z15) {
                                        break;
                                    }
                                    length3--;
                                } else if (z15) {
                                    i12++;
                                } else {
                                    z14 = true;
                                }
                            }
                            String a10 = C6.a(length3, 1, str3, i12);
                            String str4 = (String) entry.getValue();
                            int length4 = str4.length() - 1;
                            int i13 = 0;
                            boolean z16 = false;
                            while (i13 <= length4) {
                                boolean z17 = kotlin.jvm.internal.g.f(str4.charAt(!z16 ? i13 : length4), 32) <= 0;
                                if (z16) {
                                    if (!z17) {
                                        break;
                                    }
                                    length4--;
                                } else if (z17) {
                                    i13++;
                                } else {
                                    z16 = true;
                                }
                            }
                            hashMap.put(a10, C6.a(length4, 1, str4, i13));
                        }
                    }
                }
            }
            map.clear();
            map.putAll(hashMap);
        }
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    kotlin.jvm.internal.g.b(next);
                    String string = jSONObject.getString(next);
                    kotlin.jvm.internal.g.d(string, "getString(...)");
                    hashMap.put(next, string);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public static String a(String url, HashMap hashMap) {
        kotlin.jvm.internal.g.e(url, "url");
        if (hashMap != null && (!hashMap.isEmpty())) {
            for (Map.Entry entry : hashMap.entrySet()) {
                url = kotlin.text.j.K(url, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        return url;
    }

    public static byte[] a(byte[] compressedData) {
        GZIPInputStream gZIPInputStream;
        kotlin.jvm.internal.g.e(compressedData, "compressedData");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressedData);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    compressedData = a((InputStream) gZIPInputStream);
                } catch (IOException e10) {
                    e = e10;
                    gZIPInputStream2 = gZIPInputStream;
                    Z5.a((byte) 2, "K8", "Failed to decompress response", e);
                    gZIPInputStream = gZIPInputStream2;
                    a((Closeable) byteArrayInputStream);
                    a((Closeable) gZIPInputStream);
                    return compressedData;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPInputStream2 = gZIPInputStream;
                    a((Closeable) byteArrayInputStream);
                    a((Closeable) gZIPInputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
        a((Closeable) byteArrayInputStream);
        a((Closeable) gZIPInputStream);
        return compressedData;
    }

    public static byte[] a(InputStream input) {
        kotlin.jvm.internal.g.e(input, "input");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = input.read(bArr);
                tf.d dVar = tf.d.f30009a;
                if (-1 != read) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.jvm.internal.g.b(byteArray);
                    return byteArray;
                }
            } finally {
                a(byteArrayOutputStream);
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (httpURLConnection != null) {
            try {
                inputStream = httpURLConnection.getInputStream();
            } catch (Error | Exception unused) {
                return;
            }
        } else {
            inputStream = null;
        }
        a((Closeable) inputStream);
        a((Closeable) (httpURLConnection != null ? httpURLConnection.getErrorStream() : null));
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException | Error | Exception unused) {
            }
        }
    }
}
