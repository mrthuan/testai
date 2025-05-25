package com.pgl.ssdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import java.io.BufferedInputStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import org.json.JSONArray;

/* compiled from: ExecuteIntelCid.java */
/* loaded from: classes2.dex */
public class B {
    private static String a(BufferedInputStream bufferedInputStream) {
        int read;
        byte[] bArr = new byte[4096];
        StringBuilder sb2 = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb2.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception unused) {
            }
        } while (read >= 4096);
        return sb2.toString();
    }

    private static void b(LinkProperties linkProperties, JSONArray jSONArray) {
        for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
            if (linkAddress != null && linkAddress.getAddress() != null && !linkAddress.getAddress().isLoopbackAddress()) {
                jSONArray.put(linkAddress.getAddress().getHostAddress());
            }
        }
    }

    private static void a(LinkProperties linkProperties, JSONArray jSONArray) {
        InetAddress gateway;
        for (RouteInfo routeInfo : linkProperties.getRoutes()) {
            if (routeInfo != null && routeInfo.isDefaultRoute() && (gateway = routeInfo.getGateway()) != null && (!(gateway instanceof Inet6Address) || !"::".equals(gateway.getHostAddress()))) {
                jSONArray.put(gateway.getHostAddress());
            }
        }
    }

    public static String[] b(Context context) {
        Network[] allNetworks;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        int type;
        String[] strArr = new String[5];
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            JSONArray jSONArray5 = new JSONArray();
            for (Network network : allNetworks) {
                if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getState() == NetworkInfo.State.CONNECTED && (linkProperties = connectivityManager.getLinkProperties(network)) != null && ((type = networkInfo.getType()) == 0 || type == 1)) {
                    for (InetAddress inetAddress : linkProperties.getDnsServers()) {
                        if (inetAddress != null) {
                            jSONArray5.put(inetAddress.getHostAddress());
                        }
                    }
                    if (type == 0) {
                        b(linkProperties, jSONArray);
                        a(linkProperties, jSONArray2);
                    } else {
                        b(linkProperties, jSONArray3);
                        a(linkProperties, jSONArray4);
                    }
                }
            }
            strArr[0] = jSONArray3.toString();
            strArr[1] = jSONArray4.toString();
            strArr[2] = jSONArray.toString();
            strArr[3] = jSONArray2.toString();
            strArr[4] = jSONArray5.toString();
        }
        return strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.lang.String r5) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L5b
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L5b
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L5c
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.write(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r5 = 10
            r2.write(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.flush()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.close()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r1.waitFor()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            java.lang.String r5 = a(r3)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5e
            r2.close()     // Catch: java.io.IOException -> L39
        L39:
            r3.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r0 = r5
            goto L6b
        L3e:
            r5 = move-exception
            goto L42
        L40:
            r5 = move-exception
            r3 = r0
        L42:
            r0 = r2
            goto L4b
        L44:
            r3 = r0
            goto L5e
        L46:
            r5 = move-exception
            goto L4a
        L48:
            r5 = move-exception
            r1 = r0
        L4a:
            r3 = r0
        L4b:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L50
        L50:
            if (r3 == 0) goto L55
            r3.close()     // Catch: java.io.IOException -> L55
        L55:
            if (r1 == 0) goto L5a
            r1.destroy()
        L5a:
            throw r5
        L5b:
            r1 = r0
        L5c:
            r2 = r0
            r3 = r2
        L5e:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L63
        L63:
            if (r3 == 0) goto L68
            r3.close()     // Catch: java.io.IOException -> L68
        L68:
            if (r1 != 0) goto L6b
            goto L6e
        L6b:
            r1.destroy()
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.B.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e9, code lost:
        if (r11.length() == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.String a(android.content.Context r11) {
        /*
            java.lang.Class<com.pgl.ssdk.B> r0 = com.pgl.ssdk.B.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le1
            r1.<init>()     // Catch: java.lang.Throwable -> Le1
            java.io.File r2 = r11.getFilesDir()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Le1
            r1.append(r2)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r2 = "/dic"
            r1.append(r2)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le1
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Le1
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Le1
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L4f
            java.lang.String r2 = "chmod 777 "
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> Le1
            a(r2)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r2 = a(r1)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r3 = "chmod 600 "
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> Le1
            a(r3)     // Catch: java.lang.Throwable -> Le1
            if (r2 == 0) goto L4f
            int r3 = r2.length()     // Catch: java.lang.Throwable -> Le1
            if (r3 <= 0) goto L4f
            monitor-exit(r0)
            return r2
        L4f:
            android.content.res.Resources r11 = r11.getResources()     // Catch: java.lang.Throwable -> Le1
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r2 = "dic"
            java.io.InputStream r11 = r11.open(r2)     // Catch: java.lang.Throwable -> Le1
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Le1
            r2.<init>()     // Catch: java.lang.Throwable -> Le1
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> Le1
        L66:
            r5 = 0
            int r6 = r11.read(r4, r5, r3)     // Catch: java.lang.Throwable -> Le1
            r7 = -1
            if (r6 == r7) goto L8f
            java.lang.String r7 = "dic"
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)     // Catch: java.lang.Throwable -> Le1
            byte[] r7 = r7.getBytes(r8)     // Catch: java.lang.Throwable -> Le1
            r8 = r5
        L7b:
            if (r8 >= r6) goto L8b
            r9 = r4[r8]     // Catch: java.lang.Throwable -> Le1
            int r10 = r7.length     // Catch: java.lang.Throwable -> Le1
            int r10 = r8 % r10
            r10 = r7[r10]     // Catch: java.lang.Throwable -> Le1
            r9 = r9 ^ r10
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> Le1
            r4[r8] = r9     // Catch: java.lang.Throwable -> Le1
            int r8 = r8 + 1
            goto L7b
        L8b:
            r2.write(r4, r5, r6)     // Catch: java.lang.Throwable -> Le1
            goto L66
        L8f:
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le1
            r11.<init>(r1)     // Catch: java.lang.Throwable -> Le1
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.Throwable -> Le1
            r11.write(r2)     // Catch: java.lang.Throwable -> Le1
            r11.close()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r11 = "chmod 777 "
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r11 = r11.concat(r2)     // Catch: java.lang.Throwable -> Le1
            a(r11)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r11 = a(r1)     // Catch: java.lang.Throwable -> Le1
            if (r11 == 0) goto Lb7
            int r2 = r11.length()     // Catch: java.lang.Throwable -> Le1
            if (r2 != 0) goto Ld3
        Lb7:
            java.io.RandomAccessFile r11 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Le1
            java.lang.String r2 = "rw"
            r11.<init>(r1, r2)     // Catch: java.lang.Throwable -> Le1
            r2 = 1
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> Le1
            r3 = 2
            r2[r5] = r3     // Catch: java.lang.Throwable -> Le1
            r3 = 16
            r11.seek(r3)     // Catch: java.lang.Throwable -> Le1
            r11.write(r2)     // Catch: java.lang.Throwable -> Le1
            r11.close()     // Catch: java.lang.Throwable -> Le1
            java.lang.String r11 = a(r1)     // Catch: java.lang.Throwable -> Le1
        Ld3:
            java.lang.String r2 = "chmod 600 "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Le1
            a(r1)     // Catch: java.lang.Throwable -> Le1
            goto Le3
        Le1:
            java.lang.String r11 = "0[<!>]EXCEPTION[<!>]"
        Le3:
            if (r11 == 0) goto Leb
            int r1 = r11.length()     // Catch: java.lang.Throwable -> Lef
            if (r1 != 0) goto Led
        Leb:
            java.lang.String r11 = "0[<!>]ERROR[<!>]"
        Led:
            monitor-exit(r0)
            return r11
        Lef:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.B.a(android.content.Context):java.lang.String");
    }
}
