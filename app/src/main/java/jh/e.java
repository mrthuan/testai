package jh;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.activity.r;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.office.fc.hslf.usermodel.PictureData;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.system.f;

/* compiled from: PictureManage.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static int f19245g;

    /* renamed from: h  reason: collision with root package name */
    public static final ConcurrentHashMap f19246h = new ConcurrentHashMap(10);

    /* renamed from: a  reason: collision with root package name */
    public long f19247a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19248b;

    /* renamed from: e  reason: collision with root package name */
    public final f f19250e;

    /* renamed from: f  reason: collision with root package name */
    public b f19251f;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f19249d = new ArrayList();
    public final HashMap c = new HashMap();

    public e(f fVar) {
        File file;
        this.f19247a = 0L;
        this.f19250e = fVar;
        this.f19247a = 0L;
        if (fVar != null && fVar.s() != null) {
            file = fVar.s().G0();
        } else {
            file = null;
        }
        if (file == null) {
            if (fVar != null && fVar.o() != null && fVar.o().c() != null) {
                fVar.o().c().a(false, new Throwable("SD Card Error"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        String str = File.separator;
        String g10 = r.g(sb2, str, "tempPic");
        this.f19248b = g10;
        File file2 = new File(g10);
        if (!file2.exists()) {
            file2.mkdir();
        }
        String str2 = file2.getAbsolutePath() + str + System.currentTimeMillis();
        this.f19248b = str2;
        File file3 = new File(str2);
        if (!file3.exists()) {
            file3.mkdir();
        }
    }

    public final synchronized void a(Bitmap bitmap, String str) {
        if (!TextUtils.isEmpty(str) && !bitmap.isRecycled()) {
            if (f19245g > 8388608) {
                ConcurrentHashMap concurrentHashMap = f19246h;
                String str2 = (String) ((Map.Entry) concurrentHashMap.entrySet().iterator().next()).getKey();
                Bitmap bitmap2 = (Bitmap) concurrentHashMap.get(str2);
                if (bitmap2 != null) {
                    f19245g -= bitmap2.getWidth() * bitmap2.getHeight();
                    Bitmap bitmap3 = (Bitmap) concurrentHashMap.remove(str2);
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                }
            }
            f19245g = (bitmap.getHeight() * bitmap.getHeight()) + f19245g;
            f19246h.put(str, bitmap);
        }
    }

    public final int b(a aVar) {
        String str;
        String str2 = aVar.c;
        if (str2 == null) {
            byte[] bArr = aVar.f19231b;
            try {
                str = l(bArr, 0, bArr.length);
            } catch (Exception e10) {
                this.f19250e.o().c().a(false, e10);
                str = null;
            }
            aVar.c = str;
            aVar.f19231b = null;
        } else {
            int k10 = k(str2);
            if (k10 >= 0) {
                return k10;
            }
        }
        ArrayList arrayList = this.f19249d;
        int size = arrayList.size();
        arrayList.add(aVar);
        this.c.put(aVar.c, Integer.valueOf(size));
        return size;
    }

    public final int c(PictureData pictureData) {
        HashMap hashMap = this.c;
        Integer num = (Integer) hashMap.get(pictureData.getTempFilePath());
        if (num == null) {
            a aVar = new a();
            aVar.c = pictureData.getTempFilePath();
            aVar.f19230a = (byte) pictureData.getType();
            ArrayList arrayList = this.f19249d;
            int size = arrayList.size();
            arrayList.add(aVar);
            hashMap.put(pictureData.getTempFilePath(), Integer.valueOf(size));
            return size;
        }
        return num.intValue();
    }

    public final int d(PackagePart packagePart) {
        String str;
        String name = packagePart.getPartName().getName();
        HashMap hashMap = this.c;
        Integer num = (Integer) hashMap.get(name);
        if (num == null) {
            a aVar = new a();
            try {
                StringBuilder sb2 = new StringBuilder();
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = this.f19247a;
                this.f19247a = 1 + j10;
                sb2.append(currentTimeMillis + j10);
                sb2.append(".tmp");
                String sb3 = sb2.toString();
                File file = new File(this.f19248b + File.separator + sb3);
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                InputStream inputStream = packagePart.getInputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                inputStream.close();
                fileOutputStream.close();
                str = file.getAbsolutePath();
            } catch (Exception e10) {
                f fVar = this.f19250e;
                if (fVar != null && fVar.o() != null && fVar.o().c() != null) {
                    fVar.o().c().a(false, e10);
                }
                str = null;
            }
            aVar.c = str;
            aVar.a(packagePart.getPartName().getExtension());
            ArrayList arrayList = this.f19249d;
            int size = arrayList.size();
            arrayList.add(aVar);
            hashMap.put(name, Integer.valueOf(size));
            return size;
        }
        return num.intValue();
    }

    public final void e(int i10, String str) {
        f();
        b bVar = this.f19251f;
        if (bVar != null && !bVar.f19233a.get()) {
            synchronized (bVar.f19234b) {
                if (bVar.c(str)) {
                    bVar.f19236e.get(str).add(Integer.valueOf(i10));
                    if (bVar.f19237f.get(Integer.valueOf(i10)) == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str);
                        bVar.f19237f.put(Integer.valueOf(i10), arrayList);
                    } else {
                        bVar.f19237f.get(Integer.valueOf(i10)).add(str);
                    }
                }
            }
        }
    }

    public final void f() {
        b bVar = this.f19251f;
        f fVar = this.f19250e;
        if (bVar == null) {
            this.f19251f = new b(fVar);
        } else {
            bVar.f19234b = fVar;
        }
    }

    public final synchronized void g() {
        for (Bitmap bitmap : f19246h.values()) {
            bitmap.recycle();
        }
        f19246h.clear();
        f19245g = 0;
    }

    public final String h(int i10, byte b10, String str, int i11, int i12) {
        String str2 = str.substring(0, str.length() - 4) + "converted.tmp";
        f();
        b bVar = this.f19251f;
        synchronized (bVar) {
            if (!bVar.f19233a.get()) {
                bVar.f19234b.r(26, Boolean.TRUE);
                bVar.a(b10, str, str2, i11, i12, true);
            }
        }
        return str2;
    }

    public final synchronized Bitmap i(String str) {
        return (Bitmap) f19246h.get(str);
    }

    public final a j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f19249d;
            if (i10 < arrayList.size()) {
                return (a) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final int k(String str) {
        Integer num = (Integer) this.c.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final String l(byte[] bArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.f19247a;
        this.f19247a = 1 + j10;
        sb2.append(currentTimeMillis + j10);
        sb2.append(".tmp");
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f19248b);
        File file = new File(r.g(sb4, File.separator, sb3));
        try {
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr, i10, i11);
            fileOutputStream.close();
        } catch (Exception e10) {
            this.f19250e.o().c().a(false, e10);
        }
        return file.getAbsolutePath();
    }
}
