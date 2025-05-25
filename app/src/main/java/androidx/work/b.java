package androidx.work;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o2.h;

/* compiled from: Data.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f4909b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4910a;

    /* compiled from: Data.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f4911a = new HashMap();

        public final void a(HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                HashMap hashMap2 = this.f4911a;
                if (value == null) {
                    hashMap2.put(str, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                        int i10 = 0;
                        if (cls == boolean[].class) {
                            boolean[] zArr = (boolean[]) value;
                            b bVar = b.f4909b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i10 < zArr.length) {
                                boolArr[i10] = Boolean.valueOf(zArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            byte[] bArr = (byte[]) value;
                            b bVar2 = b.f4909b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i10 < bArr.length) {
                                bArr2[i10] = Byte.valueOf(bArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, bArr2);
                        } else if (cls == int[].class) {
                            int[] iArr = (int[]) value;
                            b bVar3 = b.f4909b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i10 < iArr.length) {
                                numArr[i10] = Integer.valueOf(iArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, numArr);
                        } else if (cls == long[].class) {
                            long[] jArr = (long[]) value;
                            b bVar4 = b.f4909b;
                            Long[] lArr = new Long[jArr.length];
                            while (i10 < jArr.length) {
                                lArr[i10] = Long.valueOf(jArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, lArr);
                        } else if (cls == float[].class) {
                            float[] fArr = (float[]) value;
                            b bVar5 = b.f4909b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i10 < fArr.length) {
                                fArr2[i10] = Float.valueOf(fArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, fArr2);
                        } else if (cls == double[].class) {
                            double[] dArr = (double[]) value;
                            b bVar6 = b.f4909b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i10 < dArr.length) {
                                dArr2[i10] = Double.valueOf(dArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                        }
                    } else {
                        hashMap2.put(str, value);
                    }
                }
            }
        }
    }

    static {
        h.e("Data");
        b bVar = new b(new HashMap());
        c(bVar);
        f4909b = bVar;
    }

    public b() {
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0042 -> B:34:0x0042). Please submit an issue!!! */
    public static b a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        if (bArr.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException | ClassNotFoundException unused) {
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    objectInputStream.close();
                } catch (IOException | ClassNotFoundException unused2) {
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                    return new b(hashMap);
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused4) {
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException unused6) {
            }
            return new b(hashMap);
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public static byte[] c(b bVar) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(bVar.f4910a.size());
                    for (Map.Entry entry : bVar.f4910a.entrySet()) {
                        objectOutputStream.writeUTF((String) entry.getKey());
                        objectOutputStream.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream.close();
                    } catch (IOException unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException unused3) {
                    objectOutputStream2 = objectOutputStream;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused5) {
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused7) {
                    }
                    throw th;
                }
            } catch (IOException unused8) {
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
        }
    }

    public final String b(String str) {
        Object obj = this.f4910a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        HashMap hashMap = this.f4910a;
        Set<String> keySet = hashMap.keySet();
        if (!keySet.equals(bVar.f4910a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = hashMap.get(str);
            Object obj3 = bVar.f4910a.get(str);
            if (obj2 != null && obj3 != null) {
                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z10 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z10 = obj2.equals(obj3);
                    continue;
                }
            } else if (obj2 == obj3) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f4910a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap hashMap = this.f4910a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public b(b bVar) {
        this.f4910a = new HashMap(bVar.f4910a);
    }

    public b(HashMap hashMap) {
        this.f4910a = new HashMap(hashMap);
    }
}
