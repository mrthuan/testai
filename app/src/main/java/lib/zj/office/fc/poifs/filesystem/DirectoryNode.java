package lib.zj.office.fc.poifs.filesystem;

import a6.h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.hpsf.ClassID;
import lib.zj.office.fc.poifs.property.DirectoryProperty;
import lib.zj.office.fc.poifs.property.DocumentProperty;
import lib.zj.office.fc.poifs.property.Property;

/* loaded from: classes3.dex */
public class DirectoryNode extends EntryNode implements DirectoryEntry, Iterable<Entry> {
    private Map<String, Entry> _byname;
    private ArrayList<Entry> _entries;
    private NPOIFSFileSystem _nfilesystem;
    private POIFSFileSystem _ofilesystem;
    private POIFSDocumentPath _path;

    public DirectoryNode(DirectoryProperty directoryProperty, POIFSFileSystem pOIFSFileSystem, DirectoryNode directoryNode) {
        this(directoryProperty, directoryNode, pOIFSFileSystem, null);
    }

    public boolean changeName(String str, String str2) {
        EntryNode entryNode = (EntryNode) this._byname.get(str);
        if (entryNode != null) {
            boolean changeName = ((DirectoryProperty) getProperty()).changeName(entryNode.getProperty(), str2);
            if (changeName) {
                this._byname.remove(str);
                this._byname.put(entryNode.getProperty().getName(), entryNode);
                return changeName;
            }
            return changeName;
        }
        return false;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DirectoryEntry
    public DirectoryEntry createDirectory(String str) {
        DirectoryNode directoryNode;
        DirectoryProperty directoryProperty = new DirectoryProperty(str);
        POIFSFileSystem pOIFSFileSystem = this._ofilesystem;
        if (pOIFSFileSystem != null) {
            directoryNode = new DirectoryNode(directoryProperty, pOIFSFileSystem, this);
            this._ofilesystem.addDirectory(directoryProperty);
        } else {
            directoryNode = new DirectoryNode(directoryProperty, this._nfilesystem, this);
            this._nfilesystem.addDirectory(directoryProperty);
        }
        ((DirectoryProperty) getProperty()).addChild(directoryProperty);
        this._entries.add(directoryNode);
        this._byname.put(str, directoryNode);
        return directoryNode;
    }

    public DocumentEntry createDocument(POIFSDocument pOIFSDocument) {
        DocumentProperty documentProperty = pOIFSDocument.getDocumentProperty();
        DocumentNode documentNode = new DocumentNode(documentProperty, this);
        ((DirectoryProperty) getProperty()).addChild(documentProperty);
        this._ofilesystem.addDocument(pOIFSDocument);
        this._entries.add(documentNode);
        this._byname.put(documentProperty.getName(), documentNode);
        return documentNode;
    }

    public DocumentInputStream createDocumentInputStream(String str) {
        return createDocumentInputStream(getEntry(str));
    }

    public boolean deleteEntry(EntryNode entryNode) {
        boolean deleteChild = ((DirectoryProperty) getProperty()).deleteChild(entryNode.getProperty());
        if (deleteChild) {
            this._entries.remove(entryNode);
            this._byname.remove(entryNode.getName());
            POIFSFileSystem pOIFSFileSystem = this._ofilesystem;
            if (pOIFSFileSystem != null) {
                pOIFSFileSystem.remove(entryNode);
            } else {
                this._nfilesystem.remove(entryNode);
            }
        }
        return deleteChild;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DirectoryEntry
    public Iterator<Entry> getEntries() {
        return this._entries.iterator();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DirectoryEntry
    public Entry getEntry(String str) {
        Entry entry;
        if (str != null) {
            entry = this._byname.get(str);
        } else {
            entry = null;
        }
        if (entry != null) {
            return entry;
        }
        throw new FileNotFoundException(h.d("no such entry: \"", str, OperatorName.SHOW_TEXT_LINE_AND_SPACE));
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DirectoryEntry
    public int getEntryCount() {
        return this._entries.size();
    }

    public POIFSFileSystem getFileSystem() {
        return this._ofilesystem;
    }

    public NPOIFSFileSystem getNFileSystem() {
        return this._nfilesystem;
    }

    public POIFSDocumentPath getPath() {
        return this._path;
    }

    public String getShortDescription() {
        return getName();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DirectoryEntry
    public ClassID getStorageClsid() {
        return getProperty().getStorageClsid();
    }

    public Object[] getViewableArray() {
        return new Object[0];
    }

    public Iterator getViewableIterator() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getProperty());
        Iterator<Entry> it = this._entries.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList.iterator();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DirectoryEntry
    public boolean hasEntry(String str) {
        if (str != null && this._byname.containsKey(str)) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.EntryNode
    public boolean isDeleteOK() {
        return isEmpty();
    }

    @Override // lib.zj.office.fc.poifs.filesystem.EntryNode, lib.zj.office.fc.poifs.filesystem.Entry
    public boolean isDirectoryEntry() {
        return true;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DirectoryEntry
    public boolean isEmpty() {
        return this._entries.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Entry> iterator() {
        return getEntries();
    }

    public boolean preferArray() {
        return false;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DirectoryEntry
    public void setStorageClsid(ClassID classID) {
        getProperty().setStorageClsid(classID);
    }

    public DirectoryNode(DirectoryProperty directoryProperty, NPOIFSFileSystem nPOIFSFileSystem, DirectoryNode directoryNode) {
        this(directoryProperty, directoryNode, null, nPOIFSFileSystem);
    }

    public DocumentInputStream createDocumentInputStream(Entry entry) {
        if (entry.isDocumentEntry()) {
            return new DocumentInputStream((DocumentEntry) entry);
        }
        throw new IOException("Entry '" + entry.getName() + "' is not a DocumentEntry");
    }

    private DirectoryNode(DirectoryProperty directoryProperty, DirectoryNode directoryNode, POIFSFileSystem pOIFSFileSystem, NPOIFSFileSystem nPOIFSFileSystem) {
        super(directoryProperty, directoryNode);
        Entry documentNode;
        this._ofilesystem = pOIFSFileSystem;
        this._nfilesystem = nPOIFSFileSystem;
        if (directoryNode == null) {
            this._path = new POIFSDocumentPath();
        } else {
            this._path = new POIFSDocumentPath(directoryNode._path, new String[]{directoryProperty.getName()});
        }
        this._byname = new HashMap();
        this._entries = new ArrayList<>();
        Iterator<Property> children = directoryProperty.getChildren();
        while (children.hasNext()) {
            Property next = children.next();
            if (next.isDirectory()) {
                DirectoryProperty directoryProperty2 = (DirectoryProperty) next;
                POIFSFileSystem pOIFSFileSystem2 = this._ofilesystem;
                if (pOIFSFileSystem2 != null) {
                    documentNode = new DirectoryNode(directoryProperty2, pOIFSFileSystem2, this);
                } else {
                    documentNode = new DirectoryNode(directoryProperty2, this._nfilesystem, this);
                }
            } else {
                documentNode = new DocumentNode((DocumentProperty) next, this);
            }
            this._entries.add(documentNode);
            this._byname.put(documentNode.getName(), documentNode);
        }
    }

    public DocumentEntry createDocument(NPOIFSDocument nPOIFSDocument) {
        DocumentProperty documentProperty = nPOIFSDocument.getDocumentProperty();
        DocumentNode documentNode = new DocumentNode(documentProperty, this);
        ((DirectoryProperty) getProperty()).addChild(documentProperty);
        this._nfilesystem.addDocument(nPOIFSDocument);
        this._entries.add(documentNode);
        this._byname.put(documentProperty.getName(), documentNode);
        return documentNode;
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DirectoryEntry
    public DocumentEntry createDocument(String str, InputStream inputStream) {
        NPOIFSFileSystem nPOIFSFileSystem = this._nfilesystem;
        if (nPOIFSFileSystem != null) {
            return createDocument(new NPOIFSDocument(str, nPOIFSFileSystem, inputStream));
        }
        return createDocument(new POIFSDocument(str, inputStream));
    }

    @Override // lib.zj.office.fc.poifs.filesystem.DirectoryEntry
    public DocumentEntry createDocument(String str, int i10, POIFSWriterListener pOIFSWriterListener) {
        return createDocument(new POIFSDocument(str, i10, this._path, pOIFSWriterListener));
    }
}
