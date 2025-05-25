package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.entity.Header;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private static s f6798a;

    /* renamed from: b  reason: collision with root package name */
    private File f6799b;
    private File c;

    /* renamed from: d  reason: collision with root package name */
    private File f6800d;

    /* renamed from: e  reason: collision with root package name */
    private Context f6801e;

    /* renamed from: f  reason: collision with root package name */
    private a f6802f = null;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f6805a;

        /* renamed from: b  reason: collision with root package name */
        private long f6806b;
        private File c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f6807d;

        private a(File file) {
            long parseLong;
            this.f6807d = null;
            this.c = file;
            String[] split = file.getName().split("-|\\.");
            if (split.length >= 2) {
                this.f6805a = Long.parseLong(split[0]);
                parseLong = Long.parseLong(split[1]);
            } else {
                String name = file.getName();
                if (TextUtils.isEmpty(name) || name.length() < 13) {
                    return;
                }
                String substring = name.substring(0, 13);
                if (!TextUtils.isDigitsOnly(substring)) {
                    return;
                }
                parseLong = Long.parseLong(substring);
                this.f6805a = parseLong;
            }
            this.f6806b = parseLong;
        }

        private String a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f6805a);
            sb2.append("-");
            return android.support.v4.media.session.h.e(sb2, this.f6806b, ".ctx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject b() {
            if (this.f6807d == null) {
                try {
                    this.f6807d = new JSONObject(com.apm.insight.l.h.c(this.c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f6807d == null) {
                    this.f6807d = new JSONObject();
                }
            }
            return this.f6807d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.c.delete();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(long j10) {
            long j11 = this.f6805a;
            if (j11 <= j10 || j11 - j10 <= 604800000) {
                long j12 = this.f6806b;
                if (j12 >= j10 || j10 - j12 <= 604800000) {
                    return this.c.lastModified() < j10 && j10 - this.c.lastModified() > 604800000;
                }
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f6806b = j10;
            this.c.renameTo(new File(this.c.getParent(), a()));
        }
    }

    private s(Context context) {
        File c = com.apm.insight.l.n.c(context);
        if (!c.exists() || (!c.isDirectory() && c.delete())) {
            c.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f6799b = c;
        this.c = new File(c, "did");
        this.f6800d = new File(c, "device_uuid");
        this.f6801e = context;
    }

    public static int a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (Header.c(jSONObject)) {
            return 2;
        }
        if (Header.c(jSONObject2)) {
            return 0;
        }
        return (String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) && Header.d(jSONObject)) ? 1 : 2;
    }

    private a c() {
        if (this.f6802f == null) {
            d(".ctx");
        }
        return this.f6802f;
    }

    private File d(long j10) {
        Iterator<a> it = d(".ctx").iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (j10 >= next.f6805a && j10 <= next.f6806b) {
                return next.c;
            }
        }
        return null;
    }

    private File e(long j10) {
        Iterator<a> it = d(".allData").iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (j10 >= next.f6805a && j10 <= next.f6806b) {
                return next.c;
            }
        }
        return null;
    }

    private File f(long j10) {
        Iterator<a> it = d(".ctx").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (aVar == null || Math.abs(aVar.f6806b - j10) > Math.abs(next.f6806b - j10)) {
                aVar = next;
            }
        }
        if (aVar != null) {
            return aVar.c;
        }
        return null;
    }

    private File g(long j10) {
        Iterator<a> it = d(".allData").iterator();
        a aVar = null;
        while (it.hasNext()) {
            a next = it.next();
            if (aVar == null || Math.abs(aVar.f6806b - j10) > Math.abs(next.f6806b - j10)) {
                aVar = next;
            }
        }
        if (aVar != null) {
            return aVar.c;
        }
        return null;
    }

    public String b() {
        try {
            return com.apm.insight.l.h.c(this.c.getAbsolutePath());
        } catch (Throwable unused) {
            return PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
    }

    public static s a() {
        if (f6798a == null) {
            f6798a = new s(com.apm.insight.i.g());
        }
        return f6798a;
    }

    private void c(long j10) {
        try {
            ArrayList<a> d10 = d("");
            if (d10.size() <= 6) {
                return;
            }
            Iterator<a> it = d10.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b(j10)) {
                    next.c();
                }
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
    }

    private ArrayList<a> d(final String str) {
        File[] listFiles = this.f6799b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.s.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                if (str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches()) {
                    return true;
                }
                return false;
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        com.apm.insight.l.p.a((Object) ("foundRuntimeContextFiles " + listFiles.length));
        a aVar = null;
        for (File file : listFiles) {
            try {
                a aVar2 = new a(file);
                arrayList.add(aVar2);
                if (this.f6802f == null) {
                    if (".ctx".equals(str)) {
                        if (aVar != null && aVar2.f6806b < aVar.f6806b) {
                        }
                        aVar = aVar2;
                    }
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
        if (this.f6802f == null && aVar != null) {
            this.f6802f = aVar;
        }
        return arrayList;
    }

    public JSONArray b(long j10) {
        Throwable th2;
        String str;
        File e10 = e(j10);
        if (e10 == null) {
            e10 = g(j10);
        }
        if (e10 != null) {
            try {
                str = com.apm.insight.l.h.c(e10.getAbsolutePath());
            } catch (Throwable th3) {
                th2 = th3;
                str = null;
            }
            try {
                return new JSONArray(str);
            } catch (Throwable th4) {
                th2 = th4;
                com.apm.insight.c.a().a("NPTH_CATCH", new IOException(a0.a.h("content :", str), th2));
                return null;
            }
        }
        return null;
    }

    public String a(String str) {
        try {
            return com.apm.insight.l.h.c(this.f6800d.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    public void c(String str) {
        try {
            com.apm.insight.l.h.a(this.f6800d, str, false);
        } catch (Throwable unused) {
        }
    }

    public JSONObject a(long j10) {
        boolean z10;
        Throwable th2;
        String str;
        File d10 = d(j10);
        if (d10 == null) {
            d10 = f(j10);
            z10 = true;
        } else {
            z10 = false;
        }
        JSONObject jSONObject = null;
        if (d10 != null) {
            try {
                str = com.apm.insight.l.h.c(d10.getAbsolutePath());
            } catch (Throwable th3) {
                th2 = th3;
                str = null;
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th4) {
                th2 = th4;
                com.apm.insight.c.a().a("NPTH_CATCH", new IOException(a0.a.h("content :", str), th2));
                if (jSONObject != null) {
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e10) {
                        com.apm.insight.c.a().a("NPTH_CATCH", e10);
                    }
                }
                return jSONObject;
            }
        }
        if (jSONObject != null && z10) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }

    public void b(String str) {
        try {
            com.apm.insight.l.h.a(this.c, str, false);
        } catch (Throwable unused) {
        }
    }

    private void a(long j10, long j11, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f6799b, android.support.v4.media.session.h.e(androidx.activity.r.h("", j10, "-"), j11, ".ctx"));
        File file2 = new File(this.f6799b, android.support.v4.media.session.h.e(androidx.activity.r.h("", j10, "-"), j11, ".allData"));
        try {
            com.apm.insight.l.h.a(file, jSONObject, false);
            com.apm.insight.l.h.a(file2, jSONArray, false);
            this.f6802f = new a(file);
        } catch (IOException e10) {
            com.apm.insight.c.a().a("NPTH_CATCH", e10);
        }
    }

    public void a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject a10 = Header.a(this.f6801e).a(map);
        if (Header.c(a10)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a c = c();
        if (c == null) {
            a(currentTimeMillis, currentTimeMillis, a10, jSONArray);
            return;
        }
        int a11 = a(c.b(), a10);
        if (a11 == 1) {
            a(c.f6805a, currentTimeMillis, a10, jSONArray);
            com.apm.insight.l.h.a(c.c);
        } else if (a11 == 2) {
            a(currentTimeMillis, currentTimeMillis, a10, jSONArray);
        } else if (a11 == 3) {
            c.a(currentTimeMillis);
        }
        c(currentTimeMillis);
    }
}
