package lib.zj.office.fc.hpsf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.ListIterator;
import lib.zj.office.fc.poifs.filesystem.DirectoryEntry;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class MutablePropertySet extends PropertySet {
    private final int OFFSET_HEADER;

    public MutablePropertySet() {
        byte[] bArr = PropertySet.BYTE_ORDER_ASSERTION;
        int length = bArr.length;
        byte[] bArr2 = PropertySet.FORMAT_ASSERTION;
        this.OFFSET_HEADER = length + bArr2.length + 4 + 16 + 4;
        this.byteOrder = LittleEndian.getUShort(bArr);
        this.format = LittleEndian.getUShort(bArr2);
        this.osVersion = 133636;
        this.classID = new ClassID();
        LinkedList linkedList = new LinkedList();
        this.sections = linkedList;
        linkedList.add(new MutableSection());
    }

    public void addSection(Section section) {
        if (this.sections == null) {
            this.sections = new LinkedList();
        }
        this.sections.add(section);
    }

    public void clearSections() {
        this.sections = null;
    }

    public void setByteOrder(int i10) {
        this.byteOrder = i10;
    }

    public void setClassID(ClassID classID) {
        this.classID = classID;
    }

    public void setFormat(int i10) {
        this.format = i10;
    }

    public void setOSVersion(int i10) {
        this.osVersion = i10;
    }

    public InputStream toInputStream() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        write(byteArrayOutputStream);
        byteArrayOutputStream.close();
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    public void write(OutputStream outputStream) {
        int size = this.sections.size();
        TypeWriter.writeToStream(outputStream, (short) getByteOrder());
        TypeWriter.writeToStream(outputStream, (short) getFormat());
        TypeWriter.writeToStream(outputStream, getOSVersion());
        TypeWriter.writeToStream(outputStream, getClassID());
        TypeWriter.writeToStream(outputStream, size);
        int i10 = (size * 20) + this.OFFSET_HEADER;
        ListIterator listIterator = this.sections.listIterator();
        while (listIterator.hasNext()) {
            MutableSection mutableSection = (MutableSection) listIterator.next();
            if (mutableSection.getFormatID() != null) {
                TypeWriter.writeToStream(outputStream, mutableSection.getFormatID());
                TypeWriter.writeUIntToStream(outputStream, i10);
                try {
                    i10 += mutableSection.getSize();
                } catch (HPSFRuntimeException e10) {
                    Throwable reason = e10.getReason();
                    if (reason instanceof UnsupportedEncodingException) {
                        throw new IllegalPropertySetDataException(reason);
                    }
                    throw e10;
                }
            } else {
                throw new NoFormatIDException();
            }
        }
        ListIterator listIterator2 = this.sections.listIterator();
        while (listIterator2.hasNext()) {
            ((MutableSection) listIterator2.next()).write(outputStream);
        }
    }

    public MutablePropertySet(PropertySet propertySet) {
        this.OFFSET_HEADER = PropertySet.BYTE_ORDER_ASSERTION.length + PropertySet.FORMAT_ASSERTION.length + 4 + 16 + 4;
        this.byteOrder = propertySet.getByteOrder();
        this.format = propertySet.getFormat();
        this.osVersion = propertySet.getOSVersion();
        setClassID(propertySet.getClassID());
        clearSections();
        if (this.sections == null) {
            this.sections = new LinkedList();
        }
        for (Section section : propertySet.getSections()) {
            addSection(new MutableSection(section));
        }
    }

    public void write(DirectoryEntry directoryEntry, String str) {
        try {
            directoryEntry.getEntry(str).delete();
        } catch (FileNotFoundException unused) {
        }
        directoryEntry.createDocument(str, toInputStream());
    }
}
