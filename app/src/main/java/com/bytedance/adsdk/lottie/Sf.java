package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.fl.Dww;
import com.bytedance.component.sdk.annotation.RawRes;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public class Sf {
    private static final Map<String, ABk<ROR>> Qhi = new HashMap();
    private static final Set<Object> cJ = new HashSet();

    /* renamed from: ac  reason: collision with root package name */
    private static final byte[] f7761ac = {80, Field.MERGESEQ, 3, 4};

    @WorkerThread
    public static zc<ROR> ac(Context context, String str) {
        return ac(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static ABk<ROR> cJ(Context context, String str) {
        return cJ(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static ABk<ROR> Qhi(Context context, String str) {
        return Qhi(context, str, "url_".concat(String.valueOf(str)));
    }

    @WorkerThread
    public static zc<ROR> ac(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return cJ(context.getAssets().open(str), str2);
            }
            return Qhi(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new zc<>(e10);
        }
    }

    public static ABk<ROR> cJ(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return Qhi(str2, new Callable<zc<ROR>>() { // from class: com.bytedance.adsdk.lottie.Sf.4
            @Override // java.util.concurrent.Callable
            /* renamed from: Qhi */
            public zc<ROR> call() {
                return Sf.ac(applicationContext, str, str2);
            }
        });
    }

    public static ABk<ROR> Qhi(final Context context, final String str, final String str2) {
        return Qhi(str2, new Callable<zc<ROR>>() { // from class: com.bytedance.adsdk.lottie.Sf.1
            @Override // java.util.concurrent.Callable
            /* renamed from: Qhi */
            public zc<ROR> call() {
                zc<ROR> Qhi2 = Tgh.Qhi(context).Qhi(context, str, str2);
                if (str2 != null && Qhi2.Qhi() != null) {
                    com.bytedance.adsdk.lottie.ac.Tgh.Qhi().Qhi(str2, Qhi2.Qhi());
                }
                return Qhi2;
            }
        });
    }

    public static ABk<ROR> Qhi(Context context, @RawRes int i10) {
        return Qhi(context, i10, ac(context, i10));
    }

    @WorkerThread
    public static zc<ROR> cJ(Context context, @RawRes int i10) {
        return cJ(context, i10, ac(context, i10));
    }

    public static ABk<ROR> Qhi(Context context, @RawRes final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return Qhi(str, new Callable<zc<ROR>>() { // from class: com.bytedance.adsdk.lottie.Sf.5
            @Override // java.util.concurrent.Callable
            /* renamed from: Qhi */
            public zc<ROR> call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return Sf.cJ(context2, i10, str);
            }
        });
    }

    @WorkerThread
    public static zc<ROR> cJ(Context context, @RawRes int i10, String str) {
        try {
            return cJ(context.getResources().openRawResource(i10), ac(context, i10));
        } catch (Resources.NotFoundException e10) {
            return new zc<>(e10);
        }
    }

    private static String ac(Context context, @RawRes int i10) {
        StringBuilder sb2 = new StringBuilder("rawRes");
        sb2.append(Qhi(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    @WorkerThread
    public static zc<ROR> cJ(InputStream inputStream, String str) {
        return Qhi(inputStream, str, true);
    }

    private static boolean Qhi(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @WorkerThread
    private static zc<ROR> cJ(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ROR ror = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    ror = Qhi(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).Qhi();
                } else {
                    if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                        if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        if (name.contains("../")) {
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            String[] split = name.split(PackagingURIHelper.FORWARD_SLASH_STRING);
                            String str2 = split[split.length - 1];
                            String str3 = str2.split("\\.")[0];
                            File file = new File(context.getCacheDir(), str2);
                            new FileOutputStream(file);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable unused) {
                            }
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                file.getAbsolutePath();
                            }
                            hashMap2.put(str3, createFromFile);
                        }
                    }
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] split2 = name.split(PackagingURIHelper.FORWARD_SLASH_STRING);
                        hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (ror == null) {
                return new zc<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                WAv Qhi2 = Qhi(ror, (String) entry.getKey());
                if (Qhi2 != null) {
                    Qhi2.Qhi(com.bytedance.adsdk.lottie.Tgh.ROR.Qhi((Bitmap) entry.getValue(), Qhi2.Qhi(), Qhi2.cJ()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z10 = false;
                for (com.bytedance.adsdk.lottie.ac.ac acVar : ror.Gm().values()) {
                    if (acVar.Qhi().equals(entry2.getKey())) {
                        acVar.Qhi((Typeface) entry2.getValue());
                        z10 = true;
                    }
                }
                if (!z10) {
                    String str4 = (String) entry2.getKey();
                }
            }
            if (hashMap.isEmpty()) {
                for (Map.Entry<String, WAv> entry3 : ror.zc().entrySet()) {
                    WAv value = entry3.getValue();
                    if (value == null) {
                        return null;
                    }
                    String CJ = value.CJ();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (CJ.startsWith("data:") && CJ.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(CJ.substring(CJ.indexOf(44) + 1), 0);
                            value.Qhi(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, WAv> entry4 : ror.zc().entrySet()) {
                if (entry4.getValue().Tgh() == null) {
                    return new zc<>(new IllegalStateException("There is no image for " + entry4.getValue().CJ()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.lottie.ac.Tgh.Qhi().Qhi(str, ror);
            }
            return new zc<>(ror);
        } catch (IOException e10) {
            return new zc<>(e10);
        }
    }

    public static ABk<ROR> Qhi(final InputStream inputStream, final String str) {
        return Qhi(str, new Callable<zc<ROR>>() { // from class: com.bytedance.adsdk.lottie.Sf.6
            @Override // java.util.concurrent.Callable
            /* renamed from: Qhi */
            public zc<ROR> call() {
                return Sf.cJ(inputStream, str);
            }
        });
    }

    @WorkerThread
    private static zc<ROR> Qhi(InputStream inputStream, String str, boolean z10) {
        try {
            return Qhi(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z10) {
                com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(inputStream);
            }
        }
    }

    @WorkerThread
    public static zc<ROR> Qhi(JsonReader jsonReader, String str) {
        return Qhi(jsonReader, str, true);
    }

    private static zc<ROR> Qhi(JsonReader jsonReader, String str, boolean z10) {
        try {
            try {
                ROR Qhi2 = Dww.Qhi(jsonReader);
                com.bytedance.adsdk.lottie.ac.Tgh.Qhi().Qhi(str, Qhi2);
                zc<ROR> zcVar = new zc<>(Qhi2);
                if (z10) {
                    Qhi(jsonReader);
                }
                return zcVar;
            } catch (Exception e10) {
                zc<ROR> zcVar2 = new zc<>(e10);
                if (z10) {
                    Qhi(jsonReader);
                }
                return zcVar2;
            }
        } catch (Throwable th2) {
            if (z10) {
                Qhi(jsonReader);
            }
            throw th2;
        }
    }

    public static void Qhi(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    @WorkerThread
    public static zc<ROR> Qhi(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return cJ(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(zipInputStream);
        }
    }

    private static WAv Qhi(ROR ror, String str) {
        for (WAv wAv : ror.zc().values()) {
            if (wAv.CJ().equals(str)) {
                return wAv;
            }
        }
        return null;
    }

    private static ABk<ROR> Qhi(final String str, Callable<zc<ROR>> callable) {
        final ROR Qhi2 = str == null ? null : com.bytedance.adsdk.lottie.ac.Tgh.Qhi().Qhi(str);
        if (Qhi2 != null) {
            return new ABk<>(new Callable<zc<ROR>>() { // from class: com.bytedance.adsdk.lottie.Sf.7
                @Override // java.util.concurrent.Callable
                /* renamed from: Qhi */
                public zc<ROR> call() {
                    return new zc<>(ROR.this);
                }
            });
        }
        if (str != null) {
            Map<String, ABk<ROR>> map = Qhi;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        ABk<ROR> aBk = new ABk<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            aBk.Qhi(new Gm<ROR>() { // from class: com.bytedance.adsdk.lottie.Sf.2
                @Override // com.bytedance.adsdk.lottie.Gm
                public void Qhi(ROR ror) {
                    Sf.Qhi.remove(str);
                    atomicBoolean.set(true);
                    if (Sf.Qhi.size() == 0) {
                        Sf.cJ(true);
                    }
                }
            });
            aBk.ac(new Gm<Throwable>() { // from class: com.bytedance.adsdk.lottie.Sf.3
                @Override // com.bytedance.adsdk.lottie.Gm
                public void Qhi(Throwable th2) {
                    Sf.Qhi.remove(str);
                    atomicBoolean.set(true);
                    if (Sf.Qhi.size() == 0) {
                        Sf.cJ(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, ABk<ROR>> map2 = Qhi;
                map2.put(str, aBk);
                if (map2.size() == 1) {
                    cJ(false);
                }
            }
        }
        return aBk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(boolean z10) {
        ArrayList arrayList = new ArrayList(cJ);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10);
        }
    }
}
