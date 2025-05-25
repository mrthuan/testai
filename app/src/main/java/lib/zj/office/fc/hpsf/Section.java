package lib.zj.office.fc.hpsf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class Section {
    protected Map<Long, String> dictionary;
    protected ClassID formatID;
    protected long offset;
    protected Property[] properties;
    protected int size;
    private boolean wasNull;

    /* loaded from: classes3.dex */
    public class PropertyListEntry implements Comparable<PropertyListEntry> {

        /* renamed from: id  reason: collision with root package name */
        int f20662id;
        int length;
        int offset;

        public PropertyListEntry() {
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getClass().getName());
            stringBuffer.append("[id=");
            stringBuffer.append(this.f20662id);
            stringBuffer.append(", offset=");
            stringBuffer.append(this.offset);
            stringBuffer.append(", length=");
            stringBuffer.append(this.length);
            stringBuffer.append(']');
            return stringBuffer.toString();
        }

        @Override // java.lang.Comparable
        public int compareTo(PropertyListEntry propertyListEntry) {
            int i10 = propertyListEntry.offset;
            int i11 = this.offset;
            if (i11 < i10) {
                return -1;
            }
            return i11 == i10 ? 0 : 1;
        }
    }

    public Section() {
    }

    public Section(byte[] bArr, int i10) {
        int i11;
        PropertyListEntry propertyListEntry;
        PropertyListEntry propertyListEntry2;
        this.formatID = new ClassID(bArr, i10);
        long uInt = LittleEndian.getUInt(bArr, i10 + 16);
        this.offset = uInt;
        int i12 = (int) uInt;
        this.size = (int) LittleEndian.getUInt(bArr, i12);
        int i13 = i12 + 4;
        int uInt2 = (int) LittleEndian.getUInt(bArr, i13);
        int i14 = i13 + 4;
        this.properties = new Property[uInt2];
        ArrayList arrayList = new ArrayList(uInt2);
        int i15 = 0;
        for (int i16 = 0; i16 < this.properties.length; i16++) {
            PropertyListEntry propertyListEntry3 = new PropertyListEntry();
            propertyListEntry3.f20662id = (int) LittleEndian.getUInt(bArr, i14);
            int i17 = i14 + 4;
            propertyListEntry3.offset = (int) LittleEndian.getUInt(bArr, i17);
            i14 = i17 + 4;
            arrayList.add(propertyListEntry3);
        }
        Collections.sort(arrayList);
        int i18 = 0;
        while (true) {
            i11 = uInt2 - 1;
            if (i18 >= i11) {
                break;
            }
            PropertyListEntry propertyListEntry4 = (PropertyListEntry) arrayList.get(i18);
            i18++;
            propertyListEntry4.length = ((PropertyListEntry) arrayList.get(i18)).offset - propertyListEntry4.offset;
        }
        if (uInt2 > 0) {
            PropertyListEntry propertyListEntry5 = (PropertyListEntry) arrayList.get(i11);
            propertyListEntry5.length = this.size - propertyListEntry5.offset;
        }
        Iterator it = arrayList.iterator();
        int i19 = -1;
        while (i19 == -1 && it.hasNext()) {
            if (((PropertyListEntry) it.next()).f20662id == 1) {
                int i20 = (int) (this.offset + propertyListEntry2.offset);
                long uInt3 = LittleEndian.getUInt(bArr, i20);
                int i21 = i20 + 4;
                if (uInt3 == 2) {
                    i19 = LittleEndian.getUShort(bArr, i21);
                } else {
                    throw new HPSFRuntimeException("Value type of property ID 1 is not VT_I2 but " + uInt3 + ".");
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Property property = new Property(propertyListEntry.f20662id, bArr, this.offset + propertyListEntry.offset, ((PropertyListEntry) it2.next()).length, i19);
            if (property.getID() == 1) {
                property = new Property(property.getID(), property.getType(), Integer.valueOf(i19));
            }
            this.properties[i15] = property;
            i15++;
        }
        this.dictionary = (Map) getProperty(0L);
    }

    private Property[] remove(Property[] propertyArr, int i10) {
        int length = propertyArr.length - 1;
        Property[] propertyArr2 = new Property[length];
        if (i10 > 0) {
            System.arraycopy(propertyArr, 0, propertyArr2, 0, i10);
        }
        System.arraycopy(propertyArr, i10 + 1, propertyArr2, i10, length - i10);
        return propertyArr2;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (obj != null && (obj instanceof Section)) {
            Section section = (Section) obj;
            if (!section.getFormatID().equals(getFormatID())) {
                return false;
            }
            int length = getProperties().length;
            Property[] propertyArr = new Property[length];
            int length2 = section.getProperties().length;
            Property[] propertyArr2 = new Property[length2];
            System.arraycopy(getProperties(), 0, propertyArr, 0, length);
            System.arraycopy(section.getProperties(), 0, propertyArr2, 0, length2);
            Property property = null;
            Property property2 = null;
            int i10 = 0;
            while (true) {
                z10 = true;
                if (i10 >= propertyArr.length) {
                    break;
                }
                long id2 = propertyArr[i10].getID();
                if (id2 == 0) {
                    property2 = propertyArr[i10];
                    propertyArr = remove(propertyArr, i10);
                    i10--;
                }
                if (id2 == 1) {
                    propertyArr = remove(propertyArr, i10);
                    i10--;
                }
                i10++;
            }
            int i11 = 0;
            while (i11 < propertyArr2.length) {
                long id3 = propertyArr2[i11].getID();
                if (id3 == 0) {
                    property = propertyArr2[i11];
                    propertyArr2 = remove(propertyArr2, i11);
                    i11--;
                }
                if (id3 == 1) {
                    propertyArr2 = remove(propertyArr2, i11);
                    i11--;
                }
                i11++;
            }
            if (propertyArr.length != propertyArr2.length) {
                return false;
            }
            if (property2 != null && property != null) {
                z10 = property2.getValue().equals(property.getValue());
            } else if (property2 != null || property != null) {
                z10 = false;
            }
            if (z10) {
                return Util.equals(propertyArr, propertyArr2);
            }
        }
        return false;
    }

    public int getCodepage() {
        Integer num = (Integer) getProperty(1L);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public Map<Long, String> getDictionary() {
        return this.dictionary;
    }

    public ClassID getFormatID() {
        return this.formatID;
    }

    public long getOffset() {
        return this.offset;
    }

    public String getPIDString(long j10) {
        String str;
        Map<Long, String> map = this.dictionary;
        if (map != null) {
            str = map.get(Long.valueOf(j10));
        } else {
            str = null;
        }
        if (str == null) {
            str = SectionIDMap.getPIDString(getFormatID().getBytes(), j10);
        }
        if (str == null) {
            return SectionIDMap.UNDEFINED;
        }
        return str;
    }

    public Property[] getProperties() {
        return this.properties;
    }

    public Object getProperty(long j10) {
        int i10 = 0;
        this.wasNull = false;
        while (true) {
            Property[] propertyArr = this.properties;
            if (i10 < propertyArr.length) {
                if (j10 == propertyArr[i10].getID()) {
                    return this.properties[i10].getValue();
                }
                i10++;
            } else {
                this.wasNull = true;
                return null;
            }
        }
    }

    public boolean getPropertyBooleanValue(int i10) {
        Boolean bool = (Boolean) getProperty(i10);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public int getPropertyCount() {
        return this.properties.length;
    }

    public int getPropertyIntValue(long j10) {
        Object property = getProperty(j10);
        if (property == null) {
            return 0;
        }
        if (!(property instanceof Long) && !(property instanceof Integer)) {
            throw new HPSFRuntimeException("This property is not an integer type, but " + property.getClass().getName() + ".");
        }
        return ((Number) property).intValue();
    }

    public int getSize() {
        return this.size;
    }

    public int hashCode() {
        long hashCode = getFormatID().hashCode() + 0;
        for (Property property : getProperties()) {
            hashCode += property.hashCode();
        }
        return (int) (hashCode & 4294967295L);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Property[] properties = getProperties();
        stringBuffer.append(getClass().getName());
        stringBuffer.append("[formatID: ");
        stringBuffer.append(getFormatID());
        stringBuffer.append(", offset: ");
        stringBuffer.append(getOffset());
        stringBuffer.append(", propertyCount: ");
        stringBuffer.append(getPropertyCount());
        stringBuffer.append(", size: ");
        stringBuffer.append(getSize());
        stringBuffer.append(", properties: [\n");
        for (Property property : properties) {
            stringBuffer.append(property.toString());
            stringBuffer.append(",\n");
        }
        stringBuffer.append("]]");
        return stringBuffer.toString();
    }

    public boolean wasNull() {
        return this.wasNull;
    }
}
