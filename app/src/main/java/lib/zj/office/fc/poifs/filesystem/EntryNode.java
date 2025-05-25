package lib.zj.office.fc.poifs.filesystem;

import lib.zj.office.fc.poifs.property.Property;

/* loaded from: classes3.dex */
public abstract class EntryNode implements Entry {
    private DirectoryNode _parent;
    private Property _property;

    public EntryNode(Property property, DirectoryNode directoryNode) {
        this._property = property;
        this._parent = directoryNode;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.Entry
    public boolean delete() {
        if (!isRoot() && isDeleteOK()) {
            return this._parent.deleteEntry(this);
        }
        return false;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.Entry
    public String getName() {
        return this._property.getName();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.Entry
    public DirectoryEntry getParent() {
        return this._parent;
    }

    public Property getProperty() {
        return this._property;
    }

    public abstract boolean isDeleteOK();

    @Override // lib.zj.office.fc.poifs.filesystem.Entry
    public boolean isDirectoryEntry() {
        return false;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.Entry
    public boolean isDocumentEntry() {
        return false;
    }

    public boolean isRoot() {
        if (this._parent == null) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.Entry
    public boolean renameTo(String str) {
        if (!isRoot()) {
            return this._parent.changeName(getName(), str);
        }
        return false;
    }
}
