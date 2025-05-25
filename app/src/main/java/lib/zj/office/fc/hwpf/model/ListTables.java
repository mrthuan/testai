package lib.zj.office.fc.hwpf.model;

import androidx.appcompat.view.menu.d;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

@Internal
/* loaded from: classes3.dex */
public final class ListTables {
    private static final int LIST_DATA_SIZE = 28;
    private static final int LIST_FORMAT_OVERRIDE_SIZE = 16;
    private static POILogger log = POILogFactory.getLogger(ListTables.class);
    ListMap _listMap = new ListMap(0);
    ArrayList<ListFormatOverride> _overrideList = new ArrayList<>();

    /* loaded from: classes3.dex */
    public static class ListMap implements Map<Integer, POIListData> {
        private ArrayList<Integer> keyList;
        private HashMap<Integer, POIListData> parent;

        public /* synthetic */ ListMap(int i10) {
            this();
        }

        @Override // java.util.Map
        public void clear() {
            this.keyList.clear();
            this.parent.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.parent.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.parent.containsValue(obj);
        }

        @Override // java.util.Map
        public Set<Map.Entry<Integer, POIListData>> entrySet() {
            throw new IllegalStateException("Use sortedKeys() + get() instead");
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.parent.isEmpty();
        }

        @Override // java.util.Map
        public Set<Integer> keySet() {
            throw new IllegalStateException("Use sortedKeys() instead");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends Integer, ? extends POIListData> map) {
            for (Map.Entry<? extends Integer, ? extends POIListData> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // java.util.Map
        public int size() {
            return this.parent.size();
        }

        public List<Integer> sortedKeys() {
            return Collections.unmodifiableList(this.keyList);
        }

        @Override // java.util.Map
        public Collection<POIListData> values() {
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = this.keyList.iterator();
            while (it.hasNext()) {
                arrayList.add(this.parent.get(it.next()));
            }
            return arrayList;
        }

        private ListMap() {
            this.keyList = new ArrayList<>();
            this.parent = new HashMap<>();
        }

        @Override // java.util.Map
        public POIListData get(Object obj) {
            return this.parent.get(obj);
        }

        @Override // java.util.Map
        public POIListData put(Integer num, POIListData pOIListData) {
            this.keyList.add(num);
            return this.parent.put(num, pOIListData);
        }

        @Override // java.util.Map
        public POIListData remove(Object obj) {
            this.keyList.remove(obj);
            return this.parent.remove(obj);
        }
    }

    public ListTables() {
    }

    public int addList(POIListData pOIListData, ListFormatOverride listFormatOverride) {
        int lsid = pOIListData.getLsid();
        while (this._listMap.get((Object) Integer.valueOf(lsid)) != null) {
            lsid = pOIListData.resetListID();
            listFormatOverride.setLsid(lsid);
        }
        this._listMap.put(Integer.valueOf(lsid), pOIListData);
        this._overrideList.add(listFormatOverride);
        return lsid;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        ListTables listTables = (ListTables) obj;
        if (this._listMap.size() == listTables._listMap.size()) {
            for (Integer num : this._listMap.keySet()) {
                if (!this._listMap.get((Object) num).equals(listTables._listMap.get((Object) num))) {
                    return false;
                }
            }
            int size = this._overrideList.size();
            if (size == listTables._overrideList.size()) {
                for (int i10 = 0; i10 < size; i10++) {
                    if (!this._overrideList.get(i10).equals(listTables._overrideList.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public POIListLevel getLevel(int i10, int i11) {
        POIListData pOIListData = this._listMap.get((Object) Integer.valueOf(i10));
        if (i11 < pOIListData.numLevels()) {
            return pOIListData.getLevels()[i11];
        }
        POILogger pOILogger = log;
        int i12 = POILogger.WARN;
        StringBuilder e10 = d.e("Requested level ", i11, " which was greater than the maximum defined (");
        e10.append(pOIListData.numLevels());
        e10.append(")");
        pOILogger.log(i12, e10.toString());
        return null;
    }

    public POIListData getListData(int i10) {
        return this._listMap.get((Object) Integer.valueOf(i10));
    }

    public ListFormatOverride getOverride(int i10) {
        if (this._overrideList.size() >= i10) {
            return this._overrideList.get(i10 - 1);
        }
        return null;
    }

    public int getOverrideCount() {
        return this._overrideList.size();
    }

    public int getOverrideIndexFromListID(int i10) {
        int i11;
        int size = this._overrideList.size();
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                if (this._overrideList.get(i12).getLsid() == i10) {
                    i11 = i12 + 1;
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 != -1) {
            return i11;
        }
        throw new NoSuchElementException("No list found with the specified ID");
    }

    public void writeListDataTo(HWPFOutputStream hWPFOutputStream) {
        int size = this._listMap.size();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2];
        LittleEndian.putShort(bArr, (short) size);
        hWPFOutputStream.write(bArr);
        for (Integer num : this._listMap.sortedKeys()) {
            POIListData pOIListData = this._listMap.get((Object) num);
            hWPFOutputStream.write(pOIListData.toByteArray());
            for (POIListLevel pOIListLevel : pOIListData.getLevels()) {
                byteArrayOutputStream.write(pOIListLevel.toByteArray());
            }
        }
        hWPFOutputStream.write(byteArrayOutputStream.toByteArray());
    }

    public void writeListOverridesTo(HWPFOutputStream hWPFOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int size = this._overrideList.size();
        byte[] bArr = new byte[4];
        LittleEndian.putInt(bArr, size);
        hWPFOutputStream.write(bArr);
        for (int i10 = 0; i10 < size; i10++) {
            ListFormatOverride listFormatOverride = this._overrideList.get(i10);
            hWPFOutputStream.write(listFormatOverride.toByteArray());
            for (ListFormatOverrideLevel listFormatOverrideLevel : listFormatOverride.getLevelOverrides()) {
                byteArrayOutputStream.write(listFormatOverrideLevel.toByteArray());
            }
        }
        hWPFOutputStream.write(byteArrayOutputStream.toByteArray());
    }

    public ListTables(byte[] bArr, int i10, int i11) {
        short s4 = LittleEndian.getShort(bArr, i10);
        int i12 = i10 + 2;
        int i13 = (s4 * 28) + i12;
        for (int i14 = 0; i14 < s4; i14++) {
            POIListData pOIListData = new POIListData(bArr, i12);
            this._listMap.put(Integer.valueOf(pOIListData.getLsid()), pOIListData);
            i12 += 28;
            int numLevels = pOIListData.numLevels();
            for (int i15 = 0; i15 < numLevels; i15++) {
                POIListLevel pOIListLevel = new POIListLevel(bArr, i13);
                pOIListData.setLevel(i15, pOIListLevel);
                i13 += pOIListLevel.getSizeInBytes();
            }
        }
        int i16 = LittleEndian.getInt(bArr, i11);
        int i17 = i11 + 4;
        int i18 = (i16 * 16) + i17;
        for (int i19 = 0; i19 < i16; i19++) {
            ListFormatOverride listFormatOverride = new ListFormatOverride(bArr, i17);
            i17 += 16;
            int numOverrides = listFormatOverride.numOverrides();
            for (int i20 = 0; i20 < numOverrides; i20++) {
                while (i18 < bArr.length && bArr[i18] == -1) {
                    i18++;
                }
                if (i18 < bArr.length) {
                    ListFormatOverrideLevel listFormatOverrideLevel = new ListFormatOverrideLevel(bArr, i18);
                    listFormatOverride.setOverride(i20, listFormatOverrideLevel);
                    i18 = listFormatOverrideLevel.getSizeInBytes() + i18;
                }
            }
            this._overrideList.add(listFormatOverride);
        }
    }
}
