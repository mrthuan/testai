package lib.zj.office.fc.hpsf;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import lib.zj.office.fc.poifs.filesystem.DirectoryEntry;

/* loaded from: classes3.dex */
public abstract class SpecialPropertySet extends MutablePropertySet {
    private MutablePropertySet delegate;

    public SpecialPropertySet(PropertySet propertySet) {
        this.delegate = new MutablePropertySet(propertySet);
    }

    @Override // lib.zj.office.fc.hpsf.MutablePropertySet
    public void addSection(Section section) {
        this.delegate.addSection(section);
    }

    @Override // lib.zj.office.fc.hpsf.MutablePropertySet
    public void clearSections() {
        this.delegate.clearSections();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public boolean equals(Object obj) {
        return this.delegate.equals(obj);
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public int getByteOrder() {
        return this.delegate.getByteOrder();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public ClassID getClassID() {
        return this.delegate.getClassID();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public Section getFirstSection() {
        return this.delegate.getFirstSection();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public int getFormat() {
        return this.delegate.getFormat();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public int getOSVersion() {
        return this.delegate.getOSVersion();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public Property[] getProperties() {
        return this.delegate.getProperties();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public Object getProperty(int i10) {
        return this.delegate.getProperty(i10);
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public boolean getPropertyBooleanValue(int i10) {
        return this.delegate.getPropertyBooleanValue(i10);
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public int getPropertyIntValue(int i10) {
        return this.delegate.getPropertyIntValue(i10);
    }

    public abstract PropertyIDMap getPropertySetIDMap();

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public int getSectionCount() {
        return this.delegate.getSectionCount();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public List getSections() {
        return this.delegate.getSections();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public boolean isDocumentSummaryInformation() {
        return this.delegate.isDocumentSummaryInformation();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public boolean isSummaryInformation() {
        return this.delegate.isSummaryInformation();
    }

    @Override // lib.zj.office.fc.hpsf.MutablePropertySet
    public void setByteOrder(int i10) {
        this.delegate.setByteOrder(i10);
    }

    @Override // lib.zj.office.fc.hpsf.MutablePropertySet
    public void setClassID(ClassID classID) {
        this.delegate.setClassID(classID);
    }

    @Override // lib.zj.office.fc.hpsf.MutablePropertySet
    public void setFormat(int i10) {
        this.delegate.setFormat(i10);
    }

    @Override // lib.zj.office.fc.hpsf.MutablePropertySet
    public void setOSVersion(int i10) {
        this.delegate.setOSVersion(i10);
    }

    @Override // lib.zj.office.fc.hpsf.MutablePropertySet
    public InputStream toInputStream() {
        return this.delegate.toInputStream();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public String toString() {
        return this.delegate.toString();
    }

    @Override // lib.zj.office.fc.hpsf.PropertySet
    public boolean wasNull() {
        return this.delegate.wasNull();
    }

    @Override // lib.zj.office.fc.hpsf.MutablePropertySet
    public void write(DirectoryEntry directoryEntry, String str) {
        this.delegate.write(directoryEntry, str);
    }

    @Override // lib.zj.office.fc.hpsf.MutablePropertySet
    public void write(OutputStream outputStream) {
        this.delegate.write(outputStream);
    }

    public SpecialPropertySet(MutablePropertySet mutablePropertySet) {
        this.delegate = mutablePropertySet;
    }
}
