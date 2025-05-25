package lib.zj.office.fc.ddf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public abstract class AbstractEscherOptRecord extends EscherRecord {
    protected List<EscherProperty> properties = new ArrayList();

    private int getPropertiesSize() {
        int i10 = 0;
        for (EscherProperty escherProperty : this.properties) {
            i10 += escherProperty.getPropertySize();
        }
        return i10;
    }

    public void addEscherProperty(EscherProperty escherProperty) {
        this.properties.add(escherProperty);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        this.properties = new EscherPropertyFactory().createProperties(bArr, i10 + 8, getInstance());
        return readHeader + 8;
    }

    public List<EscherProperty> getEscherProperties() {
        return this.properties;
    }

    public EscherProperty getEscherProperty(int i10) {
        return this.properties.get(i10);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return getPropertiesSize() + 8;
    }

    public <T extends EscherProperty> T lookup(int i10) {
        Iterator<EscherProperty> it = this.properties.iterator();
        while (it.hasNext()) {
            T t4 = (T) it.next();
            if (t4.getPropertyNumber() == i10) {
                return t4;
            }
        }
        return null;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        LittleEndian.putInt(bArr, i10 + 4, getPropertiesSize());
        int i11 = i10 + 8;
        for (EscherProperty escherProperty : this.properties) {
            i11 += escherProperty.serializeSimplePart(bArr, i11);
        }
        for (EscherProperty escherProperty2 : this.properties) {
            i11 += escherProperty2.serializeComplexPart(bArr, i11);
        }
        int i12 = i11 - i10;
        escherSerializationListener.afterRecordSerialize(i11, getRecordId(), i12, this);
        return i12;
    }

    public void sortProperties() {
        Collections.sort(this.properties, new Comparator<EscherProperty>() { // from class: lib.zj.office.fc.ddf.AbstractEscherOptRecord.1
            @Override // java.util.Comparator
            public int compare(EscherProperty escherProperty, EscherProperty escherProperty2) {
                short propertyNumber = escherProperty.getPropertyNumber();
                short propertyNumber2 = escherProperty2.getPropertyNumber();
                if (propertyNumber < propertyNumber2) {
                    return -1;
                }
                return propertyNumber == propertyNumber2 ? 0 : 1;
            }
        });
    }

    public String toString() {
        String property = System.getProperty("line.separator");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(":");
        sb2.append(property);
        sb2.append("  isContainer: ");
        sb2.append(isContainerRecord());
        sb2.append(property);
        sb2.append("  options: 0x");
        sb2.append(HexDump.toHex(getOptions()));
        sb2.append(property);
        sb2.append("  recordId: 0x");
        sb2.append(HexDump.toHex(getRecordId()));
        sb2.append(property);
        sb2.append("  numchildren: ");
        sb2.append(getChildRecords().size());
        sb2.append(property);
        sb2.append("  properties:");
        sb2.append(property);
        Iterator<EscherProperty> it = this.properties.iterator();
        while (it.hasNext()) {
            sb2.append("    " + it.next().toString() + property);
        }
        return sb2.toString();
    }
}
