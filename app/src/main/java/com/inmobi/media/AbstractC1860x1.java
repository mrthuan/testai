package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.inmobi.media.x1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1860x1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15618a;

    public AbstractC1860x1(String tableName, String tableSchema) {
        kotlin.jvm.internal.g.e(tableName, "tableName");
        kotlin.jvm.internal.g.e(tableSchema, "tableSchema");
        this.f15618a = tableName;
        try {
            R2.f14604a.a(tableName, tableSchema);
        } catch (Exception unused) {
        }
    }

    public abstract Object a(ContentValues contentValues);

    public final void a(Object obj) {
        try {
            R2.a(this.f15618a, b(obj));
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    public abstract ContentValues b(Object obj);

    public final void b(Object obj, String str, String[] strArr) {
        try {
            R2.b(this.f15618a, b(obj), str, strArr);
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    public final void a(Object obj, String str, String[] strArr) {
        try {
            R2.a(this.f15618a, b(obj), str, strArr);
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    public final Object b(String str, String[] strArr) {
        try {
            List<ContentValues> b10 = R2.b(this.f15618a, null, str, strArr, null, null, null, null);
            if (!b10.isEmpty()) {
                return a(b10.get(0));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList a(AbstractC1860x1 abstractC1860x1, String str, String[] strArr, String str2, String str3, String str4, Integer num, int i10) {
        String str5 = (i10 & 1) != 0 ? null : str;
        String[] strArr2 = (i10 & 2) != 0 ? null : strArr;
        String str6 = (i10 & 4) != 0 ? null : str2;
        String str7 = (i10 & 8) != 0 ? null : str3;
        String str8 = (i10 & 16) != 0 ? null : str4;
        Integer num2 = (i10 & 32) != 0 ? null : num;
        abstractC1860x1.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            List<ContentValues> b10 = R2.b(abstractC1860x1.f15618a, null, str5, strArr2, str6, str7, str8, num2 != null ? num2.toString() : null);
            if (!b10.isEmpty()) {
                for (ContentValues contentValues : b10) {
                    arrayList.add(abstractC1860x1.a(contentValues));
                }
                return arrayList;
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static int a(AbstractC1860x1 abstractC1860x1) {
        abstractC1860x1.getClass();
        try {
            return R2.a(abstractC1860x1.f15618a, null, null, null, null, null, null, null);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int a(String str, String[] strArr) {
        try {
            return R2.a(this.f15618a, str, strArr);
        } catch (Exception unused) {
            return 0;
        }
    }
}
