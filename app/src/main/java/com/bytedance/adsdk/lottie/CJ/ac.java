package com.bytedance.adsdk.lottie.CJ;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: DefaultLottieFetchResult.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class ac implements ROR {
    private final HttpURLConnection Qhi;

    public ac(HttpURLConnection httpURLConnection) {
        this.Qhi = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.lottie.CJ.ROR
    public String CJ() {
        try {
            if (Qhi()) {
                return null;
            }
            return "Unable to fetch " + this.Qhi.getURL() + ". Failed with " + this.Qhi.getResponseCode() + "\n" + Qhi(this.Qhi);
        } catch (IOException e10) {
            return e10.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.lottie.CJ.ROR
    public boolean Qhi() {
        try {
            return this.Qhi.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.lottie.CJ.ROR
    public String ac() {
        return this.Qhi.getContentType();
    }

    @Override // com.bytedance.adsdk.lottie.CJ.ROR
    public InputStream cJ() {
        return this.Qhi.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.Qhi.disconnect();
    }

    private String Qhi(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }
}
