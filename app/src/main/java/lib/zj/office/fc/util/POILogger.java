package lib.zj.office.fc.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class POILogger {
    public static int DEBUG = 1;
    public static int ERROR = 7;
    public static int FATAL = 9;
    public static int INFO = 3;
    public static int WARN = 5;

    private void commonLogFormatted(int i10, String str, Object[] objArr) {
        if (check(i10)) {
            Object[] flattenArrays = flattenArrays(objArr);
            if (flattenArrays[flattenArrays.length - 1] instanceof Throwable) {
                log(i10, (Object) StringUtil.format(str, flattenArrays), (Throwable) flattenArrays[flattenArrays.length - 1]);
            } else {
                log(i10, StringUtil.format(str, flattenArrays));
            }
        }
    }

    private Object[] flattenArrays(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.addAll(objectToObjectArray(obj));
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private List<Object> objectToObjectArray(Object obj) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (obj instanceof byte[]) {
            for (byte b10 : (byte[]) obj) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            while (i10 < cArr.length) {
                arrayList.add(Character.valueOf(cArr[i10]));
                i10++;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            while (i10 < sArr.length) {
                arrayList.add(Short.valueOf(sArr[i10]));
                i10++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            while (i10 < iArr.length) {
                arrayList.add(Integer.valueOf(iArr[i10]));
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            while (i10 < jArr.length) {
                arrayList.add(Long.valueOf(jArr[i10]));
                i10++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            while (i10 < fArr.length) {
                arrayList.add(new Float(fArr[i10]));
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            while (i10 < dArr.length) {
                arrayList.add(new Double(dArr[i10]));
                i10++;
            }
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            while (i10 < objArr.length) {
                arrayList.add(objArr[i10]);
                i10++;
            }
        } else {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public abstract boolean check(int i10);

    public abstract void initialize(String str);

    public abstract void log(int i10, Object obj);

    public void log(int i10, Object obj, Object obj2) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(32);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            log(i10, stringBuffer);
        }
    }

    public abstract void log(int i10, Object obj, Throwable th2);

    public void logFormatted(int i10, String str, Object obj) {
        commonLogFormatted(i10, str, new Object[]{obj});
    }

    public void logFormatted(int i10, String str, Object obj, Object obj2) {
        commonLogFormatted(i10, str, new Object[]{obj, obj2});
    }

    public void log(int i10, Object obj, Object obj2, Object obj3) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(48);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            log(i10, stringBuffer);
        }
    }

    public void logFormatted(int i10, String str, Object obj, Object obj2, Object obj3) {
        commonLogFormatted(i10, str, new Object[]{obj, obj2, obj3});
    }

    public void logFormatted(int i10, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        commonLogFormatted(i10, str, new Object[]{obj, obj2, obj3, obj4});
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(64);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            log(i10, stringBuffer);
        }
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(80);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            stringBuffer.append(obj5);
            log(i10, stringBuffer);
        }
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(96);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            stringBuffer.append(obj5);
            stringBuffer.append(obj6);
            log(i10, stringBuffer);
        }
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(112);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            stringBuffer.append(obj5);
            stringBuffer.append(obj6);
            stringBuffer.append(obj7);
            log(i10, stringBuffer);
        }
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(128);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            stringBuffer.append(obj5);
            stringBuffer.append(obj6);
            stringBuffer.append(obj7);
            stringBuffer.append(obj8);
            log(i10, stringBuffer);
        }
    }

    public void log(int i10, Throwable th2) {
        log(i10, (Object) null, th2);
    }

    public void log(int i10, Object obj, Object obj2, Throwable th2) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(32);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            log(i10, (Object) stringBuffer, th2);
        }
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Throwable th2) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(48);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            log(i10, (Object) stringBuffer, th2);
        }
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Object obj4, Throwable th2) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(64);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            log(i10, (Object) stringBuffer, th2);
        }
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Throwable th2) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(80);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            stringBuffer.append(obj5);
            log(i10, (Object) stringBuffer, th2);
        }
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Throwable th2) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(96);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            stringBuffer.append(obj5);
            stringBuffer.append(obj6);
            log(i10, (Object) stringBuffer, th2);
        }
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Throwable th2) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(112);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            stringBuffer.append(obj5);
            stringBuffer.append(obj6);
            stringBuffer.append(obj7);
            log(i10, (Object) stringBuffer, th2);
        }
    }

    public void log(int i10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Throwable th2) {
        if (check(i10)) {
            StringBuffer stringBuffer = new StringBuffer(128);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            stringBuffer.append(obj5);
            stringBuffer.append(obj6);
            stringBuffer.append(obj7);
            stringBuffer.append(obj8);
            log(i10, (Object) stringBuffer, th2);
        }
    }
}
