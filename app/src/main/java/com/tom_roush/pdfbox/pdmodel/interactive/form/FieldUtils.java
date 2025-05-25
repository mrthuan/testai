package com.tom_roush.pdfbox.pdmodel.interactive.form;

import androidx.activity.r;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSString;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class FieldUtils {

    /* loaded from: classes2.dex */
    public static class KeyValue {
        private final String key;
        private final String value;

        public KeyValue(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(this.key);
            sb2.append(", ");
            return r.g(sb2, this.value, ")");
        }
    }

    /* loaded from: classes2.dex */
    public static class KeyValueKeyComparator implements Serializable, Comparator<KeyValue> {
        private static final long serialVersionUID = 6715364290007167694L;

        @Override // java.util.Comparator
        public int compare(KeyValue keyValue, KeyValue keyValue2) {
            return keyValue.key.compareTo(keyValue2.key);
        }
    }

    /* loaded from: classes2.dex */
    public static class KeyValueValueComparator implements Serializable, Comparator<KeyValue> {
        private static final long serialVersionUID = -3984095679894798265L;

        @Override // java.util.Comparator
        public int compare(KeyValue keyValue, KeyValue keyValue2) {
            return keyValue.value.compareTo(keyValue2.value);
        }
    }

    private FieldUtils() {
    }

    public static List<String> getPairableItems(COSBase cOSBase, int i10) {
        if (i10 >= 0 && i10 <= 1) {
            if (cOSBase instanceof COSString) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(((COSString) cOSBase).getString());
                return arrayList;
            } else if (cOSBase instanceof COSArray) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<COSBase> it = ((COSArray) cOSBase).iterator();
                while (it.hasNext()) {
                    COSBase next = it.next();
                    if (next instanceof COSString) {
                        arrayList2.add(((COSString) next).getString());
                    } else if (next instanceof COSArray) {
                        COSArray cOSArray = (COSArray) next;
                        if (cOSArray.size() >= i10 + 1 && (cOSArray.get(i10) instanceof COSString)) {
                            arrayList2.add(((COSString) cOSArray.get(i10)).getString());
                        }
                    }
                }
                return arrayList2;
            } else {
                return Collections.emptyList();
            }
        }
        throw new IllegalArgumentException("Only 0 and 1 are allowed as an index into two-element arrays");
    }

    public static void sortByKey(List<KeyValue> list) {
        Collections.sort(list, new KeyValueKeyComparator());
    }

    public static void sortByValue(List<KeyValue> list) {
        Collections.sort(list, new KeyValueValueComparator());
    }

    public static List<KeyValue> toKeyValueList(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(new KeyValue(list.get(i10), list2.get(i10)));
        }
        return arrayList;
    }
}
