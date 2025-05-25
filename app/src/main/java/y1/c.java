package y1;

import android.database.Cursor;
import androidx.activity.f;
import androidx.activity.r;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f31975a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f31976b;
    public final Set<b> c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f31977d;

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f31978a;

        /* renamed from: b  reason: collision with root package name */
        public final String f31979b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f31980d;

        /* renamed from: e  reason: collision with root package name */
        public final int f31981e;

        /* renamed from: f  reason: collision with root package name */
        public final String f31982f;

        /* renamed from: g  reason: collision with root package name */
        public final int f31983g;

        public a(int i10, String str, int i11, boolean z10, String str2, String str3) {
            this.f31978a = str;
            this.f31979b = str2;
            this.f31980d = z10;
            this.f31981e = i10;
            int i12 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i12 = 3;
                } else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                    if (!upperCase.contains("BLOB")) {
                        i12 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                    }
                } else {
                    i12 = 2;
                }
            }
            this.c = i12;
            this.f31982f = str3;
            this.f31983g = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f31981e != aVar.f31981e || !this.f31978a.equals(aVar.f31978a) || this.f31980d != aVar.f31980d) {
                return false;
            }
            String str = this.f31982f;
            int i10 = this.f31983g;
            int i11 = aVar.f31983g;
            String str2 = aVar.f31982f;
            if (i10 == 1 && i11 == 2 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i10 == 2 && i11 == 1 && str2 != null && !str2.equals(str)) {
                return false;
            }
            if ((i10 == 0 || i10 != i11 || (str == null ? str2 == null : str.equals(str2))) && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int hashCode = ((this.f31978a.hashCode() * 31) + this.c) * 31;
            if (this.f31980d) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            return ((hashCode + i10) * 31) + this.f31981e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Column{name='");
            sb2.append(this.f31978a);
            sb2.append("', type='");
            sb2.append(this.f31979b);
            sb2.append("', affinity='");
            sb2.append(this.c);
            sb2.append("', notNull=");
            sb2.append(this.f31980d);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f31981e);
            sb2.append(", defaultValue='");
            return r.g(sb2, this.f31982f, "'}");
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f31984a;

        /* renamed from: b  reason: collision with root package name */
        public final String f31985b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f31986d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f31987e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f31984a = str;
            this.f31985b = str2;
            this.c = str3;
            this.f31986d = Collections.unmodifiableList(list);
            this.f31987e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f31984a.equals(bVar.f31984a) || !this.f31985b.equals(bVar.f31985b) || !this.c.equals(bVar.c) || !this.f31986d.equals(bVar.f31986d)) {
                return false;
            }
            return this.f31987e.equals(bVar.f31987e);
        }

        public final int hashCode() {
            int h10 = f.h(this.c, f.h(this.f31985b, this.f31984a.hashCode() * 31, 31), 31);
            return this.f31987e.hashCode() + ((this.f31986d.hashCode() + h10) * 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f31984a + "', onDelete='" + this.f31985b + "', onUpdate='" + this.c + "', columnNames=" + this.f31986d + ", referenceColumnNames=" + this.f31987e + '}';
        }
    }

    /* compiled from: TableInfo.java */
    /* renamed from: y1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0412c implements Comparable<C0412c> {

        /* renamed from: a  reason: collision with root package name */
        public final int f31988a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31989b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final String f31990d;

        public C0412c(int i10, int i11, String str, String str2) {
            this.f31988a = i10;
            this.f31989b = i11;
            this.c = str;
            this.f31990d = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(C0412c c0412c) {
            C0412c c0412c2 = c0412c;
            int i10 = this.f31988a - c0412c2.f31988a;
            if (i10 == 0) {
                return this.f31989b - c0412c2.f31989b;
            }
            return i10;
        }
    }

    /* compiled from: TableInfo.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f31991a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f31992b;
        public final List<String> c;

        public d(String str, List list, boolean z10) {
            this.f31991a = str;
            this.f31992b = z10;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f31992b != dVar.f31992b || !this.c.equals(dVar.c)) {
                return false;
            }
            String str = this.f31991a;
            boolean startsWith = str.startsWith("index_");
            String str2 = dVar.f31991a;
            if (startsWith) {
                return str2.startsWith("index_");
            }
            return str.equals(str2);
        }

        public final int hashCode() {
            int hashCode;
            String str = this.f31991a;
            if (str.startsWith("index_")) {
                hashCode = -1184239155;
            } else {
                hashCode = str.hashCode();
            }
            return this.c.hashCode() + (((hashCode * 31) + (this.f31992b ? 1 : 0)) * 31);
        }

        public final String toString() {
            return "Index{name='" + this.f31991a + "', unique=" + this.f31992b + ", columns=" + this.c + '}';
        }
    }

    public c(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        Set<d> unmodifiableSet;
        this.f31975a = str;
        this.f31976b = Collections.unmodifiableMap(hashMap);
        this.c = Collections.unmodifiableSet(hashSet);
        if (hashSet2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(hashSet2);
        }
        this.f31977d = unmodifiableSet;
    }

    public static c a(b2.a aVar, String str) {
        HashSet hashSet;
        boolean z10;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        boolean z11;
        Cursor f10 = aVar.f("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (f10.getColumnCount() > 0) {
                int columnIndex = f10.getColumnIndex(NamingTable.TAG);
                int columnIndex2 = f10.getColumnIndex("type");
                int columnIndex3 = f10.getColumnIndex("notnull");
                int columnIndex4 = f10.getColumnIndex("pk");
                int columnIndex5 = f10.getColumnIndex("dflt_value");
                while (f10.moveToNext()) {
                    String string = f10.getString(columnIndex);
                    String string2 = f10.getString(columnIndex2);
                    if (f10.getInt(columnIndex3) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hashMap.put(string, new a(f10.getInt(columnIndex4), string, 2, z11, string2, f10.getString(columnIndex5)));
                }
            }
            f10.close();
            HashSet hashSet2 = new HashSet();
            f10 = aVar.f("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = f10.getColumnIndex(FacebookMediationAdapter.KEY_ID);
                int columnIndex7 = f10.getColumnIndex("seq");
                int columnIndex8 = f10.getColumnIndex("table");
                int columnIndex9 = f10.getColumnIndex("on_delete");
                int columnIndex10 = f10.getColumnIndex("on_update");
                ArrayList b10 = b(f10);
                int count = f10.getCount();
                int i13 = 0;
                while (i13 < count) {
                    f10.moveToPosition(i13);
                    if (f10.getInt(columnIndex7) != 0) {
                        i10 = columnIndex6;
                        i11 = columnIndex7;
                        arrayList = b10;
                        i12 = count;
                    } else {
                        int i14 = f10.getInt(columnIndex6);
                        i10 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i11 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b10.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b10;
                            C0412c c0412c = (C0412c) it.next();
                            int i15 = count;
                            if (c0412c.f31988a == i14) {
                                arrayList2.add(c0412c.c);
                                arrayList3.add(c0412c.f31990d);
                            }
                            b10 = arrayList4;
                            count = i15;
                        }
                        arrayList = b10;
                        i12 = count;
                        hashSet2.add(new b(f10.getString(columnIndex8), f10.getString(columnIndex9), f10.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i13++;
                    columnIndex6 = i10;
                    columnIndex7 = i11;
                    b10 = arrayList;
                    count = i12;
                }
                f10.close();
                f10 = aVar.f("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = f10.getColumnIndex(NamingTable.TAG);
                    int columnIndex12 = f10.getColumnIndex("origin");
                    int columnIndex13 = f10.getColumnIndex("unique");
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        hashSet = new HashSet();
                        while (f10.moveToNext()) {
                            if ("c".equals(f10.getString(columnIndex12))) {
                                String string3 = f10.getString(columnIndex11);
                                if (f10.getInt(columnIndex13) == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                d c = c(aVar, string3, z10);
                                if (c != null) {
                                    hashSet.add(c);
                                }
                            }
                        }
                        return new c(str, hashMap, hashSet2, hashSet);
                    }
                    f10.close();
                    hashSet = null;
                    return new c(str, hashMap, hashSet2, hashSet);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(FacebookMediationAdapter.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new C0412c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(b2.a aVar, String str, boolean z10) {
        Cursor f10 = aVar.f("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = f10.getColumnIndex("seqno");
            int columnIndex2 = f10.getColumnIndex("cid");
            int columnIndex3 = f10.getColumnIndex(NamingTable.TAG);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (f10.moveToNext()) {
                    if (f10.getInt(columnIndex2) >= 0) {
                        int i10 = f10.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i10), f10.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, arrayList, z10);
            }
            f10.close();
            return null;
        } finally {
            f10.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = cVar.f31975a;
        String str2 = this.f31975a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map<String, a> map = cVar.f31976b;
        Map<String, a> map2 = this.f31976b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set<b> set2 = cVar.c;
        Set<b> set3 = this.c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set<d> set4 = this.f31977d;
        if (set4 == null || (set = cVar.f31977d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f31975a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Map<String, a> map = this.f31976b;
        if (map != null) {
            i11 = map.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Set<b> set = this.c;
        if (set != null) {
            i12 = set.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "TableInfo{name='" + this.f31975a + "', columns=" + this.f31976b + ", foreignKeys=" + this.c + ", indices=" + this.f31977d + '}';
    }
}
