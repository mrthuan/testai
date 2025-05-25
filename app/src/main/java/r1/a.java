package r1;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MultiDex.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f29431a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f29432b;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r1 < 1) goto L23;
     */
    static {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.a.f29431a = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L42
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            java.lang.String r2 = "."
            r1.<init>(r0, r2)
            boolean r0 = r1.hasMoreTokens()
            r2 = 0
            if (r0 == 0) goto L22
            java.lang.String r0 = r1.nextToken()
            goto L23
        L22:
            r0 = r2
        L23:
            boolean r3 = r1.hasMoreTokens()
            if (r3 == 0) goto L2d
            java.lang.String r2 = r1.nextToken()
        L2d:
            if (r0 == 0) goto L42
            if (r2 == 0) goto L42
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L42
            int r1 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L42
            r2 = 1
            r3 = 2
            if (r0 > r3) goto L43
            if (r0 != r3) goto L42
            if (r1 < r2) goto L42
            goto L43
        L42:
            r2 = 0
        L43:
            r1.a.f29432b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.a.<clinit>():void");
    }

    public static void a(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : listFiles) {
                file2.getPath();
                file2.length();
                if (!file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (!file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0022 A[Catch: all -> 0x006c, DONT_GENERATE, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x000d, B:10:0x0016, B:11:0x001a, B:16:0x0022, B:19:0x0027, B:20:0x002e, B:23:0x003e, B:32:0x005e, B:36:0x0065, B:38:0x0067, B:22:0x0032, B:25:0x004c, B:26:0x0050, B:31:0x0057), top: B:57:0x0005, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r6, java.io.File r7, java.io.File r8) {
        /*
            java.lang.String r0 = "secondary-dexes"
            java.util.HashSet r1 = r1.a.f29431a
            monitor-enter(r1)
            boolean r2 = r1.contains(r7)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            return
        Ld:
            r1.add(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "java.vm.version"
            java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch: java.lang.RuntimeException -> L1f java.lang.Throwable -> L6c
            boolean r4 = r3 instanceof dalvik.system.BaseDexClassLoader     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 != 0) goto L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            return
        L24:
            a(r6)     // Catch: java.lang.Throwable -> L27
        L27:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "code_cache"
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6c
            e(r4)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L6c
            goto L3e
        L32:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L6c
            java.io.File r8 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L6c
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6c
            e(r4)     // Catch: java.lang.Throwable -> L6c
        L3e:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r4, r0)     // Catch: java.lang.Throwable -> L6c
            e(r8)     // Catch: java.lang.Throwable -> L6c
            androidx.multidex.MultiDexExtractor r0 = new androidx.multidex.MultiDexExtractor     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r7, r8)     // Catch: java.lang.Throwable -> L6c
            r7 = 0
            java.util.ArrayList r7 = r0.c(r6, r7)     // Catch: java.lang.Throwable -> L54
            d(r8, r3, r7)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            goto L5e
        L54:
            r6 = move-exception
            goto L68
        L56:
            r7 = 1
            java.util.ArrayList r6 = r0.c(r6, r7)     // Catch: java.lang.Throwable -> L54
            d(r8, r3, r6)     // Catch: java.lang.Throwable -> L54
        L5e:
            r0.close()     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L6c
            goto L63
        L62:
            r2 = move-exception
        L63:
            if (r2 != 0) goto L67
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            return
        L67:
            throw r2     // Catch: java.lang.Throwable -> L6c
        L68:
            r0.close()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L6c
        L6b:
            throw r6     // Catch: java.lang.Throwable -> L6c
        L6c:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.a.b(android.content.Context, java.io.File, java.io.File):void");
    }

    public static Field c(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder g10 = b.a.g("Field ", str, " not found in ");
        g10.append(obj.getClass());
        throw new NoSuchFieldException(g10.toString());
    }

    public static void d(File file, ClassLoader classLoader, ArrayList arrayList) {
        IOException[] iOExceptionArr;
        if (!arrayList.isEmpty()) {
            Object obj = c(classLoader, "pathList").get(classLoader);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
                    Field c = c(obj, "dexElements");
                    Object[] objArr2 = (Object[]) c.get(obj);
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                    System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                    System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                    c.set(obj, objArr3);
                    if (arrayList2.size() > 0) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            IOException iOException = (IOException) it.next();
                        }
                        Field c10 = c(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) c10.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                            arrayList2.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        c10.set(obj, iOExceptionArr);
                        IOException iOException2 = new IOException("I/O exception during makeDexElement");
                        iOException2.initCause((Throwable) arrayList2.get(0));
                        throw iOException2;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
        }
    }

    public static void e(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                file.getPath();
            } else {
                file.getPath();
                parentFile.isDirectory();
                parentFile.isFile();
                parentFile.exists();
                parentFile.canRead();
                parentFile.canWrite();
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
