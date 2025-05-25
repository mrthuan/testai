package lib.zj.office.fc.poifs.filesystem;

import java.util.ArrayList;
import java.util.Iterator;
import lib.zj.office.fc.poifs.property.DocumentProperty;

/* loaded from: classes3.dex */
public class DocumentNode extends EntryNode implements DocumentEntry {
    private POIFSDocument _document;

    public DocumentNode(DocumentProperty documentProperty, DirectoryNode directoryNode) {
        super(documentProperty, directoryNode);
        this._document = documentProperty.getDocument();
    }

    public POIFSDocument getDocument() {
        return this._document;
    }

    public String getShortDescription() {
        return getName();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DocumentEntry
    public int getSize() {
        return getProperty().getSize();
    }

    public Object[] getViewableArray() {
        return new Object[0];
    }

    public Iterator getViewableIterator() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getProperty());
        arrayList.add(this._document);
        return arrayList.iterator();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.EntryNode
    public boolean isDeleteOK() {
        return true;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.EntryNode, lib.zj.office.fc.poifs.filesystem.Entry
    public boolean isDocumentEntry() {
        return true;
    }

    public boolean preferArray() {
        return false;
    }
}
