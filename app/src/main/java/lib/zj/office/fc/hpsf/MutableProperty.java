package lib.zj.office.fc.hpsf;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public class MutableProperty extends Property {
    public MutableProperty() {
    }

    public void setID(long j10) {
        this.f20661id = j10;
    }

    public void setType(long j10) {
        this.type = j10;
    }

    public void setValue(Object obj) {
        this.value = obj;
    }

    public int write(OutputStream outputStream, int i10) {
        long type = getType();
        if (i10 == 1200 && type == 30) {
            type = 31;
        }
        return VariantSupport.write(outputStream, type, getValue(), i10) + TypeWriter.writeUIntToStream(outputStream, type) + 0;
    }

    public MutableProperty(Property property) {
        setID(property.getID());
        setType(property.getType());
        setValue(property.getValue());
    }
}
