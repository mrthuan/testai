package com.apm.insight.k;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f6623a;

    /* renamed from: b  reason: collision with root package name */
    private HttpURLConnection f6624b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6625d;

    /* renamed from: e  reason: collision with root package name */
    private f f6626e;

    /* renamed from: f  reason: collision with root package name */
    private m f6627f;

    public j(String str, String str2, boolean z10) {
        this.c = str2;
        this.f6625d = z10;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f6623a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f6624b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f6624b.setDoOutput(true);
        this.f6624b.setDoInput(true);
        this.f6624b.setRequestMethod("POST");
        this.f6624b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (z10) {
            this.f6624b.setRequestProperty("Content-Encoding", "gzip");
            this.f6627f = new m(this.f6624b.getOutputStream());
            return;
        }
        this.f6626e = new f(this.f6624b.getOutputStream());
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f6623a + "--\r\n").getBytes();
        if (this.f6625d) {
            this.f6627f.write(bytes);
            this.f6627f.b();
            this.f6627f.a();
        } else {
            this.f6626e.write(bytes);
            this.f6626e.flush();
            this.f6626e.a();
        }
        int responseCode = this.f6624b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f6624b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f6624b.disconnect();
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            return sb2.toString();
        }
        throw new IOException(b.a.c("Server returned non-OK status: ", responseCode));
    }

    public void a(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder("--");
        a6.h.l(sb2, this.f6623a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb2.append(name);
        sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }
        sb2.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f6625d) {
            this.f6627f.write(sb2.toString().getBytes());
        } else {
            this.f6626e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            }
            (this.f6625d ? this.f6627f : this.f6626e).write(bArr, 0, read);
        }
        fileInputStream.close();
        if (this.f6625d) {
            this.f6627f.write("\r\n".getBytes());
            return;
        }
        this.f6626e.write("\r\n".getBytes());
        this.f6626e.flush();
    }

    public void a(String str, String str2) {
        a(str, str2, false);
    }

    public void a(String str, String str2, boolean z10) {
        StringBuilder sb2 = new StringBuilder("--");
        a6.h.l(sb2, this.f6623a, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=");
        sb2.append(this.c);
        sb2.append("\r\n\r\n");
        try {
            if (this.f6625d) {
                this.f6627f.write(sb2.toString().getBytes());
            } else {
                this.f6626e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z10) {
            bytes = com.apm.insight.i.i().getEncryptImpl().a(bytes);
        }
        try {
            if (this.f6625d) {
                this.f6627f.write(bytes);
                this.f6627f.write("\r\n".getBytes());
                return;
            }
            this.f6626e.write(bytes);
            this.f6626e.write("\r\n".getBytes());
        } catch (IOException unused2) {
        }
    }

    public void a(String str, File... fileArr) {
        StringBuilder sb2 = new StringBuilder("--");
        a6.h.l(sb2, this.f6623a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f6625d) {
            this.f6627f.write(sb2.toString().getBytes());
        } else {
            this.f6626e.write(sb2.toString().getBytes());
        }
        com.apm.insight.l.h.a(this.f6625d ? this.f6627f : this.f6626e, fileArr);
        if (this.f6625d) {
            this.f6627f.write("\r\n".getBytes());
            return;
        }
        this.f6626e.write("\r\n".getBytes());
        this.f6626e.flush();
    }
}
