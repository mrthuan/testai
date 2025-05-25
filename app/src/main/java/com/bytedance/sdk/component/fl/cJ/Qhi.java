package com.bytedance.sdk.component.fl.cJ;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultHttpClient.java */
/* loaded from: classes.dex */
public class Qhi implements com.bytedance.sdk.component.fl.fl<fl> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.bytedance.sdk.component.fl.fl
    /* renamed from: cJ */
    public fl<byte[]> Qhi(com.bytedance.sdk.component.fl.Tgh tgh) {
        Closeable closeable;
        InputStream inputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2 = null;
        r0 = null;
        Map<String, String> map = null;
        int i10 = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(tgh.Qhi()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr2 = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = inputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } catch (MalformedURLException e10) {
                            e = e10;
                            bArr = null;
                        } catch (IOException e11) {
                            e = e11;
                            bArr = null;
                        }
                    }
                    i10 = 200;
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (MalformedURLException e12) {
                    e = e12;
                    bArr = null;
                    byteArrayOutputStream = bArr;
                    e.getMessage();
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(inputStream);
                    com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(closeable2);
                    return new fl<>(i10, bArr, message, map);
                } catch (IOException e13) {
                    e = e13;
                    bArr = null;
                    byteArrayOutputStream = bArr;
                    e.getMessage();
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(inputStream);
                    com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(closeable2);
                    return new fl<>(i10, bArr, message, map);
                } catch (Throwable th2) {
                    th = th2;
                    closeable = null;
                    inputStream2 = inputStream;
                    com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(inputStream2);
                    com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(closeable);
                    throw th;
                }
            } catch (MalformedURLException e14) {
                e = e14;
                inputStream = null;
                bArr = null;
            } catch (IOException e15) {
                e = e15;
                inputStream = null;
                bArr = null;
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(inputStream2);
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(closeable);
                throw th;
            }
            try {
                if (tgh.cJ()) {
                    map = Qhi(httpURLConnection);
                }
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(inputStream);
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(byteArrayOutputStream);
                message = "success";
            } catch (MalformedURLException e16) {
                e = e16;
                e.getMessage();
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(inputStream);
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(closeable2);
                return new fl<>(i10, bArr, message, map);
            } catch (IOException e17) {
                e = e17;
                e.getMessage();
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(inputStream);
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(closeable2);
                return new fl<>(i10, bArr, message, map);
            }
            return new fl<>(i10, bArr, message, map);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private Map<String, String> Qhi(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }
}
