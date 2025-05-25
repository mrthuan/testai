package com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi;

import com.bytedance.sdk.component.cJ.Qhi.HzH;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: NetResponseBody.java */
/* loaded from: classes.dex */
public class hm extends HzH {
    HttpURLConnection Qhi;
    InputStream cJ;

    public hm(HttpURLConnection httpURLConnection) {
        this.Qhi = httpURLConnection;
        this.cJ = new ROR(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.HzH
    public byte[] CJ() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.cJ.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.HzH
    public long Qhi() {
        try {
            return this.Qhi.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.HzH
    public InputStream ac() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.HzH
    public String cJ() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.cJ));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.HzH, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.cJ.close();
            this.Qhi.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.cJ.Qhi.HzH
    public com.bytedance.sdk.component.cJ.Qhi.WAv fl() {
        if (this.Qhi.getContentType() != null) {
            return com.bytedance.sdk.component.cJ.Qhi.WAv.Qhi(this.Qhi.getContentType());
        }
        return null;
    }

    public hm(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.Qhi = httpURLConnection;
        this.cJ = new ROR(inputStream, httpURLConnection);
    }
}
