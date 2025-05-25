package lib.zj.office.fc.poifs.eventfilesystem;

import lib.zj.office.fc.poifs.filesystem.DocumentInputStream;
import lib.zj.office.fc.poifs.filesystem.POIFSDocumentPath;

/* loaded from: classes3.dex */
public class POIFSReaderEvent {
    private String documentName;
    private POIFSDocumentPath path;
    private DocumentInputStream stream;

    public POIFSReaderEvent(DocumentInputStream documentInputStream, POIFSDocumentPath pOIFSDocumentPath, String str) {
        this.stream = documentInputStream;
        this.path = pOIFSDocumentPath;
        this.documentName = str;
    }

    public String getName() {
        return this.documentName;
    }

    public POIFSDocumentPath getPath() {
        return this.path;
    }

    public DocumentInputStream getStream() {
        return this.stream;
    }
}
